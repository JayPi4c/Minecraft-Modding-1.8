package com.JayPi4c.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiWoodBarrel extends GuiContainer {

	
	public static final ResourceLocation BACKGROUND = new ResourceLocation("appledimension:textures/gui/wood_barrel.png");
	
	public GuiWoodBarrel(Container container) {
		super(container);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		mc.renderEngine.bindTexture(BACKGROUND);
		int k = (this.width - this.xSize) / 2 ;
		int l = (this.height - this.ySize) / 2 ;
		drawTexturedModalRect(k, l, 0, 0, xSize, ySize );
	}

}
