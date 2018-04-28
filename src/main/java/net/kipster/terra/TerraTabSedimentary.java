package net.kipster.terra;

import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class TerraTabSedimentary extends CreativeTabs
{
	public TerraTabSedimentary(String label) { super("terratabsedimentary"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.LIMESTONE_STONE);}

}
