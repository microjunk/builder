package builder.blocks;

import net.minecraft.block.Block;
import builder.Builder;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockNetherEscape extends Block
{

	public BlockNetherEscape(int i, int j)
	{
		super(i, Material.portal);
		this.setCreativeTab(Builder.tabBuilder);
	}
	public void registerIcons(IconRegister var1)
    {
        this.blockIcon = var1.registerIcon("builder:portal");
    }
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
	
	public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        if (par5Entity.ridingEntity == null && par5Entity.riddenByEntity == null && par5Entity instanceof EntityPlayer && !par1World.isRemote)
        {
            ((EntityPlayer)par5Entity).travelToDimension(1);
        }
    }
    
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    
}