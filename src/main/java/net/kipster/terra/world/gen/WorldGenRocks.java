package net.kipster.terra.world.gen;

import java.util.Random;

import net.kipster.terra.Config;
import net.kipster.terra.init.BlockInit;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkGeneratorEnd;
import net.minecraft.world.gen.ChunkGeneratorHell;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;


public class WorldGenRocks implements IWorldGenerator {
	
	private WorldGenerator basalt_stone;
	private WorldGenerator blackdiorite_stone;
	private WorldGenerator imperialquartzite_stone;
	private WorldGenerator pinkquartzite_stone;
	private WorldGenerator redquartzite_stone;
	private WorldGenerator chalk_stone;
	private WorldGenerator blueschist_stone;
	private WorldGenerator greenschist_stone;
	private WorldGenerator gabbro_stone;
	private WorldGenerator gneiss_stone;
	private WorldGenerator kimberlite_stone;
	private WorldGenerator limestone_stone;
	private WorldGenerator marble_stone;
	private WorldGenerator migmatite_stone;
	private WorldGenerator pumice_stone;
	private WorldGenerator rhyolite_stone;
	private WorldGenerator scoria_stone;
	private WorldGenerator slate_stone;
	private WorldGenerator soapstone_stone;
	private WorldGenerator alikite;
	private WorldGenerator krundaltite;
	private WorldGenerator triglicite;
	
	
	public WorldGenRocks() {
		basalt_stone = new WorldGenMinable(BlockInit.BASALT_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		blackdiorite_stone = new WorldGenMinable(BlockInit.BLACKDIORITE_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		imperialquartzite_stone = new WorldGenMinable(BlockInit.IMPERIALQUARTZITE_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		pinkquartzite_stone = new WorldGenMinable(BlockInit.PINKQUARTZITE_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		redquartzite_stone = new WorldGenMinable(BlockInit.REDQUARTZITE_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		chalk_stone = new WorldGenMinable(BlockInit.CHALK_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		blueschist_stone = new WorldGenMinable(BlockInit.BLUESCHIST_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		greenschist_stone = new WorldGenMinable(BlockInit.GREENSCHIST_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		gabbro_stone = new WorldGenMinable(BlockInit.GABBRO_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		gneiss_stone = new WorldGenMinable(BlockInit.GNEISS_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		kimberlite_stone = new WorldGenMinable(BlockInit.KIMBERLITE_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		limestone_stone = new WorldGenMinable(BlockInit.LIMESTONE_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		marble_stone = new WorldGenMinable(BlockInit.MARBLE_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		migmatite_stone = new WorldGenMinable(BlockInit.MIGMATITE_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		pumice_stone = new WorldGenMinable(BlockInit.PUMICE_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		rhyolite_stone = new WorldGenMinable(BlockInit.RHYOLITE_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		scoria_stone = new WorldGenMinable(BlockInit.SCORIA_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		slate_stone = new WorldGenMinable(BlockInit.SLATE_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		soapstone_stone = new WorldGenMinable(BlockInit.SOAPSTONE_STONE.getDefaultState(), 30, BlockMatcher.forBlock(Blocks.STONE));
		alikite = new WorldGenMinable(BlockInit.ALIKITE.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.NETHERRACK));
		krundaltite = new WorldGenMinable(BlockInit.KRUNDALTITE.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.NETHERRACK));
		triglicite = new WorldGenMinable(BlockInit.TRIGLICITE.getDefaultState(), 50, BlockMatcher.forBlock(Blocks.NETHERRACK));
		
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i ++) {
			int x = chunk_X * 16 + rand.nextInt(16);
		    int y = minHeight + rand.nextInt(heightDiff);
		    int z = chunk_Z * 16 + rand.nextInt(16);
		    generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {	
		switch(world.provider.getDimension()) {
		case 0://Overworld
			this.runGenerator(basalt_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(imperialquartzite_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(blackdiorite_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(pinkquartzite_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(chalk_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(blueschist_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(greenschist_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(gabbro_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(gneiss_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(kimberlite_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(limestone_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(marble_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(migmatite_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(pumice_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(rhyolite_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(scoria_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(slate_stone, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(soapstone_stone, world, random, chunkX, chunkZ, 5, 0, 256);
		
			break;
			
		case 6://Mining Dim
			this.runGenerator(basalt_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(imperialquartzite_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(blackdiorite_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(pinkquartzite_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(redquartzite_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(chalk_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(blueschist_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(greenschist_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(gabbro_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(gneiss_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(kimberlite_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(limestone_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(marble_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(migmatite_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(pumice_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(rhyolite_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(scoria_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(slate_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(soapstone_stone, world, random, chunkX, chunkZ, 8, 0, 256);
			
			break;
			
		case -1://Nether
			this.runGenerator(alikite, world, random, chunkX, chunkZ, 20, 0, 256);
			this.runGenerator(krundaltite, world, random, chunkX, chunkZ, 20, 0, 256);
			this.runGenerator(triglicite, world, random, chunkX, chunkZ, 20, 0, 256);

		}	
	}
}