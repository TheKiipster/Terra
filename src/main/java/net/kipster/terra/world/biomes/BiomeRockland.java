package net.kipster.terra.world.biomes;

import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.init.BlockInit;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeRockland extends Biome 
{
	
	protected static final WorldGenBlockBlob COBBLESTONE_BOULDER_FEATURE = new WorldGenBlockBlob(Blocks.COBBLESTONE, 1);
	private final WorldGenerator silverfishSpawner = new WorldGenMinable(Blocks.MONSTER_EGG.getDefaultState().withProperty(BlockSilverfish.VARIANT, BlockSilverfish.EnumType.STONE), 9);
    
public BiomeRockland() 
{
	super(new BiomeProperties("Rockland").setBaseHeight(3.7F).setHeightVariation(0.6F).setTemperature(0.2F).setRainfall(0.3F));
	
	BiomeManager.addVillageBiome(BiomeInit.ROCKLAND , true);
	
	topBlock = Blocks.STONE.getDefaultState();
	fillerBlock = Blocks.STONE.getDefaultState();
	
	this.decorator.generateFalls = false;
	this.decorator.extraTreeChance = 0.02F;
	this.decorator.flowersPerChunk = 0;
    this.decorator.grassPerChunk = 2;
    this.spawnableCreatureList.clear();
 
}
@Override
public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
    if (noiseVal > 1.9D) {
        this.topBlock = Blocks.COBBLESTONE.getDefaultState();
        this.fillerBlock = Blocks.COBBLESTONE.getDefaultState();  } 
    else if (noiseVal > 1D) {
            this.topBlock = Blocks.GRAVEL.getDefaultState();
            this.fillerBlock = Blocks.GRAVEL.getDefaultState();  } 
        else {
     this.topBlock = Blocks.STONE.getDefaultState();
        this.fillerBlock = Blocks.STONE.getDefaultState();
    }

    this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
}

public WorldGenerator getRandomWorldGenForGrass(Random rand)
{
    return rand.nextInt(4) == 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
}

public void decorate(World worldIn, Random rand, BlockPos pos)
{
    super.decorate(worldIn, rand, pos);

    net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Pre(worldIn, rand, pos));
    WorldGenerator emeralds = new EmeraldGenerator();
    if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, emeralds, pos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.EMERALD))
        emeralds.generate(worldIn, rand, pos);

    for (int j1 = 0; j1 < 7; ++j1)
    {
        int k1 = rand.nextInt(16);
        int l1 = rand.nextInt(64);
        int i2 = rand.nextInt(16);
        if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, silverfishSpawner, pos.add(j1, k1, l1), net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.SILVERFISH))
        this.silverfishSpawner.generate(worldIn, rand, pos.add(k1, l1, i2));
    }
    if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.ROCK)) {
        int boulderChance = rand.nextInt(5);
        if (boulderChance == 0) {
            int k6 = rand.nextInt(16) + 8;
            int l = rand.nextInt(16) + 8;
            BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
            COBBLESTONE_BOULDER_FEATURE.generate(worldIn, rand, blockpos);
        }
    }
    net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Post(worldIn, rand, pos));
}




private static class EmeraldGenerator extends WorldGenerator
{
    @Override
    public boolean generate(World worldIn, Random rand, BlockPos pos)
    {
        int count = 3 + rand.nextInt(6);
        for (int i = 0; i < count; i++)
        {
            int offset = net.minecraftforge.common.ForgeModContainer.fixVanillaCascading ? 8 : 0; // MC-114332
            BlockPos blockpos = pos.add(rand.nextInt(16) + offset, rand.nextInt(28) + 4, rand.nextInt(16) + offset);

            net.minecraft.block.state.IBlockState state = worldIn.getBlockState(blockpos);
            if (state.getBlock().isReplaceableOreGen(state, worldIn, blockpos, net.minecraft.block.state.pattern.BlockMatcher.forBlock(Blocks.STONE)))
            {
                worldIn.setBlockState(blockpos, Blocks.EMERALD_ORE.getDefaultState(), 16 | 3);
            }
        }
        return true;
    }
}       
@Override
public int getModdedBiomeGrassColor(int original) {
    return 0x778D51;
}

@Override
public int getModdedBiomeFoliageColor(int original) {
    return 0x778D51;
}

}