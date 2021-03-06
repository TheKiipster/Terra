package net.kipster.terra.world.biomes;

import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.world.gen.trees.WorldGenTerraShrub;
import net.kipster.terra.world.gen.trees.WorldGenTreeShrubOak;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;

public class BiomeShrubland extends Biome 
{	
	protected static final WorldGenAbstractTree SHRUB_OAK = new WorldGenTreeShrubOak();
	
	 
	public BiomeShrubland() 
	{
		super(new BiomeProperties("Shrubland").setBaseHeight(0.1F).setHeightVariation(0.024F).setTemperature(0.8F).setRainfall(0.4F));
		
		BiomeManager.addVillageBiome(BiomeInit.SHRUBLAND , true);
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
        this.spawnableCreatureList.clear();
		this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntitySheep.class, 5, 2, 6));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityPig.class, 5, 2, 6));
        this.decorator.treesPerChunk = 1;
        this.decorator.flowersPerChunk = 2;
        this.decorator.grassPerChunk = 4;

	}

	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return (WorldGenAbstractTree)(rand.nextInt(2) == 0 ? SHRUB_OAK : SHRUB_OAK);
		}

	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0x89BA60;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0x89BA60;
	}
}