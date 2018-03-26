package com.JayPi4c.utils;

import java.io.InputStream;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class Schematic {
	
	private short width;
	private short height;
	private short length;
	private int size;
	private BlockObject[] blockObjects;
	
	public Schematic(String filename){
		try{
			InputStream is = Schematic.class.getResourceAsStream("/assets/appledimension/schematics/" + filename);
			NBTTagCompound nbtdata = CompressedStreamTools.readCompressed(is);
			
			is.close();
			
			width = nbtdata.getShort("Width");
			height = nbtdata.getShort("Heught");
			length = nbtdata.getShort("Length");
			size = width * height * length;
			blockObjects = new BlockObject[size]; 
			byte[] BlockIDs = nbtdata.getByteArray("Blocks");
			byte[] metadate = nbtdata.getByteArray("Data");
			
			
			int counter = 0;
			
			for(int i = 0; i < height; i++){
				for(int j = 0; j < length; j++){
					for(int k = 0; k < width; k++){
						BlockPos pos = new BlockPos(k, i, j);
						IBlockState state = Block.getBlockById(BlockIDs[counter]).getStateFromMeta(metadate[counter]);
						blockObjects[counter] = new BlockObject(pos, state);
						counter++;
					}
				}				
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void generate(World world,int x, int y, int z){
		for(BlockObject obj : blockObjects){
			world.setBlockState(obj.getPositionWithOffset(x, y, z), obj.getState());
		}
		
		
	}

}
