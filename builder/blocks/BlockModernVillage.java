package builder.blocks;

import java.util.Random;

import builder.Builder;
import builder.structures.modern.ModernBigCube;
import builder.structures.modern.ModernBigHouse;
import builder.structures.modern.ModernBigHouseGarden;
import builder.structures.modern.ModernBlackSmith;
import builder.structures.modern.ModernChurch1;
import builder.structures.modern.ModernChurch2;
import builder.structures.modern.ModernCube;
import builder.structures.modern.ModernFarm;
import builder.structures.modern.ModernHut;
import builder.structures.modern.ModernLamp;
import builder.structures.modern.ModernLibrary;
import builder.structures.modern.ModernStation1;
import builder.structures.modern.ModernStation2;
import builder.structures.modern.circle.ModernCircle1;
import builder.structures.modern.circle.ModernCircle2;
import builder.structures.modern.circle.ModernCircle3;
import builder.structures.modern.circle.ModernCircle4;
import builder.structures.modern.circle.ModernCircle5;
import builder.structures.modern.houses.ModernHouseOne;
import builder.structures.modern.houses.ModernHouseThree;
import builder.structures.modern.houses.ModernHouseTwo1;
import builder.structures.modern.houses.ModernHouseTwo2;
import builder.structures.modern.houses.ModernHouseTwo3;
import builder.structures.modern.trees.ModernTree1;
import builder.structures.modern.trees.ModernTree2;
import builder.structures.modern.trees.ModernTree3;
import builder.structures.modern.trees.ModernTree4;
import builder.structures.structuregenerator.WorldGenModern;
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

public class BlockModernVillage extends BlockFlower
{
	private Random rand;
	
	public BlockModernVillage(int i)
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
        this.blockIcon = var1.registerIcon("builder:modern");
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
        return Builder.modernVillage.blockID;
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
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.WEST);
			gen.setOffset(11, 0, 0);
			gen.addBlockArray(ModernStation1.blockArrayModernStation1);
			gen.addBlockArray(ModernStation2.blockArrayModernStation2);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Station by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.blockIron.blockID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.NORTH);
			gen.setOffset(0, 0, -9);
			gen.addBlockArray(ModernHouseOne.blockArrayModernHouse1);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern House 1 by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.coalBlock.blockID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.EAST);
			gen.setOffset(-11, 0, 0);
			gen.addBlockArray(ModernHouseTwo1.blockArrayModernHouseTwo1);
			gen.addBlockArray(ModernHouseTwo2.blockArrayModernHouseTwo2);
			gen.addBlockArray(ModernHouseTwo3.blockArrayModernHouseTwo3);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern House 2 by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.blockGold.blockID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.WEST);
			gen.setOffset(13, 0, 0);
			gen.addBlockArray(ModernHouseThree.blockArrayModernHouse3);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern House 3 by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.ingotIron.itemID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.NORTH);
			gen.setOffset(0, 0, -3);
			gen.addBlockArray(ModernLamp.blockArrayMVLamp);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Street Lamp by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.sapling.blockID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.NORTH);
			gen.setOffset(0, 0, -10);
			gen.addBlockArray(ModernTree1.blockArrayTree1);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Tree 1 by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.fence.blockID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.EAST);
			gen.setOffset(-9, 0, 0);
			gen.addBlockArray(ModernTree2.blockArrayTree2);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Tree 2 by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.stick.itemID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.EAST);
			gen.setOffset(-5, 0, 0);
			gen.addBlockArray(ModernTree3.blockArrayMVTree3);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Tree 3 by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.wood.blockID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.EAST);
			gen.setOffset(-8, 0, 0);
			gen.addBlockArray(ModernTree4.blockArrayTree4);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Tree 4 by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.stoneSingleSlab.blockID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.EAST);
			gen.setOffset(-22, 0, 0);
			gen.addBlockArray(ModernCircle1.blockArrayCircle1);
			gen.addBlockArray(ModernCircle2.blockArrayCircle2);
			gen.addBlockArray(ModernCircle3.blockArrayCircle3);
			gen.addBlockArray(ModernCircle4.blockArrayCircle4);
			gen.addBlockArray(ModernCircle5.blockArrayCircle5);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Circle by xXTIjsXx");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.planks.blockID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.NORTH);
			gen.setOffset(0, 0, -9);
			gen.addBlockArray(ModernBigCube.blockArrayBigCube);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Big Cube");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.stone.blockID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.WEST);
			gen.setOffset(12, 0, 0);
			gen.addBlockArray(ModernBigHouse.blockArrayModernBigHouse);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Big House");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.hoeDiamond.itemID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.NORTH);
			gen.setOffset(0, 0, -12);
			gen.addBlockArray(ModernBigHouseGarden.blockArrayBigHouseGarden);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Big House Garden");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.swordDiamond.itemID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.EAST);
			gen.setOffset(-6, 0, 0);
			gen.addBlockArray(ModernBlackSmith.blockArrayModernBlackSmith);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern BlackSmith");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.book.itemID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.WEST);
			gen.setOffset(12, 0, 0);
			gen.addBlockArray(ModernChurch1.blockArrayModernChurch1);
			gen.addBlockArray(ModernChurch2.blockArrayModernChurch2);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Church");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.swordGold.itemID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.NORTH);
			gen.setOffset(0, 0, -6);
			gen.addBlockArray(ModernCube.blockArrayModernCube);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Cube");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.hoeGold.itemID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.EAST);
			gen.setOffset(-12, 0, 0);
			gen.addBlockArray(ModernFarm.blockArrayModernFarm);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Farm");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.swordWood.itemID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.NORTH);
			gen.setOffset(0, 0, -6);
			gen.addBlockArray(ModernHut.blockArrayModernHut);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Hut");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.bookShelf.blockID)
		{
			StructureGeneratorBase gen = new WorldGenModern();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenModern.SOUTH);
			gen.setOffset(0, 0, 12);
			gen.addBlockArray(ModernLibrary.blockArrayModernLibrary);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Modern Library");
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