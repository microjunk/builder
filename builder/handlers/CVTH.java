package builder.handlers;

import java.util.Random;

import builder.Builder;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Tuple;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class CVTH implements IVillageTradeHandler
{
	//public static final int WILDCARD_VALUE = Short.MIN_VALUE;
	
	@Override
    public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
    {
		switch(villager.getProfession()) 
        {
            //trading two itemstacks for one itemstack in return
           	//recipeList.add(new MerchantRecipe(new ItemStack(Item.emerald, 6), new ItemStack(YourMod.youritem1, 2), new ItemStack(YourMod.youritem2, 2)));
            //standard trade
            //recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 1), new ItemStack(Item.redstone, 4)));
            //use metadata in either case
            //recipeList.add(new MerchantRecipe(new ItemStack(Item.dye, 4, 15), // dye of metadata 15 is bonemeal, so we need 4 bonemeals//new ItemStack(YourMod.youritem, 1, 6))); // to buy 1 mod item of metadata value 6
        
        		//Hallow Villagers
            case 6: //Hallow Librarian Jack
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.writableBook, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.paper, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.book, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.map, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.writtenBook, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.dyePowder)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.bookShelf)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), RandomMerchList.pickBooks(random)));
            	break;
            case 7: //Hallow Priest
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.book, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.compass, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.enderPearl, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.map, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bread, 3)));
            	break;
            case 8: //Hallow BlackSmith
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Builder.hammer, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 1), new ItemStack(Item.redstone, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.bucketEmpty, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 6)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 8)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.swordIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.swordGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 2), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.helmetChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.plateChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.bootsChain, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 3), new ItemStack(Item.legsChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.coal, 3), new ItemStack(Item.flintAndSteel, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotGold, 1), new ItemStack(Item.pickaxeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 2), new ItemStack(Item.ingotIron, 1), new ItemStack(Item.pickaxeIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 4), new ItemStack(Item.pickaxeStone, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.goldNugget, 5), new ItemStack(Item.pickaxeDiamond, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 11), new ItemStack(Item.minecartEmpty, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 4), new ItemStack(Item.minecartCrate, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 6), new ItemStack(Item.minecartHopper, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.redstone, 32), new ItemStack(Item.minecartPowered, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.tnt, 4), new ItemStack(Item.minecartTnt, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.saddle, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordIron, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorGold, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldenCarrot, 1), new ItemStack(Item.carrotOnAStick, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(5)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(1)));
            	break;
            case 9: //Hallow Farmer
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeIron, 1), new ItemStack(Item.seeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.melonSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.pumpkinSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.wood), new ItemStack(Item.hoeWood, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotGold, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeGold)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeIron)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.carrot, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.potato, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketMilk, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.pumpkin, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.melon, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 90)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 91)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 92)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 93)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 100)));
            	break;
            case 10: //Hallow Butcher
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.chickenRaw, 1), new ItemStack(Item.chickenCooked, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.beefRaw, 1), new ItemStack(Item.beefCooked, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.fishRaw, 1), new ItemStack(Item.fishCooked, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.porkRaw, 1), new ItemStack(Item.porkCooked, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.melon, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.cookie, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.cake, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.wheat, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.melon, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.cookie, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.cake, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.appleRed, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 12), new ItemStack(Item.appleGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.silk, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.bucketMilk, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.egg, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.sugar, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.pumpkinPie, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.bowlEmpty, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.bowlSoup, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.ice, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.axeStone, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.axeIron, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.axeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.monsterPlacer, 1, 90), new ItemStack(Item.porkRaw, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.monsterPlacer, 1, 92), new ItemStack(Item.beefRaw, 25)));
            	break;
            case 11: //Hallow Villager
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.wood, 9, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.redstone, 10)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.torchRedstoneActive, 10)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.thinGlass, 8)));
            	break;
            	
            	//Modern Villagers
            case 12: //Modern Priest
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.book, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.compass, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.enderPearl, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.map, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bread, 3)));
            	break;
            case 13: //Modern Gardener
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.plantYellow, 6)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.plantRed, 6)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.flowerPot, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), RandomMerchList.dyePowder(random)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.grass, 5)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeWood, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.mushroomBrown, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.mushroomRed, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.vine, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.cactus, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.tallGrass, 1, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.waterlily, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.web, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.leaves, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.thinGlass, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.reed, 1)));
            	break;
            case 14: //Modern BlackSmith
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Builder.hammer, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 1), new ItemStack(Item.redstone, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.bucketEmpty, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 6)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 8)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.swordIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.swordGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 2), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.helmetChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.plateChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.bootsChain, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 3), new ItemStack(Item.legsChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.coal, 3), new ItemStack(Item.flintAndSteel, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotGold, 1), new ItemStack(Item.pickaxeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 2), new ItemStack(Item.ingotIron, 1), new ItemStack(Item.pickaxeIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 4), new ItemStack(Item.pickaxeStone, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.goldNugget, 5), new ItemStack(Item.pickaxeDiamond, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 11), new ItemStack(Item.minecartEmpty, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 4), new ItemStack(Item.minecartCrate, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 6), new ItemStack(Item.minecartHopper, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.redstone, 32), new ItemStack(Item.minecartPowered, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.tnt, 4), new ItemStack(Item.minecartTnt, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.saddle, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordIron, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorGold, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldenCarrot, 1), new ItemStack(Item.carrotOnAStick, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordDiamond, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.shineySwords(3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordDiamond, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.shineySwords(5)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordDiamond, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.shineySwords(1)));
            	break;
            case 15: //Modern Farmer
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeIron, 1), new ItemStack(Item.seeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.melonSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.pumpkinSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.wood), new ItemStack(Item.hoeWood, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotGold, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeGold)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeIron)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.carrot, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.potato, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketMilk, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.pumpkin, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.melon, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 90)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 91)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 92)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 93)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 100)));
            	break; 
            case 16: //Modern Joe
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.coal, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 6), new ItemStack(Block.coalBlock, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Block.wood, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.stick, 13)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 16), new ItemStack(Item.bucketLava, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.sapling, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 12), new ItemStack(Item.blazeRod, 3)));
            	break;
            	
            	//Oriental Villagers
            case 17: //Oriental Priest
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.book, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.compass, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.enderPearl, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.map, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bread, 3)));
            	break;
            case 18: //Oriental BlackSmith
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Builder.hammer, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 1), new ItemStack(Item.redstone, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.bucketEmpty, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 6)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 8)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.swordIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.swordGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 2), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.helmetChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.plateChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.bootsChain, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 3), new ItemStack(Item.legsChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.coal, 3), new ItemStack(Item.flintAndSteel, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotGold, 1), new ItemStack(Item.pickaxeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 2), new ItemStack(Item.ingotIron, 1), new ItemStack(Item.pickaxeIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 4), new ItemStack(Item.pickaxeStone, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.goldNugget, 5), new ItemStack(Item.pickaxeDiamond, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 11), new ItemStack(Item.minecartEmpty, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 4), new ItemStack(Item.minecartCrate, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 6), new ItemStack(Item.minecartHopper, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.redstone, 32), new ItemStack(Item.minecartPowered, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.tnt, 4), new ItemStack(Item.minecartTnt, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.saddle, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordIron, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorGold, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldenCarrot, 1), new ItemStack(Item.carrotOnAStick, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(5)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(1)));
            	break;
            case 19: //Oriental Librarian
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.writableBook, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.paper, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.book, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.map, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.writtenBook, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.dyePowder)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.bookShelf)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), RandomMerchList.pickBooks(random)));
            	break;
            case 20: //Oriental Farmer
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeIron, 1), new ItemStack(Item.seeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.melonSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.pumpkinSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.wood), new ItemStack(Item.hoeWood, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotGold, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeGold)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeIron)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.carrot, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.potato, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketMilk, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.pumpkin, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.melon, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 90)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 91)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 92)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 93)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 100)));
            	break;
            case 21: //Oriental Villager
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.wood, 9, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.redstone, 10)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.torchRedstoneActive, 10)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.thinGlass, 8)));
            	break;
            	
            	//Medieval Villagers
            case 22: //Medieval Priest
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.book, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.compass, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.enderPearl, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.map, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bread, 3)));
            	break;
            case 23: //Medieval BlackSmith
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Builder.hammer, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 1), new ItemStack(Item.redstone, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.bucketEmpty, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 6)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 8)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.swordIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.swordGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 2), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.helmetChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.plateChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.bootsChain, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 3), new ItemStack(Item.legsChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.coal, 3), new ItemStack(Item.flintAndSteel, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotGold, 1), new ItemStack(Item.pickaxeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 2), new ItemStack(Item.ingotIron, 1), new ItemStack(Item.pickaxeIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 4), new ItemStack(Item.pickaxeStone, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.goldNugget, 5), new ItemStack(Item.pickaxeDiamond, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 11), new ItemStack(Item.minecartEmpty, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 4), new ItemStack(Item.minecartCrate, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 6), new ItemStack(Item.minecartHopper, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.redstone, 32), new ItemStack(Item.minecartPowered, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.tnt, 4), new ItemStack(Item.minecartTnt, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.saddle, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordIron, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorGold, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldenCarrot, 1), new ItemStack(Item.carrotOnAStick, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(5)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(1)));
            	break;
            case 24: //Medieval Butcher
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.chickenRaw, 1), new ItemStack(Item.chickenCooked, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.beefRaw, 1), new ItemStack(Item.beefCooked, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.fishRaw, 1), new ItemStack(Item.fishCooked, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.porkRaw, 1), new ItemStack(Item.porkCooked, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.melon, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.cookie, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.cake, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.wheat, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.melon, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.cookie, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.cake, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.appleRed, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 12), new ItemStack(Item.appleGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.silk, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.bucketMilk, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.egg, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.sugar, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.pumpkinPie, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.bowlEmpty, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.bowlSoup, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.ice, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.axeStone, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.axeIron, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.axeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.monsterPlacer, 1, 90), new ItemStack(Item.porkRaw, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.monsterPlacer, 1, 92), new ItemStack(Item.beefRaw, 25)));
            	break;
            case 25: //Medieval Farmer
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeIron, 1), new ItemStack(Item.seeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.melonSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.pumpkinSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.wood), new ItemStack(Item.hoeWood, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotGold, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeGold)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeIron)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.carrot, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.potato, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketMilk, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.pumpkin, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.melon, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 90)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 91)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 92)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 93)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 100)));
            	break; 
            case 26: //Medieval Keeper
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bed, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.itemFrame, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.cloth, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketMilk, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketWater, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.melon, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.recordChirp, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.jukebox, 1)));
            	break;
            case 27: //Medieval Chemist
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.glassBottle, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.fermentedSpiderEye, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.dyePowder, 1, 15)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.eyeOfEnder, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.magmaCream, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.blazePowder, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.expBottle, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.speckledMelon, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.appleGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.ghastTear, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.glowstone, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.goldenCarrot, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.poisonousPotato, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.cauldron, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.brewingStand, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), RandomMerchList.potionBottle(random)));
            	break;
            case 28: //Medieval Guard
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.arrow, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bow, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.swordGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bootsGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.axeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.leather, 1)));
            	break;
            	
            	//Indian Villagers
            case 29: //Chief
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bone, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.feather, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.silk, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.arrow, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bow, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.flint, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.cloth, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.leather, 1)));
            	break;
            case 30: //Villager
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bone, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.feather, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.silk, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.arrow, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bow, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.flint, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.cloth, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.leather, 1)));
            	break;
            	
            	//OldWest Villagers
            case 31: //OldWest Priest
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.book, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.compass, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.enderPearl, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.map, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bread, 3)));
            	break;
            case 32: //OldWest BlackSmith
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Builder.hammer, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 1), new ItemStack(Item.redstone, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.bucketEmpty, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 6)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 8)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.swordIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.swordGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 2), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.helmetChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.plateChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.bootsChain, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 3), new ItemStack(Item.legsChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.coal, 3), new ItemStack(Item.flintAndSteel, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotGold, 1), new ItemStack(Item.pickaxeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 2), new ItemStack(Item.ingotIron, 1), new ItemStack(Item.pickaxeIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 4), new ItemStack(Item.pickaxeStone, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.goldNugget, 5), new ItemStack(Item.pickaxeDiamond, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 11), new ItemStack(Item.minecartEmpty, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 4), new ItemStack(Item.minecartCrate, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 6), new ItemStack(Item.minecartHopper, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.redstone, 32), new ItemStack(Item.minecartPowered, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.tnt, 4), new ItemStack(Item.minecartTnt, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.saddle, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordIron, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorGold, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldenCarrot, 1), new ItemStack(Item.carrotOnAStick, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(5)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(1)));
            	break;
            case 33: //OldWest Banker
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 1), new ItemStack(Item.redstone, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.diamond, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 1), new ItemStack(Item.emerald, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.blockNetherQuartz, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 1), new ItemStack(Item.redstone, 4)));
            	break;
            case 34: //OldWest Clerk
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.flowerPot, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.bed, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.itemFrame, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.chickenRaw, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.beefRaw, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.porkRaw, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.fishRaw, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.cookie, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.leather, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.sugar, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.dyePowder, 32)));
            	break;
            case 35: //OldWest Sheriff
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.chickenRaw, 1), new ItemStack(Item.ingotIron, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.chickenRaw, 1), new ItemStack(Item.leash, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.chickenRaw, 1), new ItemStack(Item.nameTag, 1)));
            	break;
            case 36: //OldWest Villager
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.wood, 9, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.redstone, 10)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.torchRedstoneActive, 10)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.thinGlass, 8)));
            	break;
            	
            	//Russian Villagers
            case 37: //Russian Priest
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.book, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.compass, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.enderPearl, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.map, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bread, 3)));
            	break;
            case 38: //Russian BlackSmith
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Builder.hammer, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 1), new ItemStack(Item.redstone, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.bucketEmpty, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 6)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 8)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.swordIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.swordGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 2), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.helmetChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.plateChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.bootsChain, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 3), new ItemStack(Item.legsChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.coal, 3), new ItemStack(Item.flintAndSteel, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotGold, 1), new ItemStack(Item.pickaxeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 2), new ItemStack(Item.ingotIron, 1), new ItemStack(Item.pickaxeIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 4), new ItemStack(Item.pickaxeStone, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.goldNugget, 5), new ItemStack(Item.pickaxeDiamond, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 11), new ItemStack(Item.minecartEmpty, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 4), new ItemStack(Item.minecartCrate, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 6), new ItemStack(Item.minecartHopper, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.redstone, 32), new ItemStack(Item.minecartPowered, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.tnt, 4), new ItemStack(Item.minecartTnt, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.saddle, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordIron, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorGold, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldenCarrot, 1), new ItemStack(Item.carrotOnAStick, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(5)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(1)));
            	break;
            case 39: //Russian Soldier
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.arrow, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bow, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.swordGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bootsGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.axeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.leather, 1)));
            	break;
            case 40: //Russian Farmer
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeIron, 1), new ItemStack(Item.seeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.melonSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.pumpkinSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.wood), new ItemStack(Item.hoeWood, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotGold, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeGold)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeIron)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.carrot, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.potato, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketMilk, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.pumpkin, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.melon, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 90)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 91)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 92)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 93)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 100)));
            	break;
            case 41: //Russian Villager
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.wood, 9, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.redstone, 10)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.torchRedstoneActive, 10)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.thinGlass, 8)));
            	break;

            	//Roman Villagers
            case 42: //Roman Priest
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.book, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.compass, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.enderPearl, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.map, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bread, 3)));
            	break;
            case 43: //Roman Warrior
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.arrow, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bow, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.swordGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bootsGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.axeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.leather, 1)));
            	break;
            case 44: //Roman Farmer
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeIron, 1), new ItemStack(Item.seeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.melonSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.pumpkinSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.wood), new ItemStack(Item.hoeWood, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotGold, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeGold)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeIron)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.carrot, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.potato, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketMilk, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.pumpkin, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.melon, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 90)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 91)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 92)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 93)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 100)));
            	break;
            case 45: //Roman BlackSmith
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Builder.hammer, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 1), new ItemStack(Item.redstone, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.bucketEmpty, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 6)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 8)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.swordIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.swordGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 2), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.helmetChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.plateChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.bootsChain, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 3), new ItemStack(Item.legsChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.coal, 3), new ItemStack(Item.flintAndSteel, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotGold, 1), new ItemStack(Item.pickaxeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 2), new ItemStack(Item.ingotIron, 1), new ItemStack(Item.pickaxeIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 4), new ItemStack(Item.pickaxeStone, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.goldNugget, 5), new ItemStack(Item.pickaxeDiamond, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 11), new ItemStack(Item.minecartEmpty, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 4), new ItemStack(Item.minecartCrate, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 6), new ItemStack(Item.minecartHopper, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.redstone, 32), new ItemStack(Item.minecartPowered, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.tnt, 4), new ItemStack(Item.minecartTnt, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.saddle, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordIron, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorGold, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldenCarrot, 1), new ItemStack(Item.carrotOnAStick, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(5)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(1)));
            	break;
            case 46: //Roman Villager
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.wood, 9, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.redstone, 10)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.torchRedstoneActive, 10)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.thinGlass, 8)));
            	break;
            case 47: //Roman Librarian
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.writableBook, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.paper, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.book, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.map, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.writtenBook, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.dyePowder)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Block.bookShelf)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.flame, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.fireAspect, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.aquaAffinity, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.baneOfArthropods, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.blastProtection, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.efficiency, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.power, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.projectileProtection, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.punch, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.protection, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.sharpness, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.smite, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.featherFalling, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.fireProtection, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.fortune, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.infinity, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.knockback, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.looting, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.respiration, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.silkTouch, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.thorns, 1))));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.unbreaking, 1))));
            	break;
            	
            	//Viking Villagers
            case 48: //Viking Priest
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.book, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 2), new ItemStack(Item.compass, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.enderPearl, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.map, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bread, 3)));
            	break;
            case 49: //Viking Farmer
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeIron, 1), new ItemStack(Item.seeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.melonSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.pumpkinSeeds, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.wood), new ItemStack(Item.hoeWood, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotGold, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeGold)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 1), new ItemStack(Item.hoeIron)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Item.carrot, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.potato, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketMilk, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 1), new ItemStack(Item.bucketWater, 3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.pumpkin, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.hoeGold, 1), new ItemStack(Block.melon, 32)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 90)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 91)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 92)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 93)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 7), new ItemStack(Item.monsterPlacer, 1, 100)));
            	break;
            case 50: //Viking BlackSmith
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Builder.hammer, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 1), new ItemStack(Item.redstone, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.bucketEmpty, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 6)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 8)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.swordIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.swordGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 2), new ItemStack(Item.goldNugget, 2), new ItemStack(Item.helmetChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.plateChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 2), new ItemStack(Item.bootsChain, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 3), new ItemStack(Item.legsChain, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), new ItemStack(Item.coal, 3), new ItemStack(Item.flintAndSteel, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotGold, 1), new ItemStack(Item.pickaxeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 2), new ItemStack(Item.ingotIron, 1), new ItemStack(Item.pickaxeIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.oreRedstone, 4), new ItemStack(Item.pickaxeStone, 2)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.goldNugget, 5), new ItemStack(Item.pickaxeDiamond, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.ingotIron, 11), new ItemStack(Item.minecartEmpty, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 4), new ItemStack(Item.minecartCrate, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 6), new ItemStack(Item.minecartHopper, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.redstone, 32), new ItemStack(Item.minecartPowered, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Block.tnt, 4), new ItemStack(Item.minecartTnt, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldNugget, 4), new ItemStack(Item.saddle, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordIron, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorIron, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), new ItemStack(Item.horseArmorGold, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.goldenCarrot, 1), new ItemStack(Item.carrotOnAStick, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(3)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(5)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.swordGold, 1), new ItemStack(Item.diamond, 3), EnchantedItemStacks.goldenSwords(1)));
            	break;
            case 51: //Viking Butcher
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.chickenRaw, 1), new ItemStack(Item.chickenCooked, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.beefRaw, 1), new ItemStack(Item.beefCooked, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.fishRaw, 1), new ItemStack(Item.fishCooked, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.porkRaw, 1), new ItemStack(Item.porkCooked, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.melon, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.cookie, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.cake, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.wheat, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.melon, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.cookie, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.cake, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.appleRed, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 12), new ItemStack(Item.appleGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.silk, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.bucketMilk, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.egg, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.sugar, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.pumpkinPie, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.bowlEmpty, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.bowlSoup, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.ice, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.axeStone, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.axeIron, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.axeGold, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.monsterPlacer, 1, 90), new ItemStack(Item.porkRaw, 25)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.monsterPlacer, 1, 92), new ItemStack(Item.beefRaw, 25)));
            	break;
            case 52: //Viking Villager
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.wood, 9, 1)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Item.redstone, 10)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.torchRedstoneActive, 10)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.coalBlock, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.hay, 4)));
            	recipeList.add(new MerchantRecipe(new ItemStack(Item.diamond, 1), new ItemStack(Block.thinGlass, 8)));
            	break;
            default:
            	break;
        }
	}
}