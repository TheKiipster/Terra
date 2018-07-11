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
import net.kipster.terra.world.gen.WorldGenWeirdLineThing;
import net.kipster.terra.world.gen.trees.WorldGenTerraShrub;
import net.kipster.terra.world.gen.trees.WorldGenTreeEbony;
import net.kipster.terra.world.gen.trees.WorldGenTreeOak2;
import net.kipster.terra.world.gen.trees.WorldGenTreeShrubOak;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockTallGrass;
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
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraft.world.gen.feature.WorldGenFossils;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeStonelands extends Biome
{
	
	protected static final WorldGenLakes LAVA_LAKE_FEATURE = new WorldGenLakes(Blocks.LAVA);
	protected static final WorldGenTreeShrubOak SHRUB_OAK = new WorldGenTreeShrubOak();
	protected static final WorldGenTreeOak2 TREE_OAK = new WorldGenTreeOak2(false, false);
	protected static final WorldGenBlockBlob STONE_BOULDER_FEATURE = new WorldGenBlockBlob(Blocks.STONE, 1);
	protected static final WorldGenWeirdLineThing STONE = new WorldGenWeirdLineThing(Blocks.STONE, 1);
	
	public BiomeStonelands() 
	{
		
		super(new BiomeProperties("Stonelands").setBaseHeight(0.84F).setHeightVariation(0.5F).setTemperature(0.8F).setRainfall(0.4F));
		
		BiomeManager.addVillageBiome(BiomeInit.STONELANDS , true);
		
	    topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		//this.decorator.extraTreeChance = 2F;
		this.decorator.treesPerChunk = 1;
		this.decorator.grassPerChunk = 10;
		this.decorator.deadBushPerChunk = 4;
		this.decorator.flowersPerChunk = 2;
		this.decorator.cactiPerChunk = 3;
		this.decorator.gravelPatchesPerChunk = 10;
		this.decorator.sandPatchesPerChunk = 10;
		
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
	@Override
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
        if (noiseVal > 1.90D) {
            this.topBlock = Blocks.STONE.getDefaultState();
            this.fillerBlock = Blocks.STONE.getDefaultState();  } 
        else {
         this.topBlock = Blocks.GRASS.getDefaultState();
            this.fillerBlock = Blocks.DIRT.getDefaultState();
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
}
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return (WorldGenAbstractTree)(rand.nextInt(1) == 0 ? TREE_OAK : SHRUB_OAK);
		}
		@Override
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
		        	           if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.DESERT_WELL))
		        	   	        if (rand.nextInt(1000) == 0)
		        	   	        {
		        	   	            int i = rand.nextInt(16) + 8;
		        	   	            int j = rand.nextInt(16) + 8;
		        	   	            BlockPos blockpos = worldIn.getHeight(pos.add(i, 0, j)).up();
		        	   	            (new WorldGenDesertWells()).generate(worldIn, rand, blockpos);
		        	   	        }

		        	   	        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FOSSIL))
		        	   	        if (rand.nextInt(64) == 0)
		        	   	        {
		        	   	            (new WorldGenFossils()).generate(worldIn, rand, pos);
		        	   	        }
		        	   	     if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.ROCK)) {
		        		            int genChance = rand.nextInt(3);
		        		            if (genChance == 0) {
		        		                int k6 = rand.nextInt(16) + 8;
		        		                int l = rand.nextInt(16) + 8;
		        		                BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
		        		                STONE_BOULDER_FEATURE.generate(worldIn, rand, blockpos);
		        		            }
		        		            if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.ROCK)) {
		        			            int genChance1 = rand.nextInt(3);
		        			            if (genChance1 == 0) {
		        			                int k6 = rand.nextInt(16) + 8;
		        			                int l = rand.nextInt(16) + 8;
		        			                BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
		        			                STONE.generate(worldIn, rand, blockpos);
		        		        }

		    super.decorate(worldIn, rand, pos);
		        }
		        	   	     }
		        }
		}


		@Override
		public int getModdedBiomeGrassColor(int original) {
		    return 0xCCB675;
		}
		@Override
		public int getModdedBiomeFoliageColor(int original) {
		    return 0xCCB675;
		}
	}