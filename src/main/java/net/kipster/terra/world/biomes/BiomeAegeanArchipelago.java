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
import net.kipster.terra.world.biomes.BiomeLushForest.EmeraldGenerator;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeAegeanArchipelago extends Biome
{	
	
	protected static final WorldGenBlockBlob COBBLESTONE_BOULDER_FEATURE = new WorldGenBlockBlob(Blocks.COBBLESTONE, 1);
	
	public BiomeAegeanArchipelago() 
	{
		
		super(new BiomeProperties("Aegean Archipelago").setBaseHeight(-1.8F).setHeightVariation(0.85F).setTemperature(0.5F).setRainfall(0.3F).setWaterColor(0x00b8ff));
		
		
		BiomeManager.addVillageBiome(BiomeInit.AEGEAN_ARCHIPELAGO , false);
		
	topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.STONE.getDefaultState();
		
		this.decorator.treesPerChunk = 5;
		this.decorator.clayPerChunk = 3;
		this.decorator.generateFalls = true;
		this.decorator.gravelPatchesPerChunk = 6;
		this.decorator.sandPatchesPerChunk = 5;
		this.decorator.reedsPerChunk = 3;
		 this.decorator.flowersPerChunk = 3;
	        this.decorator.grassPerChunk = 5;
		
	}
	@Override
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
        if (noiseVal > 1.90D) {
            this.topBlock = Blocks.STONE.getDefaultState();
            this.fillerBlock = Blocks.STONE.getDefaultState();  } 
        else {
         this.topBlock = Blocks.GRASS.getDefaultState();
            this.fillerBlock = Blocks.STONE.getDefaultState();
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
}
@Override
public void decorate(World worldIn, Random rand, BlockPos pos) {
    if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.ROCK)) {
        int boulderChance = rand.nextInt(5);
        if (boulderChance == 0) {
            int k6 = rand.nextInt(16) + 8;
            int l = rand.nextInt(16) + 8;
            BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
            COBBLESTONE_BOULDER_FEATURE.generate(worldIn, rand, blockpos);
        }
    }

    super.decorate(worldIn, rand, pos);
}
	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0x96db1c;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0x96db1c; 
	}
}