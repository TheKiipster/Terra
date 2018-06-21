package net.kipster.terra.util.handlers;

import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipeHandler 
{

public static void registerFurnaceRecipes() {
	GameRegistry.addSmelting(BlockInit.CONTINENTAL_SAND, new ItemStack(Blocks.GLASS), 1.0F);
	GameRegistry.addSmelting(BlockInit.IRON_SAND, new ItemStack(Blocks.GLASS), 1.0F);
	GameRegistry.addSmelting(BlockInit.OLIVINE_SAND, new ItemStack(Blocks.GLASS), 1.0F);
	GameRegistry.addSmelting(BlockInit.ORANGE_SAND, new ItemStack(Blocks.GLASS), 1.0F);
	GameRegistry.addSmelting(BlockInit.PINK_SAND, new ItemStack(Blocks.GLASS), 1.0F);
	GameRegistry.addSmelting(BlockInit.PURPLE_SAND, new ItemStack(Blocks.GLASS), 1.0F);
	GameRegistry.addSmelting(BlockInit.WHITE_SAND, new ItemStack(Blocks.GLASS), 1.0F);
	GameRegistry.addSmelting(BlockInit.BLACK_SAND, new ItemStack(Blocks.GLASS), 1F);
	GameRegistry.addSmelting(BlockInit.ORE_OVERWORLDI_ANKERITE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.ORE_OVERWORLDI_LIMONITE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.ORE_OVERWORLDI_HEMATITE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.ORE_OVERWORLDI_GOETHITE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.ORE_OVERWORLDI_MAGNETITE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.ORE_OVERWORLDI_SIDERITE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.ORE_OVERWORLDI_TACONITE, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.ORE_OVERWORLDI_BANDED, new ItemStack(Items.IRON_INGOT), 1F);
	GameRegistry.addSmelting(BlockInit.BASALT_COBBLESTONE, new ItemStack(BlockInit.BASALT_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.BLACKDIORITE_COBBLESTONE, new ItemStack(BlockInit.BLACKDIORITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.IMPERIALQUARTZITE_COBBLESTONE, new ItemStack(BlockInit.IMPERIALQUARTZITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.PINKQUARTZITE_COBBLESTONE, new ItemStack(BlockInit.PINKQUARTZITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.REDQUARTZITE_COBBLESTONE, new ItemStack(BlockInit.REDQUARTZITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.BLUESCHIST_COBBLESTONE, new ItemStack(BlockInit.BLUESCHIST_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.GREENSCHIST_COBBLESTONE, new ItemStack(BlockInit.GREENSCHIST_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.CHALK_COBBLESTONE, new ItemStack(BlockInit.CHALK_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.GABBRO_COBBLESTONE, new ItemStack(BlockInit.GABBRO_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.GNEISS_COBBLESTONE, new ItemStack(BlockInit.GNEISS_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.KIMBERLITE_COBBLESTONE, new ItemStack(BlockInit.KIMBERLITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.LIMESTONE_COBBLESTONE, new ItemStack(BlockInit.LIMESTONE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.MARBLE_COBBLESTONE, new ItemStack(BlockInit.MARBLE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.MIGMATITE_COBBLESTONE, new ItemStack(BlockInit.MIGMATITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.PUMICE_COBBLESTONE, new ItemStack(BlockInit.PUMICE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.RHYOLITE_COBBLESTONE, new ItemStack(BlockInit.RHYOLITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.SCORIA_COBBLESTONE, new ItemStack(BlockInit.SCORIA_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.SLATE_COBBLESTONE, new ItemStack(BlockInit.SLATE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.SOAPSTONE_COBBLESTONE, new ItemStack(BlockInit.SOAPSTONE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.ANORTHOSITE_COBBLESTONE, new ItemStack(BlockInit.ANORTHOSITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.DACITE_COBBLESTONE, new ItemStack(BlockInit.DACITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.DUNITE_COBBLESTONE, new ItemStack(BlockInit.DUNITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.GRANODIORITE_COBBLESTONE, new ItemStack(BlockInit.GRANODIORITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.FELSITE_COBBLESTONE, new ItemStack(BlockInit.FELSITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.PEGMATITE_COBBLESTONE, new ItemStack(BlockInit.PEGMATITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.KOMATITE_COBBLESTONE, new ItemStack(BlockInit.KOMATITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.PERIDOTITE_COBBLESTONE, new ItemStack(BlockInit.PERIDOTITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.PORPHYRY_COBBLESTONE, new ItemStack(BlockInit.PORPHYRY_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.PYROXENITE_COBBLESTONE, new ItemStack(BlockInit.PYROXENITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.LATITE_COBBLESTONE, new ItemStack(BlockInit.LATITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.SYENITE_COBBLESTONE, new ItemStack(BlockInit.SYENITE_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.TUFF_COBBLESTONE, new ItemStack(BlockInit.TUFF_STONE), 1F);
	GameRegistry.addSmelting(BlockInit.TROCTOLITE_COBBLESTONE, new ItemStack(BlockInit.TROCTOLITE_STONE), 1F);
	
	GameRegistry.addSmelting(BlockInit.ASPENLOG, new ItemStack(Items.COAL), 1F);
	GameRegistry.addSmelting(BlockInit.BLUESPRUCELOG, new ItemStack(Items.COAL), 1F);
	GameRegistry.addSmelting(BlockInit.BLACKSPRUCELOG, new ItemStack(Items.COAL), 1F);
	GameRegistry.addSmelting(BlockInit.CHERRYLOG, new ItemStack(Items.COAL), 1F);
	GameRegistry.addSmelting(BlockInit.EBONYLOG, new ItemStack(Items.COAL), 1F);
	GameRegistry.addSmelting(BlockInit.ELMLOG, new ItemStack(Items.COAL), 1F);
	GameRegistry.addSmelting(BlockInit.JACARANDALOG, new ItemStack(Items.COAL), 1F);
	GameRegistry.addSmelting(BlockInit.POPLARLOG, new ItemStack(Items.COAL), 1F);
	GameRegistry.addSmelting(BlockInit.PALMLOG, new ItemStack(Items.COAL), 1F);
	GameRegistry.addSmelting(BlockInit.PAULOWNIALOG, new ItemStack(Items.COAL), 1F);
	GameRegistry.addSmelting(BlockInit.MAHOGANYLOG, new ItemStack(Items.COAL), 1F);
	GameRegistry.addSmelting(BlockInit.MANGROVELOG, new ItemStack(Items.COAL), 1F);
	GameRegistry.addSmelting(BlockInit.WHITESPRUCELOG, new ItemStack(Items.COAL), 1F);
	GameRegistry.addSmelting(BlockInit.REDSPRUCELOG, new ItemStack(Items.COAL), 1F);
	
	GameRegistry.addSmelting(BlockInit.ALIKITE, new ItemStack(ItemInit.ALIKITE_BRICK), 1F);
	GameRegistry.addSmelting(BlockInit.TRIGLICITE, new ItemStack(ItemInit.TRIGLICITE_BRICK), 1F);
	GameRegistry.addSmelting(BlockInit.KRUNDALTITE, new ItemStack(ItemInit.KRUNDALTITE_BRICK), 1F);
	System.out.println("Furnace Recipes Registered");
}
}
