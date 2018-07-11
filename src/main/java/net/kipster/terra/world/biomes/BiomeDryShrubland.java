package net.kipster.terra.world.biomes;

import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.world.gen.WorldGenSandPatches;
import net.kipster.terra.world.gen.trees.WorldGenTerraShrub;
import net.kipster.terra.world.gen.trees.WorldGenTreeShrubEbony;
import net.kipster.terra.world.gen.trees.WorldGenTreeShrubOak;
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
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraft.world.gen.feature.WorldGenFossils;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;

public class BiomeDryShrubland extends Biome 
{	
	protected static final WorldGenAbstractTree SHRUB_EBONY = new WorldGenTreeShrubEbony();
	 protected static final WorldGenSandPatches SAND_PATCH = new WorldGenSandPatches(Blocks.SAND.getDefaultState(), 3);
	 
	public BiomeDryShrubland() 
	{
		super(new BiomeProperties("Dry Shrubland").setTemperature(Biomes.DESERT.getDefaultTemperature()).setRainfall(Biomes.DESERT.getRainfall()).setRainDisabled());
		
		BiomeManager.addVillageBiome(BiomeInit.DRY_SHRUBLAND , true);
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
        this.spawnableCreatureList.clear();
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityHorse.class, 5, 2, 6));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityDonkey.class, 1, 1, 3));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityPig.class, 5, 2, 6));
        this.decorator.treesPerChunk = 1;
        this.decorator.flowersPerChunk = 1;
        this.decorator.grassPerChunk = 2;
        this.decorator.deadBushPerChunk = 6;
	}

	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return (WorldGenAbstractTree)(rand.nextInt(2) == 0 ? SHRUB_EBONY : SHRUB_EBONY);
		}

public void decorate(World worldIn, Random rand, BlockPos pos)
{
    if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.DESERT_WELL))
        if (rand.nextInt(1000) == 0)
        {
            int i = rand.nextInt(16) + 8;
            int j = rand.nextInt(16) + 8;
            BlockPos blockpos = worldIn.getHeight(pos.add(i, 0, j)).up();
            (new WorldGenDesertWells()).generate(worldIn, rand, blockpos);
        }
    int grassChance = rand.nextInt(4);
	if (grassChance == 0) {
		int k6 = rand.nextInt(16) + 8;
		int l = rand.nextInt(16) + 8;
		BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
		SAND_PATCH.generate(worldIn, rand, blockpos);
	}

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FOSSIL))
        if (rand.nextInt(64) == 0)
        {
            (new WorldGenFossils()).generate(worldIn, rand, pos);
        }

    super.decorate(worldIn, rand, pos);
        }

@Override
public int getModdedBiomeGrassColor(int original) {
    return 0xCCB675;
}
@Override
public int getModdedBiomeFoliageColor(int original) {
    return 0xCCB675;
}
}