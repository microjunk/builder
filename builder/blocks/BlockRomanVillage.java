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
import builder.structures.roman.RomanArch;
import builder.structures.roman.RomanBigGarden;
import builder.structures.roman.RomanBlkSmth;
import builder.structures.roman.RomanCubedHouse;
import builder.structures.roman.RomanInn1;
import builder.structures.roman.RomanInn2;
import builder.structures.roman.RomanLargeCubedHouse;
import builder.structures.roman.RomanSmallGarden;
import builder.structures.roman.bighouse.RomanBigHouse1;
import builder.structures.roman.bighouse.RomanBigHouse2;
import builder.structures.roman.bighouse.RomanBigHouse3;
import builder.structures.roman.bighouse.RomanBigHouse4;
import builder.structures.roman.bighouse.RomanBigHouse5;
import builder.structures.roman.bighouse.RomanBigHouse6;
import builder.structures.roman.bighousegarden.RomanBigHouseGarden1;
import builder.structures.roman.bighousegarden.RomanBigHouseGarden2;
import builder.structures.roman.bighousegarden.RomanBigHouseGarden3;
import builder.structures.roman.bighousegarden.RomanBigHouseGarden4;
import builder.structures.roman.bighousegarden.RomanBigHouseGarden5;
import builder.structures.roman.bighousegarden.RomanBigHouseGarden6;
import builder.structures.roman.library.RomanLibrary1;
import builder.structures.roman.library.RomanLibrary2;
import builder.structures.roman.library.RomanLibrary3;
import builder.structures.roman.pavilion.RomanPavilion1;
import builder.structures.roman.pavilion.RomanPavilion2;
import builder.structures.roman.pavilion.RomanPavilion3;
import builder.structures.structuregenerator.WorldGenRoman;
import builder.utils.structuregenerator.StructureGeneratorBase;

public class BlockRomanVillage extends BlockFlower
{
	private Random rand;
	private EntityPlayer entityplayer;
	
	public BlockRomanVillage(int i)
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
        this.blockIcon = var1.registerIcon("Builder:roman");
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
        return Builder.romanVillage.blockID;
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
			StructureGeneratorBase gen = new WorldGenRoman();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRoman.EAST);
			gen.setOffset(-8, 0, 0);
			gen.addBlockArray(RomanBlkSmth.blockArrayBlkSmth);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Roman Black Smith");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bed.itemID)
		{
			StructureGeneratorBase gen = new WorldGenRoman();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRoman.SOUTH);
			gen.setOffset(0, 0, 9);
			gen.addBlockArray(RomanInn1.blockArrayRomanInn1);
			gen.addBlockArray(RomanInn2.blockArrayRomanInn2);
			gen.generate(world, rand, i, j - 7, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Roman Inn");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.hoeGold.itemID)
		{
			StructureGeneratorBase gen = new WorldGenRoman();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRoman.EAST);
			gen.setOffset(-14, 0, 0);
			gen.addBlockArray(RomanBigGarden.blockArrayBigGarden);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Big Garden");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bread.itemID)
		{
			StructureGeneratorBase gen = new WorldGenRoman();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRoman.EAST);
			gen.setOffset(-20, 0, 0);
			gen.addBlockArray(RomanBigHouse1.blockArrayBigHouse1);
			gen.addBlockArray(RomanBigHouse2.blockArrayBigHouse2);
			gen.addBlockArray(RomanBigHouse3.blockArrayBigHouse3);
			gen.addBlockArray(RomanBigHouse4.blockArrayBigHouse4);
			gen.addBlockArray(RomanBigHouse5.blockArrayBigHouse5);
			gen.addBlockArray(RomanBigHouse6.blockArrayBigHouse6);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Roman Big House");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.hoeDiamond.itemID)
		{
			StructureGeneratorBase gen = new WorldGenRoman();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRoman.EAST);
			gen.setOffset(-29, 0, 0);
			gen.addBlockArray(RomanBigHouseGarden1.blockArrayBigHouseGarden1);
			gen.addBlockArray(RomanBigHouseGarden2.blockArrayBigHouseGarden2);
			gen.addBlockArray(RomanBigHouseGarden3.blockArrayBigHouseGarden3);
			gen.addBlockArray(RomanBigHouseGarden4.blockArrayBigHouseGarden4);
			gen.addBlockArray(RomanBigHouseGarden5.blockArrayBigHouseGarden5);
			gen.addBlockArray(RomanBigHouseGarden6.blockArrayBigHouseGarden6);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Roman Big House w/ Garden");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.helmetIron.itemID)
		{
			StructureGeneratorBase gen = new WorldGenRoman();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRoman.EAST);
			gen.setOffset(-8, 0, 0);
			gen.addBlockArray(RomanCubedHouse.blockArrayCubedHouse);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Roman Cubed House");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.helmetGold.itemID)
		{
			StructureGeneratorBase gen = new WorldGenRoman();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRoman.EAST);
			gen.setOffset(-7, 0, 0);
			gen.addBlockArray(RomanLargeCubedHouse.blockArrayLgCubedHouse);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Roman Large Cubed House");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.bookShelf.blockID)
		{
			StructureGeneratorBase gen = new WorldGenRoman();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRoman.EAST);
			gen.setOffset(-15, 0, 0);
			gen.addBlockArray(RomanLibrary1.blockArrayLibrary1);
			gen.addBlockArray(RomanLibrary2.blockArrayLibrary2);
			gen.addBlockArray(RomanLibrary3.blockArrayLibrary3);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Roman Library");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.hoeWood.itemID)
		{
			StructureGeneratorBase gen = new WorldGenRoman();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRoman.EAST);
			gen.setOffset(-7, 0, 0);
			gen.addBlockArray(RomanSmallGarden.blockArraySmallGarden);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Roman Small Garden");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.ingotIron.itemID)
		{
			StructureGeneratorBase gen = new WorldGenRoman();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRoman.EAST);
			gen.setOffset(-16, 0, 0);
			gen.addBlockArray(RomanPavilion1.blockArrayPavilion1);
			gen.addBlockArray(RomanPavilion2.blockArrayPavilion2);
			gen.addBlockArray(RomanPavilion3.blockArrayPavilion3);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Roman Pavilion by Enosphorous");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.sandStone.blockID)
		{
			StructureGeneratorBase gen = new WorldGenRoman();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenRoman.SOUTH);
			gen.setOffset(0, 0, 6);
			gen.addBlockArray(RomanArch.blockArrayArch);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Arch");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.blockNetherQuartz.blockID)
		{
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Colosseum");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.plantYellow.blockID)
		{
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Decoration Tower");
			}
			equipped.stackSize--;
			return true;
		}
		else
		{
			entityplayer.addChatMessage("No building associated with this item.");
			return false;
		}
    }
}