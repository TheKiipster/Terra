package net.kipster.terra.init;

import java.util.ArrayList;
import java.util.List;

import net.kipster.terra.Main;
import net.kipster.terra.objects.items.ItemAnthraciteCoal;
import net.kipster.terra.objects.items.ItemBituminousCoal;
import net.kipster.terra.objects.items.ItemLigniteCoal;
import net.kipster.terra.objects.items.ItemPeatCoal;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	
	public static final Item ANTHRACITE_COAL = new ItemAnthraciteCoal("ore_overworldci_anthracite");
	public static final Item BITUMINOUS_COAL = new ItemBituminousCoal("ore_overworldci_bituminous");
	public static final Item LIGNITE_COAL = new ItemLigniteCoal("ore_overworldci_lignite");
	public static final Item PEAT_COAL = new ItemPeatCoal("ore_overworldci_peat");
	
	
	public static void registerRender(Item item) {
	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(
			new ResourceLocation(Main.modId, item.getUnlocalizedName().substring(5)), "inventory"));
}

public static void registerRender(Item item, int meta, String fileName) {
	ModelLoader.setCustomModelResourceLocation(item, meta,
			new ModelResourceLocation(new ResourceLocation(Main.modId, fileName), "inventory"));
	
}

}