package net.kipster.terra;

import net.kipster.terra.proxy.CommonProxy;
import net.kipster.terra.util.handlers.RegistryHandler;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {

    private static final String CATEGORY_BIOMES = "Biomes";
    private static final String CATEGORY_ORES = "Ores";

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
 	public static boolean disableRedMountains = false;
 	public static boolean disableBlueMountains = false;
 	public static boolean disableGreyMountains = false;
 	public static boolean disableBadlands = false;
 	public static boolean disableOvergrownPlains = false;
 	public static boolean disableLushSwamp = false;
 	public static boolean disableThicket = false;
 	public static boolean disableBlossomWoods = false;
 	public static boolean disableBlueTaiga = false;

 	 //Ores
 	public static int anthracitePerChunk = 8;
	public static int bituminousPerChunk = 8;
	public static int lignitePerChunk = 8;
	public static int peatPerChunk = 8;
	public static int hematitePerChunk = 5;
	public static int magnetitePerChunk = 5;
	public static int limonitePerChunk = 5;
	public static int goethitePerChunk = 5;
	public static int ankeritePerChunk = 5;
	public static int bandedPerChunk = 5;
	public static int sideritePerChunk = 5;
	public static int taconitePerChunk = 5;	
	public static int danlveyitePerChunk = 25;
	public static int solituditePerChunk = 25;	
	public static int thenalitePerChunk = 25;	
	public static int kamboradoitePerChunk = 25;	
	public static int magachitePerChunk = 25;	
	public static int meliscitePerChunk = 25;	

    public static void readConfig() {
        Configuration cfg = RegistryHandler.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
            initOreConfig(cfg);
     
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
		disableRedMountains = cfg.get(CATEGORY_BIOMES, "disableRedMountains", disableRedMountains).getBoolean();
		disableBlueMountains = cfg.get(CATEGORY_BIOMES, "disableBlueMountains", disableBlueMountains).getBoolean();
		disableGreyMountains = cfg.get(CATEGORY_BIOMES, "disableGreyMountains", disableGreyMountains).getBoolean();
		disableBadlands = cfg.get(CATEGORY_BIOMES, "disableBadlands", disableBadlands).getBoolean();
		disableThicket = cfg.get(CATEGORY_BIOMES, "disableThicket", disableThicket).getBoolean();
		disableOvergrownPlains = cfg.get(CATEGORY_BIOMES, "disableOvergrownPlains", disableOvergrownPlains).getBoolean();
		disableLushSwamp = cfg.get(CATEGORY_BIOMES, "disableLushSwamp", disableLushSwamp).getBoolean();
		disableBlossomWoods = cfg.get(CATEGORY_BIOMES, "disableBlossomWoods", disableBlossomWoods).getBoolean();
		disableWoodlands = cfg.get(CATEGORY_BIOMES, "disableWoodlands", disableWoodlands).getBoolean();
		disableBlueTaiga = cfg.get(CATEGORY_BIOMES, "disableBlueTaiga", disableBlueTaiga).getBoolean();
    }
    private static void initOreConfig(Configuration cfg) {
    	
        cfg.addCustomCategoryComment(CATEGORY_ORES, "Ore configuration");
        anthracitePerChunk = cfg.getInt("anthracitePerChunk", CATEGORY_ORES, anthracitePerChunk, 0, 100, "Anthracite Per Chunk");
        bituminousPerChunk = cfg.getInt("bituminousPerChunk", CATEGORY_ORES, bituminousPerChunk, 0, 100, "Bituminous Per Chunk");
        lignitePerChunk = cfg.getInt("lignitePerChunk", CATEGORY_ORES, lignitePerChunk, 0, 100, "Lignite Per Chunk");
        peatPerChunk = cfg.getInt("peatPerChunk", CATEGORY_ORES, peatPerChunk, 0, 100, "Peat Per Chunk");
        hematitePerChunk = cfg.getInt("hematitePerChunk", CATEGORY_ORES, hematitePerChunk, 0, 100, "Hematite Per Chunk");
        magnetitePerChunk = cfg.getInt("magnetitePerChunk", CATEGORY_ORES, magnetitePerChunk, 0, 100, "Magnetite Per Chunk");
        limonitePerChunk = cfg.getInt("limonitePerChunk", CATEGORY_ORES, limonitePerChunk, 0, 100, "Limonite Per Chunk");
        goethitePerChunk = cfg.getInt("goethitePerChunk", CATEGORY_ORES, goethitePerChunk, 0, 100, "Goethite Per Chunk");
        ankeritePerChunk = cfg.getInt("ankeritePerChunk", CATEGORY_ORES, ankeritePerChunk, 0, 100, "Ankerite Per Chunk");
        bandedPerChunk = cfg.getInt("bandedPerChunk", CATEGORY_ORES, bandedPerChunk, 0, 100, "Banded Per Chunk");
        sideritePerChunk = cfg.getInt("sideritePerChunk", CATEGORY_ORES, sideritePerChunk, 0, 100, "Siderite Per Chunk");
        taconitePerChunk = cfg.getInt("taconitePerChunk", CATEGORY_ORES, taconitePerChunk, 0, 100, "Taconite Per Chunk");
        danlveyitePerChunk = cfg.getInt("danlveyitePerChunk", CATEGORY_ORES, danlveyitePerChunk, 0, 100, "Danlveyite Per Chunk");
        solituditePerChunk = cfg.getInt("solituditePerChunk", CATEGORY_ORES, solituditePerChunk, 0, 100, "Solitudite Per Chunk");
        thenalitePerChunk = cfg.getInt("thenalitePerChunk", CATEGORY_ORES, thenalitePerChunk, 0, 100, "Thenalite Per Chunk");
        kamboradoitePerChunk = cfg.getInt("kamboradoitePerChunk", CATEGORY_ORES, kamboradoitePerChunk, 0, 100, "Kamboradoite Per Chunk");
        magachitePerChunk = cfg.getInt("magachitePerChunk", CATEGORY_ORES, magachitePerChunk, 0, 100, "Magachite Per Chunk");
        meliscitePerChunk = cfg.getInt("meliscitePerChunk", CATEGORY_ORES, meliscitePerChunk, 0, 100, "Meliscite Per Chunk");
        
        
    }
}