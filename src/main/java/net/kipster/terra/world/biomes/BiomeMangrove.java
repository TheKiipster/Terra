package net.kipster.terra.world.biomes;

import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.world.gen.trees.WorldGenMangrove;
import net.kipster.terra.world.gen.trees.WorldGenTreeSwamp;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenFossils;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.BiomeManager;

public class BiomeMangrove extends Biome 
{	
	protected static final WorldGenAbstractTree TREE = new WorldGenMangrove();
	protected static final IBlockState WATER_LILY = Blocks.WATERLILY.getDefaultState();
	public BiomeMangrove() 
	{
		super(new BiomeProperties("Mangrove").setBaseHeight(-.23F).setHeightVariation(0.01F).setTemperature(0.8F).setRainfall(0.9F).setWaterColor(0x4e653c));
		
		BiomeManager.addVillageBiome(BiomeInit.MANGROVE , false);
		
		this.decorator.generateFalls = true;
		this.decorator.bigMushroomsPerChunk = 2;
		 this.decorator.treesPerChunk = 12;
	        this.decorator.flowersPerChunk = 8;
	        this.decorator.deadBushPerChunk = 3;
	        this.decorator.sandPatchesPerChunk = 19;
	        this.decorator.mushroomsPerChunk = 8;
	        this.decorator.reedsPerChunk = 10;
	        this.decorator.clayPerChunk = 7;
	        this.decorator.waterlilyPerChunk = 6;
	        this.decorator.grassPerChunk = 5;
	        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySlime.class, 1, 1, 1));
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		
        
	}
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return TREE;
}

    public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos)
    {
        return BlockFlower.EnumFlowerType.BLUE_ORCHID;
    }

    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal)
    {
        double d0 = GRASS_COLOR_NOISE.getValue((double)x * 0.25D, (double)z * 0.25D);

        if (d0 > 0.0D)
        {
            int i = x & 15;
            int j = z & 15;

            for (int k = 255; k >= 0; --k)
            {
                if (chunkPrimerIn.getBlockState(j, k, i).getMaterial() != Material.AIR)
                {
                    if (k == 62 && chunkPrimerIn.getBlockState(j, k, i).getBlock() != Blocks.WATER)
                    {
                        chunkPrimerIn.setBlockState(j, k, i, WATER);

                        if (d0 < 0.12D)
                        {
                            chunkPrimerIn.setBlockState(j, k + 1, i, WATER_LILY);
                        }
                    }

                    break;
                }
            }
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
    }

    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
        super.decorate(worldIn, rand, pos);

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FOSSIL))
        if (rand.nextInt(64) == 0)
        {
            (new WorldGenFossils()).generate(worldIn, rand, pos);
        }
    }

    @Override
    public void addDefaultFlowers()
    {
        addFlower(Blocks.RED_FLOWER.getDefaultState().withProperty(Blocks.RED_FLOWER.getTypeProperty(), BlockFlower.EnumFlowerType.BLUE_ORCHID), 10);
    
}

@Override
public int getModdedBiomeGrassColor(int original) {
    return 0x395a1e;
}
@Override
public int getModdedBiomeFoliageColor(int original) {
    return 0x395a1e;
}
}
