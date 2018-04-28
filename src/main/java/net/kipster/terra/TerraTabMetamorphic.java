package net.kipster.terra;

import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class TerraTabMetamorphic extends CreativeTabs
{
	public TerraTabMetamorphic(String label) { super("terratabmetamorphic"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.MARBLE_STONE);}

}
