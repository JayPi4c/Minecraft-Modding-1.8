package com.JayPi4c.render;

import com.JayPi4c.model.ModelKrinto;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderKrinto extends RenderLiving{

	public RenderKrinto() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelKrinto(), 0);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("appledimension", "textures/entity/Krinto.png");
	}

}
