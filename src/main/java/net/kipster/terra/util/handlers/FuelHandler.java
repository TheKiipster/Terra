package net.kipster.terra.util.handlers;

import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public  class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == ItemInit.ANTHRACITE_COAL) {
			return 1600;
		}
		if (fuel.getItem() == ItemInit.BITUMINOUS_COAL) {
			return 1600;
		}
		if (fuel.getItem() == ItemInit.LIGNITE_COAL) {
			return 1600;
		}
		if (fuel.getItem() == ItemInit.PEAT_COAL) {
			return 1600;
		}
		if (fuel.getItem() == Item.getItemFromBlock(BlockInit.ORE_OVERWORLDCB_ANTHRACITE)) {
			return 16000;
		}
		if (fuel.getItem() == Item.getItemFromBlock(BlockInit.ORE_OVERWORLDCB_ANTHRACITE)) {
			return 16000;
		}
		if (fuel.getItem() == Item.getItemFromBlock(BlockInit.ORE_OVERWORLDCB_ANTHRACITE)) {
			return 16000;
		}
		if (fuel.getItem() == Item.getItemFromBlock(BlockInit.ORE_OVERWORLDCB_ANTHRACITE)) {
			return 16000;
		}
		return 0;
	
	}
	}	
	