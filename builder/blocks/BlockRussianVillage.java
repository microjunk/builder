package builder.blocks;

import java.util.Random;

import builder.Builder;
import builder.structures.russian.RussianChurch1;
import builder.structures.russian.RussianChurch2;
import builder.structures.russian.RussianFountain;
import builder.structures.russian.RussianHouse1;
import builder.structures.russian.RussianHouse2;
import builder.structures.russian.mansion.RussianMansion1;
import builder.structures.russian.mansion.RussianMansion2;
import builder.structures.russian.mansion.RussianMansion3;
import builder.structures.russian.mansion.RussianMansion4;
import builder.structures.russian.mansion.RussianMansion5;
import builder.structures.russian.mansion.RussianMansion6;
import builder.structures.russian.mansion.RussianMansion7;
import builder.structures.structuregenerator.WorldGenRussian;
import builder.utils.structuregenerator.StructureGeneratorBase;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockRussianVillage extends BlockFlower
{
	// could use onBlockActivated's parameter world.rand instead of this
	private Random rand;
	
	public BlockRussianVillage(int i)
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
        this.blockIcon = var1.registerIcon("builder:russian");
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
        return Builder.russianVillage.blockID;
    }
    
    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5)
    {
		ItemStack equipped = entityplayer.getCurrentEquippedItem();
		if (equipped == null)
		{
			return false;
		}
		
		int playerfacing = MathHelper.floor_double((double)((entityplayer.rotationYaw * 4F) / 360f) + 0.5D) &3;
		
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.book.itemID)
		{
			StructureGeneratorBase gen = new WorldGenRussian();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRussian.SOUTH);
			gen.setOffset(0, 0, 9);
			gen.addBlockArray(RussianChurch1.blockArrayRussianChurch1);
			gen.addBlockArray(RussianChurch2.blockArrayRussianChurch2);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Russian Church by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bread.itemID)
		{
			StructureGeneratorBase gen = new WorldGenRussian();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRussian.EAST);
			gen.setOffset(-12, 0, 0);
			gen.addBlockArray(RussianHouse1.blockArrayRussianHouse1);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Russian House 1 by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.flowerPot.itemID)
		{
			StructureGeneratorBase gen = new WorldGenRussian();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRussian.WEST);
			gen.setOffset(12, 0, 0);
			gen.addBlockArray(RussianHouse2.blockArrayRussianHouse2);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Russian House 2 by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bucketEmpty.itemID)
		{
			StructureGeneratorBase gen = new WorldGenRussian();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRussian.EAST);
			gen.setOffset(-6, 0, 0);
			gen.addBlockArray(RussianFountain.blockArrayFountain);
			gen.generate(world, rand, i, j - 2, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Russian Fountain by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Builder.hammer.itemID)
		{
			StructureGeneratorBase gen = new WorldGenRussian();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRussian.NORTH);
			gen.setOffset(0, 0, -11);
			gen.addBlockArray(RussianMansion1.blockArrayRussianMansion1);
			gen.addBlockArray(RussianMansion2.blockArrayRussianMansion2);
			gen.addBlockArray(RussianMansion3.blockArrayRussianMansion3);
			gen.addBlockArray(RussianMansion4.blockArrayRussianMansion4);
			gen.addBlockArray(RussianMansion5.blockArrayRussianMansion5);
			gen.addBlockArray(RussianMansion6.blockArrayRussianMansion6);
			gen.addBlockArray(RussianMansion7.blockArrayRussianMansion7);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Russian Mansion by xXTIjsXx");
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