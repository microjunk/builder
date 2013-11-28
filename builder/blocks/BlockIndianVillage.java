package builder.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import builder.Builder;
import builder.structures.indian.BigHut1;
import builder.structures.indian.BigHut2;
import builder.structures.indian.Corral;
import builder.structures.indian.Hut1;
import builder.structures.indian.Hut2;
import builder.structures.indian.Hut3;
import builder.structures.indian.Hut4;
import builder.structures.indian.TotemPole;
import builder.structures.structuregenerator.WorldGenIndian;
import builder.utils.structuregenerator.StructureGeneratorBase;

public class BlockIndianVillage extends BlockFlower
{
	// could use onBlockActivated's parameter world.rand instead of this
	private Random rand;
	
	public BlockIndianVillage(int i)
	{
		super(i);
		float f = 0.4F;
		setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setCreativeTab(Builder.tabBuilder);
	}

	/**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
	public void registerIcons(IconRegister var1)
    {
        this.blockIcon = var1.registerIcon("builder:indian");
    }
	
	/**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getBlockTextureFromSideAndMetadata(int var1, int var2)
    {
        return this.blockIcon;
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Builder.indianVillage.blockID;
    }
    
    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5)
    {
		ItemStack equipped = entityplayer.getCurrentEquippedItem();
		if (equipped == null)
		{
			return false;
		}
		
		int playerfacing = MathHelper.floor_double((double)((entityplayer.rotationYaw * 4F) / 360f) + 0.5D) &3;
		
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Builder.hammer.itemID)
		{
			StructureGeneratorBase gen = new WorldGenIndian();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenIndian.SOUTH);
			gen.setOffset(0, 0, 11);
			gen.addBlockArray(BigHut1.blockArrayBigHut1);
			gen.addBlockArray(BigHut2.blockArrayBigHut2);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Indian Big Hut by Sand_Vlade");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.fence.blockID)
		{
			StructureGeneratorBase gen = new WorldGenIndian();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenIndian.EAST);
			gen.setOffset(-10, 0, 0);
			gen.addBlockArray(Corral.blockArrayCorral);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Indian Corral by Sand_Vlade");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.leather.itemID)
		{
			StructureGeneratorBase gen = new WorldGenIndian();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenIndian.WEST);
			gen.setOffset(9, 0, 0);
			gen.addBlockArray(Hut1.blockArrayHut1);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Indian Hut 1 by Sand_Vlade");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.arrow.itemID)
		{
			StructureGeneratorBase gen = new WorldGenIndian();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenIndian.WEST);
			gen.setOffset(9, 0, 0);
			gen.addBlockArray(Hut2.blockArrayHut2);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Indian Hut 2 by Sand_Vlade");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bow.itemID)
		{
			StructureGeneratorBase gen = new WorldGenIndian();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenIndian.EAST);
			gen.setOffset(-8, 0, 0);
			gen.addBlockArray(Hut3.blockArrayHut3);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Indian Hut 3 by Sand_Vlade");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bone.itemID)
		{
			StructureGeneratorBase gen = new WorldGenIndian();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenIndian.EAST);
			gen.setOffset(-9, 0, 0);
			gen.addBlockArray(Hut4.blockArrayHut4);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Indian Hut 4 by Sand_Vlade");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.planks.blockID)
		{
			StructureGeneratorBase gen = new WorldGenIndian();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenIndian.SOUTH);
			gen.setOffset(0, 0, 9);
			gen.addBlockArray(TotemPole.blockArrayTotemPole);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Indian Totem Pole by Sand_Vlade");
			}
			return true;
		}
		else
		{
			entityplayer.addChatMessage("No building associated with this item.");
			return false;
		}
    }
}