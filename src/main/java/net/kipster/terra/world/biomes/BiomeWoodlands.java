package net.kipster.terra.world.biomes;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import org.apache.commons.lang3.tuple.Pair;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.init.BlockInit;
import net.kipster.terra.world.gen.trees.WorldGenTerraShrub;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTaiga1;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeWoodlands extends Biome
{	
	 protected static final WorldGenLakes LAKE = new WorldGenLakes(Blocks.WATER);
	private final WorldGenTaiga2 spruceGenerator = new WorldGenTaiga2(false);
    protected static final WorldGenBirchTree SUPER_BIRCH_TREE = new WorldGenBirchTree(false, true);
    protected static final WorldGenBirchTree BIRCH_TREE = new WorldGenBirchTree(false, false);
    protected static final WorldGenCanopyTree ROOF_TREE = new WorldGenCanopyTree(false);
	 
	public BiomeWoodlands() 
	{
		
		super(new BiomeProperties("Woodlands").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		
		BiomeManager.addVillageBiome(BiomeInit.WOODLANDS , false);
		
	topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 15;
		
		 this.decorator.flowersPerChunk = 3;
	        this.decorator.grassPerChunk = 6;
	        this.decorator.mushroomsPerChunk = 4;
	        this.decorator.bigMushroomsPerChunk = 1;
	        
	        this.spawnableCreatureList.clear();
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
	}

	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	{
		  if (rand.nextInt(3) > 0)
	        {
	    return (WorldGenAbstractTree)(rand.nextInt(3) > 0 ? this.spruceGenerator : super.getRandomTreeFeature(rand));
	        }
	    else if (rand.nextInt(5) != 0)
        {
            return (WorldGenAbstractTree)(rand.nextInt(10) == 0 ? BIG_TREE_FEATURE : ROOF_TREE);
        }
        else
        {
            return BIRCH_TREE;
        }
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
	    return 0x618545;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0x618545;
	}
}