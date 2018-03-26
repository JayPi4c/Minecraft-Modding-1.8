package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGrindstone extends Item {

	public ItemGrindstone(){
		
		this.setUnlocalizedName("grindstone");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);
		//immmwer einmal mehr als geschrieben
		this.setMaxDamage(100);

	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
	itemStack.setItemDamage(itemStack.getItemDamage() + 1);
	return itemStack;
	}
	
	
}
