package net.kipster.terra.objects.blocks;

import java.util.Random;

import net.kipster.terra.Main;
import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.kipster.terra.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockMoss extends BlockFalling implements IHasModel
{
	
	public static final PropertyBool SNOWY = PropertyBool.create("snowy");
	public BlockMoss(String name, Material material) 
	{
		super(Material.GROUND);
		setUnlocalizedName(name);
		setSoundType(SoundType.GROUND);
		setRegistryName(name);
		setHardness(0.8F);
		setCreativeTab(Main.TERRATABMISC);
		setDefaultState(this.blockState.getBaseState().withProperty(SNOWY, Boolean.valueOf(false)));
        setTickRandomly(true);
		
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	    /**
	     * Get the actual Block state of this Block at the given position. This applies properties not visible in the
	     * metadata, such as fence connections.
	     */
	    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        Block block = worldIn.getBlockState(pos.up()).getBlock();
	        return state.withProperty(SNOWY, Boolean.valueOf(block == Blocks.SNOW || block == Blocks.SNOW_LAYER));
	    }

	    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	        if (!worldIn.isRemote)
	        {
	            if (!worldIn.isAreaLoaded(pos, 2)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
	            if (worldIn.getLightFromNeighbors(pos.up()) < 4 && worldIn.getBlockState(pos.up()).getLightOpacity(worldIn, pos.up()) > 2)
	            {
	                worldIn.setBlockState(pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
	            }
	            else
	            {
	                if (worldIn.getLightFromNeighbors(pos.up()) >= 9)
	                {
	                    for (int i = 0; i < 4; ++i)
	                    {
	                        BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);
	                        IBlockState iblockstate = worldIn.getBlockState(blockpos);
	                        IBlockState iblockstate1 = worldIn.getBlockState(blockpos.up());

	                        if (iblockstate.getBlock() == Blocks.DIRT && iblockstate.getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.DIRT && worldIn.getLightFromNeighbors(blockpos.up()) >= 4 && iblockstate1.getLightOpacity(worldIn, blockpos.up()) <= 2)
	                        {
	                            worldIn.setBlockState(blockpos, this.getDefaultState());
	                        }
	                    }
	                }
	            }
	        }
	    }

	    /**
	     * Called periodically clientside on blocks near the player to show effects (like furnace fire particles). Note that
	     * this method is unrelated to {@link randomTick} and {@link #needsRandomTick}, and will always be called regardless
	     * of whether the block can receive random update ticks
	     */
	    @SideOnly(Side.CLIENT)
	    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	    {
	        super.randomDisplayTick(stateIn, worldIn, pos, rand);

	        if (rand.nextInt(10) == 0)
	        {
	            worldIn.spawnParticle(EnumParticleTypes.TOWN_AURA, (double)((float)pos.getX() + rand.nextFloat()), (double)((float)pos.getY() + 1.1F), (double)((float)pos.getZ() + rand.nextFloat()), 0.0D, 0.0D, 0.0D);
	        }
	    }

	    /**
	     * Get the Item that this Block should drop when harvested.
	     */
	    public Item getItemDropped(IBlockState state, Random rand, int fortune)
	    {
	        return Blocks.DIRT.getItemDropped(Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT), rand, fortune);
	    }

	    /**
	     * Convert the BlockState into the correct metadata value
	     */
	    public int getMetaFromState(IBlockState state)
	    {
	        return 0;
	    }

	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {SNOWY});
	    }
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable)
	{
		return plantable.getPlantType(world, pos) == EnumPlantType.Plains  || plantable.getPlantType(world, pos) == EnumPlantType.Cave || plantable.getPlantType(world, pos) == EnumPlantType.Crop || plantable.getPlantType(world, pos) == EnumPlantType.Water;
}
	}