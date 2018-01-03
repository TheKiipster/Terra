package net.kipster.terra.world.gen.generators;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WorldGenTerraShrub extends WorldGenTreeBase
{

    public WorldGenTerraShrub(Block leafBlock, Block woodBlock, int leafBlockMeta, int woodBlockMeta, boolean notify)
    {
		super(leafBlock, woodBlock, leafBlockMeta, woodBlockMeta, 0, 0, notify);
	}

	public boolean generate(World wor, Random rand, BlockPos pos)
    {
    	world = wor;
    	random = rand;
    	
        if(!isLegalTreePosition(pos, false, false)){
        	return false;
        }
    	
    	setBlockLog(pos, 0);
    	
    	generateLeafLayerCircleNoise(2.4, pos.getX(), pos.getZ(), pos.getY());
    	generateLeafLayerCircleNoise(1.2, pos.getX(), pos.getZ(), pos.getY()+1);
    	
        return true;
    }
}