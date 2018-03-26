package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemAppleJuice extends ItemFood{

	public ItemAppleJuice() {
		super(3, 2, false);
		this.setUnlocalizedName("apple_juice");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);
		
	}

}
