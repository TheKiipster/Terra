package net.kipster.terra;

import net.kipster.terra.proxy.CommonProxy;
import net.kipster.terra.util.handlers.RegistryHandler;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {

    private static final String CATEGORY_BIOMES = "Biomes";
    private static final String CATEGORY_ORES = "Ores";
    private static final String CATEGORY_ROCKS = "Rocks";

    //Biomes
	
 	 public static boolean disableGrassland = false;
 	 public static boolean disableTropicalDesert = false;
 	 public static boolean disableBlackDesert = false;
 	 public static boolean disableGreenExtremeHills = false;
 	 public static boolean disableGreenHills = false;
 	 public static boolean disablePlateau = false;
 	 public static boolean disableGreenPlateau = true;
 	 public static boolean disableRedPlateau = false;
 	 public static boolean disableDryPlateau = true;
 	 public static boolean disableSteppe = false;
 	 public static boolean disableFrozenPlateau = true;
 	 public static boolean disableColdPlateau = true;
 	 public static boolean disableFens = false;
 	 public static boolean disableShrubland = false;
 	 public static boolean disableTundraSpikes = false;
 	 public static boolean disableTundra = false;
 	 public static boolean disableRockland = false;
 	 public static boolean disableLake = false;
 	 public static boolean disableFrozenLake = false;
 	 public static boolean disableSahel = false;
 	 public static boolean disableSandstoneDunes = false;
 	 public static boolean disableSandDunes = false;
 	 public static boolean disableRedSandDunes = false;
 	 public static boolean disableOrangeSandDunes = false;
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
 	 public static boolean disableBrownBeach = false;
 	 public static boolean disablePurpleBeach = false;
 	 public static boolean disableRedBeach = false;
 	 public static boolean disableWhiteBeach = false;
 	 public static boolean disableGreenBeach = false;
 	 public static boolean disableOrangeBeach = false;
 	public static boolean disableRedMountains = false;
 	public static boolean disableBlueMountains = false;
 	public static boolean disableGreyMountains = false;
 	public static boolean disableClaylands = false;
 	public static boolean disableOvergrownPlains = false;
 	public static boolean disableLushSwamp = false;
 	public static boolean disableThicket = false;
 	public static boolean disableBlossomWoods = false;
 	public static boolean disableBlueTaiga = false;
 	public static boolean disableColdBlueTaiga = false;
	public static boolean disableCrimsonWoods = false;
	public static boolean disableSilkglades = false;
	public static boolean disableColdDesert = false;
	public static boolean disableMysticWoods = false;
	public static boolean disableSpruceWoods = false;
	public static boolean disableOutback = false;
	public static boolean disableSemiAridDesert = false;
	public static boolean disableColdForest = false;
	public static boolean disableColdBirchForest = false;
	public static boolean disableColdRoofedForest = false;
	public static boolean disableColdMegaTaiga = false;
	public static boolean disableColdMegaSpruceTaiga = false;
	public static boolean disableBlueMushroomPlains = false;
	public static boolean disablePinkMushroomPlains = false;
	public static boolean disableFungalJungle = false;
	public static boolean disableSaltLake = true;
	public static boolean disableJungleArchipelago = false;
	public static boolean disableAegeanArchipelago = false;
	public static boolean disableMountainousArchipelago = false;
	public static boolean disableDesertArchipelago = false;
	public static boolean disableAncientForest = false;
	public static boolean disableMangrove = false;
	public static boolean disableGoldenForest = false;
	public static boolean disableCliffs = false;
	public static boolean disableSahara = false;
	public static boolean disableTropicalForest = false;
	public static boolean disableTropicalGrassland = false;
	public static boolean disableBlossomArchipelago = true;
	public static boolean disableColdArchipelago = true;
	public static boolean disableRainforestArchipelago = true;
	public static boolean disableDenseShrubland = false;
	public static boolean disableOakForest = false;
	public static boolean disableStonelands = false;
	public static boolean disableAutumnTaiga = false;
	public static boolean disableBlackSandDunes = false;
	public static boolean disableDryShrubland = false;
	public static boolean disableTallOakForest = false;
	
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
	
	//Rocks
	public static int basaltPerChunk = 1;
	public static int blackdioritePerChunk = 1;
	public static int chalkPerChunk = 1;
	public static int blueschistPerChunk = 1;
	public static int gabbroPerChunk = 1;
	public static int limestonePerChunk = 1;
	public static int gneissPerChunk = 1;
	public static int greenschistPerChunk = 1;	
	public static int imperialquartzitePerChunk = 1;	
	public static int kimberlitePerChunk = 1;	
	public static int marblePerChunk = 1;	
	public static int migmatitePerChunk = 1;	
	public static int pinkquartzitePerChunk = 1;	
	public static int pumicePerChunk = 1;	
	public static int redquartzitePerChunk = 1;	
	public static int rhyolitePerChunk = 1;	
	public static int slatePerChunk = 1;	
	public static int scoriaPerChunk = 1;	
	public static int soapstonePerChunk = 1;	
	public static int dacitePerChunk = 1;
	public static int tuffPerChunk = 1;
	public static int pegmatitePerChunk = 1;
	public static int peridotitePerChunk = 1;
	public static int anorthositePerChunk = 1;
	public static int dunitePerChunk = 1;
	public static int felsitePerChunk = 1;
	public static int granodioritePerChunk = 1;	
	public static int komatitePerChunk = 1;	
	public static int latitePerChunk = 1;	
	public static int porphyryPerChunk = 1;	
	public static int pyroxenitePerChunk = 1;	
	public static int syenitePerChunk = 1;	
	public static int troctolitePerChunk = 1;		
	public static int alikitePerChunk = 12;	
	public static int krundaltitePerChunk = 12;	
	public static int triglicitePerChunk = 12;	

    public static void readConfig() {
        Configuration cfg = RegistryHandler.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
            initOreConfig(cfg);
            initRockConfig(cfg);
     
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
		disableBrownBeach = cfg.get(CATEGORY_BIOMES, "disableBrownBeach", disableBrownBeach).getBoolean();
		disableGreenBeach = cfg.get(CATEGORY_BIOMES, "disableGreenBeach", disableGreenBeach).getBoolean();
		disableOrangeBeach = cfg.get(CATEGORY_BIOMES, "disableOrangeBeach", disableOrangeBeach).getBoolean();
		disableBlackDesert = cfg.get(CATEGORY_BIOMES, "disableBlackDesert", disableBlackDesert).getBoolean();
		disableTropicalDesert = cfg.get(CATEGORY_BIOMES, "disableTropicalDesert", disableTropicalDesert).getBoolean();
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
		disableSandstoneDunes = cfg.get(CATEGORY_BIOMES, "disableSandstoneDunes", disableSandstoneDunes).getBoolean();
		disableSandDunes = cfg.get(CATEGORY_BIOMES, "disableSandDunes", disableSandDunes).getBoolean();
		disableRedSandDunes = cfg.get(CATEGORY_BIOMES, "disableRedSandDunes", disableRedSandDunes).getBoolean();
		disableOrangeSandDunes = cfg.get(CATEGORY_BIOMES, "disableOrangeSandDunes", disableOrangeSandDunes).getBoolean();
		disableAlps = cfg.get(CATEGORY_BIOMES, "disableAlps", disableAlps).getBoolean();
		disableHighlands = cfg.get(CATEGORY_BIOMES, "disableHighlands", disableHighlands).getBoolean();
		disableGlacier = cfg.get(CATEGORY_BIOMES, "disableGlacier", disableGlacier).getBoolean();
		disablePinelands = cfg.get(CATEGORY_BIOMES, "disablePinelands", disablePinelands).getBoolean();
		disableLushForest = cfg.get(CATEGORY_BIOMES, "disableLushForest", disableLushForest).getBoolean();
		disableRainforest = cfg.get(CATEGORY_BIOMES, "disableRainforest", disableRainforest).getBoolean();
		disableRedMountains = cfg.get(CATEGORY_BIOMES, "disableRedMountains", disableRedMountains).getBoolean();
		disableBlueMountains = cfg.get(CATEGORY_BIOMES, "disableBlueMountains", disableBlueMountains).getBoolean();
		disableGreyMountains = cfg.get(CATEGORY_BIOMES, "disableGreyMountains", disableGreyMountains).getBoolean();
		disableClaylands = cfg.get(CATEGORY_BIOMES, "disableClaylands", disableClaylands).getBoolean();
		disableThicket = cfg.get(CATEGORY_BIOMES, "disableThicket", disableThicket).getBoolean();
		disableOvergrownPlains = cfg.get(CATEGORY_BIOMES, "disableOvergrownPlains", disableOvergrownPlains).getBoolean();
		disableLushSwamp = cfg.get(CATEGORY_BIOMES, "disableLushSwamp", disableLushSwamp).getBoolean();
		disableBlossomWoods = cfg.get(CATEGORY_BIOMES, "disableBlossomWoods", disableBlossomWoods).getBoolean();
		disableWoodlands = cfg.get(CATEGORY_BIOMES, "disableWoodlands", disableWoodlands).getBoolean();
		disableBlueTaiga = cfg.get(CATEGORY_BIOMES, "disableBlueTaiga", disableBlueTaiga).getBoolean();
		disableColdBlueTaiga = cfg.get(CATEGORY_BIOMES, "disableColdBlueTaiga", disableColdBlueTaiga).getBoolean();
		disableCrimsonWoods = cfg.get(CATEGORY_BIOMES, "disableCrimsonWoods", disableCrimsonWoods).getBoolean();
		disableSilkglades = cfg.get(CATEGORY_BIOMES, "disableSilkglades", disableSilkglades).getBoolean();
		disableColdDesert = cfg.get(CATEGORY_BIOMES, "disableColdDesert", disableColdDesert).getBoolean();
		disableMysticWoods = cfg.get(CATEGORY_BIOMES, "disableMysticWoods", disableMysticWoods).getBoolean();
		disableSemiAridDesert = cfg.get(CATEGORY_BIOMES, "disableSemiAridDesert", disableSemiAridDesert).getBoolean();
		disableOutback = cfg.get(CATEGORY_BIOMES, "disableOutback", disableOutback).getBoolean();
		disableSaltLake = cfg.get(CATEGORY_BIOMES, "disableSaltLake", disableSaltLake).getBoolean();
		disableColdForest = cfg.get(CATEGORY_BIOMES, "disableColdForest", disableColdForest).getBoolean();
		disableColdRoofedForest = cfg.get(CATEGORY_BIOMES, "disableColdRoofedForest", disableColdRoofedForest).getBoolean();
		disableColdBirchForest = cfg.get(CATEGORY_BIOMES, "disableColdBirchForest", disableColdBirchForest).getBoolean();
		disableColdMegaTaiga = cfg.get(CATEGORY_BIOMES, "disableColdMegaTaiga", disableColdMegaTaiga).getBoolean();
		disableColdMegaSpruceTaiga = cfg.get(CATEGORY_BIOMES, "disableColdMegaSpruceTaiga", disableColdMegaSpruceTaiga).getBoolean();
		disableBlueMushroomPlains = cfg.get(CATEGORY_BIOMES, "disableBlueMushroomPlains", disableBlueMushroomPlains).getBoolean();
		disablePinkMushroomPlains = cfg.get(CATEGORY_BIOMES, "disablePinkMushroomPlains", disablePinkMushroomPlains).getBoolean();
		disableFungalJungle = cfg.get(CATEGORY_BIOMES, "disableFungalJungle", disableFungalJungle).getBoolean();
		disableJungleArchipelago = cfg.get(CATEGORY_BIOMES, "disableJungleArchipelago", disableJungleArchipelago).getBoolean();
		disableAegeanArchipelago = cfg.get(CATEGORY_BIOMES, "disableAegeanArchipelago", disableAegeanArchipelago).getBoolean();
		disableSpruceWoods = cfg.get(CATEGORY_BIOMES, "disableSpruceWoods", disableSpruceWoods).getBoolean();
		disableMountainousArchipelago = cfg.get(CATEGORY_BIOMES, "disableMountainousArchipelago", disableMountainousArchipelago).getBoolean();
		disableDesertArchipelago = cfg.get(CATEGORY_BIOMES, "disableDesertArchipelago", disableDesertArchipelago).getBoolean();
		disableAncientForest = cfg.get(CATEGORY_BIOMES, "disableAncientForest", disableAncientForest).getBoolean();
		disableMangrove = cfg.get(CATEGORY_BIOMES, "disableMangrove", disableMangrove).getBoolean();
		disableGoldenForest = cfg.get(CATEGORY_BIOMES, "disableGoldenForest", disableGoldenForest).getBoolean();
		disableCliffs = cfg.get(CATEGORY_BIOMES, "disableCliffs", disableCliffs).getBoolean();
		disableSahara = cfg.get(CATEGORY_BIOMES, "disableSahara", disableSahara).getBoolean();
		disableTropicalForest = cfg.get(CATEGORY_BIOMES, "disableTropicalForest", disableTropicalForest).getBoolean();
		disableTropicalGrassland = cfg.get(CATEGORY_BIOMES, "disableTropicalGrassland", disableTropicalGrassland).getBoolean();
		disableBlossomArchipelago = cfg.get(CATEGORY_BIOMES, "disableBlossomArchipelago", disableBlossomArchipelago).getBoolean();
		disableColdArchipelago = cfg.get(CATEGORY_BIOMES, "disableColdArchipelago", 		disableColdArchipelago).getBoolean();
		disableRainforestArchipelago = cfg.get(CATEGORY_BIOMES, "disableRainforestArchipelago", disableRainforestArchipelago).getBoolean();
		disableDenseShrubland = cfg.get(CATEGORY_BIOMES, "disableDenseShrubland", disableDenseShrubland).getBoolean();
		disableDryShrubland = cfg.get(CATEGORY_BIOMES, "disableDryShrubland", disableDryShrubland).getBoolean();
		disableOakForest = cfg.get(CATEGORY_BIOMES, "disableOakForest", disableOakForest).getBoolean();
		disableStonelands = cfg.get(CATEGORY_BIOMES, "disableStonelands", disableStonelands).getBoolean();
		disableAutumnTaiga = cfg.get(CATEGORY_BIOMES, "disableAutumnTaiga", disableAutumnTaiga).getBoolean();
		disableBlackSandDunes = cfg.get(CATEGORY_BIOMES, "disableBlackSandDunes", disableBlackSandDunes).getBoolean();
		disableTallOakForest = cfg.get(CATEGORY_BIOMES, "disableTallOakForest", disableTallOakForest).getBoolean();
		
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
    private static void initRockConfig(Configuration cfg) {
    	 cfg.addCustomCategoryComment(CATEGORY_ROCKS, "Rock configuration");
    	 basaltPerChunk = cfg.getInt("basaltPerChunk", CATEGORY_ROCKS, basaltPerChunk, 0, 100, "Basalt Per Chunk");
    	 blackdioritePerChunk = cfg.getInt("blackdioritePerChunk", CATEGORY_ROCKS, blackdioritePerChunk, 0, 100, "Black Diorite Per Chunk");
    	 chalkPerChunk = cfg.getInt("chalkPerChunk", CATEGORY_ROCKS, chalkPerChunk, 0, 100, "Chalk Per Chunk");
    	 blueschistPerChunk = cfg.getInt("blueschistPerChunk", CATEGORY_ROCKS, blueschistPerChunk, 0, 100, "Blue Schist Per Chunk");
         gabbroPerChunk = cfg.getInt("gabbroPerChunk", CATEGORY_ROCKS, gabbroPerChunk, 0, 100, "Gabbro Per Chunk");
         limestonePerChunk = cfg.getInt("limestonePerChunk", CATEGORY_ROCKS, limestonePerChunk, 0, 100, "Limestone Per Chunk");
         gneissPerChunk = cfg.getInt("gneissPerChunk", CATEGORY_ROCKS, gneissPerChunk, 0, 100, "Gneiss Per Chunk");
         greenschistPerChunk = cfg.getInt("greenschistPerChunk", CATEGORY_ROCKS, greenschistPerChunk, 0, 100, "Green Schist Per Chunk");
         imperialquartzitePerChunk = cfg.getInt("imperialquartzitePerChunk", CATEGORY_ROCKS, imperialquartzitePerChunk, 0, 100, "Imperial Quartzite Per Chunk");
         kimberlitePerChunk = cfg.getInt("kimberlitePerChunk", CATEGORY_ROCKS, kimberlitePerChunk, 0, 100, "Kimberlite Per Chunk");
         marblePerChunk = cfg.getInt("marblePerChunk", CATEGORY_ROCKS, marblePerChunk, 0, 100, "Marble Per Chunk");
         migmatitePerChunk = cfg.getInt("migmatitePerChunk", CATEGORY_ROCKS, migmatitePerChunk, 0, 100, "Migmatite Per Chunk");
         pinkquartzitePerChunk = cfg.getInt("pinkquartzitePerChunk", CATEGORY_ROCKS, pinkquartzitePerChunk, 0, 100, "Pink Quartzite Per Chunk");
         pumicePerChunk = cfg.getInt("pumicePerChunk", CATEGORY_ROCKS, pumicePerChunk, 0, 100, "Pumice Per Chunk");
         redquartzitePerChunk = cfg.getInt("redquartzitePerChunk", CATEGORY_ROCKS, redquartzitePerChunk, 0, 100, "Red Quartzite Per Chunk");
         rhyolitePerChunk = cfg.getInt("rhyolitePerChunk", CATEGORY_ROCKS, rhyolitePerChunk, 0, 100, "Rhyolite Per Chunk");
        slatePerChunk = cfg.getInt("slatePerChunk", CATEGORY_ROCKS, slatePerChunk, 0, 100, "Slate Per Chunk");
        scoriaPerChunk = cfg.getInt("scoriaPerChunk", CATEGORY_ROCKS, scoriaPerChunk, 0, 100, "Scoria Per Chunk");
        soapstonePerChunk = cfg.getInt("soapstonePerChunk", CATEGORY_ROCKS, soapstonePerChunk, 0, 100, "Soapstone Per Chunk");
        dacitePerChunk = cfg.getInt("dacitePerChunk", CATEGORY_ROCKS, dacitePerChunk, 0, 100, "Dacite Per Chunk");
        tuffPerChunk = cfg.getInt("tuffPerChunk", CATEGORY_ROCKS, tuffPerChunk, 0, 100, "Tuff");
        pegmatitePerChunk = cfg.getInt("pegmatitePerChunk", CATEGORY_ROCKS, pegmatitePerChunk, 0, 100, "Pegmatite Per Chunk");
        peridotitePerChunk = cfg.getInt("peridotitePerChunk", CATEGORY_ROCKS, peridotitePerChunk, 0, 100, "Peridotite Per Chunk");
        anorthositePerChunk = cfg.getInt("anorthositePerChunk", CATEGORY_ROCKS, anorthositePerChunk, 0, 100, "Anorthosite Per Chunk");
        dunitePerChunk = cfg.getInt("dunitePerChunk", CATEGORY_ROCKS, dunitePerChunk, 0, 100, "Dunite Per Chunk");
        felsitePerChunk = cfg.getInt("felsitePerChunk", CATEGORY_ROCKS, felsitePerChunk, 0, 100, "Felsite Per Chunk");
        granodioritePerChunk = cfg.getInt("granodioritePerChunk", CATEGORY_ROCKS, granodioritePerChunk, 0, 100, "Granodiorite Per Chunk");
        komatitePerChunk = cfg.getInt("komatitePerChunk", CATEGORY_ROCKS, komatitePerChunk, 0, 100, "Komatite Per Chunk");
        latitePerChunk = cfg.getInt("latitePerChunk", CATEGORY_ROCKS, latitePerChunk, 0, 100, "Latite Per Chunk");
        porphyryPerChunk = cfg.getInt("porphyryPerChunk", CATEGORY_ROCKS, porphyryPerChunk, 0, 100, "Porphyry Per Chunk");
        pyroxenitePerChunk = cfg.getInt("pyroxenitePerChunk", CATEGORY_ROCKS, pyroxenitePerChunk, 0, 100, "Pyroxenite Per Chunk");
        syenitePerChunk = cfg.getInt("syenitePerChunk", CATEGORY_ROCKS, syenitePerChunk, 0, 100, "Syenite Per Chunk");
        troctolitePerChunk = cfg.getInt("troctolitePerChunk", CATEGORY_ROCKS, troctolitePerChunk, 0, 100, "Troctolite Per Chunk");
        alikitePerChunk = cfg.getInt("alikitePerChunk", CATEGORY_ROCKS, alikitePerChunk, 0, 100, "Alikite Per Chunk");
        krundaltitePerChunk = cfg.getInt("krundaltitePerChunk", CATEGORY_ROCKS, krundaltitePerChunk, 0, 100, "Krundaltite Per Chunk");
        triglicitePerChunk = cfg.getInt("triglicitePerChunk", CATEGORY_ROCKS, triglicitePerChunk, 0, 100, "Triglicite Per Chunk");
    }
}