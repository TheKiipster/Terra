package net.kipster.terra.world.biomes;

import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.world.gen.WorldGenWeirdLineThing;
import net.kipster.terra.world.gen.trees.WorldGenTerraShrub;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeCliffs extends Biome 
{	
	protected static final WorldGenAbstractTree TREE = new WorldGenTerraShrub(Blocks.LEAVES, Blocks.LOG, 2, 2, false);
	private static final WorldGenTaiga2 SPRUCE_GENERATOR = new WorldGenTaiga2(true);
	protected static final WorldGenBlockBlob COBBLESTONE_BOULDER_FEATURE = new WorldGenBlockBlob(Blocks.COBBLESTONE, 1);
	protected static final WorldGenWeirdLineThing COBBLE = new WorldGenWeirdLineThing(Blocks.COBBLESTONE, 1);
	
	public BiomeCliffs() 
	{
		super(new BiomeProperties("Cliffs").setBaseHeight(3.4F).setHeightVariation(0.4F).setTemperature(Biomes.FOREST.getDefaultTemperature()).setRainfall(Biomes.EXTREME_HILLS.getRainfall()));
		
		BiomeManager.addVillageBiome(BiomeInit.CLIFFS , true);
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.generateFalls = true; 
		this.decorator.gravelPatchesPerChunk = 4;
		this.decorator.treesPerChunk = 3;
        this.decorator.flowersPerChunk = 1;
        this.decorator.grassPerChunk = 1;
        
        this.spawnableCreatureList.clear();
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityLlama.class, 5, 4, 6));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
	}
	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
    {
        
            return (WorldGenAbstractTree)(rand.nextInt(3) == 0 ? SPRUCE_GENERATOR : TREE);
        
    }
	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos) {

		  if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.ROCK)) {
	            int genChance = rand.nextInt(3);
	            if (genChance == 0) {
	                int k6 = rand.nextInt(16) + 8;
	                int l = rand.nextInt(16) + 8;
	                BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
	                COBBLESTONE_BOULDER_FEATURE.generate(worldIn, rand, blockpos);
	            }
	            if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.ROCK)) {
		            int genChance1 = rand.nextInt(3);
		            if (genChance1 == 0) {
		                int k6 = rand.nextInt(16) + 8;
		                int l = rand.nextInt(16) + 8;
		                BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
		                COBBLE.generate(worldIn, rand, blockpos);
	        }
		  
	super.decorate(worldIn, rand, pos);
		
	            }
		  }
	}
	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0x8cb06b;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0x8cb06b;
	}
	}    
