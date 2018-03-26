package com.JayPi4c.biomes;

import com.JayPi4c.AppleDimension;
import com.JayPi4c.entity.EntityKrinto;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.biome.BiomeGenBase;

public class AppleBiome extends BiomeGenBase{

	public AppleBiome() {
		super(25);
		setBiomeName("AppleBiome");
		fillerBlock = AppleDimension.adiomantium_block.getDefaultState();
		topBlock = AppleDimension.appleblock.getDefaultState();
		theBiomeDecorator.generateLakes  = true;
		setHeight(new Height(1, 3));
		spawnableCaveCreatureList.clear();
		//                                                               Wahrscheinlichkeit, min spawn , max spawn
		spawnableCaveCreatureList.add(new SpawnListEntry(EntityZombie.class, 15, 1, 2));
		spawnableCaveCreatureList.add(new SpawnListEntry(EntitySkeleton.class, 10, 1, 3));
		spawnableCaveCreatureList.add(new SpawnListEntry(EntityKrinto.class, 20, 2, 5));
		spawnableCaveCreatureList.add(new SpawnListEntry(EntityCreeper.class, 5, 1, 1));
		
		spawnableCreatureList.clear();
		spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 15, 5, 8));
		spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 15, 5, 8));
		spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 15, 5, 8));
		spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, 10, 4, 8));
		spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 15, 5, 8));
		spawnableCreatureList.add(new SpawnListEntry(EntityRabbit.class, 15, 5, 8));
		
		spawnableMonsterList.clear();
		spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class, 15, 1, 2));
		spawnableMonsterList.add(new SpawnListEntry(EntitySkeleton.class, 15, 1, 2));
		spawnableMonsterList.add(new SpawnListEntry(EntityKrinto.class, 20, 2, 5));
		spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 2, 1, 2));



		





		
	}

}
