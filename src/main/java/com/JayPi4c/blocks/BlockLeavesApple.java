package com.JayPi4c.blocks;

import java.util.Random;

import com.JayPi4c.AppleDimension;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockLeavesApple extends Block{

	public BlockLeavesApple() {
		super(Material.leaves);
		this.setUnlocalizedName("leaves_apple");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);

        this.setHardness(0.3F);
        //this.setHarvestLevel("sheare", 1);
}
	
   /* // gibt eine Zufallszahl zwischen 1 und pMaximum zurück
    public int anzahl(int pMaximum) {
        return  (int) ((Math.random()*3)+1);
    }*/
    
	public int quantityDropped(Random random){
		return (int) ((Math.random()*3)+1);
		
	}
	
	public Item getItemDropped(IBlockState state, Random rand,int fortune){
		return Items.apple;
		
	}
	
	@Override
	public void onLanded(World worldIn, Entity entityIn) {
		if (entityIn instanceof EntityPlayer && !worldIn.isRemote){
			EntityPlayer player = (EntityPlayer) entityIn; 
			player.addPotionEffect(new PotionEffect(Potion.saturation.id,20,1));
			}
           }
	
	
	

}
