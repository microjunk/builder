package builder.structures.oriental;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class JapanCrops
{
	public static final int[][][][] blockArrayCrops =
	{
		{//y = 0
			{//x = 0
				{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID}
			},
			{//x = 1
				{Block.grass.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.grass.blockID}
			},
			{//x = 2
				{Block.grass.blockID},{Block.planks.blockID},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.tilledField.blockID, 7},{Block.planks.blockID},{Block.grass.blockID}
			},
			{//x = 3
				{Block.grass.blockID},
				{Block.planks.blockID},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.planks.blockID},
				{Block.grass.blockID}
			},
			{//x = 4
				{Block.grass.blockID},
				{Block.planks.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.planks.blockID},
				{Block.grass.blockID}
			},
			{//x = 5
				{Block.grass.blockID},
				{Block.planks.blockID},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.planks.blockID},
				{Block.grass.blockID},
			},
			{//x = 6
				{Block.grass.blockID},
				{Block.planks.blockID},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.planks.blockID},
				{Block.grass.blockID}
			},
			{//x = 7
				{Block.grass.blockID},
				{Block.stoneDoubleSlab.blockID, 2},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.planks.blockID},
				{Block.grass.blockID}
			},
			{//x = 8
				{Block.grass.blockID},
				{Block.planks.blockID},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.planks.blockID},
				{Block.grass.blockID}
			},
			{//x = 9
				{Block.grass.blockID},
				{Block.planks.blockID},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.planks.blockID},
				{Block.grass.blockID},
			},
			{//x = 10
				{Block.grass.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.grass.blockID}
			},
			{//x = 11
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID}
			}
		},
		{//y = 1
			{//x = 0
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{0}
			},
			{//x = 2
				{0},
				{Block.fence.blockID},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.fence.blockID},
				{0}
			},
			{//x = 3
				{0},
				{Block.fence.blockID},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.fence.blockID},
				{0}
			},
			{//x = 4
				{0},
				{Block.fence.blockID},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.fence.blockID},
				{0}
			},
			{//x = 5
				{0},
				{Block.fence.blockID},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.fence.blockID},
				{0}
			},
			{//x = 6
				{0},
				{Block.fence.blockID},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.fence.blockID},
				{0}
			},
			{//x = 7
				{0},
				{Block.fence.blockID},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.fence.blockID},
				{0}
			},
			{//x = 8
				{0},
				{Block.fence.blockID},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.fence.blockID},
				{0}
			},
			{//x = 9
				{0},
				{Block.fence.blockID},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.crops.blockID, 7},
				{Block.fence.blockID},
				{0}
			},
			{//x = 10
				{0},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{0}
			},
			{//x = 11
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 2
			{//x = 0
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},
				{Block.torchWood.blockID, 5},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.torchWood.blockID, 5},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.torchWood.blockID, 5},
				{0}
			},
			{//x = 2
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 3
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 4
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 5
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 6
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 7
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 8
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 9
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 10
				{0},{Block.torchWood.blockID, 5},{0},{0},{0},{0},{0},{0},{0},{0},{0},{Block.torchWood.blockID, 5},{0},{0},{0},{0},{0},{0},{0},{0},{Block.torchWood.blockID, 5},{0}
			},
			{//x = 11
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 3
			{//x = 0
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 2
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 3
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 4
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 5
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 6
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 7
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 8
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 9
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 10
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 11
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			}}};	
}