package net.kipster.terra.objects.items;

import net.kipster.terra.Main;
import net.kipster.terra.init.ItemInit;
import net.kipster.terra.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemNetherGems extends Item implements IHasModel
{
	public ItemNetherGems(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TERRATABROCKS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}