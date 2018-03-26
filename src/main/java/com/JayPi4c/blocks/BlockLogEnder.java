package com.JayPi4c.blocks;

import com.JayPi4c.AppleDimension;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLogEnder extends Block{

	public BlockLogEnder() {
		super(Material.wood);
		this.setUnlocalizedName("log_ender");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);

        this.setHardness(5.0F);
        this.setHarvestLevel("axe", 2);


		
	}
	
	
	

}
