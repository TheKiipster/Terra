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

public class WorldGenCoalOres implements IWorldGenerator
{
	private WorldGenerator ore_overworldc_anthracite;
	private WorldGenerator ore_overworldc_bituminous;
	private WorldGenerator ore_overworldc_lignite;
	private WorldGenerator ore_overworldc_peat;

	
	public WorldGenCoalOres() 
	{
		
		ore_overworldc_anthracite = new WorldGenMinable(BlockInit.ORE_OVERWORLD_ANTHRACITE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworldc_bituminous = new WorldGenMinable(BlockInit.ORE_OVERWORLD_BITUMINOUS.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworldc_lignite = new WorldGenMinable(BlockInit.ORE_OVERWORLD_LIGNITE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworldc_peat = new WorldGenMinable(BlockInit.ORE_OVERWORLD_PEAT.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		
		
	
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 0:
			
			runGenerator(ore_overworldc_anthracite, world, random, chunkX, chunkZ, 11, 0, 100);
			runGenerator(ore_overworldc_bituminous, world, random, chunkX, chunkZ, 11, 0, 100);
			runGenerator(ore_overworldc_lignite, world, random, chunkX, chunkZ, 11, 0, 100);
			runGenerator(ore_overworldc_peat, world, random, chunkX, chunkZ, 11, 0, 100);

			
			
			break;
		}
		switch(world.provider.getDimension())
		{
		case 6:
			
			runGenerator(ore_overworldc_anthracite, world, random, chunkX, chunkZ, 16, 0, 100);
			runGenerator(ore_overworldc_bituminous, world, random, chunkX, chunkZ, 16, 0, 100);
			runGenerator(ore_overworldc_lignite, world, random, chunkX, chunkZ, 16, 0, 100);
			runGenerator(ore_overworldc_peat, world, random, chunkX, chunkZ, 16, 0, 100);

			
			
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