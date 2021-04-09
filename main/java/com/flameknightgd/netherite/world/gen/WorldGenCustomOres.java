package com.flameknightgd.netherite.world.gen;

import java.util.Random;

import com.flameknightgd.netherite.init.ModBlocks;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	//Nether Ores
	private WorldGenerator ancient_debris1;
	private WorldGenerator ancient_debris2;
	
	public WorldGenCustomOres()
	{
		//Nether Ores
		ancient_debris1 = new WorldGenMinable(ModBlocks.ANCIENT_DEBRIS.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ancient_debris2 = new WorldGenMinable(ModBlocks.ANCIENT_DEBRIS.getDefaultState(), 2, BlockMatcher.forBlock(Blocks.NETHERRACK));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			//Nether Ores
			runGenerator(ancient_debris1, world, random, chunkX, chunkZ, 1, 8, 22);
			runGenerator(ancient_debris2, world, random, chunkX, chunkZ, 1, 8, 119);
			
			break;
			
		case 0:
			
			break;
			
		case 1:
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if((minHeight > maxHeight) || (minHeight < 0) || (maxHeight > 256))
		{
			throw new IllegalArgumentException("Ore generated out of bounds");
			
		}
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}