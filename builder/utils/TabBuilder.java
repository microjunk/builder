package builder.utils;

import builder.Builder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class TabBuilder extends CreativeTabs 
{
	public TabBuilder(int par1, String par2Str)
    {
            super(par1, par2Str);
    }
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
    	return Builder.netherEscape.blockID;
    }
    public String getTranslatedTabLabel()
    {
     return "Builder";
    }
}