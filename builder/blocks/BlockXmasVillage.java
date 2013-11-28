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
import builder.utils.structuregenerator.StructureGeneratorBase;

public class BlockXmasVillage extends BlockFlower
{
	// could use onBlockActivated's parameter world.rand instead of this
	private Random rand;
	
	public BlockXmasVillage(int i)
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
			//StructureGeneratorBase gen = new WorldGenHallow();
			//gen.setPlayerFacing(entityplayer);
			//gen.setStructureFacing(WorldGenHallow.SOUTH);
			//gen.setOffset(0, 0, 8);
			//gen.addBlockArray(BlackSmith.blockArrayBlackSmith);
			//gen.generate(world, rand, i, j - 3, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Black Smith");
			}
			return true;
		}
		if(entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Block.blockIron.blockID)
		{
			//StructureGeneratorBase gen = new WorldGenHallow();
			//gen.setPlayerFacing(entityplayer);
			//gen.setStructureFacing(WorldGenHallow.SOUTH);
			//gen.setOffset(0, 0, 7);
			//gen.addBlockArray(BigCube.blockArrayBigCube);
			//gen.generate(world, rand, i, j - 1, k);
			
			equipped.stackSize--;
			if(!world.isRemote)
			{
				entityplayer.addChatMessage("Building Hallow Big Cube");
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