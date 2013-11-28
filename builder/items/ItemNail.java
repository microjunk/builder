package builder.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import builder.Builder;

public class ItemNail extends Item
{

	public ItemNail(int i)
	{
		
		super(i);
		this.maxStackSize = 64;
		this.setCreativeTab(Builder.tabBuilder);
		
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("builder:nail");
	}
	
}