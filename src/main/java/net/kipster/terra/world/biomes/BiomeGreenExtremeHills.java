package net.kipster.terra.world.biomes;

import java.util.Random;

import net.kipster.terra.init.BiomeInit;
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
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;

public class BiomeGreenExtremeHills extends Biome 
{
	private final WorldGenerator silverfishSpawner = new WorldGenMinable(Blocks.MONSTER_EGG.getDefaultState().withProperty(BlockSilverfish.VARIANT, BlockSilverfish.EnumType.STONE), 9);
    private final WorldGenTaiga2 spruceGenerator = new WorldGenTaiga2(false);
    
public BiomeGreenExtremeHills() 
{
	super(new BiomeProperties("Green Extreme Hills").setBaseHeight(1.0F).setHeightVariation(0.5F).setTemperature(0.2F).setRainfall(0.3F));
	
	BiomeManager.addVillageBiome(BiomeInit.GREENEXTREMEHILLS , true);
	
	topBlock = Blocks.GRASS.getDefaultState();
	fillerBlock = Blocks.DIRT.getDefaultState();
	
	this.decorator.generateFalls = true;
	this.decorator.treesPerChunk = 5;
	this.decorator.flowersPerChunk = 4;
    this.decorator.grassPerChunk = 20;
    this.spawnableCreatureList.clear();
    this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
	 this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityLlama.class, 5, 4, 6));
	 this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
}

public WorldGenAbstractTree getRandomTreeFeature(Random rand)
{
    return (WorldGenAbstractTree)(rand.nextInt(3) > 0 ? this.spruceGenerator : super.getRandomTreeFeature(rand));
}
public WorldGenerator getRandomWorldGenForGrass(Random rand)
{
    return rand.nextInt(4) == 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
}

public void decorate(World worldIn, Random rand, BlockPos pos)
{
    super.decorate(worldIn, rand, pos);

    DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.GRASS);

    if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
    for (int i = 0; i < 7; ++i)
    {
        int j = rand.nextInt(16) + 8;
        int k = rand.nextInt(16) + 8;
        int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
        DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
    }
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
    return 0x409A35;
}

@Override
public int getModdedBiomeFoliageColor(int original) {
    return 0x409A35;
}

}