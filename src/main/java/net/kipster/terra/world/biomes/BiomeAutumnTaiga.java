package net.kipster.terra.world.biomes;

import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.world.gen.trees.WorldGenAutumnTaigaOrange;
import net.kipster.terra.world.gen.trees.WorldGenAutumnTaigaYellow;
import net.kipster.terra.world.gen.trees.WorldGenTallerSpruce;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeAutumnTaiga extends Biome 
{	
	 private static final WorldGenBlockBlob FOREST_ROCK_GENERATOR = new WorldGenBlockBlob(Blocks.MOSSY_COBBLESTONE, 0);
	 protected static final WorldGenLakes LAKE = new WorldGenLakes(Blocks.WATER);
	protected static final WorldGenAbstractTree YELLOW = new WorldGenAutumnTaigaYellow(false, false);
	protected static final WorldGenAbstractTree ORANGE = new WorldGenAutumnTaigaOrange(false, false);
    private final WorldGenTallerSpruce spruceGenerator = new WorldGenTallerSpruce(true);
	 
	public BiomeAutumnTaiga() 
	{
		super(new BiomeProperties("Autumn Taiga").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.TAIGA.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()));
		
		BiomeManager.addVillageBiome(BiomeInit.AUTUMN_TAIGA , true);
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
        this.spawnableCreatureList.clear();
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 8, 4, 4));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
        this.decorator.treesPerChunk = 7;
        this.decorator.flowersPerChunk = 2;
        this.decorator.grassPerChunk = 4;

	}

	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
	if (rand.nextInt(2) > 0)
	{
		  return this.spruceGenerator;
	}
	else
	{
	  return (WorldGenAbstractTree)(rand.nextInt(4) == 0 ? YELLOW : ORANGE);
	}
}
	public WorldGenerator getRandomWorldGenForGrass(Random rand)
    {
        return rand.nextInt(5) > 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
    }

    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
        if ( net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.ROCK))
        {
            int i = rand.nextInt(3);

            for (int j = 0; j < i; ++j)
            {
                int k = rand.nextInt(16) + 8;
                int l = rand.nextInt(16) + 8;
                BlockPos blockpos = worldIn.getHeight(pos.add(k, 0, l));
                FOREST_ROCK_GENERATOR.generate(worldIn, rand, blockpos);
            }
        }

        DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.FERN);

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS))
        for (int i1 = 0; i1 < 7; ++i1)
        {
            int j1 = rand.nextInt(16) + 8;
            int k1 = rand.nextInt(16) + 8;
            int l1 = rand.nextInt(worldIn.getHeight(pos.add(j1, 0, k1)).getY() + 32);
            DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j1, l1, k1));
        }
        if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.LAKE_WATER)) {
            int boulderChance = rand.nextInt(12);
            if (boulderChance == 0) {
             int k6 = rand.nextInt(16) + 8;
             int l = rand.nextInt(16) + 8;
              BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
              LAKE.generate(worldIn, rand, blockpos);
            }

        super.decorate(worldIn, rand, pos);
    }
    }
	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0xA4BA6B;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0xA4BA6B;
}
}