package net.kipster.terra.world.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import net.kipster.terra.world.biomes.BiomeBlossomWoods;
import net.kipster.terra.world.gen.generators.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomTrees implements IWorldGenerator
{

	private final WorldGenerator WHITECHERRY= new WorldGenTreeCherryWhite(false, false);
	private final WorldGenerator PURPLECHERRY = new WorldGenTreeCherryPurple(false);
	private final WorldGenerator BLUESPRUCE = new WorldGenTreeBlueSpruce(false);
	private final WorldGenerator REDSPRUCE = new WorldGenTreeRedSpruce(false);
	private final WorldGenerator BLACKSPRUCE = new WorldGenTreeBlackSpruce(false);
	private final WorldGenerator WHITESPRUCE = new WorldGenTreeWhiteSpruce(false);
	private final WorldGenerator MAHOGANY = new WorldGenTreeMahogany(false, false);
	private final WorldGenerator ELM = new WorldGenTreeElm(false);
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 1:
			break;
			
		case 0:
			
			runGenerator(BLACKSPRUCE, world, random, chunkX, chunkZ, 3, -1, 0, BiomeTaiga.class);
			runGenerator(WHITESPRUCE, world, random, chunkX, chunkZ, 3, -1, 0, BiomeTaiga.class);
			runGenerator(MAHOGANY, world, random, chunkX, chunkZ, 3, -1, 0, BiomeJungle.class);
			runGenerator(ELM, world, random, chunkX, chunkZ, 3, -1, 0, BiomeForest.class);
		
			break;
			
		case -1:
			
		}
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, double chancesToSpawn, int minHeight, int maxHeight, Class<?>... classes)
	{
		if(chancesToSpawn < 1) 
		{
			if(random.nextDouble() < chancesToSpawn) chancesToSpawn = 1;
			else chancesToSpawn = 0;
		}
		
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chancesToSpawn; i++)
		{
			BlockPos pos = new BlockPos(chunkX * 16 + 10 + random.nextInt(15), minHeight + random.nextInt(heightDiff), chunkZ * 16 + 10 + random.nextInt(15));
			if(minHeight < 0) pos = world.getHeight(pos);
			Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
			if(classesList.contains(biome) || classes.length == 0) generator.generate(world, random, pos);
		}
	}
}