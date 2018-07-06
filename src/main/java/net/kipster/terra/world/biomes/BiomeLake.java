package net.kipster.terra.world.biomes;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.init.BlockInit;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockTallGrass;
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
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeLake extends Biome 
{	
	
	private final WorldGenTaiga2 spruceGenerator = new WorldGenTaiga2(false);
	
	public BiomeLake() 
	{
		
		super(new BiomeProperties("Lake").setBaseHeight(-0.7F).setHeightVariation(0.16F).setTemperature(0.8F).setRainfall(0.4F).setWaterColor(2320566));
		
		BiomeManager.addVillageBiome(BiomeInit.LAKE , false);
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 2;
		 this.decorator.reedsPerChunk = 3;
	        this.decorator.clayPerChunk = 4;
		this.decorator.extraTreeChance = 0.05F;
		 this.decorator.sandPatchesPerChunk = 2;
	        this.decorator.gravelPatchesPerChunk = 4;
	        this.decorator.grassPerChunk = 3;
	        
	        this.spawnableCreatureList.clear();
	}

	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	{
	    return (WorldGenAbstractTree)(rand.nextInt(3) > 0 ? this.spruceGenerator : super.getRandomTreeFeature(rand));
	}
	public WorldGenerator getRandomWorldGenForGrass(Random rand)
	{
	    return rand.nextInt(4) == 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
	}

	public void decorate(World worldIn, Random rand, BlockPos pos)
	{
	    super.decorate(worldIn, rand, pos);

	    DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.GRASS);

	    if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
	    for (int i = 0; i < 7; ++i)
	    {
	        int j = rand.nextInt(16) + 8;
	        int k = rand.nextInt(16) + 8;
	        int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
	        DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
	    }
	}
	}