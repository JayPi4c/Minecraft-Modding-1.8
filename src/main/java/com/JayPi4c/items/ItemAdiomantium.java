package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAdiomantium extends Item {

	public ItemAdiomantium(){
		
		this.setUnlocalizedName("adiomantium_dust");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);

	}
	
	
}
