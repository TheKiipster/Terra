package net.kipster.terra.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import net.kipster.terra.Main;
import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.kipster.terra.objects.blocks.item.ItemBlockVariants;
import net.kipster.terra.util.handlers.EnumLeafHandler;
import net.kipster.terra.util.interfaces.IHasModel;
import net.kipster.terra.util.interfaces.IMetaName;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLeaf extends BlockLeaves implements IMetaName, IHasModel
{
	public static final PropertyEnum<EnumLeafHandler.EnumType> VARIANT = PropertyEnum.<EnumLeafHandler.EnumType>create("variant", EnumLeafHandler.EnumType.class, new Predicate<EnumLeafHandler.EnumType>()
	{
		public boolean apply(@Nullable EnumLeafHandler.EnumType apply)
		{
			return apply.getMeta() < 3;
		}
	});
	
	private String name;
	
	public BlockLeaf(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EnumLeafHandler.EnumType.WHITECHERRY).withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
		setCreativeTab(Main.TERRATABPLANTS);
		
		this.name = name;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        items.add(new ItemStack(this, 1, EnumLeafHandler.EnumType.WHITECHERRY.getMeta()));
        items.add(new ItemStack(this, 1, EnumLeafHandler.EnumType.PURPLECHERRY.getMeta()));
        items.add(new ItemStack(this, 1, EnumLeafHandler.EnumType.BLUESPRUCE.getMeta()));
    }
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(VARIANT, EnumLeafHandler.EnumType.byMetadata(meta % 4));
	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		int i = ((EnumLeafHandler.EnumType)state.getValue(VARIANT)).getMeta();
		
		if(!((Boolean)state.getValue(DECAYABLE)).booleanValue())
		{
			i |= 4;
		}
		
		if(!((Boolean)state.getValue(CHECK_DECAY)).booleanValue())
		{
			i |= 8;
		}
		
		return i;

	}
	
	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state) 
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, ((EnumLeafHandler.EnumType)state.getValue(VARIANT)).getMeta());
	}
	
	@Override
	public int damageDropped(IBlockState state) 
	{
		return ((EnumLeafHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public String getSpecialName(ItemStack stack) 
	{
		return EnumLeafHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {return;}
	
	@Override
	protected int getSaplingDropChance(IBlockState state) {return 30;}
	
	@Override
	public EnumType getWoodType(int meta) {return null;}
	
	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) 
	{
		return NonNullList.withSize(1, new ItemStack(this, 1, world.getBlockState(pos).getValue(VARIANT).getMeta()));
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT,DECAYABLE,CHECK_DECAY});
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	  @SideOnly(Side.CLIENT)
	    public BlockRenderLayer getBlockLayer() {
	        return Minecraft.getMinecraft().gameSettings.fancyGraphics ? BlockRenderLayer.CUTOUT_MIPPED : BlockRenderLayer.SOLID;
	}
	 @SideOnly(Side.CLIENT)
	    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
	        if (!Minecraft.getMinecraft().gameSettings.fancyGraphics) {
	            if (!(blockAccess.getBlockState(pos.offset(side)).getBlock() instanceof BlockLeaves)) {
	                return true;
	            }
	            return false;
	        }
	        return true;
	}
	
	@Override
	public void registerModels() 
	{
		for(int i = 0; i < EnumLeafHandler.EnumType.values().length; i++)
		{
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "leaves_" + EnumLeafHandler.EnumType.values()[i].getName(), "inventory");
		}
	}
}