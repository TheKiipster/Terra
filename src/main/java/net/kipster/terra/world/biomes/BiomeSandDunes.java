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
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraft.world.gen.feature.WorldGenFossils;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeSandDunes extends Biome 
{	
	protected static final WorldGenLakes LAVA_LAKE_FEATURE = new WorldGenLakes(Blocks.LAVA);
	
	public BiomeSandDunes() 
	{
		
		super(new BiomeProperties("Sand Dunes").setBaseHeight(0F).setHeightVariation(0.5F).setTemperature(Biomes.DESERT.getDefaultTemperature()).setRainfall(Biomes.DESERT.getRainfall()).setRainDisabled());
		
		BiomeManager.addVillageBiome(BiomeInit.SAND_DUNES , true);
		
		topBlock = Blocks.SAND.getDefaultState();
		fillerBlock = Blocks.SAND.getDefaultState();
		
		this.decorator.extraTreeChance = 0.003F;
        this.decorator.deadBushPerChunk = 15;
        this.decorator.reedsPerChunk = 3;
        this.decorator.cactiPerChunk = 10;
		
        this.spawnableCreatureList.clear();
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityHorse.class, 1, 2, 6));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityDonkey.class, 1, 1, 1));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
        Iterator<Biome.SpawnListEntry> iterator = this.spawnableMonsterList.iterator();

        while (iterator.hasNext())
        {
            Biome.SpawnListEntry biome$spawnlistentry = iterator.next();

            if (biome$spawnlistentry.entityClass == EntityZombie.class || biome$spawnlistentry.entityClass == EntityZombieVillager.class)
            {
                iterator.remove();
            }
        }

        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityZombie.class, 19, 4, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityZombieVillager.class, 1, 1, 1));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityHusk.class, 80, 4, 4));
	}
	public void decorate(World worldIn, Random rand, BlockPos pos)
	{
	   
	        if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.LAKE_LAVA)) {
	        	           int boulderChance = rand.nextInt(12);
	        	           if (boulderChance == 0) {
	        	            int k6 = rand.nextInt(16) + 8;
	        	            int l = rand.nextInt(16) + 8;
	        	             BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
	        	             LAVA_LAKE_FEATURE.generate(worldIn, rand, blockpos);
	        	           }
	        	        }

	    super.decorate(worldIn, rand, pos);
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