package com.JayPi4c.utils;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGeneratorOnid implements IWorldGenerator {
	
	private  Block block;
	
	public OreGeneratorOnid (Block block){
	this.block = block;	
		}
	
	

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		//welche Dimension : 0 = Overworld, 1 = Nether, 2 = End
	if (world.provider.getDimensionId() == 0){
		 chunkX *= 16;
		 chunkZ *= 16;
		 
      for(int i = 0; i < 15; i++ ){
	     int posX = chunkX + random.nextInt(16);
	     int posY = random.nextInt(64);
	     int posZ = chunkZ + random.nextInt(16); 
	
	 
	    //                                                                    Anzahl in einer Ader
	              WorldGenMinable wgm = new 	WorldGenMinable(block.getDefaultState(), 13)	;
	              wgm.generate(world, random, new BlockPos(posX, posY, posZ));
	
            }
				 
	    }	
	}

}
