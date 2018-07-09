package net.kipster.terra.world.biomes;

import java.util.Iterator;
import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.init.BlockInit;
import net.kipster.terra.world.gen.WorldGenSandPatches;
import net.kipster.terra.world.gen.trees.WorldGenTreePalm;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
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
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeTropicalGrassland extends Biome
{
	 private static final IBlockState JUNGLE_LOG = Blocks.LOG.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
	 private static final IBlockState JUNGLE_LEAF = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
	 private static final IBlockState OAK_LEAF = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
	 protected static final WorldGenLakes LAKE = new WorldGenLakes(Blocks.WATER);
	 protected static final IBlockState WATER_LILY = Blocks.WATERLILY.getDefaultState();
	 
	public BiomeTropicalGrassland() 
	{
		super(new BiomeProperties("Tropical Grassland").setBaseHeight(Biomes.JUNGLE_EDGE.getBaseHeight()).setHeightVariation(Biomes.JUNGLE_EDGE.getHeightVariation()).setTemperature(Biomes.JUNGLE_EDGE.getDefaultTemperature()).setRainfall(Biomes.JUNGLE_EDGE.getRainfall()).setWaterColor(0x63d4ff));
		
		BiomeManager.addVillageBiome(BiomeInit.TROPICAL_GRASSLAND , true);
		
		this.decorator.generateFalls = true;
		this.decorator.treesPerChunk = 1;
		this.decorator.flowersPerChunk = 7;
        this.decorator.grassPerChunk = 25;
        this.decorator.reedsPerChunk = 25;
        this.decorator.waterlilyPerChunk = 3;

        
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityOcelot.class, 2, 1, 1));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityParrot.class, 40, 1, 2));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityChicken.class, 10, 4, 4));
	}
	 public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	    {
	      
	            return (WorldGenAbstractTree)(rand.nextInt(3) == 0 ? new WorldGenTrees(false, 4 + rand.nextInt(7), JUNGLE_LOG, JUNGLE_LEAF, true) : new WorldGenTrees(false, 4 + rand.nextInt(7), JUNGLE_LOG, JUNGLE_LEAF, true));
	        }
	    

	    /**
	     * Gets a WorldGen appropriate for this biome.
	     */
	    public WorldGenerator getRandomWorldGenForGrass(Random rand)
	    {
	        return rand.nextInt(4) == 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
	    }

	    public void decorate(World worldIn, Random rand, BlockPos pos)
	    {
	        super.decorate(worldIn, rand, pos);
	        int i = rand.nextInt(16) + 8;
	        int j = rand.nextInt(16) + 8;
	        int height = worldIn.getHeight(pos.add(i, 0, j)).getY() * 2; // could == 0, which crashes nextInt
	        if (height < 1) height = 1;
	        int k = rand.nextInt(height);
	        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.PUMPKIN))
	        (new WorldGenMelon()).generate(worldIn, rand, pos.add(i, k, j));
	        WorldGenVines worldgenvines = new WorldGenVines();

	        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
	        for (int j1 = 0; j1 < 50; ++j1)
	        {
	            k = rand.nextInt(16) + 8;
	            int l = 128;
	            int i1 = rand.nextInt(16) + 8;
	            worldgenvines.generate(worldIn, rand, pos.add(k, 128, i1));
	        }
	        if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.LAKE_WATER)) {
	            int boulderChance = rand.nextInt(12);
	            if (boulderChance == 0) {
	             int k6 = rand.nextInt(16) + 8;
	             int l = rand.nextInt(16) + 8;
	              BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
	              LAKE.generate(worldIn, rand, blockpos);
	            }
	        	}
	    }
	
}