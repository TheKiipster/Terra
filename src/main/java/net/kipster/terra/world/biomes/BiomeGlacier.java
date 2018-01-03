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
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityRabbit;
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
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeGlacier extends Biome 
{	
	
	public BiomeGlacier() 
	{
		
		super(new BiomeProperties("Glacier").setBaseHeight(0.89F).setHeightVariation(0.025F).setTemperature(-2F).setRainfall(0.4F).setSnowEnabled());

		
		 this.spawnableCreatureList.clear();
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityPolarBear.class, 5, 4, 6));
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
    @Override
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
        if (noiseVal > 1.7D) {
            this.topBlock = Blocks.PACKED_ICE.getDefaultState();
            this.fillerBlock = Blocks.PACKED_ICE.getDefaultState();
        } else {
            this.topBlock = Blocks.SNOW.getDefaultState();
            this.fillerBlock = Blocks.PACKED_ICE.getDefaultState();
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
    }

	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 10387789;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 10387789;
	}
}