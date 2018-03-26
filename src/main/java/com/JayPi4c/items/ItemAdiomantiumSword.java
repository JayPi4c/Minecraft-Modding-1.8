package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemAdiomantiumSword extends ItemSword{

	public ItemAdiomantiumSword() {
		super(AppleDimension.adiomantiumToolMaterial);
		this.setUnlocalizedName("adiomantium_sword");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);
		
		
	}

}
