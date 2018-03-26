package com.JayPi4c.items;

import com.JayPi4c.AppleDimension;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ItemAdiomantiumBow extends ItemBow{

	
	public ItemAdiomantiumBow() {
		super();
		this.setUnlocalizedName("adiomantium_bow");
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);
	}
	
	@Override
	public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining) {
     ModelResourceLocation mrl = new ModelResourceLocation("AppleDimension:adiomantium_bow", "inventory");
     
     if(player.getItemInUse() != null){
    	 if (useRemaining >= 18){
    		 mrl = new ModelResourceLocation("AppleDimension:adiomantium_bow_pulling_2" ,"inventory");
    		 }else if (useRemaining > 13){
    			 mrl = new ModelResourceLocation("AppleDimension:adiomantium_bow_pulling_1","inventory");
    		 }else if(useRemaining > 0){
    			 mrl = new ModelResourceLocation("AppleDimension:adiomantium_bow_pulling_0","inventory");
    		 }
    	 
     }
     return mrl;
	
	
	}
	
	
	
	
}
