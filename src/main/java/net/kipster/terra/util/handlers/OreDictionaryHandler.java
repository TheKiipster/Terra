package net.kipster.terra.util.handlers;

import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {

	public static void registerOreDictionary() {
		OreDictionary.registerOre("sandstone", BlockInit.BLACK_SANDSTONE);
		OreDictionary.registerOre("sandstone", BlockInit.BLACK_SANDSTONE_CARVED);
		OreDictionary.registerOre("sandstone", BlockInit.BLACK_SANDSTONE_SMOOTH);
		OreDictionary.registerOre("sandstone", BlockInit.CONTINENTAL_SAND);
		OreDictionary.registerOre("sandstone", BlockInit.CONTINENTAL_SANDSTONE_CARVED);
		OreDictionary.registerOre("sandstone", BlockInit.CONTINENTAL_SANDSTONE_SMOOTH);
		OreDictionary.registerOre("sandstone", BlockInit.IRON_SANDSTONE);
		OreDictionary.registerOre("sandstone", BlockInit.IRON_SANDSTONE_CARVED);
		OreDictionary.registerOre("sandstone", BlockInit.IRON_SANDSTONE_SMOOTH);
		OreDictionary.registerOre("sandstone", BlockInit.OLIVINE_SANDSTONE);
		OreDictionary.registerOre("sandstone", BlockInit.OLIVINE_SANDSTONE_CARVED);
		OreDictionary.registerOre("sandstone", BlockInit.OLIVINE_SANDSTONE_SMOOTH);
		OreDictionary.registerOre("sandstone", BlockInit.ORANGE_SANDSTONE);
		OreDictionary.registerOre("sandstone", BlockInit.ORANGE_SANDSTONE_CARVED);
		OreDictionary.registerOre("sandstone", BlockInit.ORANGE_SANDSTONE_SMOOTH);
		OreDictionary.registerOre("sandstone", BlockInit.PINK_SANDSTONE);
		OreDictionary.registerOre("sandstone", BlockInit.PINK_SANDSTONE_CARVED);
		OreDictionary.registerOre("sandstone", BlockInit.PINK_SANDSTONE_SMOOTH);
		OreDictionary.registerOre("sandstone", BlockInit.PURPLE_SANDSTONE);
		OreDictionary.registerOre("sandstone", BlockInit.PURPLE_SANDSTONE_CARVED);
		OreDictionary.registerOre("sandstone", BlockInit.PURPLE_SANDSTONE_SMOOTH);
		OreDictionary.registerOre("sandstone", BlockInit.WHITE_SANDSTONE);
		OreDictionary.registerOre("sandstone", BlockInit.WHITE_SANDSTONE_CARVED);
		OreDictionary.registerOre("sandstone", BlockInit.WHITE_SANDSTONE_SMOOTH);
		OreDictionary.registerOre("coalOre", BlockInit.ORE_OVERWORLD_ANTHRACITE);
		OreDictionary.registerOre("coalOre", BlockInit.ORE_OVERWORLD_BITUMINOUS);
		OreDictionary.registerOre("coalOre", BlockInit.ORE_OVERWORLD_LIGNITE);
		OreDictionary.registerOre("coalOre", BlockInit.ORE_OVERWORLD_PEAT);
		OreDictionary.registerOre("coal", ItemInit.ANTHRACITE_COAL);
		OreDictionary.registerOre("coal", ItemInit.BITUMINOUS_COAL);
		OreDictionary.registerOre("coal", ItemInit.LIGNITE_COAL);
		OreDictionary.registerOre("coal", ItemInit.PEAT_COAL);
		OreDictionary.registerOre("stone", new ItemStack(Blocks.STONE, 1, 1));
		OreDictionary.registerOre("stone", new ItemStack(Blocks.STONE, 1, 3));
		OreDictionary.registerOre("stone", new ItemStack(Blocks.STONE, 1, 5));
		OreDictionary.registerOre("cobblestone", new ItemStack(Blocks.STONE, 1, 1));
		OreDictionary.registerOre("cobblestone", new ItemStack(Blocks.STONE, 1, 3));
		OreDictionary.registerOre("cobblestone", new ItemStack(Blocks.STONE, 1, 5));
		OreDictionary.registerOre("ironOre", BlockInit.ORE_OVERWORLDI_ANKERITE);
		OreDictionary.registerOre("ironOre", BlockInit.ORE_OVERWORLDI_SIDERITE);
		OreDictionary.registerOre("ironOre", BlockInit.ORE_OVERWORLDI_HEMATITE);
		OreDictionary.registerOre("ironOre", BlockInit.ORE_OVERWORLDI_GOETHITE);
		OreDictionary.registerOre("ironOre", BlockInit.ORE_OVERWORLDI_BANDED);
		OreDictionary.registerOre("ironOre", BlockInit.ORE_OVERWORLDI_TACONITE);
		OreDictionary.registerOre("ironOre", BlockInit.ORE_OVERWORLDI_MAGNETITE);
		OreDictionary.registerOre("ironOre", BlockInit.ORE_OVERWORLDI_LIMONITE);
		OreDictionary.registerOre("coalBlock", BlockInit.ORE_OVERWORLDCB_ANTHRACITE);
		OreDictionary.registerOre("coalBlock", BlockInit.ORE_OVERWORLDCB_BITUMINOUS);
		OreDictionary.registerOre("coalBlock", BlockInit.ORE_OVERWORLDCB_LIGNITE);
		OreDictionary.registerOre("coalBlock", BlockInit.ORE_OVERWORLDCB_PEAT);
		


	}

}