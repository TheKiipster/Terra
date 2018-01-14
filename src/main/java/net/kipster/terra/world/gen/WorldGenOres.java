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


public class WorldGenOres implements IWorldGenerator {
	
	private WorldGenerator anthracite;
	private WorldGenerator bituminous;
	private WorldGenerator lignite;
	private WorldGenerator peat;
	private WorldGenerator hematite;
	private WorldGenerator magnetite;
	private WorldGenerator limonite;
	private WorldGenerator goethite;
	private WorldGenerator ankerite;
	private WorldGenerator siderite;
	private WorldGenerator banded;
	private WorldGenerator taconite;
	private WorldGenerator thenalite;
	private WorldGenerator danlveyite;
	private WorldGenerator solitudite;
	private WorldGenerator magachite;
	private WorldGenerator meliscite;
	private WorldGenerator kamboradoite;

	
	public WorldGenOres() {
		anthracite = new WorldGenMinable(BlockInit.ORE_OVERWORLD_ANTHRACITE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
		bituminous = new WorldGenMinable(BlockInit.ORE_OVERWORLD_BITUMINOUS.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
		lignite = new WorldGenMinable(BlockInit.ORE_OVERWORLD_LIGNITE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
		peat = new WorldGenMinable(BlockInit.ORE_OVERWORLD_PEAT.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
		hematite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_HEMATITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		magnetite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_MAGNETITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		limonite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_LIMONITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		goethite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_GOETHITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		ankerite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_ANKERITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		banded = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_BANDED.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		taconite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_TACONITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		siderite = new WorldGenMinable(BlockInit.ORE_OVERWORLDI_SIDERITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		thenalite = new WorldGenMinable(BlockInit.THENALITE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.NETHERRACK));
		danlveyite = new WorldGenMinable(BlockInit.DANLVEYITE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.NETHERRACK));
		solitudite = new WorldGenMinable(BlockInit.SOLITUDITE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.NETHERRACK));
		magachite = new WorldGenMinable(BlockInit.MAGACHITE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.NETHERRACK));
		meliscite = new WorldGenMinable(BlockInit.MELISCITE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.NETHERRACK));
		kamboradoite = new WorldGenMinable(BlockInit.KAMBORADOITE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.NETHERRACK));
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
			this.runGenerator(anthracite, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(bituminous, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(lignite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(peat, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(hematite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(magnetite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(limonite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(goethite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(ankerite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(banded, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(taconite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(siderite, world, random, chunkX, chunkZ, 5, 0, 256);
			
		
			break;
			
		case 6://Mining Dim
			this.runGenerator(anthracite, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(bituminous, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(lignite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(peat, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(hematite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(magnetite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(limonite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(goethite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(ankerite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(banded, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(taconite, world, random, chunkX, chunkZ, 5, 0, 256);
			this.runGenerator(siderite, world, random, chunkX, chunkZ, 5, 0, 256);
			
			break;
			
		case -1://Nether
			this.runGenerator(thenalite, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(danlveyite, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(solitudite, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(magachite, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(meliscite, world, random, chunkX, chunkZ, 8, 0, 256);
			this.runGenerator(kamboradoite, world, random, chunkX, chunkZ, 8, 0, 256);
		}	
	}
}