package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemAdiomantiumPickaxe extends ItemPickaxe{

	public ItemAdiomantiumPickaxe() {
		super(AppleDimension.adiomantiumToolMaterial);
		this.setUnlocalizedName("adiomantium_pickaxe");
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);
	}

}
