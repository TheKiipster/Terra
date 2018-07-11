package net.kipster.terra.world.biomes;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.kipster.terra.init.BiomeInit;
import net.kipster.terra.init.BlockInit;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.WorldTypeEvent.BiomeSize;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class BiomeBlueMountains extends Biome 
{	
	protected static final IBlockState STAINED_HARDENED_CLAY = Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE);
	private final WorldGenerator silverfishSpawner = new WorldGenMinable(Blocks.MONSTER_EGG.getDefaultState().withProperty(BlockSilverfish.VARIANT, BlockSilverfish.EnumType.STONE), 9);
    private final WorldGenTaiga2 spruceGenerator = new WorldGenTaiga2(false);
	
	public BiomeBlueMountains() 
	{
		
		super(new BiomeProperties("Blue Mountains").setBaseHeight(3.8F).setHeightVariation(0.78F).setTemperature(-3F).setRainfall(1F).setSnowEnabled());
		
		BiomeManager.addVillageBiome(BiomeInit.BLUEMOUNTAIN , false);
		
		this.decorator.generateFalls = true;
		this.decorator.treesPerChunk = 2;
		this.decorator.flowersPerChunk = 1;
	    this.decorator.grassPerChunk = 2;
	    this.spawnableCreatureList.clear();
	    this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
		 this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityLlama.class, 5, 4, 6));
		 this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
		 Iterator<Biome.SpawnListEntry> iterator = this.spawnableMonsterList.iterator();

	        while (iterator.hasNext())
	        {
	            Biome.SpawnListEntry biome$spawnlistentry = iterator.next();

	            if (biome$spawnlistentry.entityClass == EntitySkeleton.class)
	            {
	                iterator.remove();
	            }
	        }

	        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySkeleton.class, 20, 4, 4));
	        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityStray.class, 80, 4, 4));
	}
	@Override
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
        if (noiseVal > 3.0D) {
            this.topBlock = Blocks.GRASS.getDefaultState();
            this.fillerBlock = STAINED_HARDENED_CLAY; }
        else {
        	 this.topBlock = Blocks.SNOW.getDefaultState();
             this.fillerBlock = STAINED_HARDENED_CLAY; 
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
}
	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	{
	    return (WorldGenAbstractTree)(rand.nextInt(3) > 0 ? this.spruceGenerator : super.getRandomTreeFeature(rand));
	}
	public WorldGenerator getRandomWorldGenForGrass(Random rand)
	{
	    return rand.nextInt(4) == 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
	}

	public void decorate(World worldIn, Random rand, BlockPos pos)
	{
	    super.decorate(worldIn, rand, pos);

	    DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.GRASS);

	    if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
	    for (int i = 0; i < 7; ++i)
	    {
	        int j = rand.nextInt(16) + 8;
	        int k = rand.nextInt(16) + 8;
	        int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
	        DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
	    }
	    
	    for (int j1 = 0; j1 < 7; ++j1)
	    {
	        int k1 = rand.nextInt(16);
	        int l1 = rand.nextInt(64);
	        int i2 = rand.nextInt(16);
	        if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, rand, silverfishSpawner, pos.add(j1, k1, l1), net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.SILVERFISH))
	        this.silverfishSpawner.generate(worldIn, rand, pos.add(k1, l1, i2));
	    }
	    net.minecraftforge.common.MinecraftForge.ORE_GEN_BUS.post(new net.minecraftforge.event.terraingen.OreGenEvent.Post(worldIn, rand, pos));
	}

	    
	@Override
	public int getModdedBiomeGrassColor(int original) {
	    return 0x56A578;
	}

	@Override
	public int getModdedBiomeFoliageColor(int original) {
	    return 0x56A578;
	}

	}