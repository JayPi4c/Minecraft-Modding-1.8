package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemAdiomantiumHoe extends ItemHoe{

	public ItemAdiomantiumHoe() {
		super(AppleDimension.adiomantiumToolMaterial);
		this.setUnlocalizedName("adiomantium_hoe");
		this.setCreativeTab(CreativeTabs.tabTools);		
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);
	}

}
