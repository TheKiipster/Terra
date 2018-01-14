package net.kipster.terra;

import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class TerraTabPlants extends CreativeTabs
{
	public TerraTabPlants(String label) { super("terratabplants"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.GREYDEADBUSH);}

		@Override
public boolean hasSearchBar() {
	return true;
}

}