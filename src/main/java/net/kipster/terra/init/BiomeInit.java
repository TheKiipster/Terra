package net.kipster.terra.init;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;

import net.kipster.terra.Config;
import net.kipster.terra.Config;
import net.kipster.terra.world.biomes.BiomeAlps;
import net.kipster.terra.world.biomes.BiomeBlackBeach;
import net.kipster.terra.world.biomes.BiomeBlackDesert;
import net.kipster.terra.world.biomes.BiomeColdPlateau;
import net.kipster.terra.world.biomes.BiomeDryPlateau;
import net.kipster.terra.world.biomes.BiomeDunes;
import net.kipster.terra.world.biomes.BiomeFens;
import net.kipster.terra.world.biomes.BiomeFrozenLake;
import net.kipster.terra.world.biomes.BiomeFrozenPlateau;
import net.kipster.terra.world.biomes.BiomeGlacier;
import net.kipster.terra.world.biomes.BiomeGrassland;
import net.kipster.terra.world.biomes.BiomeGreenBeach;
import net.kipster.terra.world.biomes.BiomeGreenExtremeHills;
import net.kipster.terra.world.biomes.BiomeGreenHills;
import net.kipster.terra.world.biomes.BiomeGreenPlateau;
import net.kipster.terra.world.biomes.BiomeHighlands;
import net.kipster.terra.world.biomes.BiomeLake;
import net.kipster.terra.world.biomes.BiomeLushForest;
import net.kipster.terra.world.biomes.BiomeMeadow;
import net.kipster.terra.world.biomes.BiomeOrangeBeach;
import net.kipster.terra.world.biomes.BiomePinelands;
import net.kipster.terra.world.biomes.BiomePinkBeach;
import net.kipster.terra.world.biomes.BiomePlateau;
import net.kipster.terra.world.biomes.BiomePraire;
import net.kipster.terra.world.biomes.BiomePurpleBeach;
import net.kipster.terra.world.biomes.BiomeRainforest;
import net.kipster.terra.world.biomes.BiomeRedBeach;
import net.kipster.terra.world.biomes.BiomeRedPlateau;
import net.kipster.terra.world.biomes.BiomeRockland;
import net.kipster.terra.world.biomes.BiomeSahel;
import net.kipster.terra.world.biomes.BiomeShrubland;
import net.kipster.terra.world.biomes.BiomeSteppe;
import net.kipster.terra.world.biomes.BiomeTundra;
import net.kipster.terra.world.biomes.BiomeTundraSpikes;
import net.kipster.terra.world.biomes.BiomeWhiteBeach;
import net.kipster.terra.world.biomes.BiomeWhiteDesert;
import net.kipster.terra.world.biomes.BiomeWoodlands;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit 
{
    public static Set<Biome> presentBiomes;
public static Map<Integer, List<Integer>> subBiomesMap;

	public static final Biome WHITEDESERT = new BiomeWhiteDesert();
	public static final Biome GREENEXTREMEHILLS = new BiomeGreenExtremeHills();
	public static final Biome PLATEAU = new BiomePlateau();
    public static final Biome GREENPLATEAU = new BiomeGreenPlateau();
	public static final Biome REDPLATEAU = new BiomeRedPlateau();
	public static final Biome DRYPLATEAU = new BiomeDryPlateau();
	public static final Biome STEPPE = new BiomeSteppe();
	public static final Biome FROZENPLATEAU = new BiomeFrozenPlateau();
	public static final Biome COLDPLATEAU = new BiomeColdPlateau();
	public static final Biome GRASSLAND = new BiomeGrassland();
	public static final Biome FENS = new BiomeFens();
	public static final Biome SHRUBLAND = new BiomeShrubland();
	public static final Biome TUNDRASPIKES = new BiomeTundraSpikes();
	public static final Biome TUNDRA = new BiomeTundra();
	public static final Biome ROCKLAND = new BiomeRockland();
	public static final Biome LAKE = new BiomeLake();
	public static final Biome FROZENLAKE = new BiomeFrozenLake();
	public static final Biome SAHEL = new BiomeSahel();
	public static final Biome DUNES = new BiomeDunes();
	public static final Biome ALPS = new BiomeAlps();
	public static final Biome HIGHLANDS = new BiomeHighlands();
	public static final Biome GLACIER = new BiomeGlacier();
	public static final Biome PINELANDS = new BiomePinelands();
	public static final Biome GREENHILLS = new BiomeGreenHills();
	public static final Biome LUSHFOREST = new BiomeLushForest();
	public static final Biome MEADOW = new BiomeMeadow();
	public static final Biome PRAIRE = new BiomePraire();
	public static final Biome RAINFOREST = new BiomeRainforest();
	public static final Biome WOODLANDS = new BiomeWoodlands();
	public static final Biome PINKBEACH = new BiomePinkBeach();
	public static final Biome BLACKBEACH = new BiomeBlackBeach();
	public static final Biome PURPLEBEACH = new BiomePurpleBeach();
	public static final Biome REDBEACH = new BiomeRedBeach();
	public static final Biome GREENBEACH = new BiomeGreenBeach();
	public static final Biome ORANGEBEACH = new BiomeOrangeBeach();
	public static final Biome BLACKDESERT = new BiomeBlackDesert();
	public static final Biome WHITEBEACH = new BiomeWhiteBeach();
	
	

	public static void registerBiomes()
	{
		initBiome(WHITEDESERT, "White_Desert",  5, Config.disableWhiteDesert,BiomeType.DESERT, Type.LUSH, Type.SANDY, Type.SAVANNA, Type.MESA);
		initBiome(GREENEXTREMEHILLS, "Green_Extreme_Hills",  6, Config.disableGreenExtremeHills,BiomeType.WARM, Type.MOUNTAIN, Type.HILLS, Type.LUSH);
		initBiome(PLATEAU, "Plateau",  6, Config.disablePlateau,BiomeType.WARM, Type.HILLS);
		initBiome(STEPPE, "Steppe",  6, Config.disableSteppe,BiomeType.WARM, Type.HILLS);
		initBiome(LAKE, "Lake",  5, Config.disableLake,BiomeType.WARM, Type.WATER);
		initBiome(FROZENLAKE, "Frozen_Lake",  4, Config.disableFrozenLake,BiomeType.ICY, Type.WATER, Type.COLD);
		initBiome(COLDPLATEAU, "Cold_Plateau",  5, Config.disableColdPlateau,BiomeType.COOL, Type.COLD, Type.SNOWY);
		initBiome(FROZENPLATEAU, "Frozen_Plateau",  5, Config.disableFrozenPlateau,BiomeType.ICY, Type.COLD, Type.SNOWY);
		initBiome(GREENPLATEAU, "Green_Plateau",  4, Config.disableGreenPlateau,BiomeType.WARM, Type.LUSH, Type.JUNGLE, Type.RARE);
		initBiome(REDPLATEAU, "Red_Plateau",  5, Config.disableRedPlateau,BiomeType.DESERT, Type.DRY, Type.SANDY, Type.MESA);
		initBiome(DRYPLATEAU, "Dry_Plateau",  5, Config.disableDryPlateau,BiomeType.WARM, Type.DRY, Type.SPARSE, Type.SNOWY);
		initBiome(GRASSLAND, "Grassland", 10, Config.disableGrassland, BiomeType.WARM, Type.PLAINS);
		initBiome(FENS, "Fens", 7, Config.disableFens, BiomeType.WARM, Type.SWAMP);
		initBiome(SHRUBLAND, "Shrubland", 7, Config.disableShrubland, BiomeType.WARM, Type.PLAINS, Type.DENSE);
		initBiome(TUNDRASPIKES, "Tundra_Spikes", 4, Config.disableTundraSpikes, BiomeType.ICY, Type.WASTELAND, Type.COLD, Type.SNOWY, Type.DRY);
		initBiome(TUNDRA, "Tundra", 5, Config.disableTundra, BiomeType.ICY, Type.WASTELAND, Type.COLD, Type.SNOWY, Type.DRY);
		initBiome(ROCKLAND, "Rockland", 4, Config.disableRockland, BiomeType.WARM, Type.RARE, Type.DEAD, Type.DRY, Type.WASTELAND);
		initBiome(SAHEL, "Sahel", 6, Config.disableSahel, BiomeType.DESERT, Type.HOT, Type.SAVANNA, Type.SANDY);
		initBiome(DUNES, "Dunes", 6, Config.disableDunes, BiomeType.DESERT, Type.SANDY, Type.SPARSE);
		initBiome(ALPS, "Alps", 3, Config.disableAlps, BiomeType.ICY, Type.COLD, Type.SPARSE, Type.SNOWY);
		initBiome(HIGHLANDS, "Highlands", 4, Config.disableHighlands, BiomeType.WARM, Type.HILLS, Type.SPARSE);
		initBiome(PINELANDS, "Pinelands", 3, Config.disablePinelands, BiomeType.WARM, Type.HILLS, Type.SPARSE);
		initBiome(GLACIER, "Glacier", 3, Config.disableGlacier, BiomeType.ICY, Type.COLD, Type.SNOWY, Type.DRY);
		initBiome(GREENHILLS, "Green_Hills", 5, Config.disableGreenHills, BiomeType.WARM, Type.HILLS, Type.SPARSE);
		initBiome(LUSHFOREST, "Lush_Forest", 5, Config.disableLushForest, BiomeType.WARM, Type.FOREST, Type.LUSH);
		initBiome(RAINFOREST, "Rainforest", 5, Config.disableRainforest, BiomeType.WARM, Type.JUNGLE, Type.LUSH, Type.WET);
		initBiome(MEADOW, "Meadow", 5, Config.disableMeadow, BiomeType.WARM, Type.PLAINS, Type.SPARSE, Type.LUSH);
		initBiome(PRAIRE, "Praire", 5, Config.disablePraire, BiomeType.WARM, Type.SAVANNA, Type.SPARSE);
		initBiome(WOODLANDS, "Woodlands", 5, Config.disableWoodlands, BiomeType.WARM, Type.FOREST);
		initBiome(PINKBEACH, "Pink_Beach", 2, Config.disablePinkBeach, BiomeType.WARM, Type.BEACH, Type.WATER);
		initBiome(REDBEACH, "Red_Beach", 2, Config.disableRedBeach, BiomeType.WARM, Type.BEACH, Type.WATER);
		initBiome(PURPLEBEACH, "Purple_Beach", 2, Config.disablePurpleBeach, BiomeType.WARM, Type.BEACH, Type.WATER);
		initBiome(BLACKBEACH, "Black_Beach", 2, Config.disableBlackBeach, BiomeType.WARM, Type.BEACH, Type.WATER);
		initBiome(GREENBEACH, "Green_Beach", 2, Config.disableGreenBeach, BiomeType.WARM, Type.BEACH, Type.WATER);
		initBiome(WHITEBEACH, "White_Beach", 2, Config.disableWhiteBeach, BiomeType.WARM, Type.BEACH, Type.WATER);
		initBiome(ORANGEBEACH, "Orange_Beach", 2, Config.disableOrangeBeach, BiomeType.WARM, Type.BEACH, Type.WATER);
		initBiome(BLACKDESERT, "Black_Desert", 1, Config.disableBlackDesert, BiomeType.DESERT, Type.DRY, Type.SANDY, Type.DRY, Type.SPARSE);



	}
	  public static void initSubBiomes()
	    {
	        subBiomesMap = new HashMap<Integer, List<Integer>>();

	
	       
	        setSubBiome(Biomes.DESERT, Biomes.DESERT_HILLS);
	        setSubBiome(Biomes.FOREST, Biomes.FOREST_HILLS);
	        setSubBiome(Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS);
	        setSubBiome(Biomes.ROOFED_FOREST, Biomes.PLAINS);
	        setSubBiome(Biomes.TAIGA, Biomes.TAIGA_HILLS);
	        setSubBiome(Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS);
	        setSubBiome(Biomes.COLD_TAIGA, Biomes.COLD_TAIGA_HILLS);
	        setSubBiome(Biomes.PLAINS, Biomes.FOREST_HILLS, Biomes.FOREST);
	        setSubBiome(Biomes.ICE_PLAINS, Biomes.ICE_MOUNTAINS);
	        setSubBiome(Biomes.JUNGLE, Biomes.JUNGLE_HILLS);
	        setSubBiome(Biomes.EXTREME_HILLS, Biomes.EXTREME_HILLS_WITH_TREES);
	        setSubBiome(Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU);
	        setSubBiome(Biomes.MESA_ROCK, Biomes.MESA);
	        setSubBiome(Biomes.OCEAN, Biomes.DEEP_OCEAN);
	         setSubBiome(Biomes.DESERT, BiomeInit.WHITEDESERT);
	         setSubBiome(BiomeInit.HIGHLANDS, BiomeInit.LAKE);
	         setSubBiome(BiomeInit.PINELANDS, BiomeInit.LAKE);
	         setSubBiome(Biomes.REDWOOD_TAIGA, BiomeInit.LAKE);
	         setSubBiome(Biomes.COLD_TAIGA, BiomeInit.FROZENLAKE);
	}
	
	private static Biome initBiome(Biome biome, String name, int weight, boolean disabled, BiomeType biomeType, Type... types){
		if (!disabled) {
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, weight));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("Biome Added");

		}
		return biome;
	}
	  public ImmutableSet<Biome> getPresentBiomes()
	    {
	        return ImmutableSet.copyOf(presentBiomes);
	    }

	    private static void setSubBiome(Optional<Biome> parent, Optional<Biome>... subBiomes)
	    {
	        if (parent.isPresent())
	        {
	            for (Optional<Biome> subBiome : subBiomes)
	            {
	                if (subBiome.isPresent())
	                {
	                    setSubBiome(parent.get(), subBiome.get());
	                }
	            }
	        }
	    }
	    
	    private static void setSubBiome(Biome parent, Biome... subBiomes)
	    {
	        Map<Integer, List<Integer>> map = subBiomesMap;
	        int parentId = Biome.getIdForBiome(parent);
	        if (!map.containsKey(parentId))
	        {
	            map.put(parentId, new ArrayList<Integer>());
	        }
	        for (Biome subBiome : subBiomes)
	        {
	            map.get(parentId).add(Biome.getIdForBiome(subBiome));
	        }
	}
	    
}