package net.kipster.terra.world.biomes;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.BiomeForest;

public class BiomeColdForest extends BiomeForest{

    public BiomeColdForest(BiomeForest.Type type, String name) {
        super(type, new BiomeProperties(name).setTemperature(Biomes.ICE_PLAINS.getDefaultTemperature()).setRainfall(Biomes.FOREST.getRainfall()).setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setSnowEnabled());
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