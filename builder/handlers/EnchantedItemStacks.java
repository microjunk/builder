package builder.handlers;

import java.util.List;
import java.util.Random;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.MathHelper;
import net.minecraft.util.WeightedRandomChestContent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EnchantedItemStacks extends Item
{
	public static ItemStack goldenKnockback;
	public static ItemStack goldenSmite;
	public static ItemStack goldenSharpness;
	public static ItemStack goldenBane;
	public static ItemStack goldenFireAspect;
	public static ItemStack goldenLoot;
	public static ItemStack shineyKnockback;
	public static ItemStack shineySmite;
	public static ItemStack shineySharpness;
	public static ItemStack shineyBane;
	public static ItemStack shineyFireAspect;
	public static ItemStack shineyLoot;
	
    public EnchantedItemStacks(int par1)
    {
        super(par1);
    }
    
    public static ItemStack goldenSwords(int id)
	{
    	switch(id)
    	{}
    	//int id = random.nextInt(6);
    	//int lvl = random.nextInt(2);
		if (id == 0)
		{
			goldenKnockback = new ItemStack(Item.swordGold);
			goldenKnockback.addEnchantment(Enchantment.knockback, 1);
			return goldenKnockback;
		}
		if (id == 1)
		{
			goldenSmite = new ItemStack(Item.swordGold);
			goldenSmite.addEnchantment(Enchantment.smite, 1);
			return goldenSmite;
		}
		if (id == 2)
		{
			goldenSharpness = new ItemStack(Item.swordGold);
			goldenSharpness.addEnchantment(Enchantment.sharpness, 1);
			return goldenSharpness;
		}
		if (id == 3)
		{
			goldenBane = new ItemStack(Item.swordGold);
			goldenBane.addEnchantment(Enchantment.baneOfArthropods, 1);
			return goldenBane;
		}
		if (id == 4)
		{
			goldenFireAspect = new ItemStack(Item.swordGold);
			goldenFireAspect.addEnchantment(Enchantment.fireAspect, 1);
			return goldenFireAspect;
		}
		if (id == 5)
		{
			goldenLoot = new ItemStack(Item.swordGold);
			goldenLoot.addEnchantment(Enchantment.sharpness, 1);
			return goldenLoot;
		}
		return null;
	}
    
    public static ItemStack shineySwords(int id)
	{
    	switch(id)
    	{}
    	//int id = random.nextInt(6);
		if (id == 0)
		{
			shineyKnockback = new ItemStack(Item.swordDiamond);
			shineyKnockback.addEnchantment(Enchantment.knockback, 1);
			return shineyKnockback;
		}
		if (id == 1)
		{
			shineySmite = new ItemStack(Item.swordDiamond);
			shineySmite.addEnchantment(Enchantment.smite, 1);
			return shineySmite;
		}
		if (id == 2)
		{
			shineySharpness = new ItemStack(Item.swordDiamond);
			shineySharpness.addEnchantment(Enchantment.sharpness, 1);
			return shineySharpness;
		}
		if (id == 3)
		{
			shineyBane = new ItemStack(Item.swordDiamond);
			shineyBane.addEnchantment(Enchantment.baneOfArthropods, 1);
			return shineyBane;
		}
		if (id == 4)
		{
			shineyFireAspect = new ItemStack(Item.swordDiamond);
			shineyFireAspect.addEnchantment(Enchantment.fireAspect, 1);
			return shineyFireAspect;
		}
		if (id == 5)
		{
			shineyLoot = new ItemStack(Item.swordDiamond);
			shineyLoot.addEnchantment(Enchantment.sharpness, 1);
			return shineyLoot;
		}
		return null;
	}
}