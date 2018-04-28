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
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeBlackBeach extends BiomeBeach{	
	
	public BiomeBlackBeach() 
	{
		
		super(new BiomeProperties("Black Beach").setBaseHeight(-0.35F).setHeightVariation(0.022F).setTemperature(0.8F).setRainfall(0.4F));
		
		BiomeManager.addVillageBiome(BiomeInit.BLACKBEACH , false);
	topBlock = BlockInit.BLACK_SAND.getDefaultState();
		fillerBlock = BlockInit.BLACK_SAND.getDefaultState();
		
		 this.decorator.treesPerChunk = -999;
	        this.decorator.deadBushPerChunk = 0;
	        this.decorator.reedsPerChunk = 0;
	        this.decorator.cactiPerChunk = 0;
		this.spawnableCreatureList.clear();
		
	}

}