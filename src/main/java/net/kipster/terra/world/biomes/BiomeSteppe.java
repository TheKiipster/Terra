package net.kipster.terra.world.biomes;

import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;

public class BiomeSteppe extends Biome 
{	
	public BiomeSteppe() 
	{
		super(new BiomeProperties("Steppe").setBaseHeight(0.89F).setHeightVariation(0.025F).setTemperature(1.0F));
		
		BiomeManager.addVillageBiome(BiomeInit.STEPPE , true);
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.extraTreeChance = 0.07F;
        this.decorator.flowersPerChunk = 1;
        this.decorator.grassPerChunk = 1;
        
        this.spawnableCreatureList.clear();
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityCow.class, 5, 2, 6));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityHorse.class, 5, 2, 6));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityDonkey.class, 1, 1, 3));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityLlama.class, 5, 4, 6));
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
    return 0x8fab50;
}
@Override
public int getModdedBiomeFoliageColor(int original) {
    return 0x8fab50;
}
}