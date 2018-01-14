package net.kipster.terra;

import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class TerraTabMisc extends CreativeTabs
{
	public TerraTabMisc(String label) { super("terratabmisc"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.OLIVINE_SANDSTONE_GLYPH);}

		@Override
public boolean hasSearchBar() {
	return true;
}

}