package net.kipster.terra.objects.blocks;

import java.util.Random;

import net.kipster.terra.Main;
import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.kipster.terra.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockAnthraciteOre extends Block implements IHasModel
{
	public BlockAnthraciteOre(String name, Material material) 
	{
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.STONE);
		setHardness(3F);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(Main.TERRATABMISC);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	 @Override

	 public Item getItemDropped(IBlockState state, Random rand, int fortune)

	     {

	         return ItemInit.ANTHRACITE_COAL;

	     }

	  

	 @Override

	 public int quantityDropped(Random rand)

	 {

	 return 1 + rand.nextInt(2);

	 }
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}