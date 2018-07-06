package net.kipster.terra;

import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class TerraTab extends CreativeTabs
{
	public TerraTab(String label) { super("terratab"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.BLUESPRUCESAPLING);}

}
