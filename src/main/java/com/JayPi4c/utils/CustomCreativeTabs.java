package com.JayPi4c.utils;

import com.JayPi4c.AppleDimension;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomCreativeTabs extends CreativeTabs {

	public CustomCreativeTabs() {
		super("appledimension");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(AppleDimension.appleblock);
	}

}
