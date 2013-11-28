package builder.items;

import builder.Builder;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBuildBook extends Item
{
    public ItemBuildBook(int var1)
    {
        super(var1);
        this.setCreativeTab(Builder.tabBuilder);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
    	if(!var2.isRemote)
    	{
    		var3.openGui(Builder.instance, 1, var2, 0, 0, 0);
    		var3.addChatMessage("Build Book Opened");
        }
		return var1;
    }
    
    @Override
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("Builder:buildbook");
	}
}