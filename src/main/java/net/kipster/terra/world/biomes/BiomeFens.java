package net.kipster.terra.world.biomes;

import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.BiomeManager;

public class BiomeFens extends Biome 
{	
	public BiomeFens() 
	{
		super(new BiomeProperties("Fens").setBaseHeight(-0.2F).setHeightVariation(0.1F).setTemperature(0.8F).setRainfall(0.9F).setWaterColor(14745518));
		
		BiomeManager.addVillageBiome(BiomeInit.FENS , true);
		
		topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.extraTreeChance = 0.05F;
        this.decorator.treesPerChunk = 0;
        this.decorator.flowersPerChunk = 1;
        this.decorator.deadBushPerChunk = 1;
        this.decorator.mushroomsPerChunk = 8;
        this.decorator.reedsPerChunk = 10;
        this.decorator.clayPerChunk = 5;
        this.decorator.waterlilyPerChunk = 6;
        this.decorator.sandPatchesPerChunk = 0;
        this.decorator.gravelPatchesPerChunk = 0;
        this.decorator.grassPerChunk = 10;
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySlime.class, 1, 1, 1));
        
	}
        @Override
        public int getModdedBiomeGrassColor(int original) {
            return 0x63A154;
        }

        @Override
        public int getModdedBiomeFoliageColor(int original) {
            return 0x63A154;
        }
	}