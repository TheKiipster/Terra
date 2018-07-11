package net.kipster.terra.world.biomes;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;


import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.init.BlockInit;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeMeadow extends Biome
{	
	
	public BiomeMeadow() 
	{
		
		super(new BiomeProperties("Meadow").setBaseHeight(0.125F).setHeightVariation(0.08F).setTemperature(0.8F).setRainfall(0.3F));
		
		BiomeManager.addVillageBiome(BiomeInit.MEADOW , true);
		
	topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.extraTreeChance = 0.3F;
		 this.decorator.flowersPerChunk = 100;
	        this.decorator.grassPerChunk = 26;
	        
	        this.spawnableCreatureList.clear();
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityHorse.class, 5, 2, 6));
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityDonkey.class, 1, 1, 3));
	        this.flowers.clear();
            for (BlockFlower.EnumFlowerType type : BlockFlower.EnumFlowerType.values())
            {
                if (type.getBlockType() == BlockFlower.EnumFlowerColor.YELLOW) continue;
                if (type == BlockFlower.EnumFlowerType.BLUE_ORCHID) type = BlockFlower.EnumFlowerType.POPPY;
                addFlower(net.minecraft.init.Blocks.RED_FLOWER.getDefaultState().withProperty(net.minecraft.init.Blocks.RED_FLOWER.getTypeProperty(), type), 10);
            }
	}
	 public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos)
	    {
	            double d0 = MathHelper.clamp((1.0D + GRASS_COLOR_NOISE.getValue((double)pos.getX() / 48.0D, (double)pos.getZ() / 48.0D)) / 2.0D, 0.0D, 0.9999D);
	            BlockFlower.EnumFlowerType blockflower$enumflowertype = BlockFlower.EnumFlowerType.values()[(int)(d0 * (double)BlockFlower.EnumFlowerType.values().length)];
	            return blockflower$enumflowertype == BlockFlower.EnumFlowerType.BLUE_ORCHID ? BlockFlower.EnumFlowerType.POPPY : blockflower$enumflowertype;
	        }
	
	public WorldGenerator getRandomWorldGenForGrass(Random rand)
    {
        return rand.nextInt(4) == 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
    }
	public void addDoublePlants(World p_185378_1_, Random p_185378_2_, BlockPos p_185378_3_, int p_185378_4_)
    {
        for (int i = 0; i < p_185378_4_; ++i)
        {
            int j = p_185378_2_.nextInt(3);

            if (j == 0)
            {
                DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.SYRINGA);
            }
            else if (j == 1)
            {
                DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.ROSE);
            }
            else if (j == 2)
            {
                DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.PAEONIA);
            }

            for (int k = 0; k < 5; ++k)
            {
                int l = p_185378_2_.nextInt(16) + 8;
                int i1 = p_185378_2_.nextInt(16) + 8;
                int j1 = p_185378_2_.nextInt(p_185378_1_.getHeight(p_185378_3_.add(l, 0, i1)).getY() + 32);

                if (DOUBLE_PLANT_GENERATOR.generate(p_185378_1_, p_185378_2_, new BlockPos(p_185378_3_.getX() + l, j1, p_185378_3_.getZ() + i1)))
                {
                    break;
                }
            }
        }
    }

public void decorate(World worldIn, Random rand, BlockPos pos)
{
    DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.GRASS);

    if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
    for (int i = 0; i < 7; ++i)
    {
        int j = rand.nextInt(16) + 8;
        int k = rand.nextInt(16) + 8;
        int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
        DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
    }
    if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS))
    { // no tab for patch
    int i = rand.nextInt(5) - 3;
    {
        i += 2;
    }

    this.addDoublePlants(worldIn, rand, pos, i);
   
    super.decorate(worldIn, rand, pos);
    }
        }


	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0x61bf26 ;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0x61bf26 ;
	}
}