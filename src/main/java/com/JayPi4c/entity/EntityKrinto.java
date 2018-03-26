package com.JayPi4c.entity;

import java.util.Random;

import com.JayPi4c.AppleDimension;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityKrinto extends EntityMob{

	public EntityKrinto(World worldIn) {
		super(worldIn);
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
       // this.tasks.addTask(2, this.field_175455_a);
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 0.5D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4);	
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50);
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4);
		}
	
	 protected Item getDropItem()
	    {
	        return AppleDimension.plum;
	    }
	 
	 protected void addRandomArmor()
	    {
	        switch (this.rand.nextInt(3))
	        {
	            case 0:
	                this.dropItem(Items.iron_ingot, 1);
	                break;
	            case 1:
	                this.dropItem(Items.carrot, 1);
	                break;
	            case 2:
	                this.dropItem(Items.potato, 1);
	        }
	    }
	 
	/* protected void func_180481_a(DifficultyInstance p_180481_1_)
	    {
	        super.func_180481_a(p_180481_1_);

	        if (this.rand.nextFloat() < (this.worldObj.getDifficulty() == EnumDifficulty.HARD ? 0.05F : 0.01F))
	        {
	            int i = this.rand.nextInt(3);

	            if (i == 0)
	            {
	                this.setCurrentItemOrArmor(0, new ItemStack(Items.iron_sword));
	            }
	            else
	            {
	                this.setCurrentItemOrArmor(0, new ItemStack(Items.iron_shovel));
	            }
	        }
	    }*/
	
	

}
