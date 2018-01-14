package net.kipster.terra;

import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class TerraTabGeology extends CreativeTabs
{
	public TerraTabGeology(String label) { super("terratabgeology"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.IMPERIALQUARTZITE_STONE);}

		@Override
public boolean hasSearchBar() {
	return true;
}

}