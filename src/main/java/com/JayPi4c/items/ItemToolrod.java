package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemToolrod extends Item {

	public ItemToolrod(){
		
		this.setUnlocalizedName("toolrod");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);

	}
	
	
}
