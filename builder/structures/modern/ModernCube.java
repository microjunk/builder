package builder.structures.modern;

import net.minecraft.block.Block;

public class ModernCube
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int CUSTOM_CHEST1 = 4116, PAINTING = 4112, SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayModernCube =
	{
		{//y = 0
			{//x = 0
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 1
				{Block.blockIron.blockID},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 2
				{Block.blockIron.blockID},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 3
				{Block.blockIron.blockID},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.blockIron.blockID},
				{Block.stairsStoneBrick.blockID, 3},
			},
			{//x = 4
				{Block.blockIron.blockID},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 5
				{Block.blockIron.blockID},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.stainedClay.blockID, 9},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 6
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{0},
			}
		},
		{//y = 1
			{//x = 0
				{Block.blockIron.blockID},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{0},
			},
			{//x = 1
				{Block.planks.blockID, 2},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.glass.blockID},
				{0},
			},
			{//x = 2
				{Block.planks.blockID, 2},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 2},
				{0},
			},
			{//x = 3
				{Block.planks.blockID, 2},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.doorWood.blockID, 3},
				{0},
			},
			{//x = 4
				{Block.planks.blockID, 2},
				{0},
				{0},
				{0},
				{SPAWN_VILLAGER, 1, 15},
				{0},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 5
				{Block.planks.blockID, 2},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.glass.blockID},
				{0},
			},
			{//x = 6
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.blockIron.blockID},
				{0},
			}
		},
		{//y = 2
			{//x = 0
				{Block.blockIron.blockID},
				{Block.glass.blockID},
				{Block.glass.blockID},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{0},
			},
			{//x = 1
				{Block.planks.blockID, 2},
				{0},
				{0},
				{0},
				{PAINTING, 1},
				{0},
				{Block.glass.blockID},
				{0},
			},
			{//x = 2
				{Block.planks.blockID, 2},
				{Block.torchWood.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 2},
				{0},
			},
			{//x = 3
				{Block.planks.blockID, 2},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.doorWood.blockID, 8},
				{0},
			},
			{//x = 4
				{Block.glass.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 5
				{Block.planks.blockID, 2},
				{0},
				{0},
				{0},
				{Block.torchWood.blockID, 2},
				{0},
				{Block.glass.blockID},
				{0},
			},
			{//x = 6
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.glass.blockID},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.blockIron.blockID},
				{0},
			}
		},
		{//y = 3
			{//x = 0
				{Block.blockIron.blockID},
				{Block.glass.blockID},
				{Block.glass.blockID},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{0},
			},
			{//x = 1
				{Block.planks.blockID, 2},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.glass.blockID},
				{0},
			},
			{//x = 2
				{Block.planks.blockID, 2},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 2},
				{0},
			},
			{//x = 3
				{Block.planks.blockID, 2},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 2},
				{0},
			},
			{//x = 4
				{Block.planks.blockID, 2},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 5
				{Block.glass.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.glass.blockID},
				{0},
			},
			{//x = 6
				{Block.planks.blockID, 2},
				{Block.glass.blockID},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.blockIron.blockID},
				{0},
			}
		},
		{//y = 4
			{//x = 0
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 1
				{Block.blockIron.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 2
				{Block.blockIron.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 3
				{Block.blockIron.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 4
				{Block.blockIron.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 5
				{Block.blockIron.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.blockIron.blockID},
				{0},
			},
			{//x = 6
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{Block.blockIron.blockID},
				{0},
			}
		},
		{//y = 5
			{//x = 0
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{0},
			},
			{//x = 1
				{Block.planks.blockID, 2},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.planks.blockID, 2},
				{0},
			},
			{//x = 2
				{Block.planks.blockID, 2},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.planks.blockID, 2},
				{0},
			},
			{//x = 3
				{Block.planks.blockID, 2},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.planks.blockID, 2},
				{0},
			},
			{//x = 4
				{Block.planks.blockID, 2},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.planks.blockID, 2},
				{0},
			},
			{//x = 5
				{Block.planks.blockID, 2},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.netherBrick.blockID},
				{Block.planks.blockID, 2},
				{0},
			},
			{//x = 6
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{Block.planks.blockID, 2},
				{0},
			}}};
}