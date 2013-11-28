package builder.structures.medieval.fountains;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class FountainThree
{
	public static final int[][][][] blockArrayFountainThree =
	{
		{//y = 0
			{//x = 0
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 1
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 2
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.glowStone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 3
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 4
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 5
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 6
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.glowStone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.glowStone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 7
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 8
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 9
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 10
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.glowStone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 11
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 12
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			}
		},
		{//y = 1
			{//x = 0
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.waterStill.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 2
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 2},
				{Block.cobblestone.blockID},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0},
				{0}
			},
			{//x = 3
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 1},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0}
			},
			{//x = 4
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 9},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.stoneSingleSlab.blockID, 3},
				{0}
			},
			{//x = 5
				{Block.stoneSingleSlab.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 10},
				{Block.stoneBrick.blockID, 1},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.cobblestone.blockID},
				{Block.stoneSingleSlab.blockID, 3}
			},
			{//x = 6
				{Block.cobblestone.blockID},
				{Block.waterStill.blockID, 3},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 10},
				{Block.stoneBrick.blockID, 1},
				{Block.fence.blockID},
				{Block.stoneBrick.blockID, 1},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 3},
				{Block.cobblestone.blockID}
			},
			{//x = 7
				{Block.stoneSingleSlab.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 10},
				{Block.stoneBrick.blockID, 1},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.cobblestone.blockID},
				{Block.stoneSingleSlab.blockID, 3}
			},
			{//x = 8
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 8},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.stoneSingleSlab.blockID, 3},
				{0}
			},
			{//x = 9
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 1},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0}
			},
			{//x = 10
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 2},
				{Block.cobblestone.blockID},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0},
				{0}
			},
			{//x = 11
				{0},
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.waterStill.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 12
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.cobblestone.blockID},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{0}
			}
		},
		{//y = 2
			{//x = 0
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 2
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 3
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
				{Block.stairsCobblestone.blockID, 3},
				{0},
				{0},
				{0},
				{Block.stairsCobblestone.blockID, 2},
				{Block.cobblestone.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 4
				{0},
				{0},
				{0},
				{Block.stairsCobblestone.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 1},
				{Block.stairsCobblestone.blockID, 1},
				{0},
				{0},
				{0}
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 9},
				{Block.stairsCobblestone.blockID},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 6
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 10},
				{Block.stairsCobblestone.blockID, 2},
				{Block.fence.blockID},
				{Block.stairsCobblestone.blockID, 3},
				{Block.waterStill.blockID, 10},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 7
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 10},
				{Block.stairsCobblestone.blockID, 1},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 9},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 8
				{0},
				{0},
				{0},
				{Block.stairsCobblestone.blockID},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 8},
				{Block.stairsCobblestone.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 9
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
				{Block.stairsCobblestone.blockID, 3},
				{0},
				{0},
				{0},
				{Block.stairsCobblestone.blockID, 2},
				{Block.cobblestone.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 10
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 11
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 12
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			}
		},
		{//y = 3
			{//x = 0
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 2
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 3
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
				{Block.stairsCobblestone.blockID, 2},
				{0},
				{0},
				{0},
				{Block.stairsCobblestone.blockID, 3},
				{Block.cobblestone.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 4
				{0},
				{0},
				{0},
				{Block.stairsCobblestone.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 1},
				{Block.ice.blockID},
				{Block.stairsCobblestone.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 10},
				{0},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 1},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 6
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 10},
				{0},
				{Block.fence.blockID},
				{0},
				{Block.waterStill.blockID, 10},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 7
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 10},
				{0},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 1},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 8
				{0},
				{0},
				{0},
				{Block.stairsCobblestone.blockID, 1},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 10},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID},
				{Block.stairsCobblestone.blockID, 1},
				{0},
				{0},
				{0}
			},
			{//x = 9
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
				{Block.stairsCobblestone.blockID, 2, 0},
				{0},
				{0},
				{0},
				{Block.stairsCobblestone.blockID, 3},
				{Block.cobblestone.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 10
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 11
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 12
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			}
		},
		{//y = 4
			{//x = 0
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 2
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 3
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 4
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
				{Block.waterStill.blockID, 10},
				{0},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 10},
				{Block.stairsCobblestone.blockID},
				{Block.waterStill.blockID, 10},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 6
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 10},
				{Block.stairsCobblestone.blockID, 2},
				{Block.stoneBrick.blockID, 1, 0},
				{Block.stairsCobblestone.blockID, 3},
				{Block.waterStill.blockID, 10},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 7
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 10},
				{Block.stairsCobblestone.blockID, 1, 0},
				{Block.waterStill.blockID, 10},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 8
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
				{Block.waterStill.blockID, 10},
				{0},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 9
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 10
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 11
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 12
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			}
		},
		{//y = 5
			{//x = 0
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 2
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 3
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 4
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 2},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 6
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 7
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 8
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 2},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 9
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 10
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 11
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 12
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			}
		},
		{//y = 6
			{//x = 0
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 2
				{0},
				{0},
				{0},
				{Block.trapdoor.blockID, 6},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.trapdoor.blockID, 6},
				{0},
				{0},
				{0}
			},
			{//x = 3
				{0},
				{0},
				{Block.trapdoor.blockID, 4},
				{Block.glowStone.blockID},
				{Block.trapdoor.blockID, 5},
				{0},
				{0},
				{0},
				{Block.trapdoor.blockID, 4},
				{Block.glowStone.blockID},
				{Block.trapdoor.blockID, 5},
				{0},
				{0}
			},
			{//x = 4
				{0},
				{0},
				{0},
				{Block.trapdoor.blockID, 7},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.trapdoor.blockID, 7},
				{0},
				{0},
				{0}
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 6
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 7
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 8
				{0},
				{0},
				{0},
				{Block.trapdoor.blockID, 6},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.trapdoor.blockID, 6},
				{0},
				{0},
				{0}
			},
			{//x = 9
				{0},
				{0},
				{Block.trapdoor.blockID, 4},
				{Block.glowStone.blockID},
				{Block.trapdoor.blockID, 5},
				{0},
				{0},
				{0},
				{Block.trapdoor.blockID, 4},
				{Block.glowStone.blockID},
				{Block.trapdoor.blockID, 5},
				{0},
				{0}
			},
			{//x = 10
				{0},
				{0},
				{0},
				{Block.trapdoor.blockID, 7},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.trapdoor.blockID, 7},
				{0},
				{0},
				{0}
			},
			{//x = 11
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 12
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			}
		},
		{//y = 7
			{//x = 0
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 2
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 3
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 4
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 6
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 7
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 8
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 9
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 10
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 11
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 12
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0}																							
			}}};
}