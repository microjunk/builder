package builder.handlers;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RandomMerchList 
{
	public RandomMerchList()
	{
		
	}
	public static ItemStack pickRecord(Random random)
	{
		int i = random.nextInt(3);
		if (i == 0)
		{
			return new ItemStack(Item.ingotGold);
		}
		if (i == 1)
		{
			return new ItemStack(Item.ingotIron);
		}
		if (i == 2)
		{
			return new ItemStack(Item.bread);
		}
		/*if (i == 3)
		{
			return new ItemStack(Item.bread, random.nextInt(3) + 1);
		}
		if (i == 4)
		{
			return new ItemStack(Item.gunpowder, random.nextInt(4) + 1);
		}
		if (i == 5)
		{
			return new ItemStack(Item.bread, random.nextInt(3) + 1);
		}
		if (i == 6)
		{
			return new ItemStack(Item.bucketEmpty);
		}
		if (i == 7 && random.nextInt(100) == 0)
		{
			return new ItemStack(Item.diamond);
		}
		if (i == 8 && random.nextInt(2) == 0)
		{
			return new ItemStack(Item.goldNugget, random.nextInt(4) + 1);
		}
		if (i == 9 && random.nextInt(10) == 0)
		{
			return new ItemStack(Item.itemsList[Block.blockGold.blockID + random.nextInt(2)]);
		}
		if (i == 10)
		{
			return new ItemStack(Item.bread, random.nextInt(3) + 1);
		}
		if (i == 11)
		{
			return new ItemStack(Item.bread, random.nextInt(3) + 1);
		}*/
		else
		{
			return null;
		}
	}
	
	public static ItemStack pickBooks(Random random)
    {
		int i = random.nextInt(22);
		if (i == 0)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.flame, 1));
    		
		if (i == 1)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.fireAspect, 1));
    		
		if (i == 2)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.aquaAffinity, 1));
    		
		if (i == 3)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.baneOfArthropods, 1));
    		
		if (i == 4)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.blastProtection, 1));
    		
		if (i == 5)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.efficiency, 1));
    		
		if (i == 6)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.power, 1));
    		
		if (i == 7)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.projectileProtection, 1));
    		
		if (i == 8)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.punch, 1));
    		
		if (i == 9)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.protection, 1));
    		
		if (i == 10)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.sharpness, 1));
    		
		if (i == 11)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.smite, 1));
    		
		if (i == 12)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.featherFalling, 1));
    		
		if (i == 13)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.fireProtection, 1));
    		
		if (i == 14)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.fortune, 1));
    		
		if (i == 15)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.infinity, 1));
    		
		if (i == 16)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.knockback, 1));
    		
		if (i == 17)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.looting, 1));
    		
		if (i == 18)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.respiration, 1));
    		
		if (i == 19)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.silkTouch, 1));
    		
		if (i == 20)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.thorns, 1));
    		
		if (i == 21)
			return Item.enchantedBook.getEnchantedItemStack(new EnchantmentData(Enchantment.unbreaking, 1));
    		
		else
			return null;
    }
	
	public static ItemStack dyePowder(Random random)
    {
		int i = random.nextInt(16);
		if (i == 0)
			return new ItemStack(Item.dyePowder, 8, 0);
    		
		if (i == 1)
			return new ItemStack(Item.dyePowder, 8, 1);
    		
		if (i == 2)
			return new ItemStack(Item.dyePowder, 8, 2);
    		
		if (i == 3)
			return new ItemStack(Item.dyePowder, 8, 3);
    		
		if (i == 4)
			return new ItemStack(Item.dyePowder, 8, 4);
    		
		if (i == 5)
			return new ItemStack(Item.dyePowder, 8, 5);
    		
		if (i == 6)
			return new ItemStack(Item.dyePowder, 8, 6);
    		
		if (i == 7)
			return new ItemStack(Item.dyePowder, 8, 7);
    		
		if (i == 8)
			return new ItemStack(Item.dyePowder, 8, 8);
    		
		if (i == 9)
			return new ItemStack(Item.dyePowder, 8, 9);
    		
		if (i == 10)
			return new ItemStack(Item.dyePowder, 8, 10);
    		
		if (i == 11)
			return new ItemStack(Item.dyePowder, 8, 11);
    		
		if (i == 12)
			return new ItemStack(Item.dyePowder, 8, 12);
    		
		if (i == 13)
			return new ItemStack(Item.dyePowder, 8, 13);
    		
		if (i == 14)
			return new ItemStack(Item.dyePowder, 8, 14);
    		
		if (i == 15)
			return new ItemStack(Item.dyePowder, 8, 15);
    		
		else
			return null;
    }
	
	public static ItemStack potionBottle(Random random)
    {
		int i = random.nextInt(8);
		if (i == 0)
			return new ItemStack(Item.potion, 1, 8193);
    		
		if (i == 1)
			return new ItemStack(Item.potion, 1, 8195);
    		
		if (i == 2)
			return new ItemStack(Item.potion, 1, 8196);
    		
		if (i == 3)
			return new ItemStack(Item.potion, 1, 8198);
    		
		if (i == 4)
			return new ItemStack(Item.potion, 1, 8206);
    		
		if (i == 5)
			return new ItemStack(Item.potion, 1, 8257);
    		
		if (i == 6)
			return new ItemStack(Item.potion, 1, 16392);
    		
		if (i == 7)
			return new ItemStack(Item.potion, 1, 16394);
    		
		else
			return null;
    }
}
