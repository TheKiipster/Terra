package net.kipster.terra;

import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class TerraTabIgneous extends CreativeTabs
{
	public TerraTabIgneous(String label) { super("terratabigneous"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.BASALT_STONE);}

}
