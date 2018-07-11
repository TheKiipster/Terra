package net.kipster.terra.world.biomes;

import java.util.Iterator;
import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.init.BlockInit;
import net.kipster.terra.world.gen.WorldGenGreyDeadBush;
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
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
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

public class BiomeBlackDesert extends Biome
{
	 public static final WorldGenerator GREY_DEADBUSH_FEATURE = new WorldGenGreyDeadBush();
	 protected static final WorldGenLakes LAVA_LAKE_FEATURE = new WorldGenLakes(Blocks.LAVA);
	 
	public BiomeBlackDesert() 
	{
		super(new BiomeProperties("Black Desert").setBaseHeight(Biomes.DESERT.getBaseHeight()).setHeightVariation(Biomes.DESERT.getHeightVariation()).setTemperature(Biomes.DESERT.getDefaultTemperature()).setRainfall(Biomes.DESERT.getRainfall()).setRainDisabled());
		
		BiomeManager.addVillageBiome(BiomeInit.BLACKDESERT , true);
		
		this.decorator.generateFalls = false;
		this.decorator.treesPerChunk = -999;
		this.decorator.flowersPerChunk = -999;
        this.decorator.grassPerChunk = 7;
        this.decorator.reedsPerChunk = 2;
        this.decorator.cactiPerChunk = 1;
        
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
            this.topBlock = Blocks.GRAVEL.getDefaultState();
            this.fillerBlock = Blocks.GRAVEL.getDefaultState();  } 
        else {
         this.topBlock = BlockInit.BLACK_SAND.getDefaultState();
            this.fillerBlock = BlockInit.BLACK_SAND.getDefaultState();
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
}
	
	 @Override
	    public WorldGenerator getRandomWorldGenForGrass(Random rand) {
	        return GREY_DEADBUSH_FEATURE;
	}

public void decorate(World worldIn, Random rand, BlockPos pos)
{

    if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.LAKE_LAVA)) {
    	           int boulderChance = rand.nextInt(15);
    	           if (boulderChance == 0) {
    	            int k6 = rand.nextInt(18) + 8;
    	            int l = rand.nextInt(18) + 8;
    	             BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
    	             LAVA_LAKE_FEATURE.generate(worldIn, rand, blockpos);
    	           }
 
        }

    super.decorate(worldIn, rand, pos);
        }

@Override
public int getModdedBiomeGrassColor(int original) {
    return 0x52503F;
}

@Override
public int getModdedBiomeFoliageColor(int original) {
    return 0x52503F;
}

	}
