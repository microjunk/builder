package builder.handlers;

import builder.Builder;
import builder.buildbook.BookContainer;
import builder.buildbook.BookGui;
import builder.buildtable.BuildContainer;
import builder.buildtable.BuildTableGui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandlerBuild implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		switch(id)
		{
			case 0: return id == 0 && world.getBlockId(x, y, z) == Builder.builder.blockID ? new BuildContainer(player.inventory, world, x, y, z) : null;
			case 1: return new BookContainer();
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
		return null;
	}
}