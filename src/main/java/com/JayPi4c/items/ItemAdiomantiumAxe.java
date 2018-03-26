package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemAdiomantiumAxe extends ItemAxe{

	public ItemAdiomantiumAxe() {
		super(AppleDimension.adiomantiumToolMaterial);
		this.setUnlocalizedName("adiomantium_axe");
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);
	}

}
