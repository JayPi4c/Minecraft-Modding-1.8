package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemAdiomantiumShovel extends ItemSpade {

	public ItemAdiomantiumShovel() {
		super(AppleDimension.adiomantiumToolMaterial);
		this.setUnlocalizedName("adiomantium_shovel");
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);
	}

}
