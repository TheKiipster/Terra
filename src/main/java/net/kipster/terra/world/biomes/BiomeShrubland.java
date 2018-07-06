package net.kipster.terra.world.biomes;

import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.world.gen.trees.WorldGenTerraShrub;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;

public class BiomeShrubland extends Biome 
{	
	protected static final WorldGenAbstractTree TREE = new WorldGenTerraShrub(Blocks.LEAVES, Blocks.LOG, 0, 0, false);
	
	 
	public BiomeShrubland() 
	{
		super(new BiomeProperties("Shrubland").setBaseHeight(0.115F).setHeightVariation(0.05F).setTemperature(0.8F).setRainfall(0.4F));
		
		BiomeManager.addVillageBiome(BiomeInit.SHRUBLAND , true);
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityOcelot.class, 5, 2, 6));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityHorse.class, 5, 2, 6));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityDonkey.class, 1, 1, 3));
        this.decorator.treesPerChunk = 4;
        this.decorator.flowersPerChunk = 3;
        this.decorator.grassPerChunk = 30;

	}

	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return TREE;
}

	public WorldGenerator getRandomWorldGenForGrass(Random rand)
    {
        return rand.nextInt(4) == 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
    }

public void decorate(World worldIn, Random rand, BlockPos pos)
{
    DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.GRASS);

    if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
    for (int i = 0; i < 7; ++i)
    {
        int j = rand.nextInt(16) + 8;
        int k = rand.nextInt(16) + 8;
        int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
        DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
    }

    super.decorate(worldIn, rand, pos);
        }
	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0x84C54E;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0x84C54E;
	}
}