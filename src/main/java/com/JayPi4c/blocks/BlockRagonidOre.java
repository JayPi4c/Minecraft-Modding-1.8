package com.JayPi4c.blocks;


import java.util.Random;

import com.JayPi4c.AppleDimension;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockRagonidOre extends Block{
	
	



	public BlockRagonidOre() {
		super(Material.rock);
		this.setUnlocalizedName("ragonid_ore");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);
        this.setHardness(5.0F);
        this.setHarvestLevel("pickaxe", 2);

	}
	
	public int quantityDropped(Random random){
		return 2;
		
	}
	
	public Item getItemDropped(IBlockState state, Random rand,int fortune){
		return AppleDimension.adiomantium_dust;
		
	}
	

	




}
