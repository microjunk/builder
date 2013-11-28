package builder.structures.oriental;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class JapanDietyShrines
{
	public static final int[][][][] blockArrayDiety =
	{
		{//y = 0
			{//x = 0
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 1
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 2
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 3
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 4
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 5
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 6
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 7
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			},
			{//x = 8
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID}
			}
		},
		{//y = 1
			{//x = 0
				{0},
				{Block.stoneSingleSlab.blockID},
				{Block.stoneSingleSlab.blockID},
				{Block.stoneSingleSlab.blockID}
			},
			{//x = 1
				{0},
				{Block.stoneSingleSlab.blockID},
				{Block.torchWood.blockID, 5},
				{0}
			},
			{//x = 2
				{0},
				{Block.stoneDoubleSlab.blockID},
				{Block.wood.blockID},
				{Block.pressurePlatePlanks.blockID}
			},
			{//x = 3
				{0},
				{Block.stoneSingleSlab.blockID},
				{0},
				{0}
			},
			{//x = 4
				{0},
				{Block.stoneDoubleSlab.blockID},
				{Block.wood.blockID},
				{Block.pressurePlatePlanks.blockID}
			},
			{//x = 5
				{0},
				{Block.stoneSingleSlab.blockID},
				{0},
				{0}
			},
			{//x = 6
				{0},
				{Block.stoneDoubleSlab.blockID},
				{Block.wood.blockID},
				{Block.pressurePlatePlanks.blockID}
			},
			{//x = 7
				{0},
				{Block.stoneSingleSlab.blockID},
				{Block.torchWood.blockID, 5},
				{0}
			},
			{//x = 8
				{0},
				{Block.stoneSingleSlab.blockID},
				{Block.stoneSingleSlab.blockID},
				{Block.stoneSingleSlab.blockID}
			}
		},
		{//y = 2
			{//x = 0
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 2
				{Block.signWall.blockID, 2},
				{Block.stainedClay.blockID, 1},
				{Block.trapdoor.blockID, 5},
				{0}
			},
			{//x = 3
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 4
				{Block.signWall.blockID, 2},
				{Block.stainedClay.blockID, 1},
				{Block.trapdoor.blockID, 5},
				{0}
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 6
				{Block.signWall.blockID, 2},
				{Block.stainedClay.blockID, 1},
				{Block.trapdoor.blockID, 5},
				{0}
			},
			{//x = 7
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 8
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
				{0}
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 2
				{Block.stairsCobblestone.blockID, 2},
				{Block.stainedClay.blockID, 1},
				{Block.stairsCobblestone.blockID, 3},
				{0}
			},
			{//x = 3
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 4
				{Block.stairsCobblestone.blockID, 2},
				{Block.stainedClay.blockID, 1},
				{Block.stairsCobblestone.blockID, 3},
				{0}
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 6
				{Block.stairsCobblestone.blockID, 2},
				{Block.stainedClay.blockID, 1},
				{Block.stairsCobblestone.blockID, 3},
				{0}
			},
			{//x = 7
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 8
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
				{0}
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 2
				{0},
				{Block.pressurePlatePlanks.blockID},
				{0},
				{0}
			},
			{//x = 3
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 4
				{0},
				{Block.pressurePlatePlanks.blockID},
				{0},
				{0}
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 6
				{0},
				{Block.pressurePlatePlanks.blockID},
				{0},
				{0}
			},
			{//x = 7
				{0},
				{0},
				{0},
				{0}
			},
			{//x = 8
				{0},
				{0},
				{0},
				{0}
			}}};
}