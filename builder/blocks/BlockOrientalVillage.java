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
import builder.structures.oriental.JapanBelfry;
import builder.structures.oriental.JapanBellTower;
import builder.structures.oriental.JapanCrops;
import builder.structures.oriental.JapanDietyShrines;
import builder.structures.oriental.JapanGardenBuilding;
import builder.structures.oriental.JapanShrine;
import builder.structures.oriental.magistrate.JapanMagistrate1;
import builder.structures.oriental.magistrate.JapanMagistrate2;
import builder.structures.oriental.magistrate.JapanMagistrate3;
import builder.structures.oriental.magistrate.JapanMagistrate4;
import builder.structures.oriental.magistrate.JapanMagistrate5;
import builder.structures.oriental.magistrate.JapanMagistrate6;
import builder.structures.oriental.pagoda.JapanPagoda1;
import builder.structures.oriental.pagoda.JapanPagoda2;
import builder.structures.oriental.pagoda.JapanPagoda3;
import builder.structures.oriental.pagoda.JapanPagoda4;
import builder.structures.oriental.pagoda.JapanPagoda5;
import builder.structures.oriental.pagoda.JapanPagoda6;
import builder.structures.oriental.pagoda.JapanPagoda7;
import builder.structures.oriental.pagoda.JapanPagoda8;
import builder.structures.oriental.twos.JapanDojo1;
import builder.structures.oriental.twos.JapanDojo2;
import builder.structures.oriental.twos.JapanDojo3;
import builder.structures.oriental.twos.JapanGreatHall1;
import builder.structures.oriental.twos.JapanGreatHall2;
import builder.structures.oriental.twos.JapanLargeHouse1;
import builder.structures.oriental.twos.JapanLargeHouse2;
import builder.structures.oriental.twos.JapanLargeShop1;
import builder.structures.oriental.twos.JapanLargeShop2;
import builder.structures.oriental.twos.JapanMediumHouse1;
import builder.structures.oriental.twos.JapanMediumHouse2;
import builder.structures.structuregenerator.WorldGenOriental;
import builder.utils.structuregenerator.StructureGeneratorBase;

public class BlockOrientalVillage extends BlockFlower
{
	private Random rand;
	private EntityPlayer entityplayer;
	
	public BlockOrientalVillage(int i)
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
        this.blockIcon = var1.registerIcon("Builder:japcastle");
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
        return Builder.orientalVillage.blockID;
    }
    
    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5)
    {
		ItemStack equipped = entityplayer.getCurrentEquippedItem();
		if (equipped == null)
		{
			return false;
		}
		
		int playerfacing = MathHelper.floor_double((double)((entityplayer.rotationYaw * 4F) / 360f) + 0.5D) &3;
		
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.cloth.blockID)
		{
			StructureGeneratorBase gen = new WorldGenOriental();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOriental.NORTH);
			gen.setOffset(0, 0, -7);
			gen.addBlockArray(JapanBelfry.blockArrayBelfry);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Belfry");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.ingotGold.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOriental();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOriental.EAST);
			gen.setOffset(-8, 0, 0);
			gen.addBlockArray(JapanBellTower.blockArrayBellTower);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Bell Tower");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.wheat.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOriental();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOriental.SOUTH);
			gen.setOffset(0, 0, 8);
			gen.addBlockArray(JapanGardenBuilding.blockArrayGardenHouse);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Garden House");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.hoeWood.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOriental();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOriental.EAST);
			gen.setOffset(-7, 0, 0);
			gen.addBlockArray(JapanCrops.blockArrayCrops);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Crops");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.workbench.blockID)
		{
			StructureGeneratorBase gen = new WorldGenOriental();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOriental.SOUTH);
			gen.setOffset(0, 0, 10);
			gen.addBlockArray(JapanDojo1.blockArrayDojo1);
			gen.addBlockArray(JapanDojo2.blockArrayDojo2);
			gen.addBlockArray(JapanDojo3.blockArrayDojo3);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Dojo");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bed.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOriental();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOriental.SOUTH);
			gen.setOffset(0, 0, 9);
			gen.addBlockArray(JapanGreatHall1.blockArrayGreatHall1);
			gen.addBlockArray(JapanGreatHall2.blockArrayGreatHall2);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Great Hall");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bread.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOriental();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOriental.NORTH);
			gen.setOffset(0, 0, -14);
			gen.addBlockArray(JapanLargeHouse1.blockArrayLgHouse1);
			gen.addBlockArray(JapanLargeHouse2.blockArrayLgHouse2);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Large House");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.chest.blockID)
		{
			StructureGeneratorBase gen = new WorldGenOriental();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOriental.SOUTH);
			gen.setOffset(0, 0, 13);
			gen.addBlockArray(JapanLargeShop1.blockArrayLgShop1);
			gen.addBlockArray(JapanLargeShop2.blockArrayLgShop2);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Large Shop");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.goldNugget.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOriental();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOriental.NORTH);
			gen.setOffset(0, 0, -4);
			gen.addBlockArray(JapanDietyShrines.blockArrayDiety);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Diety Shrine");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.swordIron.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOriental();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOriental.NORTH);
			gen.setOffset(0, 0, -17);
			gen.addBlockArray(JapanMagistrate1.blockArrayMagistrate1);
			gen.addBlockArray(JapanMagistrate2.blockArrayMagistrate2);
			gen.addBlockArray(JapanMagistrate3.blockArrayMagistrate3);
			gen.addBlockArray(JapanMagistrate4.blockArrayMagistrate4);
			gen.addBlockArray(JapanMagistrate5.blockArrayMagistrate5);
			gen.addBlockArray(JapanMagistrate6.blockArrayMagistrate6);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Magistrate");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.melon.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOriental();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOriental.NORTH);
			gen.setOffset(0, 0, -11);
			gen.addBlockArray(JapanMediumHouse1.blockArrayMdHouse1);
			gen.addBlockArray(JapanMediumHouse2.blockArrayMdHouse2);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medium House");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.emerald.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOriental();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOriental.EAST);
			gen.setOffset(-13, 0, 0);
			gen.addBlockArray(JapanPagoda1.blockArrayPagoda1);
			gen.addBlockArray(JapanPagoda2.blockArrayPagoda2);
			gen.addBlockArray(JapanPagoda3.blockArrayPagoda3);
			gen.addBlockArray(JapanPagoda4.blockArrayPagoda4);
			gen.addBlockArray(JapanPagoda5.blockArrayPagoda5);
			gen.addBlockArray(JapanPagoda6.blockArrayPagoda6);
			gen.addBlockArray(JapanPagoda7.blockArrayPagoda7);
			gen.addBlockArray(JapanPagoda8.blockArrayPagoda8);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Pagoda");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.stick.itemID)
		{
			StructureGeneratorBase gen = new WorldGenOriental();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenOriental.SOUTH);
			gen.setOffset(0, 0, 7);
			gen.addBlockArray(JapanShrine.blockArrayShrine);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Shrine");
			}
			equipped.stackSize--;
			return true;
		}
		return false;
    }
 
}