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
import builder.structures.medieval.Forge;
import builder.structures.medieval.alchemisttower.AlchemistTower1;
import builder.structures.medieval.alchemisttower.AlchemistTower2;
import builder.structures.medieval.alchemisttower.AlchemistTower3;
import builder.structures.medieval.fort.Fort1;
import builder.structures.medieval.fort.Fort2;
import builder.structures.medieval.fort.Fort3;
import builder.structures.medieval.fort.Fort4;
import builder.structures.medieval.fort.Fort5;
import builder.structures.medieval.fountains.FountainFour;
import builder.structures.medieval.fountains.FountainOne;
import builder.structures.medieval.fountains.FountainThree;
import builder.structures.medieval.fountains.FountainTwo;
import builder.structures.medieval.inn.Inn1;
import builder.structures.medieval.inn.Inn2;
import builder.structures.medieval.inn.Inn3;
import builder.structures.medieval.inn.Inn4;
import builder.structures.medieval.tower.TowerHouse1;
import builder.structures.medieval.tower.TowerHouse2;
import builder.structures.medieval.tower.TowerHouse3;
import builder.structures.medieval.tower.TowerHouse4;
import builder.structures.medieval.twos.FeastingHall1;
import builder.structures.medieval.twos.FeastingHall2;
import builder.structures.medieval.twos.GuardTower1;
import builder.structures.medieval.twos.GuardTower2;
import builder.structures.medieval.twos.LargeHouseOne1;
import builder.structures.medieval.twos.LargeHouseOne2;
import builder.structures.medieval.twos.LargeHouseTwo1;
import builder.structures.medieval.twos.LargeHouseTwo2;
import builder.structures.medieval.twos.LargeHouseTwo3;
import builder.structures.medieval.twos.MillingHouse1;
import builder.structures.medieval.twos.MillingHouse2;
import builder.structures.medieval.twos.SmallFarmHouse1;
import builder.structures.medieval.twos.SmallFarmHouse2;
import builder.structures.medieval.watermill.WaterMill1;
import builder.structures.medieval.watermill.WaterMill2;
import builder.structures.medieval.watermill.WaterMill3;
import builder.structures.structuregenerator.WorldGenMedieval;
import builder.utils.structuregenerator.StructureGeneratorBase;

public class BlockMedievalVillage extends BlockFlower
{
	private Random rand;
	private EntityPlayer entityplayer;
	
	public BlockMedievalVillage(int i)
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
        this.blockIcon = var1.registerIcon("Builder:medieval");
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
        return Builder.medievalVillage.blockID;
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
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.EAST);
			gen.setOffset(-9, 0, 0);
			gen.addBlockArray(Forge.blockArrayForge);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Forge");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bread.itemID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.NORTH);
			gen.setOffset(0, 0, -7);
			gen.addBlockArray(FeastingHall1.blockArrayFeastingHall1);
			gen.addBlockArray(FeastingHall2.blockArrayFeastingHall2);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Feasting Hall");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bucketWater.itemID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.EAST);
			gen.setOffset(-9, 0, 0);
			gen.addBlockArray(WaterMill1.blockArrayWaterMill1);
			gen.addBlockArray(WaterMill2.blockArrayWaterMill2);
			gen.addBlockArray(WaterMill3.blockArrayWaterMill3);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Water Mill");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.swordDiamond.itemID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.SOUTH);
			gen.setOffset(0, 0, 17);
			gen.addBlockArray(Fort1.blockArrayFort1);
			gen.addBlockArray(Fort2.blockArrayFort2);
			gen.addBlockArray(Fort3.blockArrayFort3);
			gen.addBlockArray(Fort4.blockArrayFort4);
			gen.addBlockArray(Fort5.blockArrayFort5);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Fort");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.helmetIron.itemID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.SOUTH);
			gen.setOffset(0, 0, 12);
			gen.addBlockArray(TowerHouse1.blockArrayTowerHouse1);
			gen.addBlockArray(TowerHouse2.blockArrayTowerHouse2);
			gen.addBlockArray(TowerHouse3.blockArrayTowerHouse3);
			gen.addBlockArray(TowerHouse4.blockArrayTowerHouse4);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Tower");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bed.itemID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.SOUTH);
			gen.setOffset(0, 0, 11);
			gen.addBlockArray(Inn1.blockArrayInn1);
			gen.addBlockArray(Inn2.blockArrayInn2);
			gen.addBlockArray(Inn3.blockArrayInn3);
			gen.addBlockArray(Inn4.blockArrayInn4);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Inn");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bucketEmpty.itemID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.EAST);
			gen.setOffset(-8, 0, 0);
			gen.addBlockArray(FountainFour.blockArrayFountainFour);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Fountain .v Four");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.bowlEmpty.itemID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.EAST);
			gen.setOffset(-9, 0, 0);
			gen.addBlockArray(FountainThree.blockArrayFountainThree);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Fountain .v Three");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.glassBottle.itemID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.EAST);
			gen.setOffset(-8, 0, 0);
			gen.addBlockArray(FountainTwo.blockArrayFountainTwo);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Fountain .v Two");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.ingotIron.itemID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.EAST);
			gen.setOffset(-8, 0, 0);
			gen.addBlockArray(FountainOne.blockArrayFountainOne);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Fountain .v One");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.planks.blockID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.EAST);
			gen.setOffset(-9, 0, 0);
			//gen.addBlockArray(AlchemistTower.blockArrayAlTower);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Wall");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.hoeGold.itemID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.WEST);
			gen.setOffset(11, 0, 0);
			gen.addBlockArray(SmallFarmHouse1.blockArraySmFarmHouse1);
			gen.addBlockArray(SmallFarmHouse2.blockArraySmFarmHouse2);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Small Farm House");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.axeWood.itemID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.WEST);
			gen.setOffset(11, 0, 0);
			gen.addBlockArray(MillingHouse1.blockArrayMillingHouse1);
			gen.addBlockArray(MillingHouse2.blockArrayMillingHouse2);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Mill");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.blockDiamond.blockID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.EAST);
			gen.setOffset(-11, 0, 0);
			gen.addBlockArray(LargeHouseTwo1.blockArrayLgHouseTwo1);
			gen.addBlockArray(LargeHouseTwo2.blockArrayLgHouseTwo2);
			gen.addBlockArray(LargeHouseTwo3.blockArrayLgHouseTwo3);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Large House Two");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.blockGold.blockID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.EAST);
			gen.setOffset(-9, 0, 0);
			gen.addBlockArray(LargeHouseOne1.blockArrayLgHouseOne1);
			gen.addBlockArray(LargeHouseOne2.blockArrayLgHouseOne2);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Large House One");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.swordGold.itemID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.WEST);
			gen.setOffset(9, 0, 0);
			gen.addBlockArray(GuardTower1.blockArrayGuardTower1);
			gen.addBlockArray(GuardTower2.blockArrayGuardTower2);
			gen.generate(world, rand, i, j - 3, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Guard House");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.fermentedSpiderEye.itemID)
		{
			StructureGeneratorBase gen = new WorldGenMedieval();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenMedieval.WEST);
			gen.setOffset(13, 0, 0);
			gen.addBlockArray(AlchemistTower1.blockArrayAlTower);
			gen.addBlockArray(AlchemistTower2.blockArrayAlTower2);
			gen.addBlockArray(AlchemistTower3.blockArrayAlTower3);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Medieval Alchemist Tower");
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