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
import net.kipster.terra.world.gen.trees.WorldGenTreeBlueSpruce;
import net.kipster.terra.world.gen.trees.WorldGenTreeJacarandaPurple;
import net.kipster.terra.world.gen.trees.WorldGenTreeMystic;
import net.kipster.terra.world.gen.trees.WorldGenTreePaulowniaGreen;
import net.kipster.terra.world.gen.trees.WorldGenTreePaulowniaGreenV;
import net.kipster.terra.world.gen.trees.WorldGenTreeSwampDark;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeRainforest extends Biome
{	
	
	 protected static final IBlockState WATER_LILY = Blocks.WATERLILY.getDefaultState();
		 protected static final WorldGenTreePaulowniaGreenV PAUL_GREEN = new WorldGenTreePaulowniaGreenV();
		 protected static final WorldGenAbstractTree JAC_PURPLE = new WorldGenTreeJacarandaPurple(false, false);
	public BiomeRainforest() 
	{
		
		super(new BiomeProperties("Rainforest").setBaseHeight(Biomes.JUNGLE.getBaseHeight()).setHeightVariation(Biomes.JUNGLE.getHeightVariation()).setTemperature(Biomes.JUNGLE.getDefaultTemperature()).setRainfall(Biomes.JUNGLE.getRainfall()));
		
		BiomeManager.addVillageBiome(BiomeInit.RAINFOREST , false);
		
	    topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 10;
		 this.decorator.flowersPerChunk = 12;
	        this.decorator.grassPerChunk = 15;
	        this.decorator.extraTreeChance = 5;
	        
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityChicken.class, 4, 4, 4));
	        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityOcelot.class, 2, 1, 1));
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityParrot.class, 40, 1, 2));
		
	}
	public WorldGenerator getRandomWorldGenForGrass(Random rand)
    {
        return rand.nextInt(4) == 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
    }
	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
    {
	if (rand.nextInt(3) > 0)
	{
		  return JAC_PURPLE;
	}
	else
	{
	  return (WorldGenAbstractTree)(rand.nextInt(3) == 0 ? PAUL_GREEN : PAUL_GREEN);
}
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
    int i = rand.nextInt(16) + 8;
    int j = rand.nextInt(16) + 8;
    int height = worldIn.getHeight(pos.add(i, 0, j)).getY() * 2; // could == 0, which crashes nextInt
    if (height < 1) height = 1;
    int k = rand.nextInt(height);
    if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.PUMPKIN))
        (new WorldGenMelon()).generate(worldIn, rand, pos.add(i, k, j));
    WorldGenVines worldgenvines = new WorldGenVines();

    if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
        for (j = 0; j < 50; ++j) {
            k = rand.nextInt(16) + 8;
            int l = 128;
            int i1 = rand.nextInt(16) + 8;
            worldgenvines.generate(worldIn, rand, pos.add(k, 128, i1));
EntityPig pig = new EntityPig(worldIn);
        }

    super.decorate(worldIn, rand, pos);
        }
	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0x85c140;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0x85c140;
	}
}