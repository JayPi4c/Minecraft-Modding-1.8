package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemCutClaw extends ItemSword{

	public ItemCutClaw() {
		super(ToolMaterial.WOOD);
		//super(AppleDimension.adiomantiumToolMaterial);
		this.setUnlocalizedName("cut_claw");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);
	}

}
