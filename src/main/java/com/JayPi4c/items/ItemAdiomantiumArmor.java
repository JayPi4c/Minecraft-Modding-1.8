package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemAdiomantiumArmor extends ItemArmor {

	public ItemAdiomantiumArmor(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		
		switch(armorType) {
		case 0: setUnlocalizedName("adiomantium_helmet"); break;
		case 1: setUnlocalizedName("adiomantium_chestplate"); break;
		case 2: setUnlocalizedName("adiomantium_leggings"); break;
		case 3: setUnlocalizedName("adiomantium_boots"); break;
		}
		
		setCreativeTab(AppleDimension.tabCustomCrativeTab);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(slot == 0 || slot == 1 || slot == 3) {
			return "appledimension:textures/models/armor/adiomantium_layer_1.png";
		} else if(slot == 2) {
			return "appledimension:textures/models/armor/adiomantium_layer_2.png";
		} else {
			return null;
		}
	}

}
