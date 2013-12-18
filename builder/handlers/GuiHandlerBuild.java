package builder.handlers;

import builder.Builder;
import builder.GuiSanta;
import builder.buildbook.BookContainer;
import builder.buildbook.BookGui;
import builder.buildtable.BuildContainer;
import builder.buildtable.BuildTableGui;
import builder.container.ContainerModMerchant;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandlerBuild implements IGuiHandler
{
	public static int gui = 0;
	public static int SANTA = gui++;

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		switch(id)
		{
		case 0: return id == 0 && world.getBlockId(x, y, z) == Builder.builder.blockID ? new BuildContainer(player.inventory, world, x, y, z) : null;
		case 1: return new BookContainer();
		}

		if(id == SANTA){
			return new ContainerModMerchant(player.inventory, (IMerchant)getEntityByID(x, world), world);
		}

		return null;
	}
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		switch(id)
		{
		case 0: return id == 0 && world.getBlockId(x, y, z) == Builder.builder.blockID ? new BuildTableGui(player.inventory, world, x, y, z) : null;
		case 1: return new BookGui();
		}

		if(id == SANTA){
			return new GuiSanta((ContainerModMerchant) getServerGuiElement(id, player, world, x, y, z));
		}
		return null;
	}

	public static Entity getEntityByID(int entityID, World world)
	{
		for(int i = 0; i < world.getLoadedEntityList().size(); i++)
		{
			if(((Entity)world.getLoadedEntityList().get(i)).entityId == entityID)
			{
				return ((Entity)world.getLoadedEntityList().get(i));
			}
		}
		return null;
	}
}