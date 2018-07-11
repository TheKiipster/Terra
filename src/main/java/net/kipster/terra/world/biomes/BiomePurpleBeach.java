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
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomePurpleBeach extends BiomeBeach {	
	
	protected static final WorldGenLakes LAKE = new WorldGenLakes(Blocks.WATER);
	public BiomePurpleBeach() 
	{
		
		super(new BiomeProperties("Purple Beach").setBaseHeight(-0.45F).setHeightVariation(0.017F).setTemperature(0.8F).setTemperature(0.8F).setRainfall(0.4F));
		
		BiomeManager.addVillageBiome(BiomeInit.PURPLEBEACH , false);
		
	topBlock = BlockInit.PURPLE_SAND.getDefaultState();
		fillerBlock = BlockInit.PURPLE_SAND.getDefaultState();
		
		 this.decorator.treesPerChunk = -999;
	        this.decorator.deadBushPerChunk = 0;
	        this.decorator.reedsPerChunk = 0;
	        this.decorator.cactiPerChunk = 0;
		this.spawnableCreatureList.clear();
		
	}
	  public void decorate(World worldIn, Random rand, BlockPos pos)
	    {
	       
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
}