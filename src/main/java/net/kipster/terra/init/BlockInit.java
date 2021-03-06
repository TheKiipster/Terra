package net.kipster.terra.init;

import java.util.ArrayList;
import java.util.List;

import net.kipster.terra.objects.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockInit	{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//SANDS
	public static final Block WHITE_SAND = new BlockSand("white_sand", Material.SAND);
	public static final Block WHITE_SANDSTONE = new BlockSandstone("white_sandstone", Material.ROCK);
	public static final Block WHITE_SANDSTONE_SMOOTH = new BlockSandstoneSmooth("white_sandstone_smooth", Material.ROCK);
	public static final Block WHITE_SANDSTONE_CARVED = new BlockSandstoneCarved("white_sandstone_carved", Material.ROCK);
	public static final Block WHITE_SANDSTONE_FACE = new BlockSandstoneFace("white_sandstone_face", Material.ROCK);
	public static final Block WHITE_SANDSTONE_GLYPH = new BlockSandstoneGlyph("white_sandstone_glyph", Material.ROCK);
	public static final Block BLACK_SAND = new BlockSand("black_sand", Material.SAND);
	public static final Block BLACK_SANDSTONE = new BlockSandstone("black_sandstone", Material.ROCK);
	public static final Block BLACK_SANDSTONE_SMOOTH = new BlockSandstoneSmooth("black_sandstone_smooth", Material.ROCK);
	public static final Block BLACK_SANDSTONE_CARVED = new BlockSandstoneCarved("black_sandstone_carved", Material.ROCK);
	public static final Block BLACK_SANDSTONE_FACE = new BlockSandstoneFace("black_sandstone_face", Material.ROCK);
	public static final Block BLACK_SANDSTONE_GLYPH = new BlockSandstoneGlyph("black_sandstone_glyph", Material.ROCK);
	public static final Block PINK_SAND = new BlockSand("pink_sand", Material.SAND);
	public static final Block PINK_SANDSTONE = new BlockSandstone("pink_sandstone", Material.ROCK);
	public static final Block PINK_SANDSTONE_SMOOTH = new BlockSandstoneSmooth("pink_sandstone_smooth", Material.ROCK);
	public static final Block PINK_SANDSTONE_CARVED = new BlockSandstoneCarved("pink_sandstone_carved", Material.ROCK);
	public static final Block PINK_SANDSTONE_FACE = new BlockSandstoneFace("pink_sandstone_face", Material.ROCK);
	public static final Block PINK_SANDSTONE_GLYPH = new BlockSandstoneGlyph("pink_sandstone_glyph", Material.ROCK);
	public static final Block OLIVINE_SAND = new BlockSand("olivine_sand", Material.SAND);
	public static final Block OLIVINE_SANDSTONE = new BlockSandstone("olivine_sandstone", Material.ROCK);
	public static final Block OLIVINE_SANDSTONE_SMOOTH = new BlockSandstoneSmooth("olivine_sandstone_smooth", Material.ROCK);
	public static final Block OLIVINE_SANDSTONE_CARVED = new BlockSandstoneCarved("olivine_sandstone_carved", Material.ROCK);
	public static final Block OLIVINE_SANDSTONE_FACE = new BlockSandstoneFace("olivine_sandstone_face", Material.ROCK);
	public static final Block OLIVINE_SANDSTONE_GLYPH = new BlockSandstoneGlyph("olivine_sandstone_glyph", Material.ROCK);
	public static final Block CONTINENTAL_SAND = new BlockSand("continental_sand", Material.SAND);
	public static final Block CONTINENTAL_SANDSTONE = new BlockSandstone("continental_sandstone", Material.ROCK);
	public static final Block CONTINENTAL_SANDSTONE_SMOOTH = new BlockSandstoneSmooth("continental_sandstone_smooth", Material.ROCK);
	public static final Block CONTINENTAL_SANDSTONE_CARVED = new BlockSandstoneCarved("continental_sandstone_carved", Material.ROCK);
	public static final Block CONTINENTAL_SANDSTONE_FACE = new BlockSandstoneFace("continental_sandstone_face", Material.ROCK);
	public static final Block CONTINENTAL_SANDSTONE_GLYPH = new BlockSandstoneGlyph("continental_sandstone_glyph", Material.ROCK);
	public static final Block PURPLE_SAND = new BlockSand("purple_sand", Material.SAND);
	public static final Block PURPLE_SANDSTONE = new BlockSandstone("purple_sandstone", Material.ROCK);
	public static final Block PURPLE_SANDSTONE_SMOOTH = new BlockSandstoneSmooth("purple_sandstone_smooth", Material.ROCK);
	public static final Block PURPLE_SANDSTONE_CARVED = new BlockSandstoneCarved("purple_sandstone_carved", Material.ROCK);
	public static final Block PURPLE_SANDSTONE_FACE = new BlockSandstoneFace("purple_sandstone_face", Material.ROCK);
	public static final Block PURPLE_SANDSTONE_GLYPH = new BlockSandstoneGlyph("purple_sandstone_glyph", Material.ROCK);
	public static final Block IRON_SAND = new BlockSand("iron_sand", Material.SAND);
	public static final Block IRON_SANDSTONE = new BlockSandstone("iron_sandstone", Material.ROCK);
	public static final Block IRON_SANDSTONE_SMOOTH = new BlockSandstoneSmooth("iron_sandstone_smooth", Material.ROCK);
	public static final Block IRON_SANDSTONE_CARVED = new BlockSandstoneCarved("iron_sandstone_carved", Material.ROCK);
	public static final Block IRON_SANDSTONE_FACE = new BlockSandstoneFace("iron_sandstone_face", Material.ROCK);
	public static final Block IRON_SANDSTONE_GLYPH = new BlockSandstoneGlyph("iron_sandstone_glyph", Material.ROCK);
	public static final Block ORANGE_SAND = new BlockSand("orange_sand", Material.SAND);
	public static final Block ORANGE_SANDSTONE = new BlockSandstone("orange_sandstone", Material.ROCK);
	public static final Block ORANGE_SANDSTONE_SMOOTH = new BlockSandstoneSmooth("orange_sandstone_smooth", Material.ROCK);
	public static final Block ORANGE_SANDSTONE_CARVED = new BlockSandstoneCarved("orange_sandstone_carved", Material.ROCK);
	public static final Block ORANGE_SANDSTONE_FACE = new BlockSandstoneFace("orange_sandstone_face", Material.ROCK);
	public static final Block ORANGE_SANDSTONE_GLYPH = new BlockSandstoneGlyph("orange_sandstone_glyph", Material.ROCK);
	
	//COAL & IRON
	public static final Block ORE_OVERWORLD_ANTHRACITE = new BlockAnthraciteOre("ore_overworldc_anthracite", Material.ROCK);
	public static final Block ORE_OVERWORLD_BITUMINOUS = new BlockBituminousOre("ore_overworldc_bituminous", Material.ROCK);
	public static final Block ORE_OVERWORLD_LIGNITE = new BlockLigniteOre("ore_overworldc_lignite", Material.ROCK);
	public static final Block ORE_OVERWORLD_PEAT = new BlockPeatOre("ore_overworldc_peat", Material.ROCK);
	public static final Block ORE_OVERWORLDCB_ANTHRACITE = new BlockAnthraciteBlock("ore_overworldcb_anthracite", Material.ROCK);
	public static final Block ORE_OVERWORLDCB_BITUMINOUS = new BlockBituminousBlock("ore_overworldcb_bituminous", Material.ROCK);
	public static final Block ORE_OVERWORLDCB_LIGNITE = new BlockLigniteBlock("ore_overworldcb_lignite", Material.ROCK);
	public static final Block ORE_OVERWORLDCB_PEAT = new BlockPeatBlock("ore_overworldcb_peat", Material.ROCK);
	public static final Block ORE_OVERWORLDI_HEMATITE = new BlockHematiteOre("ore_overworldi_hematite", Material.ROCK);
	public static final Block ORE_OVERWORLDI_LIMONITE = new BlockLimoniteOre("ore_overworldi_limonite", Material.ROCK);
	public static final Block ORE_OVERWORLDI_MAGNETITE = new BlockMagnetiteOre("ore_overworldi_magnetite", Material.ROCK);
	public static final Block ORE_OVERWORLDI_GOETHITE = new BlockGoethiteOre("ore_overworldi_goethite", Material.ROCK);
	public static final Block ORE_OVERWORLDI_SIDERITE = new BlockSideriteOre("ore_overworldi_siderite", Material.ROCK);
	public static final Block ORE_OVERWORLDI_ANKERITE = new BlockAnkeriteOre("ore_overworldi_ankerite", Material.ROCK);
	public static final Block ORE_OVERWORLDI_TACONITE = new BlockTaconiteOre("ore_overworldi_taconite", Material.ROCK);
	public static final Block ORE_OVERWORLDI_BANDED = new BlockBandedOre("ore_overworldi_banded", Material.ROCK);
	
	//NETHER
	public static final Block ALIKITE = new BlockNewNetherack("alikite", Material.ROCK);
	public static final Block TRIGLICITE = new BlockNewNetherack("triglicite", Material.ROCK);
	public static final Block KRUNDALTITE = new BlockNewNetherack("krundaltite", Material.ROCK);
	public static final Block ALIKITE_BRICKS = new BlockNewNetherbrick("alikite_bricks", Material.ROCK);
	public static final Block KRUNDALTITE_BRICKS = new BlockNewNetherbrick("krundaltite_bricks", Material.ROCK);
	public static final Block TRIGLICITE_BRICKS = new BlockNewNetherack("triglicite_bricks", Material.ROCK);
	public static final Block DANLVEYITE = new BlockDanlveyiteOre("danlveyite", Material.ROCK);
	public static final Block MAGACHITE = new BlockMagachiteOre("magachite", Material.ROCK);
	public static final Block MELISCITE = new BlockMelisciteOre("meliscite", Material.ROCK);
	public static final Block THENALITE = new BlockThenaliteOre("thenalite", Material.ROCK);
	public static final Block SOLITUDITE = new BlockSolituditeOre("solitudite", Material.ROCK);
	public static final Block KAMBORADOITE = new BlockKamboradoiteOre("kamboradoite", Material.ROCK);
	public static final Block DANLVEYITE_BLOCK = new BlockNewNetherGemBlock("danlveyite_block", Material.ROCK);
	public static final Block MAGACHITE_BLOCK = new BlockNewNetherGemBlock("magachite_block", Material.ROCK);
	public static final Block MELISCITE_BLOCK = new BlockNewNetherGemBlock("meliscite_block", Material.ROCK);
	public static final Block THENALITE_BLOCK = new BlockNewNetherGemBlock("thenalite_block", Material.ROCK);
	public static final Block SOLITUDITE_BLOCK = new BlockNewNetherGemBlock("solitudite_block", Material.ROCK);
	public static final Block KAMBORADOITE_BLOCK = new BlockNewNetherGemBlock("kamboradoite_block", Material.ROCK);
	public static final Block DANLVEYITE_PILLAR = new BlockNewNetherGemPillar("danlveyite_pillar", Material.ROCK);
	public static final Block MAGACHITE_PILLAR = new BlockNewNetherGemPillar("magachite_pillar", Material.ROCK);
	public static final Block MELISCITE_PILLAR = new BlockNewNetherGemPillar("meliscite_pillar", Material.ROCK);
	public static final Block THENALITE_PILLAR = new BlockNewNetherGemPillar("thenalite_pillar", Material.ROCK);
	public static final Block SOLITUDITE_PILLAR = new BlockNewNetherGemPillar("solitudite_pillar", Material.ROCK);
	public static final Block KAMBORADOITE_PILLAR = new BlockNewNetherGemPillar("kamboradoite_pillar", Material.ROCK);
	
	//LOGS
	public static final Block CHERRYLOG = new BlockLogCherry("cherry_log", Material.WOOD);
	public static final Block BLUESPRUCELOG = new BlockLogBlueSpruce("bluespruce_log", Material.WOOD);
	public static final Block BLACKSPRUCELOG = new BlockLogBlackSpruce("blackspruce_log", Material.WOOD);
	public static final Block WHITESPRUCELOG = new BlockLogWhiteSpruce("whitespruce_log", Material.WOOD);
	public static final Block REDSPRUCELOG = new BlockLogRedSpruce("redspruce_log", Material.WOOD);
	public static final Block ELMLOG = new BlockLogRedSpruce("elm_log", Material.WOOD);
	public static final Block PALMLOG = new BlockLogRedSpruce("palm_log", Material.WOOD);
	public static final Block MAHOGANYLOG = new BlockLogRedSpruce("mahogany_log", Material.WOOD);
	public static final Block EBONYLOG = new BlockLogEbony("ebony_log", Material.WOOD);
	public static final Block PAULOWNIALOG = new BlockLogPaulownia("paulownia_log", Material.WOOD);
	public static final Block JACARANDALOG = new BlockLogJacaranda("jacaranda_log", Material.WOOD);
	public static final Block ASPENLOG = new BlockLogAspen("aspen_log", Material.WOOD);
	public static final Block POPLARLOG = new BlockLogPoplar("poplar_log", Material.WOOD);
	public static final Block MANGROVELOG = new BlockLogMangrove("mangrove_log", Material.WOOD);
	
	//LEAVES
	public static final Block CHERRYLEAVESWHITE = new BlockLeavesCherryWhite("cherry_leaves_white", Material.LEAVES);
	public static final Block CHERRYLEAVESPURPLE = new BlockLeavesCherryPurple("cherry_leaves_purple", Material.LEAVES);
	public static final Block BLUESPRUCELEAVES = new BlockLeavesBlueSpruce("bluespruce_leaves", Material.LEAVES);
	public static final Block BLACKSPRUCELEAVES = new BlockLeavesBlackSpruce("blackspruce_leaves", Material.LEAVES);
	public static final Block REDSPRUCELEAVES = new BlockLeavesRedSpruce("redspruce_leaves", Material.LEAVES);
	public static final Block WHITESPRUCELEAVES = new BlockLeavesWhiteSpruce("whitespruce_leaves", Material.LEAVES);
	public static final Block ELMLEAVES = new BlockLeavesElm("elm_leaves", Material.LEAVES);
	public static final Block PALMLEAVES = new BlockLeavesPalm("palm_leaves", Material.LEAVES);
	public static final Block MAHOGANYLEAVES = new BlockLeavesMahogany("mahogany_leaves", Material.LEAVES);
	public static final Block EBONYLEAVES = new BlockLeavesEbony("ebony_leaves", Material.LEAVES);
	public static final Block JACARANDALEAVESPURPLE = new BlockLeavesJacarandaPurple("jacaranda_leaves_purple", Material.LEAVES);
	public static final Block JACARANDALEAVESMAGENTA = new BlockLeavesJacarandaMagenta("jacaranda_leaves_magenta", Material.LEAVES);
	public static final Block PAULOWNIALEAVESGREEN = new BlockLeavesPaulowniaGreen("paulownia_leaves_green", Material.LEAVES);
	public static final Block PAULOWNIALEAVESWHITE = new BlockLeavesPaulowniaWhite("paulownia_leaves_white", Material.LEAVES);
	public static final Block PAULOWNIALEAVESBLUE = new BlockLeavesPaulowniaBlue("paulownia_leaves_blue", Material.LEAVES);
	public static final Block ASPENLEAVES = new BlockLeavesAspen("aspen_leaves", Material.LEAVES);
	public static final Block POPLARLEAVES = new BlockLeavesPoplar("poplar_leaves", Material.LEAVES);
	public static final Block YELLOWBIRCHLEAVES = new BlockLeavesYellowBirch("birch_leaves_yellow", Material.LEAVES);
	public static final Block MANGROVELEAVES = new BlockLeavesMangrove("mangrove_leaves", Material.LEAVES);
	public static final Block CONIFERLEAVESYELLOW = new BlockLeavesConiferYellow("conifer_leaves_yellow", Material.LEAVES);
	public static final Block CONIFERLEAVESORANGE = new BlockLeavesConiferOrange("conifer_leaves_orange", Material.LEAVES);
	
	//SAPLINGS
	public static final Block CHERRYSAPLINGWHITE = new BlockSaplingCherryWhite("cherry_sapling_white", Material.LEAVES);
	public static final Block CHERRYSAPLINGPURPLE = new BlockSaplingCherryPurple("cherry_sapling_purple", Material.LEAVES);
	public static final Block BLUESPRUCESAPLING = new BlockSaplingBlueSpruce("bluespruce_sapling", Material.LEAVES);
	public static final Block BLACKSPRUCESAPLING = new BlockSaplingBlackSpruce("blackspruce_sapling", Material.LEAVES);
	public static final Block REDSPRUCESAPLING = new BlockSaplingRedSpruce("redspruce_sapling", Material.LEAVES);
	public static final Block WHITESPRUCESAPLING = new BlockSaplingWhiteSpruce("whitespruce_sapling", Material.LEAVES);
	public static final Block ELMSAPLING = new BlockSaplingElm("elm_sapling", Material.LEAVES);
	public static final Block PALMSAPLING = new BlockSaplingPalm("palm_sapling", Material.LEAVES);
	public static final Block MAHOGANYSAPLING = new BlockSaplingMahogany("mahogany_sapling", Material.LEAVES);
	public static final Block EBONYSAPLING = new BlockSaplingEbony("ebony_sapling", Material.LEAVES);
	public static final Block JACARANDASAPLINGPURPLE = new BlockSaplingJacarandaPurple("jacaranda_sapling_purple", Material.LEAVES);
	public static final Block JACARANDASAPLINGMAGENTA = new BlockSaplingJacarandaMagenta("jacaranda_sapling_magenta", Material.LEAVES);
	public static final Block PAULOWNIASAPLINGGREEN = new BlockSaplingPaulowniaGreen("paulownia_sapling_green", Material.LEAVES);
	public static final Block PAULOWNIASAPLINGWHITE = new BlockSaplingPaulowniaWhite("paulownia_sapling_white", Material.LEAVES);
	public static final Block PAULOWNIASAPLINGBLUE = new BlockSaplingPaulowniaBlue("paulownia_sapling_blue", Material.LEAVES);
	public static final Block ASPENSAPLING = new BlockSaplingAspen("aspen_sapling", Material.LEAVES);
	public static final Block POPLARSAPLING = new BlockSaplingPoplar("poplar_sapling", Material.LEAVES);
	public static final Block YELLOWBIRCHSAPLING = new BlockSaplingYellowBirch("birch_sapling_yellow", Material.LEAVES);
	public static final Block MANGROVESAPLING = new BlockSaplingMangrove("mangrove_sapling", Material.LEAVES);
	public static final Block CONIFERSAPLINGYELLOW = new BlockSaplingConiferYellow("conifer_sapling_yellow", Material.LEAVES);
	public static final Block CONIFERSAPLINGORANGE = new BlockSaplingConiferOrange("conifer_sapling_orange", Material.LEAVES);
	
	//FENCES
	public static final Block CHERRYFENCE = new BlockTerraFence("cherry_fence", Material.WOOD);
	public static final Block CHERRYFENCEGATE = new BlockTerraFenceGate("cherry_fencegate", Material.WOOD);
	public static final Block BLUESPRUCEFENCE = new BlockTerraFence("bluespruce_fence", Material.WOOD);
	public static final Block BLUESPRUCEFENCEGATE = new BlockTerraFenceGate("bluespruce_fencegate", Material.WOOD);
	public static final Block BLACKSPRUCEFENCE = new BlockTerraFence("blackspruce_fence", Material.WOOD);
	public static final Block BLACKSPRUCEFENCEGATE = new BlockTerraFenceGate("blackspruce_fencegate", Material.WOOD);
	public static final Block WHITESPRUCEFENCE = new BlockTerraFence("whitespruce_fence", Material.WOOD);
	public static final Block WHITESPRUCEFENCEGATE = new BlockTerraFenceGate("whitespruce_fencegate", Material.WOOD);
	public static final Block REDSPRUCEFENCE = new BlockTerraFence("redspruce_fence", Material.WOOD);
	public static final Block REDSPRUCEFENCEGATE = new BlockTerraFenceGate("redspruce_fencegate", Material.WOOD);
	public static final Block EBONYFENCE = new BlockTerraFence("ebony_fence", Material.WOOD);
	public static final Block EBONYFENCEGATE = new BlockTerraFenceGate("ebony_fencegate", Material.WOOD);
	public static final Block ELMFENCE = new BlockTerraFence("elm_fence", Material.WOOD);
	public static final Block ELMFENCEGATE = new BlockTerraFenceGate("elm_fencegate", Material.WOOD);
	public static final Block PALMFENCE = new BlockTerraFence("palm_fence", Material.WOOD);
	public static final Block PALMFENCEGATE = new BlockTerraFenceGate("palm_fencegate", Material.WOOD);
	public static final Block JACARANDAFENCE = new BlockTerraFence("jacaranda_fence", Material.WOOD);
	public static final Block JACARANDAFENCEGATE = new BlockTerraFenceGate("jacaranda_fencegate", Material.WOOD);
	public static final Block MAHOGANYFENCE = new BlockTerraFence("mahogany_fence", Material.WOOD);
	public static final Block MAHOGANYFENCEGATE = new BlockTerraFenceGate("mahogany_fencegate", Material.WOOD);
	public static final Block ASPENFENCE = new BlockTerraFence("aspen_fence", Material.WOOD);
	public static final Block ASPENFENCEGATE = new BlockTerraFenceGate("aspen_fencegate", Material.WOOD);
	public static final Block POPLARFENCE = new BlockTerraFence("poplar_fence", Material.WOOD);
	public static final Block POPLARFENCEGATE = new BlockTerraFenceGate("poplar_fencegate", Material.WOOD);
	public static final Block PAULOWNIAFENCE = new BlockTerraFence("paulownia_fence", Material.WOOD);
	public static final Block PAULOWNIAFENCEGATE = new BlockTerraFenceGate("paulownia_fencegate", Material.WOOD);
	public static final Block MANGROVEFENCE = new BlockTerraFence("mangrove_fence", Material.WOOD);
	public static final Block MANGROVEFENCEGATE = new BlockTerraFenceGate("mangrove_fencegate", Material.WOOD);
	
	public static final Block COBBLESTONEFENCEGATE = new BlockTerraStoneFenceGate("cobblestone_fencegate", Material.ROCK);
	public static final Block MOSSYCOBBLESTONEFENCEGATE = new BlockTerraStoneFenceGate("cobblestone_mossy_fencegate", Material.ROCK);
	
	
	//PLANKS
	public static final Block CHERRYPLANKS = new BlockPlanksCherry("cherry_planks", Material.WOOD);
	public static final Block BLUESPRUCEPLANKS = new BlockPlanksBlueSpruce("bluespruce_planks", Material.WOOD);
	public static final Block WHITESPRUCEPLANKS = new BlockPlanksWhiteSpruce("whitespruce_planks", Material.WOOD);
	public static final Block BLACKSPRUCEPLANKS = new BlockPlanksBlackSpruce("blackspruce_planks", Material.WOOD);
	public static final Block REDSPRUCEPLANKS = new BlockPlanksRedSpruce("redspruce_planks", Material.WOOD);
	public static final Block ELMPLANKS = new BlockPlanksElm("elm_planks", Material.WOOD);
	public static final Block PALMPLANKS = new BlockPlanksPalm("palm_planks", Material.WOOD);
	public static final Block MAHOGANYPLANKS = new BlockPlanksMahogany("mahogany_planks", Material.WOOD);
	public static final Block EBONYPLANKS = new BlockPlanksEbony("ebony_planks", Material.WOOD);
	public static final Block PAULOWNIAPLANKS = new BlockPlanksPaulownia("paulownia_planks", Material.WOOD);
	public static final Block JACARANDAPLANKS = new BlockPlanksJacaranda("jacaranda_planks", Material.WOOD);
	public static final Block ASPENPLANKS = new BlockPlanksAspen("aspen_planks", Material.WOOD);
	public static final Block POPLARPLANKS = new BlockPlanksPoplar("poplar_planks", Material.WOOD);
	public static final Block MANGROVEPLANKS = new BlockPlanksMangrove("mangrove_planks", Material.WOOD);
	
	//STAIRS
	public static final Block CHERRYSTAIRS = new BlockStair("cherry_stairs", CHERRYPLANKS.getDefaultState());
	public static final Block BLUESPRUCESTAIRS = new BlockStair("bluespruce_stairs", BLUESPRUCEPLANKS.getDefaultState());
	public static final Block WHITESPRUCESTAIRS = new BlockStair("whitespruce_stairs", WHITESPRUCEPLANKS.getDefaultState());
	public static final Block BLACKSPRUCESTAIRS = new BlockStair("blackspruce_stairs", BLACKSPRUCEPLANKS.getDefaultState());
	public static final Block REDSPRUCESTAIRS = new BlockStair("redspruce_stairs", REDSPRUCEPLANKS.getDefaultState());
	public static final Block ELMSTAIRS = new BlockStair("elm_stairs", ELMPLANKS.getDefaultState());
	public static final Block PALMSTAIRS = new BlockStair("palm_stairs", PALMPLANKS.getDefaultState());
	public static final Block MAHOGANYSTAIRS = new BlockStair("mahogany_stairs", MAHOGANYPLANKS.getDefaultState());
	public static final Block EBONYSTAIRS = new BlockStair("ebony_stairs", EBONYPLANKS.getDefaultState());
	public static final Block PAULOWNIASTAIRS = new BlockStair("paulownia_stairs", PAULOWNIAPLANKS.getDefaultState());
	public static final Block JACARANDASTAIRS = new BlockStair("jacaranda_stairs", JACARANDAPLANKS.getDefaultState());
	public static final Block ASPENSTAIRS = new BlockStair("aspen_stairs", ASPENPLANKS.getDefaultState());
	public static final Block POPLARSTAIRS = new BlockStair("poplar_stairs", POPLARPLANKS.getDefaultState());
	public static final Block MANGROVESTAIRS = new BlockStair("mangrove_stairs", MANGROVEPLANKS.getDefaultState());
	
	//STONE
	public static final Block BASALT_STONE = new BlockBasalt("basalt_stone", Material.ROCK);
	public static final Block BLACKDIORITE_STONE = new BlockBlackDiorite("blackdiorite_stone", Material.ROCK);
	public static final Block IMPERIALQUARTZITE_STONE = new BlockImperialQuartzite("imperialquartzite_stone", Material.ROCK);
	public static final Block PINKQUARTZITE_STONE = new BlockPinkQuartzite("pinkquartzite_stone", Material.ROCK);
	public static final Block REDQUARTZITE_STONE = new BlockRedQuartzite("redquartzite_stone", Material.ROCK);
	public static final Block CHALK_STONE = new BlockChalk("chalk_stone", Material.ROCK);
	public static final Block BLUESCHIST_STONE = new BlockBlueSchist("blueschist_stone", Material.ROCK);
	public static final Block GREENSCHIST_STONE = new BlockGreenSchist("greenschist_stone", Material.ROCK);
	public static final Block GABBRO_STONE = new BlockGabbro("gabbro_stone", Material.ROCK);
	public static final Block GNEISS_STONE = new BlockGneiss("gneiss_stone", Material.ROCK);
	public static final Block KIMBERLITE_STONE = new BlockKimberlite("kimberlite_stone", Material.ROCK);
	public static final Block LIMESTONE_STONE = new BlockLimestone("limestone_stone", Material.ROCK);
	public static final Block MARBLE_STONE = new BlockMarble("marble_stone", Material.ROCK);
	public static final Block MIGMATITE_STONE = new BlockMigmatite("migmatite_stone", Material.ROCK);
	public static final Block PUMICE_STONE = new BlockPumice("pumice_stone", Material.ROCK);
	public static final Block RHYOLITE_STONE = new BlockRhyolite("rhyolite_stone", Material.ROCK);
	public static final Block SCORIA_STONE = new BlockScoria("scoria_stone", Material.ROCK);
	public static final Block SLATE_STONE = new BlockSlate("slate_stone", Material.ROCK);
	public static final Block SOAPSTONE_STONE = new BlockSoapstone("soapstone_stone", Material.ROCK);
	public static final Block DACITE_STONE = new BlockDacite("dacite_stone", Material.ROCK);
	public static final Block TUFF_STONE = new BlockTuff("tuff_stone", Material.ROCK);
	public static final Block PEGMATITE_STONE = new BlockPegmatite("pegmatite_stone", Material.ROCK);
	public static final Block PERIDOTITE_STONE = new BlockPeridotite("peridotite_stone", Material.ROCK);
	public static final Block ANORTHOSITE_STONE = new BlockAnorthosite("anorthosite_stone", Material.ROCK);
	public static final Block DUNITE_STONE = new BlockDunite("dunite_stone", Material.ROCK);
	public static final Block FELSITE_STONE = new BlockFelsite("felsite_stone", Material.ROCK);
	public static final Block GRANODIORITE_STONE = new BlockGranodiorite("granodiorite_stone", Material.ROCK);
	public static final Block KOMATITE_STONE = new BlockKomatite("komatite_stone", Material.ROCK);
	public static final Block LATITE_STONE = new BlockLatite("latite_stone", Material.ROCK);
	public static final Block PORPHYRY_STONE = new BlockPorphyry("porphyry_stone", Material.ROCK);
	public static final Block PYROXENITE_STONE = new BlockPyroxenite("pyroxenite_stone", Material.ROCK);
	public static final Block SYENITE_STONE = new BlockSyenite("syenite_stone", Material.ROCK);
	public static final Block TROCTOLITE_STONE = new BlockTroctolite("troctolite_stone", Material.ROCK);
	
	
	//COBBLESTONE
	public static final Block BASALT_COBBLESTONE = new BlockIgneousRocks("basalt_cobblestone", Material.ROCK);
	public static final Block BLACKDIORITE_COBBLESTONE = new BlockIgneousRocks("blackdiorite_cobblestone", Material.ROCK);
	public static final Block IMPERIALQUARTZITE_COBBLESTONE = new BlockMetamorphicRocks("imperialquartzite_cobblestone", Material.ROCK);
	public static final Block PINKQUARTZITE_COBBLESTONE = new BlockMetamorphicRocks("pinkquartzite_cobblestone", Material.ROCK);
	public static final Block REDQUARTZITE_COBBLESTONE = new BlockMetamorphicRocks("redquartzite_cobblestone", Material.ROCK);
	public static final Block CHALK_COBBLESTONE = new BlockSedimentaryRocks("chalk_cobblestone", Material.ROCK);
	public static final Block BLUESCHIST_COBBLESTONE = new BlockMetamorphicRocks("blueschist_cobblestone", Material.ROCK);
	public static final Block GREENSCHIST_COBBLESTONE = new BlockMetamorphicRocks("greenschist_cobblestone", Material.ROCK);
	public static final Block GABBRO_COBBLESTONE = new BlockIgneousRocks("gabbro_cobblestone", Material.ROCK);
	public static final Block GNEISS_COBBLESTONE = new BlockMetamorphicRocks("gneiss_cobblestone", Material.ROCK);
	public static final Block KIMBERLITE_COBBLESTONE = new BlockIgneousRocks("kimberlite_cobblestone", Material.ROCK);
	public static final Block LIMESTONE_COBBLESTONE = new BlockSedimentaryRocks("limestone_cobblestone", Material.ROCK);
	public static final Block MARBLE_COBBLESTONE = new BlockMetamorphicRocks("marble_cobblestone", Material.ROCK);
	public static final Block MIGMATITE_COBBLESTONE = new BlockMetamorphicRocks("migmatite_cobblestone", Material.ROCK);
	public static final Block PUMICE_COBBLESTONE = new BlockIgneousRocks("pumice_cobblestone", Material.ROCK);
	public static final Block RHYOLITE_COBBLESTONE = new BlockIgneousRocks("rhyolite_cobblestone", Material.ROCK);
	public static final Block SCORIA_COBBLESTONE = new BlockIgneousRocks("scoria_cobblestone", Material.ROCK);
	public static final Block SLATE_COBBLESTONE = new BlockMetamorphicRocks("slate_cobblestone", Material.ROCK);
	public static final Block SOAPSTONE_COBBLESTONE = new BlockMetamorphicRocks("soapstone_cobblestone", Material.ROCK);
	public static final Block DACITE_COBBLESTONE = new BlockIgneousRocks("dacite_cobblestone", Material.ROCK);
	public static final Block TUFF_COBBLESTONE = new BlockIgneousRocks("tuff_cobblestone", Material.ROCK);
	public static final Block PEGMATITE_COBBLESTONE = new BlockIgneousRocks("pegmatite_cobblestone", Material.ROCK);
	public static final Block PERIDOTITE_COBBLESTONE = new BlockIgneousRocks("peridotite_cobblestone", Material.ROCK);
	public static final Block ANORTHOSITE_COBBLESTONE = new BlockIgneousRocks("anorthosite_cobblestone", Material.ROCK);
	public static final Block DUNITE_COBBLESTONE = new BlockIgneousRocks("dunite_cobblestone", Material.ROCK);
	public static final Block FELSITE_COBBLESTONE = new BlockIgneousRocks("felsite_cobblestone", Material.ROCK);
	public static final Block GRANODIORITE_COBBLESTONE = new BlockIgneousRocks("granodiorite_cobblestone", Material.ROCK);
	public static final Block KOMATITE_COBBLESTONE = new BlockIgneousRocks("komatite_cobblestone", Material.ROCK);
	public static final Block LATITE_COBBLESTONE = new BlockIgneousRocks("latite_cobblestone", Material.ROCK);
	public static final Block PORPHYRY_COBBLESTONE = new BlockIgneousRocks("porphyry_cobblestone", Material.ROCK);
	public static final Block PYROXENITE_COBBLESTONE = new BlockIgneousRocks("pyroxenite_cobblestone", Material.ROCK);
	public static final Block SYENITE_COBBLESTONE = new BlockIgneousRocks("syenite_cobblestone", Material.ROCK);
	public static final Block TROCTOLITE_COBBLESTONE = new BlockIgneousRocks("troctolite_cobblestone", Material.ROCK);
	
	
	//STONEBRICK
	public static final Block BASALT_STONEBRICK = new BlockIgneousRocks("basalt_stonebrick", Material.ROCK);
	public static final Block BLACKDIORITE_STONEBRICK = new BlockIgneousRocks("blackdiorite_stonebrick", Material.ROCK);
	public static final Block IMPERIALQUARTZITE_STONEBRICK = new BlockMetamorphicRocks("imperialquartzite_stonebrick", Material.ROCK);
	public static final Block PINKQUARTZITE_STONEBRICK = new BlockMetamorphicRocks("pinkquartzite_stonebrick", Material.ROCK);
	public static final Block REDQUARTZITE_STONEBRICK = new BlockMetamorphicRocks("redquartzite_stonebrick", Material.ROCK);
	public static final Block CHALK_STONEBRICK = new BlockSedimentaryRocks("chalk_stonebrick", Material.ROCK);
	public static final Block BLUESCHIST_STONEBRICK = new BlockMetamorphicRocks("blueschist_stonebrick", Material.ROCK);
	public static final Block GREENSCHIST_STONEBRICK = new BlockMetamorphicRocks("greenschist_stonebrick", Material.ROCK);
	public static final Block GABBRO_STONEBRICK = new BlockIgneousRocks("gabbro_stonebrick", Material.ROCK);
	public static final Block GNEISS_STONEBRICK = new BlockMetamorphicRocks("gneiss_stonebrick", Material.ROCK);
	public static final Block KIMBERLITE_STONEBRICK = new BlockIgneousRocks("kimberlite_stonebrick", Material.ROCK);
	public static final Block LIMESTONE_STONEBRICK = new BlockSedimentaryRocks("limestone_stonebrick", Material.ROCK);
	public static final Block MARBLE_STONEBRICK = new BlockMetamorphicRocks("marble_stonebrick", Material.ROCK);
	public static final Block MIGMATITE_STONEBRICK = new BlockMetamorphicRocks("migmatite_stonebrick", Material.ROCK);
	public static final Block PUMICE_STONEBRICK = new BlockIgneousRocks("pumice_stonebrick", Material.ROCK);
	public static final Block RHYOLITE_STONEBRICK = new BlockIgneousRocks("rhyolite_stonebrick", Material.ROCK);
	public static final Block SCORIA_STONEBRICK = new BlockIgneousRocks("scoria_stonebrick", Material.ROCK);
	public static final Block SLATE_STONEBRICK = new BlockMetamorphicRocks("slate_stonebrick", Material.ROCK);
	public static final Block SOAPSTONE_STONEBRICK = new BlockMetamorphicRocks("soapstone_stonebrick", Material.ROCK);
	public static final Block DACITE_STONEBRICK = new BlockIgneousRocks("dacite_stonebrick", Material.ROCK);
	public static final Block TUFF_STONEBRICK = new BlockIgneousRocks("tuff_stonebrick", Material.ROCK);
	public static final Block PEGMATITE_STONEBRICK = new BlockIgneousRocks("pegmatite_stonebrick", Material.ROCK);
	public static final Block PERIDOTITE_STONEBRICK = new BlockIgneousRocks("peridotite_stonebrick", Material.ROCK);
	public static final Block ANORTHOSITE_STONEBRICK = new BlockIgneousRocks("anorthosite_stonebrick", Material.ROCK);
	public static final Block DUNITE_STONEBRICK = new BlockIgneousRocks("dunite_stonebrick", Material.ROCK);
	public static final Block FELSITE_STONEBRICK = new BlockIgneousRocks("felsite_stonebrick", Material.ROCK);
	public static final Block GRANODIORITE_STONEBRICK = new BlockIgneousRocks("granodiorite_stonebrick", Material.ROCK);
	public static final Block KOMATITE_STONEBRICK = new BlockIgneousRocks("komatite_stonebrick", Material.ROCK);
	public static final Block LATITE_STONEBRICK = new BlockIgneousRocks("latite_stonebrick", Material.ROCK);
	public static final Block PORPHYRY_STONEBRICK = new BlockIgneousRocks("porphyry_stonebrick", Material.ROCK);
	public static final Block PYROXENITE_STONEBRICK = new BlockIgneousRocks("pyroxenite_stonebrick", Material.ROCK);
	public static final Block SYENITE_STONEBRICK = new BlockIgneousRocks("syenite_stonebrick", Material.ROCK);
	public static final Block TROCTOLITE_STONEBRICK = new BlockIgneousRocks("troctolite_stonebrick", Material.ROCK);
	
	//MISC
	public static final Block ANTHROSIUM = new BlockAnthrosium("anthrosium", Material.GROUND);
	public static final Block BELLIUM = new BlockBellium("bellium", Material.GROUND);
	public static final BlockMushrooms KLELDA = new BlockMushrooms("klelda", Material.PLANTS);
	public static final BlockMushrooms SAJERRY = new BlockMushrooms("sajerry", Material.PLANTS);
	public static final Block MOSS = new BlockMoss("moss", Material.GROUND);
	public static final Block GREYDEADBUSH = new BlockGreyDeadBush("grey_deadbush", Material.PLANTS);

	}
