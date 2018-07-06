package net.kipster.terra.objects.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import net.kipster.terra.Main;
import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.kipster.terra.objects.blocks.item.ItemBlockVariants;
import net.kipster.terra.util.interfaces.IHasModel;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLeavesRedSpruce extends BlockLeaves implements IHasModel
{
	public BlockLeavesRedSpruce(String name, Material material) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
        setDefaultState(blockState.getBaseState().withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));  
        setCreativeTab(Main.TERRATAB);
		
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance)
    {
        if (worldIn.rand.nextInt(chance) == 0)
        {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.STICK));
        }
    }
    

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(BlockInit.REDSPRUCESAPLING);
    }


    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        items.add(new ItemStack(this));
    }

    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state)
    {
        return new ItemStack(Item.getItemFromBlock(this));
    }


    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(DECAYABLE, Boolean.valueOf((meta & 4) == 0)).withProperty(CHECK_DECAY, Boolean.valueOf((meta & 8) > 0));
    }


    @Override
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;

        if (!state.getValue(DECAYABLE).booleanValue())
        {
            i |= 4;
        }

        if (state.getValue(CHECK_DECAY).booleanValue())
        {
            i |= 8;
        }

        return i;
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {CHECK_DECAY, DECAYABLE});
    }

   
    @Override
    public int damageDropped(IBlockState state)
    {
        return 0;
    }

    
    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack)
    {
        if (!worldIn.isRemote && stack.getItem() == Items.SHEARS)
        {
            player.addStat(StatList.getBlockStats(this));
        }
        else
        {
            super.harvestBlock(worldIn, player, pos, state, te, stack);
        }
    }

    @Override
    public NonNullList<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        return NonNullList.withSize(1, new ItemStack(this));
    }
    @Override
    public EnumType getWoodType(int meta)
    {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
 	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
    	return Blocks.LEAVES.getBlockLayer();
	}
	
	@Override
 	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		setGraphicsLevel(!Blocks.LEAVES.isOpaqueCube(blockState));
 		return super.shouldSideBeRendered(blockState, blockAccess, pos, side); 
 	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}