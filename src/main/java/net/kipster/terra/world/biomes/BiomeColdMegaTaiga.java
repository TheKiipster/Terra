package net.kipster.terra.world.biomes;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeTaiga;

public class BiomeColdMegaTaiga extends BiomeTaiga{

    public BiomeColdMegaTaiga(BiomeTaiga.Type type, String name) {
        super(type, new BiomeProperties(name).setTemperature(Biomes.ICE_PLAINS.getDefaultTemperature()).setRainfall(Biomes.TAIGA.getRainfall()).setBaseHeight(Biomes.TAIGA.getBaseHeight()).setHeightVariation(Biomes.TAIGA.getHeightVariation()).setSnowEnabled());
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