package net.kipster.terra.objects.blocks;

import net.kipster.terra.Main;
import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.kipster.terra.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockTerraFence extends BlockFence implements IHasModel
{
	public BlockTerraFence(String name, Material material) 
	{
		super(Material.WOOD, Material.WOOD.getMaterialMapColor());
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(blockResistance);
		setHardness(blockHardness);
		this.useNeighborBrightness = true;
		setCreativeTab(Main.TERRATAB);
        setHardness(2.0F);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}