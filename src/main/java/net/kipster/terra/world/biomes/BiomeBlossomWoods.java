package net.kipster.terra.world.biomes;

import java.util.Random;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.world.gen.trees.WorldGenTreeCherryPurple;
import net.kipster.terra.world.gen.trees.WorldGenTreeCherryPurple2;
import net.kipster.terra.world.gen.trees.WorldGenTreeCherryWhite;
import net.kipster.terra.world.gen.trees.WorldGenTreeOvergrown;
import net.kipster.terra.world.gen.trees.WorldGenTreeOvergrown2;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeBlossomWoods extends Biome
{	
	 protected static final WorldGenLakes LAKE = new WorldGenLakes(Blocks.WATER);
	protected static final WorldGenAbstractTree TREE = new WorldGenTreeCherryWhite(false, false);
	protected static final WorldGenAbstractTree TREE2 = new WorldGenTreeCherryPurple(false);
	
	public BiomeBlossomWoods() 
	{
		
		super(new BiomeProperties("Blossom Woods").setBaseHeight(Biomes.FOREST.getBaseHeight()).setHeightVariation(Biomes.FOREST.getHeightVariation()).setRainfall(Biomes.FOREST.getRainfall()));
		
		BiomeManager.addVillageBiome(BiomeInit.BLOSSOM_WOODS , true);
		
	topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		 this.decorator.treesPerChunk = 7;
	        this.decorator.grassPerChunk = 6;
	        this.decorator.flowersPerChunk = 10;
	        
	        this.spawnableCreatureList.clear();
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySlime.class, 1, 1, 1));
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

	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		if (rand.nextInt(3) > 0)
        {
    return TREE;
        }
    else
    {
        return TREE2;
    }
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
	 if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, DecorateBiomeEvent.Decorate.EventType.LAKE_WATER)) {
         int boulderChance = rand.nextInt(12);
         if (boulderChance == 0) {
          int k6 = rand.nextInt(16) + 8;
          int l = rand.nextInt(16) + 8;
           BlockPos blockpos = worldIn.getHeight(pos.add(k6, 0, l));
           LAKE.generate(worldIn, rand, blockpos);
         }
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
}
super.decorate(worldIn, rand, pos);
    }
}
}