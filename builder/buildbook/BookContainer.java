package builder.buildbook;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class BookContainer extends Container
{
    public BookContainer()
    {
    }

    public boolean canInteractWith(EntityPlayer entityplayer)
    {
        return true;
    }
}