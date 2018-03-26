package com.JayPi4c.utils;

import com.JayPi4c.AppleDimension;
import com.JayPi4c.blocks.TileEntityWoodBarrel;
import com.JayPi4c.gui.ContainerWoodBarrel;
import com.JayPi4c.gui.GuiWoodBarrel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID){
		case AppleDimension.GUI_WOOD_BARREL:return new ContainerWoodBarrel(player.inventory, (TileEntityWoodBarrel) world.getTileEntity(new BlockPos(x, y, z)));
			default: return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	switch(ID){
	case AppleDimension.GUI_WOOD_BARREL: return new GuiWoodBarrel(new ContainerWoodBarrel(player.inventory, (TileEntityWoodBarrel) world.getTileEntity(new BlockPos(x, y, z))));
	default: return null;
	}
	}

}
