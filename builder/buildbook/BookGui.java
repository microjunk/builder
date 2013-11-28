package builder.buildbook;

import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;

import builder.handlers.Resources;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class BookGui extends GuiScreen
{
	public final int xSizeOfTexture = 256;
	public final int ySizeOfTexture = 180;

	
	private int updateCounter2;

    /** Counts the number of screen updates. */
    private int updateCounter;
    
	/** Reference to the Minecraft object. */
    public Minecraft minecraft;
    public EntityPlayer entity;
    public int page;
    public int view;
    public int posX;
    public int posY;

    public BookGui()
    {
        this.entity = minecraft.getMinecraft().thePlayer;
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
        this.page = 0;
        this.updateCounter2 = 0;
        this.posX = this.width / 2;
        this.posY = this.height / 2;
        this.buttonList.clear();
        
        if (this.page == 0)
        {
            //this.buttonList.add(new GuiButton(0, this.posX - 100, this.posY - 85, 100, 20, "Mod Recipes"));
            //this.buttonList.add(new GuiButton(1, this.posX + 2, this.posY - 85, 100, 20, "Block Info"));
            //this.buttonList.add(new GuiButton(2, this.posX - 100, this.posY - 64, 100, 20, "Activators"));
            //this.buttonList.add(new GuiButton(3, this.posX +2, this.posY - 64, 100, 20, "Mod Info"));
            //this.buttonList.add(new GuiButton(50, this.posX - 100, this.posY + 62, 202, 20, "Back to game..."));
        }
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int var1, int var2, float var3)
    {
        this.drawDefaultBackground();

        if (this.page == 0)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.main_BOOK);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX - 115, this.posY - 65, 10, 10, " "));//Recipes
            this.buttonList.add(new GuiButton(2, this.posX - 115, this.posY - 45, 10, 10, " "));//Block Info
            this.buttonList.add(new GuiButton(3, this.posX - 115, this.posY - 25, 10, 10, " "));//Activators
            this.buttonList.add(new GuiButton(4, this.posX - 115, this.posY - 5, 10, 10, " "));//Mod Info
            this.buttonList.add(new GuiButton(5, this.posX - 115, this.posY + 15, 10, 10, " "));//Gallery
            this.buttonList.add(new GuiButton(0, this.posX + 85, this.posY + 65, 10, 10, " "));//Back To Game...
        }
        if (this.page == 1)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.main_RECIPE1);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(10, this.posX - 115, this.posY - 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(11, this.posX - 115, this.posY - 45, 10, 10, " "));
            this.buttonList.add(new GuiButton(12, this.posX - 115, this.posY - 25, 10, 10, " "));
            this.buttonList.add(new GuiButton(13, this.posX - 115, this.posY - 5, 10, 10, " "));
            this.buttonList.add(new GuiButton(14, this.posX - 115, this.posY + 15, 10, 10, " "));
            this.buttonList.add(new GuiButton(15, this.posX - 115, this.posY + 35, 10, 10, " "));
            this.buttonList.add(new GuiButton(16, this.posX - 115, this.posY + 55, 10, 10, " "));
            this.buttonList.add(new GuiButton(17, this.posX + 30, this.posY - 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(18, this.posX + 30, this.posY - 45, 10, 10, " "));
            this.buttonList.add(new GuiButton(19, this.posX + 30, this.posY -25, 10, 10, " "));
            this.buttonList.add(new GuiButton(20, this.posX + 30, this.posY - 5, 10, 10, " "));
            this.buttonList.add(new GuiButton(21, this.posX + 30, this.posY + 15, 10, 10, " "));
            this.buttonList.add(new GuiButton(22, this.posX + 30, this.posY + 35, 10, 10, " "));
            this.buttonList.add(new GuiButton(101, this.posX + 45, this.posY + 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(100, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 2)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.main_BLOCKINFO1);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(30, this.posX - 115, this.posY - 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(31, this.posX - 115, this.posY - 45, 10, 10, " "));
            this.buttonList.add(new GuiButton(32, this.posX - 115, this.posY - 25, 10, 10, " "));
            this.buttonList.add(new GuiButton(33, this.posX - 115, this.posY - 5, 10, 10, " "));
            this.buttonList.add(new GuiButton(34, this.posX - 115, this.posY + 15, 10, 10, " "));
            this.buttonList.add(new GuiButton(35, this.posX - 115, this.posY + 35, 10, 10, " "));
            this.buttonList.add(new GuiButton(36, this.posX - 115, this.posY + 55, 10, 10, " "));
            this.buttonList.add(new GuiButton(37, this.posX + 30, this.posY - 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(38, this.posX + 30, this.posY - 45, 10, 10, " "));
            this.buttonList.add(new GuiButton(39, this.posX + 30, this.posY -25, 10, 10, " "));
            this.buttonList.add(new GuiButton(40, this.posX + 30, this.posY - 5, 10, 10, " "));
            this.buttonList.add(new GuiButton(41, this.posX + 30, this.posY + 15, 10, 10, " "));
            this.buttonList.add(new GuiButton(42, this.posX + 30, this.posY + 35, 10, 10, " "));
            this.buttonList.add(new GuiButton(102, this.posX + 45, this.posY + 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(100, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 3)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.main_ACTIVATOR1);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(46, this.posX - 115, this.posY - 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(47, this.posX - 115, this.posY - 45, 10, 10, " "));
            this.buttonList.add(new GuiButton(48, this.posX - 115, this.posY - 25, 10, 10, " "));
            this.buttonList.add(new GuiButton(49, this.posX - 115, this.posY - 5, 10, 10, " "));
            this.buttonList.add(new GuiButton(50, this.posX - 115, this.posY + 15, 10, 10, " "));
            this.buttonList.add(new GuiButton(51, this.posX - 115, this.posY + 35, 10, 10, " "));
            this.buttonList.add(new GuiButton(52, this.posX - 115, this.posY + 55, 10, 10, " "));
            this.buttonList.add(new GuiButton(53, this.posX + 30, this.posY - 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(54, this.posX + 30, this.posY - 45, 10, 10, " "));
            this.buttonList.add(new GuiButton(55, this.posX + 30, this.posY -25, 10, 10, " "));
            this.buttonList.add(new GuiButton(56, this.posX + 30, this.posY - 5, 10, 10, " "));
            this.buttonList.add(new GuiButton(57, this.posX + 30, this.posY + 15, 10, 10, " "));
            this.buttonList.add(new GuiButton(58, this.posX + 30, this.posY + 35, 10, 10, " "));
            this.buttonList.add(new GuiButton(103, this.posX + 45, this.posY + 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(100, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 4)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.main_MODINFO1);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(104, this.posX + 45, this.posY + 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(100, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 5)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.main_MODINFO1);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(62, this.posX - 115, this.posY - 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(63, this.posX - 115, this.posY - 45, 10, 10, " "));
            this.buttonList.add(new GuiButton(64, this.posX - 115, this.posY - 25, 10, 10, " "));
            this.buttonList.add(new GuiButton(65, this.posX - 115, this.posY - 5, 10, 10, " "));
            this.buttonList.add(new GuiButton(66, this.posX - 115, this.posY + 15, 10, 10, " "));
            this.buttonList.add(new GuiButton(67, this.posX - 115, this.posY + 35, 10, 10, " "));
            this.buttonList.add(new GuiButton(68, this.posX - 115, this.posY + 55, 10, 10, " "));
            this.buttonList.add(new GuiButton(69, this.posX + 30, this.posY - 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(70, this.posX + 30, this.posY - 45, 10, 10, " "));
            this.buttonList.add(new GuiButton(71, this.posX + 30, this.posY -25, 10, 10, " "));
            this.buttonList.add(new GuiButton(72, this.posX + 30, this.posY - 5, 10, 10, " "));
            this.buttonList.add(new GuiButton(73, this.posX + 30, this.posY + 15, 10, 10, " "));
            this.buttonList.add(new GuiButton(74, this.posX + 30, this.posY + 35, 10, 10, " "));
            this.buttonList.add(new GuiButton(105, this.posX + 45, this.posY + 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(100, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 10)
        {
        	//Build Table
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_BUILDTABLE);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 11)
        {
        	//Hammer
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_HAMMER);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 12)
        {
        	//Saw
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_SAW);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 13)
        {
        	//Nail
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_NAIL);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 14)
        {
        	//NPC Village Recipe
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_NPC);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 15)
        {
        	//Oriental Village Recipe
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_ORIENTAL);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 16)
        {
        	//Medieval Village Recipe
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_MEDIEVAL);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 17)
        {
        	//Viking Village Recipe
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_VIKING);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 18)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_UNIQUE);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 19)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_ROMAN);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 20)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_MODERN);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 21)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_NETHER);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 22)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_RUSSIAN);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 23)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_OLDWEST);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(101, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 24)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_INDIAN);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(101, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 25)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_HALLOW);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(101, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 26)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_CHRISTMAS);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(101, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 27)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_SWAMP);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(101, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 28)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_JUNGLE);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(101, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 29)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.rec_DESERT);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(101, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 30)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_NPCINFO);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 31)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_ORIENTAL);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 32)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_MEDIEVAL);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 33)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_VIKING);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 34)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_UNIQUE);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 35)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_ROMAN);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 36)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_MODERN);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 37)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_NETHER);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 38)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_RUSSIAN);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 39)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_OLDWEST);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 40)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_INDIAN);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 41)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_HALLOW);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(0, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 42)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_CHRISTMAS);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(0, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 43)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_JUNGLE);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(0, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 44)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_SWAMP);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(0, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 45)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.info_DESERT);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(0, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 46)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_NPCACTIV);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(0, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 47)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_ORIENTAL);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 48)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_MEDIEVAL1);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(106, this.posX + 45, this.posY + 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 49)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_VIKING);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 50)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_UNIQUE);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 51)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_ROMAN);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 52)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_MODERN1);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(107, this.posX + 45, this.posY + 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(1, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 53)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_NETHER);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 54)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_RUSSIAN);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 55)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_OLDWEST1);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(108, this.posX + 45, this.posY + 65, 10, 10, " "));
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 56)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_INDIAN);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 57)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_HALLOW);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 58)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_CHRISTMAS);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
        	this.buttonList.add(new GuiButton(2, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 101)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.main_RECIPE2);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(23, this.posX - 115, this.posY - 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(24, this.posX - 115, this.posY - 45, 10, 10, " "));
            this.buttonList.add(new GuiButton(25, this.posX - 115, this.posY - 25, 10, 10, " "));
            this.buttonList.add(new GuiButton(26, this.posX - 115, this.posY - 5, 10, 10, " "));
            this.buttonList.add(new GuiButton(27, this.posX - 115, this.posY + 15, 10, 10, " "));
            this.buttonList.add(new GuiButton(28, this.posX - 115, this.posY + 35, 10, 10, " "));
            this.buttonList.add(new GuiButton(29, this.posX - 115, this.posY + 55, 10, 10, " "));
            this.buttonList.add(new GuiButton(100, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 102)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.main_BLOCKINFO2);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(43, this.posX - 115, this.posY - 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(44, this.posX - 115, this.posY - 45, 10, 10, " "));
            this.buttonList.add(new GuiButton(45, this.posX - 115, this.posY - 25, 10, 10, " "));
            this.buttonList.add(new GuiButton(100, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 103)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.main_ACTIVATOR2);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(59, this.posX - 115, this.posY - 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(60, this.posX - 115, this.posY - 45, 10, 10, " "));
            this.buttonList.add(new GuiButton(61, this.posX - 115, this.posY - 25, 10, 10, " "));
            this.buttonList.add(new GuiButton(100, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 104)
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.main_MODINFO2);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(100, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 105)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.main_ACTIVATOR2);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(75, this.posX - 115, this.posY - 65, 10, 10, " "));
            this.buttonList.add(new GuiButton(76, this.posX - 115, this.posY - 45, 10, 10, " "));
            this.buttonList.add(new GuiButton(77, this.posX - 115, this.posY - 25, 10, 10, " "));
            this.buttonList.add(new GuiButton(100, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 106)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_MEDIEVAL2);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(100, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 107)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_MODERN2);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(100, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        if (this.page == 108)
        {
        	GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(Resources.activ_OLDWEST2);
            this.drawTexturedModalRect(this.posX - 125, this.posY - 95, 0, 0, 256, 180);
            this.buttonList.add(new GuiButton(100, this.posX + 85, this.posY + 65, 10, 10, " "));
        }
        //this.drawCenteredString(this.fontRenderer, "Build Book", this.width - 57, this.height - 10, 16777215);
        super.drawScreen(var1, var2, var3);
    }

    /**
     * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
     */
    protected void actionPerformed(GuiButton var1)
    {
    	if (var1.id == 0)
        {
    		this.initGui();
            this.mc.displayGuiScreen((GuiScreen)null);
            //this.entity.addChatMessage("Build Book Closed");
        }
        if (var1.id == 1)
        {
            this.buttonList.clear();
            this.page = 1;
            //this.entity.addChatMessage("Block Recipes");
        }
        if (var1.id == 2)
        {
            this.buttonList.clear();
            this.page = 2;
            //this.entity.addChatMessage("Block Info");
        }
        if (var1.id == 3)
        {
            this.buttonList.clear();
            this.page = 3;
           // this.entity.addChatMessage("Block Activators");
        }
        if (var1.id == 4)
        {
            this.buttonList.clear();
            this.page = 4;
            //this.entity.addChatMessage("Mod Info");
        }
        if (var1.id == 5)
        {
            this.buttonList.clear();
            this.page = 5;
            //this.entity.addChatMessage("Mod Gallery");
        }
        if (var1.id == 10)
        {
        	this.buttonList.clear();
            this.page = 10;
            //this.entity.addChatMessage("Build Table Recipe");
        }
        if (var1.id == 11)
        {
        	this.buttonList.clear();
            this.page = 11;
            //this.entity.addChatMessage("Hammer Recipe");
        }
        if (var1.id == 12)
        {
        	this.buttonList.clear();
            this.page = 12;
            //this.entity.addChatMessage("Saw Recipe");
        }
        if (var1.id == 13)
        {
        	this.buttonList.clear();
            this.page = 13;
            //this.entity.addChatMessage("Nail Recipe");
        }
        if (var1.id == 14)
        {
        	this.buttonList.clear();
            this.page = 14;
            this.entity.addChatMessage("NPC Village Recipe");
        }
        if (var1.id == 15)
        {
        	this.buttonList.clear();
            this.page = 15;
            this.entity.addChatMessage("Oriental Village Recipe");
        }
        if (var1.id == 16)
        {
        	this.buttonList.clear();
            this.page = 16;
            this.entity.addChatMessage("Medieval Village Recipe");
        }
        if (var1.id == 17)
        {
        	this.buttonList.clear();
            this.page = 17;
            this.entity.addChatMessage("Viking Village Recipe");
        }
        if (var1.id == 18)
        {
        	this.buttonList.clear();
            this.page = 18;
            this.entity.addChatMessage("Unique Village Recipe");
        }
        if (var1.id == 19)
        {
        	this.buttonList.clear();
            this.page = 19;
            this.entity.addChatMessage("Roman Village Recipe");
        }
        if (var1.id == 20)
        {
        	this.buttonList.clear();
            this.page = 20;
            this.entity.addChatMessage("Modern Village Recipe");
        }
        if (var1.id == 21)
        {
        	this.buttonList.clear();
            this.page = 21;
            this.entity.addChatMessage("Nether Village Recipe");
        }
        if (var1.id == 22)
        {
        	this.buttonList.clear();
            this.page = 22;
            this.entity.addChatMessage("Russian Village Recipe");
        }
        if (var1.id == 23)
        {
        	this.buttonList.clear();
            this.page = 23;
            this.entity.addChatMessage("Old West Recipe");
        }
        if (var1.id == 24)
        {
        	this.buttonList.clear();
            this.page = 24;
            this.entity.addChatMessage("Indian Village Recipe");
        }
        if (var1.id == 25)
        {
        	this.buttonList.clear();
            this.page = 25;
            this.entity.addChatMessage("Hallow Village Recipe");
        }
        if (var1.id == 26)
        {
        	this.buttonList.clear();
            this.page = 26;
            this.entity.addChatMessage("Christmas Village Recipe");
        }
        if (var1.id == 27)
        {
        	this.buttonList.clear();
            this.page = 27;
            this.entity.addChatMessage("Swamp Village Recipe");
        }
        if (var1.id == 28)
        {
        	this.buttonList.clear();
            this.page = 28;
            this.entity.addChatMessage("Jungle Village Recipe");
        }
        if (var1.id == 29)
        {
        	this.buttonList.clear();
            this.page = 29;
            this.entity.addChatMessage("Desert Village Recipe");
        }
        if (var1.id == 30)
        {
        	this.buttonList.clear();
            this.page = 30;
            this.entity.addChatMessage("NPC Village Recipe");
        }
        if (var1.id == 31)
        {
        	this.buttonList.clear();
            this.page = 31;
            this.entity.addChatMessage("Oriental Village Recipe");
        }
        if (var1.id == 32)
        {
        	this.buttonList.clear();
            this.page = 32;
            this.entity.addChatMessage("Medieval Village Recipe");
        }
        if (var1.id == 33)
        {
        	this.buttonList.clear();
            this.page = 33;
            this.entity.addChatMessage("Viking Village Recipe");
        }
        if (var1.id == 34)
        {
        	this.buttonList.clear();
            this.page = 34;
            this.entity.addChatMessage("Unique Village Recipe");
        }
        if (var1.id == 35)
        {
        	this.buttonList.clear();
            this.page = 35;
            this.entity.addChatMessage("Roman Village Recipe");
        }
        if (var1.id == 36)
        {
        	this.buttonList.clear();
            this.page = 36;
            this.entity.addChatMessage("Modern Village Recipe");
        }
        if (var1.id == 37)
        {
        	this.buttonList.clear();
            this.page = 37;
            this.entity.addChatMessage("Nether Village Recipe");
        }
        if (var1.id == 38)
        {
        	this.buttonList.clear();
            this.page = 38;
            this.entity.addChatMessage("Russian Village Recipe");
        }
        if (var1.id == 39)
        {
        	this.buttonList.clear();
            this.page = 39;
            this.entity.addChatMessage("Old West Recipe");
        }
        if (var1.id == 40)
        {
        	this.buttonList.clear();
            this.page = 40;
            this.entity.addChatMessage("Indian Village Recipe");
        }
        if (var1.id == 41)
        {
        	this.buttonList.clear();
            this.page = 41;
            this.entity.addChatMessage("Hallow Village Recipe");
        }
        if (var1.id == 42)
        {
        	this.buttonList.clear();
            this.page = 42;
            this.entity.addChatMessage("Christmas Village Recipe");
        }
        if (var1.id == 43)
        {
        	this.buttonList.clear();
            this.page = 43;
            this.entity.addChatMessage("Swamp Village Recipe");
        }
        if (var1.id == 44)
        {
        	this.buttonList.clear();
            this.page = 44;
            this.entity.addChatMessage("Jungle Village Recipe");
        }
        if (var1.id == 45)
        {
        	this.buttonList.clear();
            this.page = 45;
            this.entity.addChatMessage("Desert Village Recipe");
        }
        if (var1.id == 46)
        {
        	this.buttonList.clear();
            this.page = 46;
            this.entity.addChatMessage("NPC Village Recipe");
        }
        if (var1.id == 47)
        {
        	this.buttonList.clear();
            this.page = 47;
            this.entity.addChatMessage("Oriental Village Recipe");
        }
        if (var1.id == 48)
        {
        	this.buttonList.clear();
            this.page = 48;
            this.entity.addChatMessage("Medieval Village Recipe");
        }
        if (var1.id == 49)
        {
        	this.buttonList.clear();
            this.page = 49;
            this.entity.addChatMessage("Viking Village Recipe");
        }
        if (var1.id == 50)
        {
        	this.buttonList.clear();
            this.page = 50;
            this.entity.addChatMessage("Unique Village Recipe");
        }
        if (var1.id == 51)
        {
        	this.buttonList.clear();
            this.page = 51;
            this.entity.addChatMessage("Roman Village Recipe");
        }
        if (var1.id == 52)
        {
        	this.buttonList.clear();
            this.page = 52;
            this.entity.addChatMessage("Modern Village Recipe");
        }
        if (var1.id == 53)
        {
        	this.buttonList.clear();
            this.page = 53;
            this.entity.addChatMessage("Nether Village Recipe");
        }
        if (var1.id == 54)
        {
        	this.buttonList.clear();
            this.page = 54;
            this.entity.addChatMessage("Russian Village Recipe");
        }
        if (var1.id == 55)
        {
        	this.buttonList.clear();
            this.page = 55;
            this.entity.addChatMessage("Old West Recipe");
        }
        if (var1.id == 56)
        {
        	this.buttonList.clear();
            this.page = 56;
            this.entity.addChatMessage("Indian Village Recipe");
        }
        if (var1.id == 57)
        {
        	this.buttonList.clear();
            this.page = 57;
            this.entity.addChatMessage("Hallow Village Recipe");
        }
        if (var1.id == 58)
        {
        	this.buttonList.clear();
            this.page = 58;
            this.entity.addChatMessage("Christmas Village Recipe");
        }
        if (var1.id == 59)
        {
        	this.buttonList.clear();
            this.page = 59;
            this.entity.addChatMessage("Swamp Village Recipe");
        }
        if (var1.id == 60)
        {
        	this.buttonList.clear();
            this.page = 60;
            this.entity.addChatMessage("Jungle Village Recipe");
        }
        if (var1.id == 61)
        {
        	this.buttonList.clear();
            this.page = 61;
            this.entity.addChatMessage("Desert Village Recipe");
        }
        if (var1.id == 62)
        {
        	this.buttonList.clear();
            this.page = 62;
            this.entity.addChatMessage("NPC Village Recipe");
        }
        if (var1.id == 63)
        {
        	this.buttonList.clear();
            this.page = 63;
            this.entity.addChatMessage("Oriental Village Recipe");
        }
        if (var1.id == 64)
        {
        	this.buttonList.clear();
            this.page = 64;
            this.entity.addChatMessage("Medieval Village Recipe");
        }
        if (var1.id == 65)
        {
        	this.buttonList.clear();
            this.page = 65;
            this.entity.addChatMessage("Viking Village Recipe");
        }
        if (var1.id == 66)
        {
        	this.buttonList.clear();
            this.page = 66;
            this.entity.addChatMessage("Unique Village Recipe");
        }
        if (var1.id == 67)
        {
        	this.buttonList.clear();
            this.page = 67;
            this.entity.addChatMessage("Roman Village Recipe");
        }
        if (var1.id == 68)
        {
        	this.buttonList.clear();
            this.page = 68;
            this.entity.addChatMessage("Modern Village Recipe");
        }
        if (var1.id == 69)
        {
        	this.buttonList.clear();
            this.page = 69;
            this.entity.addChatMessage("Nether Village Recipe");
        }
        if (var1.id == 70)
        {
        	this.buttonList.clear();
            this.page = 70;
            this.entity.addChatMessage("Russian Village Recipe");
        }
        if (var1.id == 71)
        {
        	this.buttonList.clear();
            this.page = 71;
            this.entity.addChatMessage("Old West Recipe");
        }
        if (var1.id == 72)
        {
        	this.buttonList.clear();
            this.page = 72;
            this.entity.addChatMessage("Indian Village Recipe");
        }
        if (var1.id == 73)
        {
        	this.buttonList.clear();
            this.page = 73;
            this.entity.addChatMessage("Hallow Village Recipe");
        }
        if (var1.id == 74)
        {
        	this.buttonList.clear();
            this.page = 74;
            this.entity.addChatMessage("Christmas Village Recipe");
        }
        if (var1.id == 75)
        {
        	this.buttonList.clear();
            this.page = 75;
            this.entity.addChatMessage("Swamp Village Recipe");
        }
        if (var1.id == 76)
        {
        	this.buttonList.clear();
            this.page = 76;
            this.entity.addChatMessage("Jungle Village Recipe");
        }
        if (var1.id == 77)
        {
        	this.buttonList.clear();
            this.page = 77;
            this.entity.addChatMessage("Desert Village Recipe");
        }
        if (var1.id == 100)
        {
        	this.buttonList.clear();
            this.page = 0;
            this.entity.addChatMessage("Modern page2 Activators");
        }
        if (var1.id == 101)
        {
        	this.buttonList.clear();
            this.page = 101;
            this.entity.addChatMessage("Builder Book");
        }
        if (var1.id == 102)
        {
        	this.buttonList.clear();
            this.page = 102;
            this.entity.addChatMessage("Builder Book");
        }
        if (var1.id == 103)
        {
        	this.buttonList.clear();
            this.page = 103;
            this.entity.addChatMessage("Builder Book");
        }
        if (var1.id == 104)
        {
        	this.buttonList.clear();
            this.page = 104;
            this.entity.addChatMessage("Builder Book");
        }
        if (var1.id == 105)
        {
        	this.buttonList.clear();
            this.page = 1;
            this.entity.addChatMessage("Builder Book");
        }
        if (var1.id == 106)
        {
        	this.buttonList.clear();
            this.page = 106;
            this.entity.addChatMessage("Builder Book");
        }
        if (var1.id == 107)
        {
        	this.buttonList.clear();
            this.page = 107;
            this.entity.addChatMessage("Builder Book");
        }
        if (var1.id == 108)
        {
        	this.buttonList.clear();
            this.page = 108;
            this.entity.addChatMessage("Builder Book");
        }
    }
    
    /**
     * Called when the mouse is clicked.
     */
    /*protected void mouseClicked(int var1, int var2, int var3)
    {
        if (var1 <= this.width && var1 >= this.width - 105 && var2 <= this.height && var2 >= this.height - 10)
        {
            Sys.openURL("http://www.minecraftforum.net/topic/1078514-131-redstone-book-v13/");
        }

        if (this.page != 0 && this.page != 6 && var1 >= this.width / 2 - 50 && var1 <= this.width / 2 + 50 && var2 >= this.height / 2 - 95 && var2 <= this.height / 2 - 85)
        {
            Sys.openURL("http://www.minecraftwiki.net/wiki/Redstone_Circuits");
        }

        super.mouseClicked(var1, var2, var3);
    }*/
}