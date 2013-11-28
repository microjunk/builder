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
import builder.structures.structuregenerator.WorldGenSwamp;
import builder.structures.swamp.SwampBigHouse;
import builder.structures.swamp.SwampBlackSmith;
import builder.structures.swamp.SwampChurch;
import builder.structures.swamp.SwampCube;
import builder.structures.swamp.SwampFarm;
import builder.structures.swamp.SwampGardenHouse;
import builder.structures.swamp.SwampHut;
import builder.structures.swamp.SwampLibrary;
import builder.utils.structuregenerator.StructureGeneratorBase;

public class BlockSwampVillage extends BlockFlower
{
	// could use onBlockActivated's parameter world.rand instead of this
	private Random rand;
	
	public BlockSwampVillage(int i)
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
			StructureGeneratorBase gen = new WorldGenSwamp();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenSwamp.SOUTH);
			gen.setOffset(0, 0, 8);
			gen.addBlockArray(SwampBlackSmith.blockArraySwampBlackSmith);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Swamp Black Smith");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.wood.blockID)
		{
			StructureGeneratorBase gen = new WorldGenSwamp();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenSwamp.SOUTH);
			gen.setOffset(0, 0, 9);
			gen.addBlockArray(SwampBigHouse.blockArraySwampBigHouse);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Swamp Big House");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.planks.blockID)
		{
			StructureGeneratorBase gen = new WorldGenSwamp();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenSwamp.SOUTH);
			gen.setOffset(0, 0, 7);
			gen.addBlockArray(SwampCube.blockArraySwampCube);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Swamp Cubic House");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.hoeWood.itemID)
		{
			StructureGeneratorBase gen = new WorldGenSwamp();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenSwamp.SOUTH);
			gen.setOffset(0, 0, 7);
			gen.addBlockArray(SwampFarm.blockArraySwampFarm);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Swamp Farm");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.hoeDiamond.itemID)
		{
			StructureGeneratorBase gen = new WorldGenSwamp();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenSwamp.SOUTH);
			gen.setOffset(0, 0, 10);
			gen.addBlockArray(SwampGardenHouse.blockArraySwampGardenHouse);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Swamp Garden House");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.stick.itemID)
		{
			StructureGeneratorBase gen = new WorldGenSwamp();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenSwamp.SOUTH);
			gen.setOffset(0, 0, 7);
			gen.addBlockArray(SwampHut.blockArraySwampHut);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Swamp Hut");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.bookShelf.blockID)
		{
			StructureGeneratorBase gen = new WorldGenSwamp();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenSwamp.SOUTH);
			gen.setOffset(0, 0, 9);
			gen.addBlockArray(SwampLibrary.blockArraySwampLibrary);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Swamp Library");
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