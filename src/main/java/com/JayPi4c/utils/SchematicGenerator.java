package com.JayPi4c.utils;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class SchematicGenerator implements IWorldGenerator {
	
	private Schematic schematic;
	
	public SchematicGenerator(Schematic schematic){
		this.schematic = schematic;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		//if (random.nextInt(5) == 0){ //nur jeder 5. Chunk
			int x = chunkX * 16 + random.nextInt(16);
			int z = chunkZ * 16 + random.nextInt(16);
			int y = getWorldHeightAt(world, x, z);
			//if (world.getBiomeGenForCoords(new BlockPos(x, y, z)) == BiomeGenBase.desert){
			schematic.generate(world, x, y, z);
			//}
 
		//}
	}
	
	private static int getWorldHeightAt(World world, int x, int z){
		int height = 0;
		for(int i = 0; i < 255; i++){
			if (world.getBlockState(new BlockPos(x, i, z)).getBlock().isFullCube()){
				height = i;
				}
			}return height -4;
		}

}
