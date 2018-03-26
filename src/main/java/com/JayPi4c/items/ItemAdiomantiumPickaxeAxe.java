package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;


public class ItemAdiomantiumPickaxeAxe extends ItemTool{

	public ItemAdiomantiumPickaxeAxe() {
		super(0, AppleDimension.adiomantiumToolMaterial, Sets.newHashSet(Block.blockRegistry));
		setHarvestLevel("pickaxe", AppleDimension.adiomantiumToolMaterial.getHarvestLevel());
		this.setUnlocalizedName("adiomantium_pickaxe_axe");
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);
	}


}
