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
import builder.structures.halloweentown.HallowBigCube;
import builder.structures.halloweentown.HallowBigHouse;
import builder.structures.halloweentown.HallowBlackSmith;
import builder.structures.halloweentown.HallowChurch;
import builder.structures.halloweentown.HallowCube;
import builder.structures.halloweentown.HallowFarm;
import builder.structures.halloweentown.HallowHut;
import builder.structures.halloweentown.HallowHutA;
import builder.structures.halloweentown.HallowLantern;
import builder.structures.halloweentown.HallowLibrary;
import builder.structures.halloweentown.HallowRowHomes;
import builder.structures.halloweentown.HallowWell;
import builder.structures.halloweentown.HallowWellA;
import builder.structures.structuregenerator.WorldGenHallow;
import builder.utils.structuregenerator.StructureGeneratorBase;

public class BlockHallowVillage extends BlockFlower
{
	// could use onBlockActivated's parameter world.rand instead of this
	private Random rand;
	
	public BlockHallowVillage(int i)
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
        this.blockIcon = var1.registerIcon("builder:hallow");
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
        return Builder.hallowVillage.blockID;
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
			StructureGeneratorBase gen = new WorldGenHallow();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenHallow.SOUTH);
			gen.setOffset(0, 0, 8);
			gen.addBlockArray(HallowBlackSmith.blockArrayBlackSmith);
			gen.generate(world, rand, i, j - 3, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Black Smith");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.blockIron.blockID)
		{
			StructureGeneratorBase gen = new WorldGenHallow();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenHallow.SOUTH);
			gen.setOffset(0, 0, 7);
			gen.addBlockArray(HallowBigCube.blockArrayBigCube);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Big Cube");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.coalBlock.blockID)
		{
			StructureGeneratorBase gen = new WorldGenHallow();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenHallow.NORTH);
			gen.setOffset(0, 0, -7);
			gen.addBlockArray(HallowBigHouse.blockArrayBigHouse);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Big House");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.book.itemID)
		{
			StructureGeneratorBase gen = new WorldGenHallow();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenHallow.SOUTH);
			gen.setOffset(0, 0, 11);
			gen.addBlockArray(HallowChurch.blockArrayChurch);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Church");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.ingotIron.itemID)
		{
			StructureGeneratorBase gen = new WorldGenHallow();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenHallow.SOUTH);
			gen.setOffset(0, 0, 7);
			gen.addBlockArray(HallowCube.blockArrayCube);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Cube");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.pumpkin.blockID)
		{
			StructureGeneratorBase gen = new WorldGenHallow();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenHallow.EAST);
			gen.setOffset(-14, 0, 0);
			gen.addBlockArray(HallowFarm.blockArrayFarm);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Farm");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.pumpkinLantern.blockID)
		{
			StructureGeneratorBase gen = new WorldGenHallow();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenHallow.EAST);
			gen.setOffset(-5, 0, 0);
			gen.addBlockArray(HallowHut.blockArrayHut);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Hut");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.stick.itemID)
		{
			StructureGeneratorBase gen = new WorldGenHallow();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenHallow.EAST);
			gen.setOffset(-5, 0, 0);
			gen.addBlockArray(HallowHutA.blockArrayHutA);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Hut 2 LegendaryDarkWarrior");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.netherFence.blockID)
		{
			StructureGeneratorBase gen = new WorldGenHallow();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenHallow.EAST);
			gen.setOffset(-3, 0, 0);
			gen.addBlockArray(HallowLantern.blockArrayLantern);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Lantern LegendaryDarkWarrior");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.bookShelf.blockID)
		{
			StructureGeneratorBase gen = new WorldGenHallow();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenHallow.WEST);
			gen.setOffset(9, 0, 0);
			gen.addBlockArray(HallowLibrary.blockArrayLibrary);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Library");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.hardenedClay.blockID)
		{
			StructureGeneratorBase gen = new WorldGenHallow();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenHallow.WEST);
			gen.setOffset(9, 0, 0);
			gen.addBlockArray(HallowRowHomes.blockArrayRowHomes);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Row Homes");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bucketEmpty.itemID)
		{
			StructureGeneratorBase gen = new WorldGenHallow();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenHallow.WEST);
			gen.setOffset(7, 0, 0);
			gen.addBlockArray(HallowWell.blockArrayWell);
			gen.generate(world, rand, i, j - 2, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Well");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bucketWater.itemID)
		{
			StructureGeneratorBase gen = new WorldGenHallow();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenHallow.WEST);
			gen.setOffset(6, 0, 0);
			gen.addBlockArray(HallowWellA.blockArrayWellA);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Well 2 LegendaryDarkWarrior");
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