package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemPlum extends ItemFood{

	public ItemPlum() {
		super(3, 2, false);
		this.setUnlocalizedName("plum");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn,EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(3 , 180 * 20, 3));
		super.onFoodEaten(stack, worldIn, player);
	}

}
