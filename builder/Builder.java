package builder;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import builder.blocks.BlockHallowVillage;
import builder.blocks.BlockIndianVillage;
import builder.blocks.BlockJungleVillage;
import builder.blocks.BlockMedievalVillage;
import builder.blocks.BlockModernVillage;
import builder.blocks.BlockNPCVillage;
import builder.blocks.BlockNetherEscape;
import builder.blocks.BlockNetherVillage;
import builder.blocks.BlockOldWestVillage;
import builder.blocks.BlockOrientalVillage;
import builder.blocks.BlockRomanVillage;
import builder.blocks.BlockRussianVillage;
import builder.blocks.BlockSwampVillage;
import builder.blocks.BlockUniqueHomes;
import builder.blocks.BlockVikingVillage;
import builder.blocks.BlockXmasVillage;
import builder.buildtable.BlockBuildTable;
import builder.handlers.BuildCraftManager;
import builder.handlers.BuilderVillagers;
import builder.handlers.CVTH;
import builder.handlers.GuiHandlerBuild;
import builder.items.ItemBuildBook;
import builder.items.ItemHammer;
import builder.items.ItemHandSaw;
import builder.items.ItemNail;
import builder.utils.CommonProxy;
import builder.utils.TabBuilder;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;

@Mod(modid = "builder", name = "Builder", version = "0.6.5")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Builder 
{
	@Instance("builder")
	public static Builder instance;

	private GuiHandlerBuild guiHandlerBuild = new GuiHandlerBuild();
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;
	
	//Tabs
	public static CreativeTabs tabBuilder = new TabBuilder(CreativeTabs.getNextID(), "Builder");
	
	//Builder
	public static Block builder;
	public static Block netherEscape;
	public static Block normalVillage;
	public static Block uniqueHomes;
	public static Block orientalVillage;
	public static Block medievalVillage;
	public static Block vikingVillage;
	public static Block romanVillage;
	public static Block netherVillage;
	public static Block modernVillage;
	public static Block russianVillage;
	public static Block oldwestVillage;
	public static Block indianVillage;
	public static Block hallowVillage;
	public static Block xmasVillage;
	public static Block swampVillage;
	public static Block jungleVillage;
	//public static Block test;
	
	public static Item hammer;
	public static Item nail;
	public static Item handSaw;
	public static Item buildcipes;
	
	public static int builderID;
	public static int netherEscapeID;
	public static int normalVillageID;
	public static int uniqueHomesID;
	public static int orientalVillageID;
	public static int medievalVillageID;
	public static int vikingVillageID;
	public static int romanVillageID;
	public static int netherVillageID;
	public static int modernVillageID;
	public static int russianVillageID;
	public static int oldwestVillageID;
	public static int indianVillageID;
	public static int hallowVillageID;
	public static int xmasVillageID;
	public static int swampVillageID;
	public static int jungleVillageID;
	
	public static int hammerID;
	public static int nailID;
	public static int handSawID;
	public static int buildcipesID;
	
	@SidedProxy(clientSide = "builder.utils.ClientProxy", serverSide = "builder.utils.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void PreInit(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		builderID = config.getBlock("builder ID", 3500, (String)null).getInt();
		uniqueHomesID = config.getBlock("uniquehomes", 3501, (String)null).getInt();
		normalVillageID = config.getBlock("normalvillage", 3502, (String)null).getInt();
		netherEscapeID = config.getBlock("portal shortcut ID", 3503, (String)null).getInt();
		orientalVillageID = config.getBlock("oriental", 3504, (String)null).getInt();
		medievalVillageID = config.getBlock("medieval", 3505, (String)null).getInt();
		vikingVillageID = config.getBlock("viking", 3506, (String)null).getInt();
		romanVillageID = config.getBlock("roman", 3507, (String)null).getInt();
		netherVillageID = config.getBlock("nether", 3508, (String)null).getInt();
		modernVillageID = config.getBlock("modern", 3509, (String)null).getInt();
		russianVillageID = config.getBlock("russian", 3510, (String)null).getInt();
		oldwestVillageID = config.getBlock("oldwest", 3511, (String)null).getInt();
		indianVillageID = config.getBlock("indian", 3512, (String)null).getInt();
		hallowVillageID = config.getBlock("hallow", 3513, (String)null).getInt();
		xmasVillageID = config.getBlock("Christmas", 3514, (String)null).getInt();
		swampVillageID = config.getBlock("Swamp", 3515, (String)null).getInt();
		jungleVillageID = config.getBlock("Jungle", 3516, (String)null).getInt();
		
		hammerID = config.getItem("hammer ID", 10000, (String)null).getInt();
		nailID = config.getItem("nail ID", 10001, (String)null).getInt();
		handSawID = config.getItem("handsaw ID", 10002, (String)null).getInt();
		buildcipesID = config.getItem("BuildBook ID", 10003, (String)null).getInt();
		
		config.save();
		
		for (int i = 0; i < 70; ++i)
		{
			VillagerRegistry.instance().registerVillageTradeHandler(i, new CVTH());
		}
		
		BuilderVillagers.initVillagers();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) 
	{
		normalVillage = new BlockNPCVillage(normalVillageID).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("normalVillage");
		builder = new BlockBuildTable(builderID).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("builder");
		netherEscape = new BlockNetherEscape(netherEscapeID, 0).setStepSound(Block.soundStoneFootstep).setHardness(-1.0F).setLightValue(0.75F).setUnlocalizedName("PortalBlock");	
		uniqueHomes = new BlockUniqueHomes(uniqueHomesID).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setUnlocalizedName("uniqueHomes");
		orientalVillage = new BlockOrientalVillage(orientalVillageID).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setUnlocalizedName("japan");
		medievalVillage = new BlockMedievalVillage(medievalVillageID).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setResistance(1F).setUnlocalizedName("medieval");
		vikingVillage = new BlockVikingVillage(vikingVillageID).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setResistance(1F).setUnlocalizedName("vikingVillage");
		romanVillage = new BlockRomanVillage(romanVillageID).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setResistance(1F).setUnlocalizedName("roman");
		netherVillage = new BlockNetherVillage(netherVillageID).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(1F).setUnlocalizedName("netherVillage");
		modernVillage = new BlockModernVillage(modernVillageID).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setResistance(1F).setUnlocalizedName("modernVillage");
		russianVillage = new BlockRussianVillage(russianVillageID).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setResistance(1F).setUnlocalizedName("russianVillage");
		oldwestVillage = new BlockOldWestVillage(oldwestVillageID).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setResistance(1F).setUnlocalizedName("oldwestVillage");
		indianVillage = new BlockIndianVillage(indianVillageID).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setResistance(1F).setUnlocalizedName("indianVillage");
		hallowVillage = new BlockHallowVillage(hallowVillageID).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setResistance(1F).setUnlocalizedName("hallowVillage");
		xmasVillage = new BlockXmasVillage(xmasVillageID).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setResistance(1F).setUnlocalizedName("xmasVillage");
		swampVillage = new BlockSwampVillage(swampVillageID).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setResistance(1F).setUnlocalizedName("swampVillage");
		jungleVillage = new BlockJungleVillage(jungleVillageID).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setResistance(1F).setUnlocalizedName("jungleVillage");
		//test = new BlockTest(3550).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("test");
		
		hammer = new ItemHammer(hammerID).setUnlocalizedName("WorkHammer");
		nail = new ItemNail(nailID).setUnlocalizedName("nail");
		handSaw = new ItemHandSaw(handSawID).setUnlocalizedName("handsaw");
		buildcipes = new ItemBuildBook(buildcipesID).setUnlocalizedName("buildbook");
		
		//scp
		//GameRegistry.registerBlock(test, "test");
		//LanguageRegistry.addName(test, "test");
		
		GameRegistry.registerBlock(netherEscape, "netherEscape");
		LanguageRegistry.addName(netherEscape, "Nether Escape");
		
		GameRegistry.registerBlock(normalVillage, "normalVillage");
		LanguageRegistry.addName(normalVillage, "Normal Village");
		
		GameRegistry.registerBlock(builder, "builder");
		LanguageRegistry.addName(builder, "Builder");
		
		GameRegistry.registerBlock(uniqueHomes, "uniqueHomes");
		LanguageRegistry.addName(uniqueHomes, "Unique Homes");
		
		GameRegistry.registerBlock(orientalVillage, "orientalVillage");
		LanguageRegistry.addName(orientalVillage, "orientalVillage");
		
		GameRegistry.registerBlock(medievalVillage, "medieval");
		LanguageRegistry.addName(medievalVillage, "Medieval");
		
		GameRegistry.registerBlock(vikingVillage, "vikingVillage");
		LanguageRegistry.addName(vikingVillage, "Viking Village");
		
		GameRegistry.registerBlock(romanVillage, "roman");
		LanguageRegistry.addName(romanVillage, "Roman");
		
		GameRegistry.registerBlock(netherVillage, "netherVillage");
		LanguageRegistry.addName(netherVillage, "nether Village");
		
		GameRegistry.registerBlock(modernVillage, "modernVillage");
		LanguageRegistry.addName(modernVillage, "modern Village");
		
		GameRegistry.registerBlock(russianVillage, "russianVillage");
		LanguageRegistry.addName(russianVillage, "russian Village");
		
		GameRegistry.registerBlock(oldwestVillage, "oldwestVillage");
		LanguageRegistry.addName(oldwestVillage, "oldwest Village");
		
		GameRegistry.registerBlock(indianVillage, "indianVillage");
		LanguageRegistry.addName(indianVillage, "Indian Village");
		
		GameRegistry.registerBlock(hallowVillage, "hallowVillage");
		LanguageRegistry.addName(hallowVillage, "Hallow Village");
		
		GameRegistry.registerBlock(xmasVillage, "xmasVillage");
		LanguageRegistry.addName(xmasVillage, "Christmas Village");
		
		GameRegistry.registerBlock(swampVillage, "swampVillage");
		LanguageRegistry.addName(swampVillage, "Swamp Village");
		
		GameRegistry.registerBlock(jungleVillage, "jungleVillage");
		LanguageRegistry.addName(jungleVillage, "Jungle Village");
		
		LanguageRegistry.addName(hammer,"Hammer");
		LanguageRegistry.addName(nail,"Nail");
		LanguageRegistry.addName(handSaw,"Hand Saw");
		LanguageRegistry.addName(buildcipes,"Build Book");
		
		//Builder
		GameRegistry.addRecipe(new ItemStack(builder, 1), new Object[] {"HPS", "PCP", " PN", Character.valueOf('P'), Block.planks, Character.valueOf('C'), Block.workbench, Character.valueOf('H'), this.hammer, Character.valueOf('S'), this.handSaw, Character.valueOf('N'), this.nail});
		GameRegistry.addRecipe(new ItemStack(hammer, 1), new Object[] {" I ", " SI", "S  ", Character.valueOf('S'), Item.stick, Character.valueOf('I'), Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(handSaw, 1), new Object[] {"  I", " I ", "S  ", Character.valueOf('I'), Item.ingotIron, Character.valueOf('S'), Item.stick});
		GameRegistry.addRecipe(new ItemStack(nail, 16), new Object[] {"I", 'I', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(buildcipes, 1), new Object[] {"WPW", "PLP", "WPW", Character.valueOf('W'), Block.planks, Character.valueOf('P'), Item.paper, Character.valueOf('L'), Item.leather});
		
		GameRegistry.registerCraftingHandler(new BuildCraftManager());
		NetworkRegistry.instance().registerGuiHandler(this, guiHandlerBuild);
		
		proxy.registerRenderThings();
		
	}

	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}

}