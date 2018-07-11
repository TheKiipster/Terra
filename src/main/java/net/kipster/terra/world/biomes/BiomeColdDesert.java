package net.kipster.terra.world.biomes;

import java.util.Iterator;
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
import net.kipster.terra.world.gen.WorldGenSandPatches;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
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
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeColdDesert extends Biome 
{	
	
	 protected static final WorldGenSandPatches PACKED_ICE = new WorldGenSandPatches(Blocks.PACKED_ICE.getDefaultState(), 5);
	public BiomeColdDesert() 
	{
		
		super(new BiomeProperties("Cold Desert").setBaseHeight(Biomes.DESERT.getBaseHeight()).setHeightVariation(Biomes.DESERT.getHeightVariation()).setTemperature(Biomes.COLD_TAIGA.getDefaultTemperature()).setRainfall(Biomes.COLD_TAIGA.getRainfall()));

		BiomeManager.addVillageBiome(BiomeInit.COLD_DESERT , false);
		
		 this.spawnableCreatureList.clear();
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityPolarBear.class, 5, 4, 6));
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
    @Override
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
        if (noiseVal > 1.7D) {
            this.topBlock = Blocks.GRAVEL.getDefaultState();
            this.fillerBlock = Blocks.GRAVEL.getDefaultState();
        } else {
            this.topBlock = Blocks.SNOW.getDefaultState();
            this.fillerBlock = Blocks.SNOW.getDefaultState();
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
    }
    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
    	
    	int iceChance = rand.nextInt(4);
    	if (iceChance == 0) {
    		int k6 = rand.nextInt(16) + 8;
    		int l = rand.nextInt(16) + 8;
    		BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
    		PACKED_ICE.generate(worldIn, rand, blockpos);
    	}

        super.decorate(worldIn, rand, pos);
    	  }
            

	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0x9a7e4c;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0x9a7e4c;
	}
}