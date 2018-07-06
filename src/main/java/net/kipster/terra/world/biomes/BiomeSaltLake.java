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
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockTallGrass;
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
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeSaltLake extends Biome 
{	
	private final WorldGenerator silverfishSpawner = new WorldGenMinable(Blocks.MONSTER_EGG.getDefaultState().withProperty(BlockSilverfish.VARIANT, BlockSilverfish.EnumType.STONE), 9);
	private final WorldGenTaiga2 spruceGenerator = new WorldGenTaiga2(false);
	
	public BiomeSaltLake() 
	{
		
		super(new BiomeProperties("Salt Lake").setBaseHeight(-0.7F).setHeightVariation(0.16F).setTemperature(0.8F).setRainfall(0.4F).setWaterColor(0x6c2098));
		
		BiomeManager.addVillageBiome(BiomeInit.SALT_LAKE , false);
		
		topBlock = Blocks.SAND.getDefaultState();
		fillerBlock = Blocks.SAND.getDefaultState();
		
		 this.decorator.reedsPerChunk = 2;
	        this.decorator.clayPerChunk = 4;
		this.decorator.extraTreeChance = 0.03F;
		 this.decorator.sandPatchesPerChunk = 2;
	        this.decorator.gravelPatchesPerChunk = 4;
	        this.decorator.grassPerChunk = 3;
	        
	        this.spawnableCreatureList.clear();
	}
	}