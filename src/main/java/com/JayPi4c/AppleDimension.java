package com.JayPi4c;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

import com.JayPi4c.biomes.AppleBiome;
import com.JayPi4c.blocks.BlockAdiomantiumBlock;
import com.JayPi4c.blocks.BlockAdiomantiumOre;
import com.JayPi4c.blocks.BlockAppleBlock;
import com.JayPi4c.blocks.BlockAppleDimensionPortal;
import com.JayPi4c.blocks.BlockLeavesApple;
import com.JayPi4c.blocks.BlockLeavesEnder;
import com.JayPi4c.blocks.BlockLeavesOrange;
import com.JayPi4c.blocks.BlockLeavesPlum;
import com.JayPi4c.blocks.BlockLogEnder;
import com.JayPi4c.blocks.BlockLogWood;
import com.JayPi4c.blocks.BlockPortalActivator;
import com.JayPi4c.blocks.BlockPresse;
import com.JayPi4c.blocks.BlockRagonidOre;
import com.JayPi4c.blocks.BlockVagonidOre;
import com.JayPi4c.blocks.BlockWoodBarrel;
import com.JayPi4c.blocks.BlockZagonidOre;
import com.JayPi4c.blocks.TileEntityWoodBarrel;
import com.JayPi4c.entity.EntityKrinto;
import com.JayPi4c.items.ItemAdiomantium;
import com.JayPi4c.items.ItemAdiomantiumArmor;
import com.JayPi4c.items.ItemAdiomantiumAxe;
import com.JayPi4c.items.ItemAdiomantiumBow;
import com.JayPi4c.items.ItemAdiomantiumCore;
import com.JayPi4c.items.ItemAdiomantiumHoe;
import com.JayPi4c.items.ItemAdiomantiumMulticore;
import com.JayPi4c.items.ItemAdiomantiumPickaxe;
import com.JayPi4c.items.ItemAdiomantiumPickaxeAxe;
import com.JayPi4c.items.ItemAdiomantiumShovel;
import com.JayPi4c.items.ItemAdiomantiumSword;
import com.JayPi4c.items.ItemAdiomantium_Ingot;
import com.JayPi4c.items.ItemAppleJuice;
import com.JayPi4c.items.ItemBluntClaw;
import com.JayPi4c.items.ItemCompressedAdiomantiumCore;
import com.JayPi4c.items.ItemCompressedAdiomantiumCoreFragment;
import com.JayPi4c.items.ItemCutClaw;
import com.JayPi4c.items.ItemGrindstone;
import com.JayPi4c.items.ItemLeatherHandle;
import com.JayPi4c.items.ItemMultitoolblade;
import com.JayPi4c.items.ItemOrange;
import com.JayPi4c.items.ItemPlum;
import com.JayPi4c.items.ItemPortalActivator;
import com.JayPi4c.items.ItemToolrod;
import com.JayPi4c.items.ItemVagonidDust;
import com.JayPi4c.items.ItemVagonidIngot;
import com.JayPi4c.items.ItemZagonidDust;
import com.JayPi4c.items.ItemZagonidIngot;
import com.JayPi4c.render.RenderKrinto;
import com.JayPi4c.utils.CustomCreativeTabs;
import com.JayPi4c.utils.EntityCreator;
import com.JayPi4c.utils.GuiHandler;
import com.JayPi4c.utils.OreGenerator;
import com.JayPi4c.utils.OreGeneratorOnid;
import com.JayPi4c.utils.Schematic;
import com.JayPi4c.utils.SchematicGenerator;
import com.JayPi4c.utils.SchematicTreeGenerator;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;


@Mod(modid = "appledimension")

public class AppleDimension {

	
	   public static final String MODID = "appledimension";
	   
	   public static final int GUI_WOOD_BARREL = 0;
	   
	   @Instance
	   public static AppleDimension instance;
	   
	   // Tool Material
	   public static ToolMaterial adiomantiumToolMaterial = EnumHelper.addToolMaterial("adiomantiumToolMaterial", 3, 350, 5, 6, 3);
		
	   // Armor Materials
	   public static ArmorMaterial adiomantiumarmormaterial = EnumHelper.addArmorMaterial("adiomantiumarmormaterial", "wurscht", 120, new int [] {2,6,5,2}, 5);
	   
	   //Creative-Tabs
	   public static CreativeTabs tabCustomCrativeTab = new CustomCreativeTabs();
	   
	   //Blocks
	   public static Block appleblock = new BlockAppleBlock();
	   public static Block adiomantium_ore = new BlockAdiomantiumOre();
	   public static Block leaves_apple = new BlockLeavesApple();
	   public static Block leaves_orange = new BlockLeavesOrange();
	   public static Block leaves_plum = new BlockLeavesPlum();
	   public static Block adiomantium_block = new BlockAdiomantiumBlock();
	   public static Block wood_barrel = new BlockWoodBarrel();
	   public static Block log_wood = new BlockLogWood();
	   public static Block log_ender = new BlockLogEnder();
	   public static Block leaves_ender = new BlockLeavesEnder();
	   public static Block ragonid_ore = new BlockRagonidOre();
	   public static Block vagonid_ore = new BlockVagonidOre();
	   public static Block zagonid_ore = new BlockZagonidOre();
	   public static Block portalactivatorblock = new BlockPortalActivator();
	   
	   public static Block presse = new BlockPresse(true);
	  
   
	   
	   //Items
	   public static Item adiomantium_dust = new ItemAdiomantium();
	   public static Item adiomantium_ingot = new ItemAdiomantium_Ingot();
	   public static ItemFood orange = new ItemOrange(); 
	   public static ItemArmor adiomantium_helmet = new ItemAdiomantiumArmor(adiomantiumarmormaterial, 0, 0);
	   public static ItemArmor adiomantium_chestplate = new ItemAdiomantiumArmor(adiomantiumarmormaterial, 0, 1);
	   public static ItemArmor adiomantium_leggings = new ItemAdiomantiumArmor(adiomantiumarmormaterial, 0, 2);
	   public static ItemArmor adiomantium_boots = new ItemAdiomantiumArmor(adiomantiumarmormaterial, 0, 3);
	   public static ItemFood plum = new ItemPlum();
	   public static Item grindstone = new ItemGrindstone();
	   public static Item blunt_claw = new ItemBluntClaw();
	   public static Item leather_handle = new ItemLeatherHandle();
	   public static ItemSword cut_claw = new ItemCutClaw();
	   public static ItemFood apple_juice = new ItemAppleJuice();
	   public static ItemPickaxe adiomantium_pickaxe = new ItemAdiomantiumPickaxe();
	   public static ItemAxe adiomantium_axe = new ItemAdiomantiumAxe();
	   public static ItemSpade adiomantium_shovel = new ItemAdiomantiumShovel();
	   public static ItemSword adiomantium_sword = new ItemAdiomantiumSword();
	   public static ItemHoe adiomantium_hoe = new ItemAdiomantiumHoe();
	   public static ItemBow adiomantium_bow = new ItemAdiomantiumBow();
	   public static Item adiomantium_pickaxe_axe = new ItemAdiomantiumPickaxeAxe(); 
	   public static Item adiomantium_core = new ItemAdiomantiumCore();
	   public static Item adiomantium_multitoolblade = new ItemMultitoolblade();
	   public static Item toolrod = new ItemToolrod();
	   public static Item adiomantium_multicore = new ItemAdiomantiumMulticore();
	   public static Item compressed_adiomantium_core_fragment = new ItemCompressedAdiomantiumCoreFragment();
	   public static Item compressed_adiomantium_core = new ItemCompressedAdiomantiumCore();
	   public static Item zagonid_dust = new ItemZagonidDust();
	   public static Item zagonid_ingot = new ItemZagonidIngot();
	   public static Item vagonid_dust = new ItemVagonidDust();
	   public static Item vagonid_ingot = new ItemVagonidIngot();
	   public static Item portalactivatoritem = new ItemPortalActivator();

	   
	   	   
	   
       //SCHEMATIC
	   public static final Schematic Castle_Schematic = new Schematic("castle.schematic");
	   public static final Schematic APPLETREE = new Schematic("appletree.schematic");
	   
	   
	   //Biome
	   public static int applebiomeid;
	   public static BiomeGenBase applebiome = new AppleBiome();
	   
	   //Dimension
	   public static Block appledimensionportal = new BlockAppleDimensionPortal();

	   
	   
	   
	   
	   @EventHandler
	   public void preInit(FMLPreInitializationEvent event){
		   
		   // Modbeschreibung
		   ModMetadata data = event.getModMetadata();
		   data.autogenerated = false;
		   data.name = EnumChatFormatting.RED + "Apple" + EnumChatFormatting.BLUE + "Dimension";
		   data.description = "A cool Mod which adds some new Blocks and Items and a new Dimension: " + EnumChatFormatting.RED + "" + EnumChatFormatting.BOLD + "Apple" + EnumChatFormatting.BLUE + "Dimension";
		   data.credits = EnumChatFormatting.AQUA + "" + EnumChatFormatting.BOLD + "PohlProductions4c" + ", Oliver4c";
		   data.logoFile = "assets/appledimension/textures/logos/logo.png";
		   data.authorList.add(EnumChatFormatting.BLUE + "" +  EnumChatFormatting.UNDERLINE + "JayPi4c");
		   data.url = "https://www.youtube.com/user/PohlProductions4c";
          

		   Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		   config.load();
		   
		   applebiomeid = config.getInt("applebiomeid", "Biome", 80, 60, 110, "Bla bla");

	   }
	   
	   @EventHandler
	   public void init(FMLInitializationEvent event){
		   
		   /*
            * Block-Registry
		    * Die Blöcke werden mit hilfe einer Methode nach dem post Init Teil Registriert und müssen hier nur kurz "erwehnt" werden
		    * Mit Hilfe von:
		    * registerBlocks(variable, "texturenname");
		    */
		   
		    registerBlocks(appleblock,"appleblock");  
		    registerBlocks(leaves_orange,"leaves_orange");
		    registerBlocks(adiomantium_ore,"adiomantium_ore");
		    registerBlocks(leaves_apple,"leaves_apple");
		    registerBlocks(leaves_plum, "leaves_plum");
		    registerBlocks(adiomantium_block, "adiomantium_block");
		    registerBlocks(wood_barrel, "wood_barrel");
		    registerBlocks(log_wood, "log_wood");
		    registerBlocks(log_ender, "log_ender");
		    registerBlocks(leaves_ender,"leaves_ender");
		    registerBlocks(ragonid_ore,"ragonid_ore");
		    registerBlocks(vagonid_ore,"vagonid_ore");
		    registerBlocks(zagonid_ore,"zagonid_ore");
		    registerBlocks(presse, "presse");
		    registerBlocks(appledimensionportal, "appledimensionportal");
		    registerBlocks(portalactivatorblock,"portalactivatorblock");
		    
		   /*Item-Registry
		    * 
		    * GameRegistry.registerItem(Variable,"Texturename");
		    * 
		    */
		    
	        registerItems(adiomantium_dust, "adiomantium_dust");
		    registerItems(adiomantium_ingot, "adiomantium_ingot");
		    registerItems(grindstone, "grindstone");
		    registerItems(blunt_claw, "blunt_claw");
		    registerItems(leather_handle, "leather_handle");
		    registerItems(adiomantium_core, "adiomantium_core");
		    registerItems(adiomantium_multitoolblade, "Multitoolblade");
		    registerItems(toolrod, "toolrod");
		    registerItems(adiomantium_multicore, "adiomantium_multicore");
		    registerItems(compressed_adiomantium_core_fragment, "compressed_adiomantium_core_fragment");
		    registerItems(compressed_adiomantium_core, "compressed_adiomantium_core");
		    registerItems(zagonid_dust, "zagonid_dust");
		    registerItems(zagonid_ingot, "zagonid_ingot");
		    registerItems(vagonid_dust, "vagonid_dust");
		    registerItems(vagonid_ingot, "vagonid_ingot");
		    registerItems(portalactivatoritem, "portalactivatoritem");

		    
	    
		    
		    /* FoodItem Registry*/
		   
		     registerFoodItems(orange, "orange");
		     registerFoodItems(plum, "plum");
		     registerFoodItems(apple_juice, "apple_juice");
		 
		 
		   /*  ArmorItem Registry */
		   
		    registerArmorItems(adiomantium_helmet, "adiomantium_helmet");
		    registerArmorItems(adiomantium_chestplate, "adiomantium_chestplate");
		    registerArmorItems(adiomantium_leggings, "adiomantium_leggings");
		    registerArmorItems(adiomantium_boots, "adiomantium_boots");
		    
		    
		    /*ToolItem Registry*/
		    registerToolItems(adiomantium_pickaxe_axe, "adiomantium_pickaxe_axe");
		    registerToolItems(adiomantium_pickaxe, "adiomantium_pickaxe");
		    registerToolItems(adiomantium_axe, "adiomantium_axe");
		    registerToolItems(adiomantium_shovel, "adiomantium_shovel");
		    registerToolItems(adiomantium_hoe, "adiomantium_hoe");
		    
		    
		    /*  SwordItem Registry*/
		    registerSwordItems(cut_claw, "cut_claw");
		    registerSwordItems(adiomantium_sword, "adiomantium_sword");
		    
		    
		    
		    /*Bow Registry*/
		    GameRegistry.registerItem(adiomantium_bow, "adiomantium_bow");
		    ModelBakery.addVariantName(adiomantium_bow, "AppleDimension:adiomantium_bow", "AppleDimension:adiomantium_bow_pulling_0", "AppleDimension:adiomantium_bow_pulling_1","AppleDimension:adiomantium_bow_pulling_2");
		    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(adiomantium_bow, 0, new ModelResourceLocation("AppleDimension:adiomantium_bow" , "inventory"));

		    /* World-Generator */
		     GameRegistry.registerWorldGenerator(new OreGenerator(adiomantium_ore), 0);
		     GameRegistry.registerWorldGenerator(new OreGeneratorOnid(vagonid_ore), 0);
		     GameRegistry.registerWorldGenerator(new OreGeneratorOnid(zagonid_ore), 0);
		     GameRegistry.registerWorldGenerator(new OreGeneratorOnid(ragonid_ore), 0);
		     
		     GameRegistry.registerWorldGenerator(new SchematicGenerator(Castle_Schematic), 0);
		     GameRegistry.registerWorldGenerator(new SchematicTreeGenerator(APPLETREE), 0);
		     
		     
		     NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		     GameRegistry.registerTileEntity(TileEntityWoodBarrel.class, "TileEntityWoodBarrel");
		     
		     //Biome Registry
		     registerBiomes(BiomeType.COOL, new BiomeEntry(applebiome, 1));
		     
		     //EntityCreator, Farben des Spawneggs sind mit http://www.colorpicker.com/   leicht zu berechnen                                                                                                                                                                                 
		     EntityCreator.createEntity(EntityKrinto.class, new RenderKrinto(), "Krinto", EnumCreatureType.MONSTER, 3, 0, 2, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.forest, BiomeGenBase.birchForest}, 0x000000, 0x000000, true);
		
		    
            /*
	         *  Crafting nach der Registry 
		     *  Variablen erstellung 
		     */
		       ItemStack stackapple_block = new ItemStack(AppleDimension.appleblock);
			   ItemStack stackadiomantium_dust = new ItemStack(AppleDimension.adiomantium_dust);
			   ItemStack stackadiomantium_ingot = new ItemStack(AppleDimension.adiomantium_ingot);
			   ItemStack stackadiomantium_boots = new ItemStack(AppleDimension.adiomantium_boots);
		       ItemStack stackadiomantium_leggings = new ItemStack(AppleDimension.adiomantium_leggings);
		       ItemStack stackadiomantium_chestplate = new ItemStack(AppleDimension.adiomantium_chestplate);
		       ItemStack stackadiomantium_helmet = new ItemStack(AppleDimension.adiomantium_helmet);
		       ItemStack stackleaves_apple = new ItemStack(AppleDimension.leaves_apple);
		       ItemStack stackleaves_orange = new ItemStack(AppleDimension.leaves_orange);
		       ItemStack stackorange = new ItemStack(AppleDimension.orange);
		       ItemStack stackplum = new ItemStack(AppleDimension.plum);
		       ItemStack stackleaves_plum = new ItemStack(AppleDimension.leaves_plum);
		       ItemStack stackgrindstone = new ItemStack(grindstone, 1, OreDictionary.WILDCARD_VALUE);
		       ItemStack stackadiomantium_block = new ItemStack(AppleDimension.adiomantium_block);
		       ItemStack stackblunt_claw = new ItemStack(AppleDimension.blunt_claw);
		       ItemStack stackleather_handle = new ItemStack(AppleDimension.leather_handle);
		       ItemStack stackcut_claw = new ItemStack(AppleDimension.cut_claw);
		       ItemStack stackwood_barrel = new ItemStack(AppleDimension.wood_barrel);
		       ItemStack stacklog_wood = new ItemStack(AppleDimension.log_wood);
		       ItemStack stacklog_ender = new ItemStack(AppleDimension.log_ender);
		       ItemStack stackapple_juice = new ItemStack(AppleDimension.apple_juice);
		       ItemStack stackadiomantium_sword = new ItemStack(AppleDimension.adiomantium_sword);
		       ItemStack stackadiomantium_shovel = new ItemStack(AppleDimension.adiomantium_shovel);
		       ItemStack stackadiomantium_hoe = new ItemStack(AppleDimension.adiomantium_hoe);
		       ItemStack stackadiomantium_pickaxe = new ItemStack(AppleDimension.adiomantium_pickaxe);
		       ItemStack stackadiomantium_axe = new ItemStack(AppleDimension.adiomantium_axe);
		       ItemStack stackadiomantium_bow = new ItemStack(AppleDimension.adiomantium_bow);
		       ItemStack stackadiomantium_pickaxe_axe = new ItemStack(AppleDimension.adiomantium_pickaxe_axe);
		       ItemStack stackadiomantium_core = new ItemStack(AppleDimension.adiomantium_core);
		       ItemStack stacktoolrod = new ItemStack(AppleDimension.toolrod);
		       ItemStack stackmultitoolblade = new ItemStack(AppleDimension.adiomantium_multitoolblade);
		       ItemStack stackadiomantium_multicore = new ItemStack(AppleDimension.adiomantium_multicore);
		       ItemStack stackcompressed_adiomantium_core_fragment = new ItemStack(AppleDimension.compressed_adiomantium_core_fragment);
		       ItemStack stackcompressed_adiomantium_core = new ItemStack(AppleDimension.compressed_adiomantium_core);
		       ItemStack stackragonid_ore = new ItemStack(AppleDimension.ragonid_ore);
		       ItemStack stackvagonid_ore = new ItemStack(AppleDimension.vagonid_ore);
		       ItemStack stackvagonid_dust = new ItemStack(AppleDimension.vagonid_dust);
		       ItemStack stackvagonid_ingot = new ItemStack(AppleDimension.vagonid_ingot);
		       ItemStack stackzagonid_ore = new ItemStack(AppleDimension.zagonid_ore);
		       ItemStack stackzagonid_dust = new ItemStack(AppleDimension.zagonid_dust);
		       ItemStack stackzagonid_ingot = new ItemStack(AppleDimension.zagonid_ingot);

		      
			   ItemStack stackdirt = new ItemStack(Blocks.dirt);
			   ItemStack stackapple = new ItemStack(Items.apple);		       
		       ItemStack stackstick = new ItemStack(Items.stick);
		       ItemStack stackbow = new ItemStack(Items.bow);
		       ItemStack stackironingot = new ItemStack(Items.iron_ingot);
		       ItemStack stackrottenflesh = new ItemStack(Items.rotten_flesh);
		       ItemStack stackleather = new ItemStack(Items.leather);
		       ItemStack stackcharcoal = new ItemStack(Items.coal, 1, 1);
		       
		    //Shapeless
	   GameRegistry.addShapelessRecipe(new ItemStack(Items.string,4), new ItemStack(Blocks.wool));    
	   GameRegistry.addShapelessRecipe(new ItemStack(Items.apple, 3),  stackleaves_apple);
	   GameRegistry.addShapelessRecipe(new ItemStack(AppleDimension.orange, 3), stackleaves_orange);
	   GameRegistry.addShapelessRecipe(new ItemStack(AppleDimension.plum, 3), stackleaves_plum );
	   GameRegistry.addShapelessRecipe(new ItemStack(AppleDimension.adiomantium_ingot, 9), stackadiomantium_block);
	   GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4), stacklog_wood);
	   GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_pearl, 2), stacklog_ender);
	   
	      //Crafting
	   GameRegistry.addRecipe(stackapple_block, "dad","ada","dad", 'd',stackdirt, 'a', stackapple);
	  // GameRegistry.addRecipe(stackapple, " x ", " y ", " x ", 'x', stackdirt, 'y', stackapple_block);
	   GameRegistry.addRecipe(stackadiomantium_dust,"   ", " XY", "   ", 'X', stackadiomantium_ingot, 'Y' , stackgrindstone );
	   GameRegistry.addRecipe(stackgrindstone, "#","#" ,'#', new ItemStack(Blocks.stone));
	   GameRegistry.addRecipe(stackadiomantium_block, "###","###","###", '#', stackadiomantium_ingot);
	   GameRegistry.addRecipe(stackblunt_claw, "#","#" ,'#', new ItemStack(Items.iron_ingot));
	   GameRegistry.addRecipe(stackleather_handle, "#", "#", '#' ,new ItemStack(Items.leather));
	   GameRegistry.addRecipe(stackcut_claw,"   ", " XY", "   ", 'X', stackblunt_claw, 'Y' , stackgrindstone );
	   GameRegistry.addRecipe(stackwood_barrel, "# #", "# #", "###", '#', new ItemStack(Blocks.planks));
	   GameRegistry.addRecipe(stackapple_juice, " # ", "* *", "***", '#', new ItemStack(Items.apple), '*', new ItemStack(Blocks.planks) );
	   GameRegistry.addRecipe(stackadiomantium_sword, "#", "#", "*", '#', stackadiomantium_ingot, '*', stackstick);
	   GameRegistry.addRecipe(stackadiomantium_pickaxe, "###", " * ", " * ", '#', stackadiomantium_ingot, '*', stackstick);
	   GameRegistry.addRecipe(stackadiomantium_axe, "## ", "#* ", " * ", '#', stackadiomantium_ingot, '*', stackstick);
	   GameRegistry.addRecipe(stackadiomantium_axe, " ##", " *#", " * ", '#', stackadiomantium_ingot, '*', stackstick);
	   GameRegistry.addRecipe(stackadiomantium_shovel, "#", "*", "*", '#', stackadiomantium_ingot, '*', stackstick);
	   GameRegistry.addRecipe(stackadiomantium_hoe, " ##", " * ", " * ", '#', stackadiomantium_ingot, '*', stackstick);
	   GameRegistry.addRecipe(stackadiomantium_hoe, "## ", " * ", " * ", '#', stackadiomantium_ingot, '*', stackstick);
	   GameRegistry.addRecipe(stackadiomantium_hoe, "## ", "*  ", "*  ", '#', stackadiomantium_ingot, '*', stackstick);
	   GameRegistry.addRecipe(stackadiomantium_hoe, " ##", "  *", "  *", '#', stackadiomantium_ingot, '*', stackstick);
	   GameRegistry.addRecipe(stackadiomantium_helmet, "###", "# #", '#', stackadiomantium_ingot);
	   GameRegistry.addRecipe(stackadiomantium_chestplate, "# #", "###", "###", '#', stackadiomantium_ingot);
	   GameRegistry.addRecipe(stackadiomantium_leggings, "###", "# #", "# #", '#', stackadiomantium_ingot);
	   GameRegistry.addRecipe(stackadiomantium_boots, "# #", "# #", '#', stackadiomantium_ingot);
	   GameRegistry.addRecipe(stackadiomantium_bow, "*#*", "#+#", "*#*", '*', stackadiomantium_dust, '#', stackadiomantium_ingot, '+', stackbow);
	   GameRegistry.addRecipe(stackadiomantium_core,"#*#","*+*","#*#", '#', stackadiomantium_dust, '*', stackadiomantium_ingot, '+', stackironingot);
	   GameRegistry.addRecipe(stacktoolrod, "#", "*", '#', stackstick, '*', stackleather_handle);
	   GameRegistry.addRecipe(stackmultitoolblade, "## ", "#*#", "#  ", '#', stackadiomantium_ingot, '*', stackadiomantium_core);
	   GameRegistry.addRecipe(stackadiomantium_pickaxe_axe, "#", "*", '#', stackmultitoolblade, '*', stacktoolrod);
	   GameRegistry.addRecipe(stackcompressed_adiomantium_core, "##", "##", '#', stackcompressed_adiomantium_core_fragment);
	   GameRegistry.addRecipe(stackadiomantium_multicore, "*#*","#+#","*#*", '*', stackcompressed_adiomantium_core_fragment, '#', stackcompressed_adiomantium_core, '+', stackadiomantium_core);
	   
	   GameRegistry.addRecipe(new ItemStack(Blocks.coal_block), "###","###","###", '#', stackcharcoal);
	   

	   
	   
	   //Smelting

	   GameRegistry.addSmelting(stackadiomantium_dust, stackadiomantium_ingot, 120);
	   GameRegistry.addSmelting(stackzagonid_dust, stackzagonid_ingot, 120);
	   GameRegistry.addSmelting(stackvagonid_dust, stackvagonid_ingot, 120);
	   GameRegistry.addSmelting(stackrottenflesh, stackleather, 50);
	   GameRegistry.addSmelting(stackadiomantium_core, stackcompressed_adiomantium_core_fragment, 220);
	   
	    }
	   
	   @EventHandler
	   public void postInit(FMLPostInitializationEvent event){
		   
		   
	   } 
	   
	   
	   
	   
	   
	   
	   
	   
	   //Methode zur Registrierung von Armor Items
	   public static void registerArmorItems(Item item, String ItemName){
		   GameRegistry.registerItem(item, ItemName);
		   Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("AppleDimension:" + ItemName, "inventory"));
		   }
	   
	   //Methode zur Registrierung von Blöcken 
	   public static void registerBlocks(Block Block, String BlockName){
		   GameRegistry.registerBlock(Block, BlockName);
		   Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(Block), 0, new ModelResourceLocation("AppleDimension:" + BlockName, "inventory"));
		  }
	   
	   //Methode zur Registrierung von Items
       public static void registerItems(Item item, String ItemName){
    	   GameRegistry.registerItem(item, ItemName);
    	   Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("AppleDimension:"+ ItemName, "inventory"));
    	   }
       
       //Methode zur Registrierung von Food Items
       public static void registerFoodItems(Item item, String ItemName){
    	   GameRegistry.registerItem(item, ItemName);
    	   Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("AppleDimension:"+ ItemName, "inventory"));
    	   }
       
       //Methode zur Registrierung von Tool Items
       public static void registerToolItems(Item item, String ItemName){
    	   GameRegistry.registerItem(item, ItemName);
    	   Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("AppleDimension:"+ ItemName, "inventory"));
    	   }
       
       //Methode zur Registrierung von Sword Items
       public static void registerSwordItems(Item item, String ItemName){
    	   GameRegistry.registerItem(item, ItemName);
    	   Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("AppleDimension:"+ ItemName, "inventory"));
         }
       
       // Methode zur Registrierung von Biomen
       public static void registerBiomes(BiomeType type,BiomeEntry entry){
    	   BiomeManager.addBiome(type, entry);
       }
       
   
}
