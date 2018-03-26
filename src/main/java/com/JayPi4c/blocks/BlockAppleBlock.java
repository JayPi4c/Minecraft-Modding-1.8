package com.JayPi4c.blocks;

import com.JayPi4c.AppleDimension;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAppleBlock extends Block{

	public BlockAppleBlock() {
		super(Material.grass);
		this.setStepSound(soundTypeGravel);
		this.setUnlocalizedName("appleblock");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);

        this.setHardness(0.5F);
       // this.setHarvestLevel("shovel", 1);


		
	}
	
	
	

}
