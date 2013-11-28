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
import builder.structures.structuregenerator.WorldGenViking;
import builder.structures.viking.VikingBlackSmith;
import builder.structures.viking.VikingFarm;
import builder.structures.viking.VikingGranary;
import builder.structures.viking.VikingHall1;
import builder.structures.viking.VikingHall2;
import builder.structures.viking.VikingHall3;
import builder.structures.viking.VikingHall4;
import builder.structures.viking.VikingHouse;
import builder.structures.viking.VikingLongHouse;
import builder.structures.viking.VikingShop;
import builder.structures.viking.VikingTemple;
import builder.structures.viking.VikingTower;
import builder.utils.structuregenerator.StructureGeneratorBase;

public class BlockVikingVillage extends BlockFlower
{
	private Random rand;
	private EntityPlayer entityplayer;
	
	public BlockVikingVillage(int i)
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
        this.blockIcon = var1.registerIcon("Builder:viking");
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
        return Builder.vikingVillage.blockID;
    }

    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5)
    {
		ItemStack equipped = entityplayer.getCurrentEquippedItem();
		if (equipped == null)
		{
			return false;
		}
		
		int playerfacing = MathHelper.floor_double((double)((entityplayer.rotationYaw * 4F) / 360f) + 0.5D) &3;
		
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.seeds.itemID)
		{
			StructureGeneratorBase gen = new WorldGenViking();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenViking.EAST);
			gen.setOffset(-5, 0, 0);
			gen.addBlockArray(VikingGranary.blockArrayGranary);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Viking Granary");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.helmetIron.itemID)
		{
			StructureGeneratorBase gen = new WorldGenViking();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenViking.EAST);
			gen.setOffset(-5, 0, 0);
			gen.addBlockArray(VikingTower.blockArrayTower);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Viking Tower");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bread.itemID)
		{
			StructureGeneratorBase gen = new WorldGenViking();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenViking.EAST);
			gen.setOffset(-8, 0, 0);
			gen.addBlockArray(VikingHouse.blockArrayHouse);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Viking House");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.chest.blockID)
		{
			StructureGeneratorBase gen = new WorldGenViking();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenViking.WEST);
			gen.setOffset(7, 0, 0);
			gen.addBlockArray(VikingShop.blockArrayShop);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Viking Shop");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Builder.hammer.itemID)
		{
			StructureGeneratorBase gen = new WorldGenViking();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenViking.WEST);
			gen.setOffset(7, 0, 0);
			gen.addBlockArray(VikingBlackSmith.blockArrayBlackSmith);
			gen.generate(world, rand, i, j - 1, k);
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Viking Black Smith");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.hoeWood.itemID)
		{
			StructureGeneratorBase gen = new WorldGenViking();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenViking.EAST);
			gen.setOffset(-12, 0, 0);
			gen.addBlockArray(VikingFarm.blockArrayFarm);
			gen.generate(world, rand, i, j - 2, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Viking Farm House");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.book.itemID)
		{
			StructureGeneratorBase gen = new WorldGenViking();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenViking.SOUTH);
			gen.setOffset(0, 0, 10);
			gen.addBlockArray(VikingTemple.blockArrayTemple);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Viking Temple");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.swordGold.itemID)
		{
			StructureGeneratorBase gen = new WorldGenViking();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenViking.SOUTH);
			gen.setOffset(0, 0, 12);
			gen.addBlockArray(VikingLongHouse.blockArrayLongHouse);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Viking Long House");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.stairsWoodSpruce.blockID)
		{
			StructureGeneratorBase gen = new WorldGenViking();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenViking.EAST);
			gen.setOffset(-14, 0, 0);
			gen.addBlockArray(VikingHall1.blockArrayVikingHall1);
			gen.addBlockArray(VikingHall2.blockArrayVikingHall2);
			gen.addBlockArray(VikingHall3.blockArrayVikingHall3);
			gen.addBlockArray(VikingHall4.blockArrayVikingHall4);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Viking Hall");
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