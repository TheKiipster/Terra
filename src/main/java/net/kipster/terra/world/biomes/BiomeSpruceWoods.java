package net.kipster.terra.world.biomes;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import org.apache.commons.lang3.tuple.Pair;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.init.BlockInit;
import net.kipster.terra.world.gen.generators.WorldGenTerraShrub;
import net.kipster.terra.world.gen.generators.WorldGenTreeBlackSpruce;
import net.kipster.terra.world.gen.generators.WorldGenTreeBlueSpruce;
import net.kipster.terra.world.gen.generators.WorldGenTreeRedSpruce;
import net.kipster.terra.world.gen.generators.WorldGenTreeWhiteSpruce;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTaiga1;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeSpruceWoods extends Biome
{	
	private final WorldGenTaiga2 spruceGenerator = new WorldGenTaiga2(false);
    protected static final WorldGenTreeRedSpruce RED_SPRUCE = new WorldGenTreeRedSpruce(false);
    protected static final WorldGenTreeBlackSpruce BLACK_SPRUCE = new WorldGenTreeBlackSpruce(false);
    protected static final WorldGenTreeWhiteSpruce WHITE_SPRUCE = new WorldGenTreeWhiteSpruce(false);
    protected static final WorldGenTreeBlueSpruce BLUE_SPRUCE = new WorldGenTreeBlueSpruce(false);
	 
	public BiomeSpruceWoods() 
	{
		
		super(new BiomeProperties("Spruce Woods").setBaseHeight(0.2F).setHeightVariation(0.2F).setTemperature(0.5F).setRainfall(0.3F));
		
		BiomeManager.addVillageBiome(BiomeInit.SPRUCE_WOODS , true);
		
	topBlock = Blocks.GRASS.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 20;
		
		 this.decorator.flowersPerChunk = 3;
	        this.decorator.grassPerChunk = 4;
	        
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
	        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
	}

	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	{
		  if (rand.nextInt(3) > 0)
	        {
	    return (WorldGenAbstractTree)(rand.nextInt(8) > 0 ? this.spruceGenerator : super.getRandomTreeFeature(rand));
	        }
	    else if (rand.nextInt(3) != 0)
        {
            return (WorldGenAbstractTree)(rand.nextInt(6) == 0 ? RED_SPRUCE : RED_SPRUCE);
        }
	    else if (rand.nextInt(3) != 0)
        {
            return (WorldGenAbstractTree)(rand.nextInt(7) == 0 ? BLACK_SPRUCE : BLACK_SPRUCE);
        }
	    else if (rand.nextInt(3) != 0)
        {
            return (WorldGenAbstractTree)(rand.nextInt(8) == 0 ? WHITE_SPRUCE : WHITE_SPRUCE);
        }
	    else if (rand.nextInt(3) != 0)
        {
            return (WorldGenAbstractTree)(rand.nextInt(9) == 0 ? BLUE_SPRUCE : BLUE_SPRUCE);
        }
        else
        {
            return RED_SPRUCE;
        }
	        }
	
	public WorldGenerator getRandomWorldGenForGrass(Random rand)
    {
        return rand.nextInt(4) == 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
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

    super.decorate(worldIn, rand, pos);
        }
	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0x8BB254;
	}
	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0x8BB254;
	}
}