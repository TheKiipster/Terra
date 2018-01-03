package net.kipster.terra.world.gen.generators;


import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IPlantable;

public abstract class WorldGenTreeBase extends WorldGenAbstractTree
{
	protected Block wood;
	protected Block leaves;
	protected int leafMeta;
	protected int woodMeta;
	
    protected int minHeight;
    protected int maxHeight;
    
    protected boolean notifyFlag;
    
    protected World world;
    protected Random random;

    public WorldGenTreeBase(Block leafBlock, Block woodBlock, int leafBlockMeta, int woodBlockMeta, int minH, int maxH, boolean notify)
    {
    	super(notify);
        leaves = leafBlock;
        wood = woodBlock;
        woodMeta = woodBlockMeta;
        leafMeta = leafBlockMeta;
        minHeight = minH;
        maxHeight = maxH;
        notifyFlag = notify;
    }

    public abstract boolean generate(World wor, Random rand, BlockPos pos);

    public boolean isLegalTreePosition(BlockPos pos, boolean snow, boolean sand){
    	
    	if(world.getBlockState(pos).getBlock().equals(Blocks.WATER))return false;
    	
    	pos = pos.down();
    	
  
    	
    	BlockPos down = pos.down();
    	IBlockState state = world.getBlockState(down);
    	return (world.getBlockState(pos).getBlock().canSustainPlant(state, world, pos, EnumFacing.UP, (IPlantable)Blocks.SAPLING) ||
    			(world.getBlockState(pos).getBlock().equals(Blocks.SAND) && sand) ||
    			(world.getBlockState(pos).getBlock().equals(Blocks.SNOW) && snow)
    			);
    }
    
    

    protected void generateLeafLayerCircle(double radius, int xo, int zo, int h){
    	for(int x = (int)Math.ceil(xo - radius); x <= (int)Math.ceil(xo + radius); x++){
			for(int z = (int)Math.ceil(zo - radius); z <= (int)Math.ceil(zo + radius); z++){
				double xfr = z - zo;
				double zfr = x- xo;
				
				if(xfr * xfr + zfr * zfr <= radius * radius){
					setBlockLeaf(new BlockPos(x, h, z));
				}
			}
		}
    }
    
   
    protected void generateLeafLayerCircleNoise(double radius, int xo, int zo, int h){
    	for(int x = (int)Math.ceil(xo - radius); x <= (int)Math.ceil(xo + radius); x++){
			for(int z = (int)Math.ceil(zo - radius); z <= (int)Math.ceil(zo + radius); z++){
				double xfr = z - zo;
				double zfr = x- xo;
				
				if(xfr * xfr + zfr * zfr <= radius * radius){
					if(xfr * xfr + zfr * zfr <= (radius - 1) * (radius - 1) || random.nextInt(2) == 0){
						setBlockLeaf(new BlockPos(x, h, z));
					}
				}
			}
		}
    }
    
    
    protected void generateWoodLayerCircle(double radius, int xo, int zo, int h){
    	for(int x = (int)Math.ceil(xo - radius); x <= (int)Math.ceil(xo + radius); x++){
			for(int z = (int)Math.ceil(zo - radius); z <= (int)Math.ceil(zo + radius); z++){
				double xfr = z - zo;
				double zfr = x- xo;
				
				if(xfr * xfr + zfr * zfr <= radius * radius){
					setBlockLog(new BlockPos(x, h, z), 0);
				}
			}
		}
    }
    
   
    protected BlockPos generateStraightBranch(int length, int locX, int locY, int locZ, int dir){
    	int direction = -1;
    	if(dir < 2)
    		 direction = 1;
    	if(dir % 2 == 0){
    		
    		for(int i = 1; i <= length; i++){
	    		setBlockLog(new BlockPos(locX + i*direction, locY+i, locZ), 4);
    		}
    		return new BlockPos(locX+length*direction, locY+length, locZ);
    	}
    	else{
    		for(int i = 1; i <= length; i++){
	    		setBlockLog(new BlockPos(locX, locY+i, locZ + i*direction), 8);
    		}
    		return new BlockPos(locX, locY+length, locZ+length*direction);
    	}
    }
    
  
    protected int[] generateStraightBranchDown(int length, int locX, int locY, int locZ, int dir){
    	int direction = -1;
    	if(dir < 2)
    		 direction = 1;
    	if(dir % 2 == 0){
    	
    		for(int i = 1; i <= length; i++){
    			setBlockLog(new BlockPos(locX + i*direction, locY+i, locZ), 4);
    		}
    		return new int[]{locX+length*direction, locY-length, locZ};
    	}
    	else{
    		for(int i = 1; i <= length; i++){
    			setBlockLog(new BlockPos(locX, locY+i, locZ + i*direction), 8);
    		}
    		return new int[]{locX, locY-length, locZ+length*direction};
    	}
    }

	protected void generateSequoiaBranch(double length, int xo, int zo, int h){
		for(int i = 0; i < length; i++){
			int j = i - 3;
			
			setBlockLog(new BlockPos(xo+i, h, zo), 4);
			if(length > 3 && j > 0 && i < length - 1){
				setBlockLog(new BlockPos(xo+i, h, zo+j), 8);
				setBlockLog(new BlockPos(xo+i, h, zo-j), 8);
			}
			
			setBlockLog(new BlockPos(xo, h, zo+i), 8);
			if(length > 3 && j > 0 && i < length - 1){
				setBlockLog(new BlockPos(xo+j, h, zo+i), 4);
				setBlockLog(new BlockPos(xo-j, h, zo+i), 4);
			}
			
			setBlockLog(new BlockPos(xo-i, h, zo), 4);
			if(length > 3 && j > 0 && i < length - 1){
				setBlockLog(new BlockPos(xo-i, h, zo+j), 8);
				setBlockLog(new BlockPos(xo-i, h, zo-j), 8);
			}
			
			setBlockLog(new BlockPos(xo, h, zo-i), 8);
			if(length > 3 && j > 0 && i < length - 1){
				setBlockLog(new BlockPos(xo+j, h, zo-i), 4);
				setBlockLog(new BlockPos(xo-j, h, zo-i), 4);
			}
			

			if(i == length - 2){
				double lr = 3.5;
			
				generateLeafLayerCircleNoise(lr, xo+i, zo, h+1);
				generateLeafLayerCircleNoise(lr, xo-i, zo, h+1);
				generateLeafLayerCircleNoise(lr, xo, zo+i, h+1);
				generateLeafLayerCircleNoise(lr, xo, zo-i, h+1);
				lr--;
				generateLeafLayerCircleNoise(lr, xo+i, zo, h+2);
				generateLeafLayerCircleNoise(lr, xo-i, zo, h+2);
				generateLeafLayerCircleNoise(lr, xo, zo+i, h+2);
				generateLeafLayerCircleNoise(lr, xo, zo-i, h+2);
			}
		}
    	
    }
    
    
    protected void setBlockLeaf(BlockPos pos){
    	try{
			if(world.isAirBlock(pos) || world.getBlockState(pos).getBlock().equals(Blocks.TALLGRASS) || world.getBlockState(pos).equals(Blocks.SNOW_LAYER.getDefaultState())){
				world.setBlockState(pos, leaves.getStateFromMeta(leafMeta));//getDefaultState().withProperty(BlockHighlandsLeaves.CHECK_DECAY, true).withProperty(BlockHighlandsLeaves.DECAYABLE, true));
			}
    	}
    	catch(RuntimeException e){
    		System.out.println("Error: Tree block couldn't generate!");
    		
    	}
    }
    
  
    protected void setBlockLog(BlockPos pos, int direction){
    	try{
			if(world.getBlockState(pos).getBlock().isReplaceable(world, pos) ||
					world.isAirBlock(pos) ||
					world.getBlockState(pos).getBlock() instanceof BlockLeaves){
				world.setBlockState(pos, wood.getStateFromMeta(woodMeta+direction));
			}
    	}
    	catch(RuntimeException e){
    		System.out.println("Error: Tree block couldn't generate!");
    		
    	}
    }
    
    
    
    protected boolean isCubeClear (BlockPos pos, int radius, int height){
    	int x = pos.getX();
    	int y = pos.getY();
    	int z = pos.getZ();
    	for(int i = x-radius; i <= x+radius; i++){
    		for(int k = z-radius; k <= z+radius; k++){
    			for(int j = y; j <= y+height; j++){
    				BlockPos treePos = new BlockPos(i, j, k);
    				
    				
    				IBlockState treeState = world.getBlockState(treePos);
    				if(treeState.getBlock().isAir(treeState, world, treePos) || treeState.getBlock().isAir(treeState, world, treePos))
    					return false;
    			}
    		}
    	}
    	return true;
    }
    
    
    
}







