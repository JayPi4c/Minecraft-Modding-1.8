package com.JayPi4c.blocks;

import com.JayPi4c.AppleDimension;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBigCraftingtable extends Block{

	public BlockBigCraftingtable() {
		super(Material.wood);
		this.setUnlocalizedName("Big_Craftingtable");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);

        this.setHardness(3.0F);
        //this.setHarvestLevel("axe", 0);


		
	}
	
	
	

}
