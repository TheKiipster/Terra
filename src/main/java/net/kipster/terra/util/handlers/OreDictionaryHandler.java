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
		OreDictionary.registerOre("plankWood", BlockInit.BLACKSPRUCEPLANKS);
		OreDictionary.registerOre("plankWood", BlockInit.BLUESPRUCEPLANKS);
		OreDictionary.registerOre("plankWood", BlockInit.REDSPRUCEPLANKS);
		OreDictionary.registerOre("plankWood", BlockInit.CHERRYPLANKS);
		OreDictionary.registerOre("plankWood", BlockInit.WHITESPRUCEPLANKS);
		OreDictionary.registerOre("logWood", BlockInit.BLACKSPRUCELOG);
		OreDictionary.registerOre("logWood", BlockInit.BLUESPRUCELOG);
		OreDictionary.registerOre("logWood", BlockInit.REDSPRUCELOG);
		OreDictionary.registerOre("logWood", BlockInit.CHERRYLOG);
		OreDictionary.registerOre("logWood", BlockInit.WHITESPRUCELOG);
		OreDictionary.registerOre("treeLeaves", BlockInit.BLACKSPRUCELEAVES);
		OreDictionary.registerOre("treeLeaves", BlockInit.BLUESPRUCELEAVES);
		OreDictionary.registerOre("treeLeaves", BlockInit.REDSPRUCELEAVES);
		OreDictionary.registerOre("treeLeaves", BlockInit.CHERRYLEAVESWHITE);
		OreDictionary.registerOre("treeLeaves", BlockInit.CHERRYLEAVESPURPLE);
		OreDictionary.registerOre("treeLeaves", BlockInit.WHITESPRUCELEAVES);
		OreDictionary.registerOre("treeSapling", BlockInit.BLACKSPRUCESAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.BLUESPRUCESAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.REDSPRUCESAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.CHERRYSAPLINGWHITE);
		OreDictionary.registerOre("treeSapling", BlockInit.CHERRYSAPLINGPURPLE);
		OreDictionary.registerOre("treeSapling", BlockInit.WHITESPRUCESAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.ELMSAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.MAHOGANYSAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.PALMSAPLING);
		OreDictionary.registerOre("treeLeaves", BlockInit.ELMLEAVES);
		OreDictionary.registerOre("treeLeaves", BlockInit.MAHOGANYLEAVES);
		OreDictionary.registerOre("treeLeaves", BlockInit.PALMLEAVES);
		OreDictionary.registerOre("logWood", BlockInit.ELMLOG);
		OreDictionary.registerOre("logWood", BlockInit.MAHOGANYLOG);
		OreDictionary.registerOre("logWood", BlockInit.PALMLOG);
		OreDictionary.registerOre("plankWood", BlockInit.ELMPLANKS);
		OreDictionary.registerOre("plankWood", BlockInit.MAHOGANYPLANKS);
		OreDictionary.registerOre("plankWood", BlockInit.PALMPLANKS);
		OreDictionary.registerOre("plankWood", BlockInit.EBONYPLANKS);
		OreDictionary.registerOre("plankWood", BlockInit.JACARANDAPLANKS);
		OreDictionary.registerOre("plankWood", BlockInit.PAULOWNIAPLANKS);
		OreDictionary.registerOre("logWood", BlockInit.EBONYLOG);
		OreDictionary.registerOre("logWood", BlockInit.JACARANDALOG);
		OreDictionary.registerOre("logWood", BlockInit.PAULOWNIALOG);
		OreDictionary.registerOre("treeLeaves", BlockInit.EBONYLEAVES);
		OreDictionary.registerOre("treeLeaves", BlockInit.PAULOWNIASAPLINGWHITE);
		OreDictionary.registerOre("treeLeaves", BlockInit.PAULOWNIALEAVESBLUE);
		OreDictionary.registerOre("treeLeaves", BlockInit.PAULOWNIALEAVESGREEN);
		OreDictionary.registerOre("treeLeaves", BlockInit.JACARANDALEAVESMAGENTA);
		OreDictionary.registerOre("treeLeaves", BlockInit.JACARANDALEAVESPURPLE);
		OreDictionary.registerOre("treeSapling", BlockInit.EBONYSAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.JACARANDASAPLINGMAGENTA);
		OreDictionary.registerOre("treeSapling", BlockInit.JACARANDASAPLINGPURPLE);
		OreDictionary.registerOre("treeSapling", BlockInit.PAULOWNIASAPLINGWHITE);
		OreDictionary.registerOre("treeSapling", BlockInit.PAULOWNIASAPLINGBLUE);
		OreDictionary.registerOre("treeSapling", BlockInit.PAULOWNIASAPLINGGREEN);
		OreDictionary.registerOre("logWood", BlockInit.MANGROVELOG);
		OreDictionary.registerOre("logWood", BlockInit.ASPENLOG);
		OreDictionary.registerOre("logWood", BlockInit.POPLARLOG);
		OreDictionary.registerOre("treeLeaves", BlockInit.MANGROVELEAVES);
		OreDictionary.registerOre("treeLeaves", BlockInit.ASPENLEAVES);
		OreDictionary.registerOre("treeLeaves", BlockInit.POPLARLEAVES);
		OreDictionary.registerOre("treeLeaves", BlockInit.YELLOWBIRCHLEAVES);
		OreDictionary.registerOre("plankWood", BlockInit.MANGROVEPLANKS);
		OreDictionary.registerOre("plankWood", BlockInit.ASPENPLANKS);
		OreDictionary.registerOre("plankWood", BlockInit.POPLARLEAVES);
		OreDictionary.registerOre("treeSapling", BlockInit.ASPENSAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.POPLARSAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.YELLOWBIRCHSAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.MANGROVESAPLING);
		OreDictionary.registerOre("treeSapling", BlockInit.CONIFERSAPLINGORANGE);
		OreDictionary.registerOre("treeSapling", BlockInit.CONIFERSAPLINGYELLOW);
		OreDictionary.registerOre("treeLeaves", BlockInit.CONIFERLEAVESORANGE);
		OreDictionary.registerOre("treeLeaves", BlockInit.CONIFERLEAVESYELLOW);
		
		
		OreDictionary.registerOre("stairWood", BlockInit.ASPENSTAIRS);
		OreDictionary.registerOre("stairWood", BlockInit.BLUESPRUCESTAIRS);
		OreDictionary.registerOre("stairWood", BlockInit.BLACKSPRUCESTAIRS);
		OreDictionary.registerOre("stairWood", BlockInit.JACARANDASTAIRS);
		OreDictionary.registerOre("stairWood", BlockInit.ELMSTAIRS);
		OreDictionary.registerOre("stairWood", BlockInit.EBONYSTAIRS);
		OreDictionary.registerOre("stairWood", BlockInit.MAHOGANYSTAIRS);
		OreDictionary.registerOre("stairWood", BlockInit.MANGROVESTAIRS);
		OreDictionary.registerOre("stairWood", BlockInit.PALMSTAIRS);
		OreDictionary.registerOre("stairWood", BlockInit.PAULOWNIASTAIRS);
		OreDictionary.registerOre("stairWood", BlockInit.POPLARSTAIRS);
		OreDictionary.registerOre("stairWood", BlockInit.REDSPRUCESTAIRS);
		OreDictionary.registerOre("stairWood", BlockInit.WHITESPRUCESTAIRS);
		OreDictionary.registerOre("stairWood", BlockInit.CHERRYSTAIRS);

		
		
		OreDictionary.registerOre("fenceWood", BlockInit.ASPENFENCE);
		OreDictionary.registerOre("fenceWood", BlockInit.BLUESPRUCEFENCE);
		OreDictionary.registerOre("fenceWood", BlockInit.BLACKSPRUCEFENCE);
		OreDictionary.registerOre("fenceWood", BlockInit.JACARANDAFENCE);
		OreDictionary.registerOre("fenceWood", BlockInit.ELMFENCE);
		OreDictionary.registerOre("fenceWood", BlockInit.EBONYFENCE);
		OreDictionary.registerOre("fenceWood", BlockInit.MAHOGANYFENCE);
		OreDictionary.registerOre("fenceWood", BlockInit.MANGROVEFENCE);
		OreDictionary.registerOre("fenceWood", BlockInit.PALMFENCE);
		OreDictionary.registerOre("fenceWood", BlockInit.PAULOWNIAFENCE);
		OreDictionary.registerOre("fenceWood", BlockInit.POPLARFENCE);
		OreDictionary.registerOre("fenceWood", BlockInit.REDSPRUCEFENCE);
		OreDictionary.registerOre("fenceWood", BlockInit.WHITESPRUCEFENCE);
		OreDictionary.registerOre("fenceWood", BlockInit.CHERRYFENCE);
		
		OreDictionary.registerOre("fenceGateWood", BlockInit.ASPENFENCEGATE);
		OreDictionary.registerOre("fenceGateWood", BlockInit.BLUESPRUCEFENCEGATE);
		OreDictionary.registerOre("fenceGateWood", BlockInit.BLACKSPRUCEFENCEGATE);
		OreDictionary.registerOre("fenceGateWood", BlockInit.JACARANDAFENCEGATE);
		OreDictionary.registerOre("fenceGateWood", BlockInit.ELMFENCEGATE);
		OreDictionary.registerOre("fenceGateWood", BlockInit.EBONYFENCEGATE);
		OreDictionary.registerOre("fenceGateWood", BlockInit.MAHOGANYFENCEGATE);
		OreDictionary.registerOre("fenceGateWood", BlockInit.MANGROVEFENCEGATE);
		OreDictionary.registerOre("fenceGateWood", BlockInit.PALMFENCEGATE);
		OreDictionary.registerOre("fenceGateWood", BlockInit.PAULOWNIAFENCEGATE);
		OreDictionary.registerOre("fenceGateWood", BlockInit.POPLARFENCEGATE);
		OreDictionary.registerOre("fenceGateWood", BlockInit.REDSPRUCEFENCEGATE);
		OreDictionary.registerOre("fenceGateWood", BlockInit.WHITESPRUCEFENCEGATE);
		OreDictionary.registerOre("fenceGateWood", BlockInit.CHERRYFENCEGATE);
		
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
		OreDictionary.registerOre("stone", BlockInit.ANORTHOSITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.DACITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.DUNITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.FELSITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.GRANODIORITE_COBBLESTONE);
		OreDictionary.registerOre("stone", BlockInit.KOMATITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.LATITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.PEGMATITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.PERIDOTITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.PORPHYRY_STONE);
		OreDictionary.registerOre("stone", BlockInit.PYROXENITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.SYENITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.TROCTOLITE_STONE);
		OreDictionary.registerOre("stone", BlockInit.TUFF_STONE);
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
		OreDictionary.registerOre("cobblestone", BlockInit.ANORTHOSITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.DACITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.DUNITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.GRANODIORITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.LATITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.FELSITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.KOMATITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.PEGMATITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.PERIDOTITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.PORPHYRY_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.PYROXENITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.SYENITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.TROCTOLITE_COBBLESTONE);
		OreDictionary.registerOre("cobblestone", BlockInit.TUFF_COBBLESTONE);

		
		
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
		OreDictionary.registerOre("stonebrick", BlockInit.ANORTHOSITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.DACITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.DUNITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.FELSITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.GRANODIORITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.KOMATITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.LATITE_STONE);
		OreDictionary.registerOre("stonebrick", BlockInit.PEGMATITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.PERIDOTITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.PORPHYRY_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.PYROXENITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.SYENITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.TROCTOLITE_STONEBRICK);
		OreDictionary.registerOre("stonebrick", BlockInit.TUFF_STONEBRICK);

		

	}

}