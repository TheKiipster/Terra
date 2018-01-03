package net.kipster.terra.world.biomes;

import java.util.Iterator;
import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenIcePath;
import net.minecraft.world.gen.feature.WorldGenIceSpike;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;

public class BiomeColdPlateau extends Biome 
{	
	private final WorldGenIceSpike iceSpike = new WorldGenIceSpike();
    private final WorldGenIcePath icePatch = new WorldGenIcePath(4);
	
	public BiomeColdPlateau() 
	{
		super(new BiomeProperties("Cold Plateau").setBaseHeight(2F).setHeightVariation(0.025F).setTemperature(-0.6F).setSnowEnabled());
		
		BiomeManager.addVillageBiome(BiomeInit.COLDPLATEAU , true);
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 4;
        this.decorator.flowersPerChunk = 0;
        this.decorator.grassPerChunk = 1;
        
        this.spawnableCreatureList.clear();
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 4, 2, 3));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityPolarBear.class, 5, 4, 6));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityLlama.class, 5, 4, 6));
        Iterator<Biome.SpawnListEntry> iterator = this.spawnableMonsterList.iterator();

        while (iterator.hasNext())
        {
            Biome.SpawnListEntry biome$spawnlistentry = iterator.next();

            if (biome$spawnlistentry.entityClass == EntitySkeleton.class)
            {
                iterator.remove();
            }
        }

        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySkeleton.class, 20, 4, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityStray.class, 80, 4, 4));
	}
	 public void decorate(World worldIn, Random rand, BlockPos pos)
	    {
	        if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.ICE))
	        {
	            for (int i = 0; i < 3; ++i)
	            {
	                int j = rand.nextInt(16) + 8;
	                int k = rand.nextInt(16) + 8;
	                this.iceSpike.generate(worldIn, rand, worldIn.getHeight(pos.add(j, 0, k)));
	            }

	            for (int l = 0; l < 2; ++l)
	            {
	                int i1 = rand.nextInt(16) + 8;
	                int j1 = rand.nextInt(16) + 8;
	                this.icePatch.generate(worldIn, rand, worldIn.getHeight(pos.add(i1, 0, j1)));
	            }
	        }

	        super.decorate(worldIn, rand, pos);
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

    public WorldGenAbstractTree getRandomTreeFeature(Random rand)
    {
        return new WorldGenTaiga2(false);
    }   

@Override
public int getModdedBiomeGrassColor(int original) {
    return 0x7ABA86;
}
@Override
public int getModdedBiomeFoliageColor(int original) {
    return 0x7ABA86;
}
}