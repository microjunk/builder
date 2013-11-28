package builder.handlers;

import builder.Builder;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class BuildCraftManager implements ICraftingHandler 
{
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) 
	{
		for (int i = 0; i < craftMatrix.getSizeInventory(); i++) // Checks all
																	// the slots
		{
			if (craftMatrix.getStackInSlot(i) != null) // If there is an item
			{
				ItemStack j = craftMatrix.getStackInSlot(i); // Gets the item
				if (j.getItem() != null && j.getItem() == Builder.hammer) 
				{
					ItemStack k = new ItemStack(Builder.hammer, 2, (j.getItemDamage() + 1)); 
					if (k.getItemDamage() >= k.getMaxDamage()) 
					{ 
						k.stackSize--; 
					}
					craftMatrix.setInventorySlotContents(i, k);
				}
				if (j.getItem() != null && j.getItem() == Builder.handSaw) 
				{
					ItemStack k = new ItemStack(Builder.handSaw, 2, (j.getItemDamage() + 1)); 
					if (k.getItemDamage() >= k.getMaxDamage()) 
					{ 
						k.stackSize--; 
					}
					craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
	}
}