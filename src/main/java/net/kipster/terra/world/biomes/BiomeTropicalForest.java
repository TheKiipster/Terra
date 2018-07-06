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
import net.kipster.terra.world.gen.WorldGenSandPatches;
import net.kipster.terra.world.gen.trees.WorldGenTreeBlueSpruce;
import net.kipster.terra.world.gen.trees.WorldGenTreeJacarandaPurple;
import net.kipster.terra.world.gen.trees.WorldGenTreeMystic;
import net.kipster.terra.world.gen.trees.WorldGenTreePalm;
import net.kipster.terra.world.gen.trees.WorldGenTreePaulowniaGreen;
import net.kipster.terra.world.gen.trees.WorldGenTreePaulowniaGreenV;
import net.kipster.terra.world.gen.trees.WorldGenTreeSwampDark;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeTropicalForest extends Biome
{	
	
	 
	 protected static final IBlockState WATER_LILY = Blocks.WATERLILY.getDefaultState();
	 private static final WorldGenTreePalm PALM = new WorldGenTreePalm(true);
	 protected static final WorldGenSandPatches WHITE_SAND = new WorldGenSandPatches(BlockInit.WHITE_SAND.getDefaultState(), 8);
	 protected static final WorldGenLakes LAKE = new WorldGenLakes(Blocks.WATER);
	 
	public BiomeTropicalForest() 
	{
		
		super(new BiomeProperties("Tropical Forest").setBaseHeight(Biomes.JUNGLE.getBaseHeight()).setHeightVariation(Biomes.JUNGLE.getHeightVariation()).setTemperature(Biomes.JUNGLE.getDefaultTemperature()).setRainfall(Biomes.JUNGLE.getRainfall()).setWaterColor(0x63d4ff));
		
		BiomeManager.addVillageBiome(BiomeInit.RAINFOREST , true);
		
	    topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = BlockInit.WHITE_SAND.getDefaultState();
		
		 this.decorator.treesPerChunk = 15;
		 this.decorator.waterlilyPerChunk = 6;
		 this.decorator.flowersPerChunk = 12;
		 this.decorator.sandPatchesPerChunk = 3;
		 this.decorator.reedsPerChunk = 12;
		 this.decorator.generateFalls = true;
	     this.decorator.grassPerChunk = 19;
	     this.decorator.extraTreeChance = 5;
	     this.decorator.clayPerChunk = 4;
	     this.decorator.cactiPerChunk = 7;
	        
	     this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityChicken.class, 4, 4, 4));
	     this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityOcelot.class, 2, 1, 1));
	     this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityParrot.class, 40, 1, 2));
	     this.flowers.clear();
	        for (BlockFlower.EnumFlowerType type : BlockFlower.EnumFlowerType.values())
	        {
	            if (type.getBlockType() == BlockFlower.EnumFlowerColor.YELLOW) continue;
	            if (type == BlockFlower.EnumFlowerType.BLUE_ORCHID) type = BlockFlower.EnumFlowerType.POPPY;
	            addFlower(net.minecraft.init.Blocks.RED_FLOWER.getDefaultState().withProperty(net.minecraft.init.Blocks.RED_FLOWER.getTypeProperty(), type), 10);
	        }
	}
	 public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos)
	    {
	            double d0 = MathHelper.clamp((1.0D + GRASS_COLOR_NOISE.getValue((double)pos.getX() / 48.0D, (double)pos.getZ() / 48.0D)) / 2.0D, 0.0D, 0.9999D);
	            BlockFlower.EnumFlowerType blockflower$enumflowertype = BlockFlower.EnumFlowerType.values()[(int)(d0 * (double)BlockFlower.EnumFlowerType.values().length)];
	            return blockflower$enumflowertype == BlockFlower.EnumFlowerType.BLUE_ORCHID ? BlockFlower.EnumFlowerType.POPPY : blockflower$enumflowertype;
	        }
		   public void addDoublePlants(World p_185378_1_, Random p_185378_2_, BlockPos p_185378_3_, int p_185378_4_)
		    {
		        for (int i = 0; i < p_185378_4_; ++i)
		        {
		            int j = p_185378_2_.nextInt(3);

		            if (j == 0)
		            {
		                DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.SYRINGA);
		            }
		            else if (j == 1)
		            {
		                DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.ROSE);
		            }
		            else if (j == 2)
		            {
		                DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.PAEONIA);
		            }

		            for (int k = 0; k < 5; ++k)
		            {
		                int l = p_185378_2_.nextInt(16) + 8;
		                int i1 = p_185378_2_.nextInt(16) + 8;
		                int j1 = p_185378_2_.nextInt(p_185378_1_.getHeight(p_185378_3_.add(l, 0, i1)).getY() + 32);

		                if (DOUBLE_PLANT_GENERATOR.generate(p_185378_1_, p_185378_2_, new BlockPos(p_185378_3_.getX() + l, j1, p_185378_3_.getZ() + i1)))
		                {
		                    break;
		                }
		            }
		        }
		    }

		   public WorldGenAbstractTree getRandomTreeFeature(Random rand)
		    {
		        return (WorldGenAbstractTree)(rand.nextInt(5) > 0 ? PALM : PALM);
		    
		    }
	public WorldGenerator getRandomWorldGenForGrass(Random rand)
    {
        return rand.nextInt(4) == 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
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
	int whitesandChance = rand.nextInt(4);
	if (whitesandChance == 0) {
		int k6 = rand.nextInt(16) + 8;
		int l = rand.nextInt(16) + 8;
		BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
		WHITE_SAND.generate(worldIn, rand, blockpos);
	}
    DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.GRASS);

    if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
    for (int i = 0; i < 7; ++i)
    {
        int j = rand.nextInt(16) + 8;
        int k = rand.nextInt(16) + 8;
        int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
        DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
    }
    int i = rand.nextInt(16) + 8;
    int j = rand.nextInt(16) + 8;
    int height = worldIn.getHeight(pos.add(i, 0, j)).getY() * 2; // could == 0, which crashes nextInt
    if (height < 1) height = 1;
    int k = rand.nextInt(height);
    if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.PUMPKIN))
        (new WorldGenMelon()).generate(worldIn, rand, pos.add(i, k, j));
    WorldGenVines worldgenvines = new WorldGenVines();

    if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
        for (j = 0; j < 50; ++j) {
            k = rand.nextInt(16) + 8;
            int l = 128;
            int i1 = rand.nextInt(16) + 8;
            worldgenvines.generate(worldIn, rand, pos.add(k, 128, i1));
EntityPig pig = new EntityPig(worldIn);
        }

    super.decorate(worldIn, rand, pos);
	  }
        }
	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0x56b625;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0x56b625;
	}
}