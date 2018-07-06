package net.kipster.terra.world.biomes;

import java.util.Iterator;
import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.init.BlockInit;
import net.kipster.terra.world.gen.WorldGenGreyDeadBush;
import net.kipster.terra.world.gen.trees.WorldGenTerraShrub;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraft.world.gen.feature.WorldGenFossils;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeSemiAridDesert extends Biome
{
	protected static final WorldGenBlockBlob COBBLESTONE_BOULDER_FEATURE = new WorldGenBlockBlob(Blocks.COBBLESTONE, 1);
	protected static final WorldGenLakes LAVA_LAKE_FEATURE = new WorldGenLakes(Blocks.LAVA);
	protected static final WorldGenAbstractTree TREE = new WorldGenTerraShrub(BlockInit.EBONYLEAVES, BlockInit.EBONYLOG, 0, 0, false);
	
	public BiomeSemiAridDesert() 
	{
		super(new BiomeProperties("Semiarid Desert").setBaseHeight(0.120F).setHeightVariation(0.028F).setTemperature(1.8F).setRainfall(0.9F));
		
		BiomeManager.addVillageBiome(BiomeInit.SEMI_ARID_DESERT , true);
		
		this.decorator.generateFalls = true;
		this.decorator.flowersPerChunk = -999;
        this.decorator.grassPerChunk = 4;
        this.decorator.cactiPerChunk = 2;
        this.decorator.treesPerChunk = 1;
        this.decorator.deadBushPerChunk = 5;
        this.decorator.extraTreeChance = 2;
        
        this.spawnableCreatureList.clear();
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
        if (noiseVal > 1.9D) {
            this.topBlock = Blocks.GRASS.getDefaultState();
            this.fillerBlock = Blocks.DIRT.getDefaultState();  } 
        else if (noiseVal > 1D) {
                this.topBlock = BlockInit.ORANGE_SAND.getDefaultState();
                this.fillerBlock = BlockInit.ORANGE_SAND.getDefaultState();  } 
            else {
         this.topBlock = Blocks.SAND.getDefaultState();
            this.fillerBlock = Blocks.SAND.getDefaultState();
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
}
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return TREE;
	}

public void decorate(World worldIn, Random rand, BlockPos pos)
{
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
            int boulderChance = rand.nextInt(5);
            if (boulderChance == 0) {
                int k6 = rand.nextInt(16) + 8;
                int l = rand.nextInt(16) + 8;
                BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
                COBBLESTONE_BOULDER_FEATURE.generate(worldIn, rand, blockpos);
            }
        }
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
    return 0xA7A34B;
}

@Override
public int getModdedBiomeFoliageColor(int original) {
    return 0xA7A34B;
}


	}
