package net.kipster.terra.util.handlers;

import net.kipster.terra.init.BlockInit;
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
	
	System.out.println("Furnace Recipes Registered");
}
}
