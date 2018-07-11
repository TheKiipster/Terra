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
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeThicket extends Biome
{
	
	protected static final WorldGenAbstractTree TREE = new WorldGenTerraShrub(Blocks.LEAVES, Blocks.LOG, 0, 0, false);
	
	public BiomeThicket() 
	{
		
		super(new BiomeProperties("Thicket").setBaseHeight(0.192F).setHeightVariation(0.085F).setTemperature(1F).setRainfall(0.2F));
		
		BiomeManager.addVillageBiome(BiomeInit.THICKET , false);
		
	 topBlock = Blocks.DIRT.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 20;
		this.decorator.grassPerChunk = 2;
		this.decorator.deadBushPerChunk = 1;

		  this.spawnableCreatureList.clear();
		 this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));

	}
	@Override
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
        if (noiseVal > 1.0D) {
            this.topBlock = Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.COARSE_DIRT);
            this.fillerBlock = Blocks.DIRT.getDefaultState();  } 
        else {
         this.topBlock = Blocks.DIRT.getDefaultState();
            this.fillerBlock = Blocks.DIRT.getDefaultState();
        }
        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	}
		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	    {
	        return SWAMP_FEATURE;
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
		    return 0x8bb658;
		}
		@Override
		public int getModdedBiomeFoliageColor(int original) {
		    return 0x8bb658;
		}
	}