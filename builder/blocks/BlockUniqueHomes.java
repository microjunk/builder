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
import builder.structures.structuregenerator.WorldGenUnique;
import builder.structures.uniquehomes.DesertCastle1;
import builder.structures.uniquehomes.DesertCastle2;
import builder.structures.uniquehomes.HobbitHouse1;
import builder.structures.uniquehomes.HobbitHouse2;
import builder.structures.uniquehomes.Igloo;
import builder.structures.uniquehomes.ScaryHouse1;
import builder.structures.uniquehomes.ScaryHouse2;
import builder.structures.uniquehomes.Snowman1;
import builder.structures.uniquehomes.Snowman2;
import builder.structures.uniquehomes.Snowman3;
import builder.structures.uniquehomes.StumpHouse1;
import builder.structures.uniquehomes.StumpHouse2;
import builder.structures.uniquehomes.StumpHouse3;
import builder.structures.uniquehomes.wizard.WizardShop1;
import builder.structures.uniquehomes.wizard.WizardShop2;
import builder.structures.uniquehomes.wizard.WizardShop3;
import builder.structures.uniquehomes.wizard.WizardShop4;
import builder.structures.uniquehomes.wizard.WizardShop5;
import builder.structures.uniquehomes.wizard.WizardShop6;
import builder.utils.structuregenerator.StructureGeneratorBase;

public class BlockUniqueHomes extends BlockFlower
{
	private Random rand;
	private EntityPlayer entityplayer;
	
	public BlockUniqueHomes(int i)
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
        this.blockIcon = var1.registerIcon("Builder:desertCastle");
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
        return Builder.uniqueHomes.blockID;
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
			StructureGeneratorBase gen = new WorldGenUnique();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenUnique.EAST);
			gen.setOffset(-12, 0, 0);
			gen.addBlockArray(StumpHouse1.blockArrayStumpHouse1);
			gen.addBlockArray(StumpHouse2.blockArrayStumpHouse2);
			gen.addBlockArray(StumpHouse3.blockArrayStumpHouse3);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Stump House");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.shovelStone.itemID)
		{
			StructureGeneratorBase gen = new WorldGenUnique();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenUnique.WEST);
			gen.setOffset(10, 0, 0);
			gen.addBlockArray(DesertCastle1.blockArrayDesertCastle1);
			gen.addBlockArray(DesertCastle2.blockArrayDesertCastle2);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Desert Castle");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.redstone.itemID)
		{
			StructureGeneratorBase gen = new WorldGenUnique();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenUnique.SOUTH);
			gen.setOffset(0, 0, 10);
			gen.addBlockArray(HobbitHouse1.blockArrayHobbitHouse1);
			gen.addBlockArray(HobbitHouse2.blockArrayHobbitHouse2);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hobbit House");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.snowball.itemID)
		{
			StructureGeneratorBase gen = new WorldGenUnique();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenUnique.EAST);
			gen.setOffset(-9, 0, 0);
			gen.addBlockArray(Igloo.blockArrayIgloo);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Igloo");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.coal.itemID)
		{
			StructureGeneratorBase gen = new WorldGenUnique();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenUnique.SOUTH);
			gen.setOffset(0, 0, 9);
			gen.addBlockArray(Snowman1.blockArraySnowman1);
			gen.addBlockArray(Snowman2.blockArraySnowman2);
			gen.addBlockArray(Snowman3.blockArraySnowman3);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Snow Man");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.fermentedSpiderEye.itemID)
		{
			StructureGeneratorBase gen = new WorldGenUnique();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenUnique.EAST);
			gen.setOffset(-14, 0, 0);
			gen.addBlockArray(WizardShop1.blockArrayWizardShop1);
			gen.addBlockArray(WizardShop2.blockArrayWizardShop2);
			gen.addBlockArray(WizardShop3.blockArrayWizardShop3);
			gen.addBlockArray(WizardShop4.blockArrayWizardShop4);
			gen.addBlockArray(WizardShop5.blockArrayWizardShop5);
			gen.addBlockArray(WizardShop6.blockArrayWizardShop6);
			gen.generate(world, rand, i, j - 1, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Wizard Shop");
			}
			equipped.stackSize--;
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.pumpkinLantern.blockID)
		{
			StructureGeneratorBase gen = new WorldGenUnique();
			gen.setPlayerFacing(entityplayer);
			gen.setStructureFacing(WorldGenUnique.SOUTH);
			gen.setOffset(0, 0, 11);
			gen.addBlockArray(ScaryHouse1.blockArrayScaryHouse1);
			gen.addBlockArray(ScaryHouse2.blockArrayScaryHouse2);
			gen.generate(world, rand, i, j, k);
			
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Scary");
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