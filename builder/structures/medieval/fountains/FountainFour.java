package builder.structures.medieval.fountains;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class FountainFour
{
	public static final int[][][][] blockArrayFountainFour =
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
				{Block.glowStone.blockID},
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
				{Block.glowStone.blockID},
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
				{Block.glowStone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 6
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
				{Block.cobblestone.blockID}
			},
			{//x = 10
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
				{Block.cobblestone.blockID}
			}
		},
		{//y = 1
			{//x = 0
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneSingleSlab.blockID},
				{0},
				{0},
				{0}
			},
			{//x = 1
				{0},
				{0},
				{Block.stoneSingleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 1},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneSingleSlab.blockID},
				{0},
				{0}
			},
			{//x = 2
				{0},
				{Block.stoneSingleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneSingleSlab.blockID},
				{0}
			},
			{//x = 3
				{Block.stoneSingleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneSingleSlab.blockID}
			},
			{//x = 4
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID, 1},
				{Block.stoneDoubleSlab.blockID}
			},
			{//x = 5
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 1},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID, 1},
				{Block.stoneDoubleSlab.blockID}
			},
			{//x = 6
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 1},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 1},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID, 1},
				{Block.stoneDoubleSlab.blockID}
			},
			{//x = 7
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 2},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 1},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID, 1},
				{Block.stoneDoubleSlab.blockID}
			},
			{//x = 8
				{Block.stoneSingleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 9},
				{Block.waterStill.blockID, 1},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 1},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneSingleSlab.blockID}
			},
			{//x = 9
				{0},
				{Block.stoneSingleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID, 1},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneSingleSlab.blockID},
				{0}
			},
			{//x = 10
				{0},
				{0},
				{Block.stoneSingleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneSingleSlab.blockID},
				{0},
				{0}
			},
			{//x = 11
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneSingleSlab.blockID},
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
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
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
				{0}
			},
			{//x = 3
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
			{//x = 4
				{Block.fence.blockID},
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
				{Block.fence.blockID}
			},
			{//x = 5
				{Block.fence.blockID},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 9},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.fence.blockID}
			},
			{//x = 6
				{Block.fence.blockID},
				{0},
				{0},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID, 9},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.fence.blockID}
			},
			{//x = 7
				{Block.fence.blockID},
				{0},
				{0},
				{Block.stoneDoubleSlab.blockID},
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID, 9},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.fence.blockID}
			},
			{//x = 8
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 9},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 9
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
				{0}
			},
			{//x = 11
				{0},
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
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
				{0}
			},
			{//x = 3
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
				{0}
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
				{Block.waterStill.blockID, 1},
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
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID, 1},
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
				{Block.stoneDoubleSlab.blockID},
				{Block.waterStill.blockID},
				{Block.waterStill.blockID, 1},
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
				{Block.waterStill.blockID, 1},
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
				{0}
			},
			{//x = 3
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
				{0}
			},
			{//x = 6
				{0},
				{0},
				{0},
				{Block.fence.blockID},
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
				{Block.fence.blockID},
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
				{0}
			},
			{//x = 9
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
				{0}
			},
			{//x = 3
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
				{0}
			},
			{//x = 6
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{Block.glowStone.blockID},
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
				{Block.fence.blockID},
				{Block.glowStone.blockID},
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
				{0}
			},
			{//x = 9
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
				{0}
			},
			{//x = 3
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
				{0}
			},
			{//x = 6
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{Block.fence.blockID},
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
				{Block.fence.blockID},
				{Block.fence.blockID},
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
				{0}
			},
			{//x = 9
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
				{0}
			},
			{//x = 3
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
				{0}
			},
			{//x = 9
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
				{0}																
			}}};
}