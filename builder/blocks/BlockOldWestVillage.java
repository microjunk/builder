package builder.blocks;

import java.util.Random;

import builder.Builder;
import builder.structures.oldwest.OldWest;
import builder.structures.oldwest.OldWestBlackSmith;
import builder.structures.oldwest.OldWestBlackSmith1;
import builder.structures.oldwest.OldWestCemetary;
import builder.structures.oldwest.OldWestChurch1;
import builder.structures.oldwest.OldWestChurch2;
import builder.structures.oldwest.OldWestCourtHouse;
import builder.structures.oldwest.OldWestGeneralStore;
import builder.structures.oldwest.OldWestJail;
import builder.structures.oldwest.OldWestOperaHouse;
import builder.structures.oldwest.OldWestSaloon;
import builder.structures.oldwest.OldWestStable;
import builder.structures.oldwest.OldWestTrainStation;
import builder.structures.oldwest.OldWestWaterTower;
import builder.structures.structuregenerator.WorldGenOldWest;
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

public class BlockOldWestVillage extends BlockFlower
{
	// could use onBlockActivated's parameter world.rand instead of this
	private Random rand;
	
	public BlockOldWestVillage(int i)
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
        this.blockIcon = var1.registerIcon("builder:oldwest");
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
        return Builder.oldwestVillage.blockID;
    }
    
    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5)
    {
		ItemStack equipped = entityplayer.getCurrentEquippedItem();
		if (equipped == null)
		{
			return false;
		}
		
		int playerfacing = MathHelper.floor_double((double)((entityplayer.rotationYaw * 4F) / 360f) + 0.5D) &3;
		
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.leash.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.SOUTH);
			gen.setOffset(0, 0, 5);
			gen.addBlockArray(OldWest.blockArrayGallow);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Gallow by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bucketEmpty.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.EAST);
			gen.setOffset(-4, 0, 0);
			gen.addBlockArray(OldWest.blockArrayTroff);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Troff by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.stick.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.SOUTH);
			gen.setOffset(0, 0, 4);
			gen.addBlockArray(OldWest.blockArrayOutHouse);
			gen.generate(world, rand, i, j - 3, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Out House by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bucketWater.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.EAST);
			gen.setOffset(-5, 0, 0);
			gen.addBlockArray(OldWest.blockArrayWell);
			gen.generate(world, rand, i, j - 2, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Well by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Builder.hammer.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.SOUTH);
			gen.setOffset(0, 0, 9);
			gen.addBlockArray(OldWestBlackSmith1.blockArrayBlackSmith1);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Black Smith by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.planks.blockID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.NORTH);
			gen.setOffset(0, 0, -8);
			gen.addBlockArray(OldWestBlackSmith.blockArrayBlackSmith);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Livery by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.cobblestoneWall.blockID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.EAST);
			gen.setOffset(-10, 0, 0);
			gen.addBlockArray(OldWestCemetary.blockArrayCemetary);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Cemetary by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.book.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.EAST);
			gen.setOffset(-13, 0, 0);
			gen.addBlockArray(OldWestChurch1.blockArrayChurch1);
			gen.addBlockArray(OldWestChurch2.blockArrayChurch2);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Church by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.axeGold.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.NORTH);
			gen.setOffset(0, 0, -10);
			gen.addBlockArray(OldWestCourtHouse.blockArrayCourtHouse);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Bank by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.chest.blockID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.NORTH);
			gen.setOffset(0, 0, -10);
			gen.addBlockArray(OldWestGeneralStore.blockArrayGeneralStore);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West General Store by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.fenceIron.blockID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.NORTH);
			gen.setOffset(0, 0, -9);
			gen.addBlockArray(OldWestJail.blockArrayOldWestJail);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Jail by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.paper.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.NORTH);
			gen.setOffset(0, 0, -10);
			gen.addBlockArray(OldWestOperaHouse.blockArrayOperaHouse);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Opera House by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.glassBottle.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.SOUTH);
			gen.setOffset(0, 0, 11);
			gen.addBlockArray(OldWestSaloon.blockArraySaloon);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Saloon by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.hay.blockID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.SOUTH);
			gen.setOffset(0, 0, 8);
			gen.addBlockArray(OldWestStable.blockArrayOldWestStable);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Stable by PixelWings");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.rail.blockID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.SOUTH);
			gen.setOffset(0, 0, 10);
			gen.addBlockArray(OldWestTrainStation.blockArrayTrainStation);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Train Station by themikerophone1");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bowlEmpty.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOldWest();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOldWest.WEST);
			gen.setOffset(7, 0, 0);
			gen.addBlockArray(OldWestWaterTower.blockArrayWaterTower);
			gen.generate(world, rand, i, j - 2, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Old West Water Tower by themikerophone1");
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