package builder.buildtable;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

public class BuildTableGui extends GuiContainer
{
	//private ResourceLocation builder = new ResourceLocation("textures/builder/textures/gui/betterone.png");
	public static String GuiTexturePrefix = "builder" + ":" + "textures/gui/";
	public static ResourceLocation builder = new ResourceLocation(GuiTexturePrefix + "bettertable.png");
	
    public BuildTableGui(InventoryPlayer inventoryplayer, World world, int i, int j, int k)
    {
        super(new BuildContainer(inventoryplayer, world, i, j, k));
    }

    public void onGuiClosed()
    {
        super.onGuiClosed();
    }

    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
    	this.fontRenderer.drawString(StatCollector.translateToLocal("\u00a76Builder"), 120, 5, 0x404040);
        this.fontRenderer.drawString(StatCollector.translateToLocal("\u00a76Table"), 124, 20, 0x404040);
        this.fontRenderer.drawString(StatCollector.translateToLocal("\u00a76Inventory"), 112, 80, 0x404040);
        //this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 - 14, 0x404040);
    }

    protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(builder);
        int l = (width - xSize) / 2;
        int i1 = (height - ySize) / 2;
        drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
    }
}