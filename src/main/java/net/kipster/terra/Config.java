package net.kipster.terra;

import net.kipster.terra.proxy.CommonProxy;
import net.kipster.terra.util.handlers.RegistryHandler;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {

    private static final String CATEGORY_BIOMES = "Biomes";

 // Biomes
	
 	 public static boolean disableGrassland = false;
 	 public static boolean disableWhiteDesert = false;
 	 public static boolean disableBlackDesert = false;
 	 public static boolean disableGreenExtremeHills = false;
 	 public static boolean disableGreenHills = false;
 	 public static boolean disablePlateau = false;
 	 public static boolean disableGreenPlateau = false;
 	 public static boolean disableRedPlateau = false;
 	 public static boolean disableDryPlateau = false;
 	 public static boolean disableSteppe = false;
 	 public static boolean disableFrozenPlateau = false;
 	 public static boolean disableColdPlateau = false;
 	 public static boolean disableFens = false;
 	 public static boolean disableShrubland = false;
 	 public static boolean disableTundraSpikes = false;
 	 public static boolean disableTundra = false;
 	 public static boolean disableRockland = false;
 	 public static boolean disableLake = false;
 	 public static boolean disableFrozenLake = false;
 	 public static boolean disableSahel = false;
 	 public static boolean disableDunes = false;
 	 public static boolean disableAlps = false;
 	 public static boolean disableHighlands = false;
 	 public static boolean disableGlacier = false;
 	 public static boolean disablePinelands = false;
 	 public static boolean disableLushForest = false;
 	 public static boolean disableMeadow = false;
 	 public static boolean disablePraire = false;
 	 public static boolean disableRainforest = false;
 	 public static boolean disableWoodlands = false;
 	 public static boolean disablePinkBeach = false;
 	 public static boolean disableBlackBeach = false;
 	 public static boolean disablePurpleBeach = false;
 	 public static boolean disableRedBeach = false;
 	 public static boolean disableWhiteBeach = false;
 	 public static boolean disableGreenBeach = false;
 	 public static boolean disableOrangeBeach = false;


    public static void readConfig() {
        Configuration cfg = RegistryHandler.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
     
        } catch (Exception e1) {
          
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_BIOMES, "Biome configuration");
        disableGrassland = cfg.get(CATEGORY_BIOMES, "disableGrassland", disableGrassland).getBoolean();
		disableMeadow = cfg.get(CATEGORY_BIOMES, "disableMeadow", disableMeadow).getBoolean();
		disableWhiteBeach = cfg.get(CATEGORY_BIOMES, "disableWhiteBeach", disableWhiteBeach).getBoolean();
		disableBlackBeach = cfg.get(CATEGORY_BIOMES, "disableBlackBeach", disableBlackBeach).getBoolean();
		disablePinkBeach = cfg.get(CATEGORY_BIOMES, "disablePinkBeach", disablePinkBeach).getBoolean();
		disablePurpleBeach = cfg.get(CATEGORY_BIOMES, "disablePurpleBeach", disablePurpleBeach).getBoolean();
		disableRedBeach = cfg.get(CATEGORY_BIOMES, "disableRedBeach", disableRedBeach).getBoolean();
		disableGreenBeach = cfg.get(CATEGORY_BIOMES, "disableGreenBeach", disableGreenBeach).getBoolean();
		disableOrangeBeach = cfg.get(CATEGORY_BIOMES, "disableOrangeBeach", disableOrangeBeach).getBoolean();
		disableBlackDesert = cfg.get(CATEGORY_BIOMES, "disableBlackDesert", disableBlackDesert).getBoolean();
		disableWhiteDesert = cfg.get(CATEGORY_BIOMES, "disableWhiteDesert", disableWhiteDesert).getBoolean();
		disableGreenExtremeHills = cfg.get(CATEGORY_BIOMES, "disableGreenExtremeHills", disableGreenExtremeHills).getBoolean();
		disableGreenHills = cfg.get(CATEGORY_BIOMES, "disableGreenHills", disableGreenHills).getBoolean();
		disablePlateau = cfg.get(CATEGORY_BIOMES, "disablePlateau", disablePlateau).getBoolean();
		disableGreenPlateau = cfg.get(CATEGORY_BIOMES, "disableGreenPlateau", disableGreenPlateau).getBoolean();
		disableRedPlateau = cfg.get(CATEGORY_BIOMES, "disableRedPlateau", disableRedPlateau).getBoolean();
		disableColdPlateau = cfg.get(CATEGORY_BIOMES, "disableColdPlateau", disableColdPlateau).getBoolean();
		disableFrozenPlateau = cfg.get(CATEGORY_BIOMES, "disableFrozenPlateau", disableFrozenPlateau).getBoolean();
		disableSteppe = cfg.get(CATEGORY_BIOMES, "disableSteppe", disableSteppe).getBoolean();
		disableDryPlateau = cfg.get(CATEGORY_BIOMES, "disableDryPlateau", disableDryPlateau).getBoolean();
		disableFens = cfg.get(CATEGORY_BIOMES, "disableFens", disableFens).getBoolean();
		disableShrubland = cfg.get(CATEGORY_BIOMES, "disableShrubland", disableShrubland).getBoolean();
		disableTundraSpikes = cfg.get(CATEGORY_BIOMES, "disableTundraSpikes", disableTundraSpikes).getBoolean();
		disableTundra = cfg.get(CATEGORY_BIOMES, "disableTundra", disableTundra).getBoolean();
		disableRockland = cfg.get(CATEGORY_BIOMES, "disableRockland", disableRockland).getBoolean();
		disableLake = cfg.get(CATEGORY_BIOMES, "disableLake", disableLake).getBoolean();
		disableFrozenLake = cfg.get(CATEGORY_BIOMES, "disableFrozenLake", disableFrozenLake).getBoolean();
		disableSahel = cfg.get(CATEGORY_BIOMES, "disableSahel", disableSahel).getBoolean();
		disableDunes = cfg.get(CATEGORY_BIOMES, "disableDunes", disableDunes).getBoolean();
		disableAlps = cfg.get(CATEGORY_BIOMES, "disableAlps", disableAlps).getBoolean();
		disableHighlands = cfg.get(CATEGORY_BIOMES, "disableHighlands", disableHighlands).getBoolean();
		disableGlacier = cfg.get(CATEGORY_BIOMES, "disableGlacier", disableGlacier).getBoolean();
		disablePinelands = cfg.get(CATEGORY_BIOMES, "disablePinelands", disablePinelands).getBoolean();
		disableLushForest = cfg.get(CATEGORY_BIOMES, "disableLushForest", disableLushForest).getBoolean();
		disableRainforest = cfg.get(CATEGORY_BIOMES, "disableRainforest", disableRainforest).getBoolean();
		disableWoodlands = cfg.get(CATEGORY_BIOMES, "disableWoodlands", disableWoodlands).getBoolean();
    }
}