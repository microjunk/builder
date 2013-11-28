package builder.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import builder.Builder;
import builder.structures.npc.NPCBasementHouse;
import builder.structures.npc.NPCBigHouse;
import builder.structures.npc.NPCBigHouseGarden;
import builder.structures.npc.NPCBlackSmith;
import builder.structures.npc.NPCChurch;
import builder.structures.npc.NPCCubicHouse;
import builder.structures.npc.NPCFarmEquipment;
import builder.structures.npc.NPCFencedCubic;
import builder.structures.npc.NPCGardens;
import builder.structures.npc.NPCHouse1;
import builder.structures.npc.NPCHouse2;
import builder.structures.npc.NPCHut;
import builder.structures.npc.NPCJail;
import builder.structures.npc.NPCLibrary;
import builder.structures.npc.NPCMineshaftShelter;
import builder.structures.npc.NPCRichHouse;
import builder.structures.npc.NPCSmallStorage;
import builder.structures.npc.NPCSmallTower;
import builder.structures.npc.NPCStable;
import builder.structures.npc.NPCWitchHut;
import builder.structures.structuregenerator.WorldGenNPC;
import builder.utils.structuregenerator.StructureGeneratorBase;

public class BlockNPCVillage extends BlockFlower
{
	// could use onBlockActivated's parameter world.rand instead of this
	private Random rand;
	
	public BlockNPCVillage(int i)
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
        this.blockIcon = var1.registerIcon("builder:well");
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
        return Builder.normalVillage.blockID;
    }
    
    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par2, float par3, float par4, float par5)
    {
		ItemStack equipped = entityplayer.getCurrentEquippedItem();
		if (equipped == null)
		{
			return false;
		}
		
		int playerfacing = MathHelper.floor_double((double)((entityplayer.rotationYaw * 4F) / 360f) + 0.5D) &3;
		
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.hoeGold.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.SOUTH);
			gen.setOffset(0, 0, 7);
			gen.addBlockArray(NPCGardens.blockArrayNPCBigGarden);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Big Garden");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.hoeWood.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.EAST);
			gen.setOffset(-6, 0, 0);
			gen.addBlockArray(NPCGardens.blockArrayNPCSmallGarden);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Small Garden");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.stick.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.EAST);
			gen.setOffset(-5, 0, 0);
			gen.addBlockArray(NPCHut.blockArrayNPCHut);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Hut");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bucketEmpty.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.EAST);
			gen.setOffset(-5, 0, 0);
			gen.addBlockArray(NPCGardens.blockArrayNPCWell);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Well");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Builder.hammer.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.EAST);
			gen.setOffset(-5, 0, 0);
			gen.addBlockArray(NPCBlackSmith.blockArrayNPCBlackSmith);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Black Smith");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.planks.blockID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.EAST);
			gen.setOffset(-5, 0, 0);
			gen.addBlockArray(NPCCubicHouse.blockArrayNPCCubicHouse);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Cubic House");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.fence.blockID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.EAST);
			gen.setOffset(-5, 0, 0);
			gen.addBlockArray(NPCFencedCubic.blockArrayNPCFenced);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Fenced Cubic House");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.fermentedSpiderEye.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.NORTH);
			gen.setOffset(0, 0, -5);
			gen.addBlockArray(NPCWitchHut.blockArrayNPCWitchHut);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Witch Hut");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.wood.blockID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.EAST);
			gen.setOffset(-7, 0, 0);
			gen.addBlockArray(NPCBigHouse.blockArrayNPCBigHouse);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Big House");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.book.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.EAST);
			gen.setOffset(-8, 0, 0);
			gen.addBlockArray(NPCChurch.blockArrayNPCChurch);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Church");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.hoeDiamond.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.EAST);
			gen.setOffset(-8, 0, 0);
			gen.addBlockArray(NPCBigHouseGarden.blockArrayNPCBigHouseGarden);
			gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC House w/ Garden");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.bookShelf.blockID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.EAST);
			gen.setOffset(-5, 0, 0);
			gen.addBlockArray(NPCLibrary.blockArrayNPCLibrary);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Library");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bed.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.NORTH);
			gen.setOffset(0, 0, -5);
			gen.addBlockArray(NPCBasementHouse.blockArrayNPCBasementHouse);
			gen.generate(world, rand, i, j - 4, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Basement House");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.shovelGold.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.SOUTH);
			gen.setOffset(0, 0, 5);
			gen.addBlockArray(NPCFarmEquipment.blockArrayNPCFarmEquipment);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Farm Equipment");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.axeGold.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.SOUTH);
			gen.setOffset(0, 0, 5);
			gen.addBlockArray(NPCHouse1.blockArrayNPCHouse1);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC House 1");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.axeDiamond.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.SOUTH);
			gen.setOffset(0, 0, 5);
			gen.addBlockArray(NPCHouse2.blockArrayNPCHouse2);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC House 2");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.swordIron.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.SOUTH);
			gen.setOffset(0, 0, 7);
			gen.addBlockArray(NPCJail.blockArrayNPCJail);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Jail");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.pickaxeIron.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.WEST);
			gen.setOffset(6, 0, 0);
			gen.addBlockArray(NPCMineshaftShelter.blockArrayNPCMineshaftShelter);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC MineShaft Shelter");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.chest.blockID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.SOUTH);
			gen.setOffset(0, 0, 5);
			gen.addBlockArray(NPCSmallStorage.blockArrayNPCSmallStorage);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Small Storage");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.helmetIron.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.NORTH);
			gen.setOffset(0, 0, -5);
			gen.addBlockArray(NPCSmallTower.blockArrayNPCSmallTower);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Small Tower");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.diamond.itemID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.SOUTH);
			gen.setOffset(0, 0, 7);
			gen.addBlockArray(NPCRichHouse.blockArrayNPCRichHouse);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Rich House");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.hay.blockID)
		{
			StructureGeneratorBase gen = new WorldGenNPC();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenNPC.SOUTH);
			gen.setOffset(0, 0, 7);
			gen.addBlockArray(NPCStable.blockArrayNPCStable);
			gen.generate(world, rand, i, j, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building NPC Stable");
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