package net.kipster.terra.util.handlers;

import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {

	public static void registerOreDictionary() {
		OreDictionary.registerOre("sand", BlockInit.BLACK_SAND);
		OreDictionary.registerOre("sand", BlockInit.CONTINENTAL_SAND);
		OreDictionary.registerOre("sand", BlockInit.OLIVINE_SAND);
		OreDictionary.registerOre("sand", BlockInit.IRON_SAND);
		OreDictionary.registerOre("sand", BlockInit.ORANGE_SAND);
		OreDictionary.registerOre("sand", BlockInit.PINK_SAND);
		OreDictionary.registerOre("sand", BlockInit.PURPLE_SAND);
		OreDictionary.registerOre("sand", BlockInit.WHITE_SAND);
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
		OreDictionary.registerOre("oreCoal", BlockInit.ORE_OVERWORLD_ANTHRACITE);
		OreDictionary.registerOre("oreCoal", BlockInit.ORE_OVERWORLD_BITUMINOUS);
		OreDictionary.registerOre("oreCoal", BlockInit.ORE_OVERWORLD_LIGNITE);
		OreDictionary.registerOre("oreCoal", BlockInit.ORE_OVERWORLD_PEAT);
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
		OreDictionary.registerOre("oreIron", BlockInit.ORE_OVERWORLDI_ANKERITE);
		OreDictionary.registerOre("oreIron", BlockInit.ORE_OVERWORLDI_SIDERITE);
		OreDictionary.registerOre("oreIron", BlockInit.ORE_OVERWORLDI_HEMATITE);
		OreDictionary.registerOre("oreIron", BlockInit.ORE_OVERWORLDI_GOETHITE);
		OreDictionary.registerOre("oreIron", BlockInit.ORE_OVERWORLDI_BANDED);
		OreDictionary.registerOre("oreIron", BlockInit.ORE_OVERWORLDI_TACONITE);
		OreDictionary.registerOre("oreIron", BlockInit.ORE_OVERWORLDI_MAGNETITE);
		OreDictionary.registerOre("oreIron", BlockInit.ORE_OVERWORLDI_LIMONITE);
		OreDictionary.registerOre("blockCoal", BlockInit.ORE_OVERWORLDCB_ANTHRACITE);
		OreDictionary.registerOre("blockCoal", BlockInit.ORE_OVERWORLDCB_BITUMINOUS);
		OreDictionary.registerOre("blockCoal", BlockInit.ORE_OVERWORLDCB_LIGNITE);
		OreDictionary.registerOre("blockCoal", BlockInit.ORE_OVERWORLDCB_PEAT);
		OreDictionary.registerOre("sandstone", BlockInit.BLACK_SANDSTONE_FACE);
		OreDictionary.registerOre("sandstone", BlockInit.BLACK_SANDSTONE_GLYPH);
		OreDictionary.registerOre("sandstone", BlockInit.PINK_SANDSTONE_FACE);
		OreDictionary.registerOre("sandstone", BlockInit.PINK_SANDSTONE_GLYPH);
		OreDictionary.registerOre("sandstone", BlockInit.PURPLE_SANDSTONE_FACE);
		OreDictionary.registerOre("sandstone", BlockInit.PURPLE_SANDSTONE_GLYPH);
		OreDictionary.registerOre("sandstone", BlockInit.WHITE_SANDSTONE_FACE);
		OreDictionary.registerOre("sandstone", BlockInit.WHITE_SANDSTONE_GLYPH);
		OreDictionary.registerOre("sandstone", BlockInit.IRON_SANDSTONE_FACE);
		OreDictionary.registerOre("sandstone", BlockInit.IRON_SANDSTONE_GLYPH);
		OreDictionary.registerOre("sandstone", BlockInit.OLIVINE_SANDSTONE_FACE);
		OreDictionary.registerOre("sandstone", BlockInit.OLIVINE_SANDSTONE_GLYPH);
		OreDictionary.registerOre("sandstone", BlockInit.ORANGE_SANDSTONE_FACE);
		OreDictionary.registerOre("sandstone", BlockInit.ORANGE_SANDSTONE_GLYPH);
		OreDictionary.registerOre("sandstone", BlockInit.CONTINENTAL_SANDSTONE_FACE);
		OreDictionary.registerOre("sandstone", BlockInit.CONTINENTAL_SANDSTONE_GLYPH);
		OreDictionary.registerOre("deadbush", BlockInit.GREYDEADBUSH);
		OreDictionary.registerOre("ingotBrickNether", ItemInit.TRIGLICITE_BRICK);
		OreDictionary.registerOre("ingotBrickNether", ItemInit.ALIKITE_BRICK);
		OreDictionary.registerOre("ingotBrickNether", ItemInit.KRUNDALTITE_BRICK);
		
		
		//Stones
		OreDictionary.registerOre("stone", BlockInit.BASALT_STONE);
		OreDictionary.registerOre("stone", BlockInit.BLACKDIORITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.IMPERIALQUARTZITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.PINKQUARTZITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.REDQUARTZITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.BLUESCHIST_STONE);
		OreDictionary.registerOre("stone", BlockInit.CHALK_STONE);
		OreDictionary.registerOre("stone", BlockInit.GREENSCHIST_STONE);
		OreDictionary.registerOre("stone", BlockInit.GABBRO_STONE);
		OreDictionary.registerOre("stone", BlockInit.KIMBERLITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.GNEISS_STONE);
		OreDictionary.registerOre("stone", BlockInit.LIMESTONE_STONE);
		OreDictionary.registerOre("stone", BlockInit.MARBLE_STONE);
		OreDictionary.registerOre("stone", BlockInit.MIGMATITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.PUMICE_STONE);
		OreDictionary.registerOre("stone", BlockInit.RHYOLITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.SCORIA_STONE);
		OreDictionary.registerOre("stone", BlockInit.SLATE_STONE);
		OreDictionary.registerOre("stone", BlockInit.SOAPSTONE_STONE);
		
		//Cobblestone
		OreDictionary.registerOre("cobblestone", BlockInit.BASALT_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.BLACKDIORITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.IMPERIALQUARTZITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.REDQUARTZITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.PINKQUARTZITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.BLUESCHIST_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.CHALK_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.GREENSCHIST_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.GABBRO_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.KIMBERLITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.GNEISS_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.LIMESTONE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.MARBLE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.MIGMATITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.PUMICE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.RHYOLITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.SCORIA_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.SLATE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.SOAPSTONE_COBBLESTONE);
		
		//Stonebrick
		OreDictionary.registerOre("stonebrick", BlockInit.BASALT_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.BLACKDIORITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.IMPERIALQUARTZITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.PINKQUARTZITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.REDQUARTZITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.BLUESCHIST_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.CHALK_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.GREENSCHIST_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.GABBRO_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.KIMBERLITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.GNEISS_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.LIMESTONE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.MARBLE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.MIGMATITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.PUMICE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.RHYOLITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.SCORIA_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.SLATE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.SOAPSTONE_STONEBRICK);
		
		

	}

}