package net.kipster.terra.world.biomes;

import java.util.Iterator;
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
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.passive.EntityRabbit;
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
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeFrozenLake extends Biome 
{	
	
	public BiomeFrozenLake() 
	{
		
		super(new BiomeProperties("Frozen Lake").setBaseHeight(-0.6F).setHeightVariation(0.16F).setTemperature(-2).setRainfall(0.4F).setSnowEnabled().setWaterColor(2320566));
		
		
		topBlock = Blocks.DIRT.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		 this.decorator.reedsPerChunk = 3;
	        this.decorator.clayPerChunk = 4;
		this.decorator.extraTreeChance = 0.05F;
		 this.decorator.sandPatchesPerChunk = 2;
	        this.decorator.gravelPatchesPerChunk = 4;
	        this.decorator.grassPerChunk = 3;
	        
	        
	        this.spawnableCreatureList.clear();
	        Iterator<Biome.SpawnListEntry> iterator = this.spawnableMonsterList.iterator();

	        while (iterator.hasNext())
	        {
	            Biome.SpawnListEntry biome$spawnlistentry = iterator.next();

	            if (biome$spawnlistentry.entityClass == EntitySkeleton.class)
	            {
	                iterator.remove();
	            }
	        }

	        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySkeleton.class, 20, 4, 4));
	        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityStray.class, 80, 4, 4));
		
	}

}