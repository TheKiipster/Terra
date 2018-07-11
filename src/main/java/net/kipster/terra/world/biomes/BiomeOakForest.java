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
import net.kipster.terra.world.biomes.BiomeRockland.EmeraldGenerator;
import net.kipster.terra.world.gen.trees.WorldGenTreeOak2;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraft.world.gen.feature.WorldGenFossils;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeOakForest extends Biome
{	

	 protected static final WorldGenLakes LAKE = new WorldGenLakes(Blocks.WATER);
    protected static final WorldGenTreeOak2 SUPER_OAK_TREE = new WorldGenTreeOak2(false, true);
    protected static final WorldGenTreeOak2 OAK_TREE = new WorldGenTreeOak2(false, false);
	public BiomeOakForest() 
	{
		
		super(new BiomeProperties("Oak Forest").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()));
		
		BiomeManager.addVillageBiome(BiomeInit.OAK_FOREST , true);
		
	topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 10;
		 this.decorator.flowersPerChunk = 1;
	        this.decorator.grassPerChunk = 3;
	        this.decorator.extraTreeChance = 2F;
	        this.decorator.generateFalls = true;
	        this.spawnableCreatureList.clear();
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
	       
	}
	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
    {
        if (rand.nextInt(1) > 0)
        {
            return SUPER_OAK_TREE;
        }
       
        else
        {
            return OAK_TREE;
        }
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
	   
	        }

	    super.decorate(worldIn, rand, pos);
	        }
	
}
