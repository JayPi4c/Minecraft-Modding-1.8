package com.JayPi4c.blocks;

import com.JayPi4c.AppleDimension;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockWoodBarrel extends BlockContainer{

	public BlockWoodBarrel() {
		super(Material.wood);
		
		this.setUnlocalizedName("wood_barrel");
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(AppleDimension.tabCustomCrativeTab);
        this.setHardness(2.0F);
        //this.setHarvestLevel("pickaxe", 0);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote){
			TileEntity tileentity = worldIn.getTileEntity(pos);
			if(tileentity instanceof TileEntityWoodBarrel){
				playerIn.openGui(AppleDimension.instance, AppleDimension.GUI_WOOD_BARREL, worldIn, pos.getX(), pos.getY(), pos.getZ());
			}
		}
		return true;
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityWoodBarrel();
	}
	
	@Override
	public int getRenderType() {
		return 3;
	}
	
	
	//TileEntityDrop
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		TileEntity tileEntity = worldIn.getTileEntity(pos);	
		if(tileEntity instanceof TileEntityWoodBarrel){
			TileEntityWoodBarrel tewb = (TileEntityWoodBarrel) tileEntity;
			InventoryHelper.dropInventoryItems(worldIn, pos, tewb.inventory);
		}
		
		super.breakBlock(worldIn, pos, state);
	}

}
