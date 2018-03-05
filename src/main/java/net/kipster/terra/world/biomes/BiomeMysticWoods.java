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
import net.kipster.terra.world.gen.generators.WorldGenTreeBlueSpruce;
import net.kipster.terra.world.gen.generators.WorldGenTreeMystic;
import net.kipster.terra.world.gen.generators.WorldGenTreeSwampDark;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeTaiga;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenFossils;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeMysticWoods extends Biome
{	
	 protected static final IBlockState WATER_LILY = Blocks.WATERLILY.getDefaultState();
	private static final WorldGenTreeBlueSpruce BLUE_SPRUCE = new WorldGenTreeBlueSpruce(false);
	 protected static final WorldGenTreeMystic ROOF_TREE = new WorldGenTreeMystic(false);
	 protected static final WorldGenAbstractTree SWAMP_DARK = new WorldGenTreeSwampDark();
    private static final WorldGenBlockBlob FOREST_ROCK_GENERATOR = new WorldGenBlockBlob(Blocks.MOSSY_COBBLESTONE, 0);
	
	public BiomeMysticWoods() 
	{
		
		super(new BiomeProperties("Mystic Woods").setBaseHeight(0.5F).setHeightVariation(0.1F).setTemperature(.5F).setRainfall(0.4F).setWaterColor(0x7300c9));
		
		BiomeManager.addVillageBiome(BiomeInit.MYSTIC_WOODS , true);
		
	topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 8, 4, 4));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityWitch.class, 2, 2, 3));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityEnderman.class, 2, 2, 3));  
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySlime.class, 1, 1, 1));
        this.decorator.treesPerChunk = 9;
        this.decorator.grassPerChunk = 7;
        this.decorator.mushroomsPerChunk = 7;
        this.decorator.bigMushroomsPerChunk= 5;
        this.decorator.waterlilyPerChunk = 4;
    }
	 public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos)
	    {
	        return BlockFlower.EnumFlowerType.BLUE_ORCHID;
	    }
	 public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal)
	    {
	        double d0 = GRASS_COLOR_NOISE.getValue((double)x * 0.25D, (double)z * 0.25D);

	        if (d0 > 0.0D)
	        {
	            int i = x & 15;
	            int j = z & 15;

	            for (int k = 255; k >= 0; --k)
	            {
	                if (chunkPrimerIn.getBlockState(j, k, i).getMaterial() != Material.AIR)
	                {
	                    if (k == 62 && chunkPrimerIn.getBlockState(j, k, i).getBlock() != Blocks.WATER)
	                    {
	                        chunkPrimerIn.setBlockState(j, k, i, WATER);

	                        if (d0 < 0.12D)
	                        {
	                            chunkPrimerIn.setBlockState(j, k + 1, i, WATER_LILY);
	                        }
	                    }

	                    break;
	                }
	            }
	        }

	        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	    }
	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
    {
	if (rand.nextInt(3) > 0)
	{
		  return SWAMP_DARK;
	}
	else
	{
	  return (WorldGenAbstractTree)(rand.nextInt(3) == 0 ? BLUE_SPRUCE : ROOF_TREE);
}
    }

	public WorldGenerator getRandomWorldGenForGrass(Random rand)
    {
        return rand.nextInt(5) > 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
    }

    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
    	if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FOSSIL))
            if (rand.nextInt(64) == 0)
            {
                (new WorldGenFossils()).generate(worldIn, rand, pos);
            }
        if ( net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.ROCK))
        {
            int i = rand.nextInt(3);

            for (int j = 0; j < i; ++j)
            {
                int k = rand.nextInt(16) + 8;
                int l = rand.nextInt(16) + 8;
                BlockPos blockpos = worldIn.getHeight(pos.add(k, 0, l));
                FOREST_ROCK_GENERATOR.generate(worldIn, rand, blockpos);
            }
        }

        DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.FERN);

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS))
        for (int i1 = 0; i1 < 7; ++i1)
        {
            int j1 = rand.nextInt(16) + 8;
            int k1 = rand.nextInt(16) + 8;
            int l1 = rand.nextInt(worldIn.getHeight(pos.add(j1, 0, k1)).getY() + 32);
            DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j1, l1, k1));
        }

        super.decorate(worldIn, rand, pos);
    }
	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0x1eccc7;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0x1eccc7;
	}

    @Override
    public void addDefaultFlowers()
    {
        addFlower(Blocks.RED_FLOWER.getDefaultState().withProperty(Blocks.RED_FLOWER.getTypeProperty(), BlockFlower.EnumFlowerType.BLUE_ORCHID), 10);
    }
}