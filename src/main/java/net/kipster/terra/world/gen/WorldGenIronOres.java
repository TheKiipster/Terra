package net.kipster.terra.world.gen;

import java.util.Random;

import net.kipster.terra.init.BlockInit;
import net.kipster.terra.util.handlers.IronOreEnumHandler;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenIronOres implements IWorldGenerator
{
	private WorldGenerator ore_overworldi_hematite;
	private WorldGenerator ore_overworldi_limonite;
	private WorldGenerator ore_overworldi_magnetite;
	private WorldGenerator ore_overworldi_goethite;
	private WorldGenerator ore_overworldi_siderite;
	private WorldGenerator ore_overworldi_ankerite;
	private WorldGenerator ore_overworldi_taconite;
	private WorldGenerator ore_overworldi_banded;

	
	public WorldGenIronOres() 
	{
		
		ore_overworldi_hematite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_HEMATITE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworldi_limonite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_LIMONITE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworldi_magnetite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_MAGNETITE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworldi_goethite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_GOETHITE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworldi_siderite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_SIDERITE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworldi_ankerite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_ANKERITE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworldi_taconite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_TACONITE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworldi_banded = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_BANDED.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));

	
		
	
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 0:
			
			runGenerator(ore_overworldi_hematite, world, random, chunkX, chunkZ, 10, 0, 100);
			runGenerator(ore_overworldi_limonite, world, random, chunkX, chunkZ, 10, 0, 100);
			runGenerator(ore_overworldi_magnetite, world, random, chunkX, chunkZ, 10, 0, 100);
			runGenerator(ore_overworldi_goethite, world, random, chunkX, chunkZ, 10, 0, 100);
			runGenerator(ore_overworldi_siderite, world, random, chunkX, chunkZ, 10, 0, 100);
			runGenerator(ore_overworldi_ankerite, world, random, chunkX, chunkZ, 10, 0, 100);
			runGenerator(ore_overworldi_taconite, world, random, chunkX, chunkZ, 10, 0, 100);
			runGenerator(ore_overworldi_banded, world, random, chunkX, chunkZ, 10, 0, 100);
			
			
			break;
		}
		switch(world.provider.getDimension())
		{
		case 6:
			
			runGenerator(ore_overworldi_hematite, world, random, chunkX, chunkZ, 12, 0, 100);
			runGenerator(ore_overworldi_limonite, world, random, chunkX, chunkZ, 12, 0, 100);
			runGenerator(ore_overworldi_magnetite, world, random, chunkX, chunkZ, 12, 0, 100);
			runGenerator(ore_overworldi_goethite, world, random, chunkX, chunkZ, 12, 0, 100);
			runGenerator(ore_overworldi_siderite, world, random, chunkX, chunkZ, 12, 0, 100);
			runGenerator(ore_overworldi_ankerite, world, random, chunkX, chunkZ, 12, 0, 100);
			runGenerator(ore_overworldi_taconite, world, random, chunkX, chunkZ, 12, 0, 100);
			runGenerator(ore_overworldi_banded, world, random, chunkX, chunkZ, 12, 0, 100);
			
			
			break;
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}