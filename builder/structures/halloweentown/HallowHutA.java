package builder.structures.halloweentown;

import net.minecraft.block.Block;

public class HallowHutA
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayHutA =
	{
		{//y = 0
			{//x = 0
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 1
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 2
				{Block.cobblestone.blockID},
				{Block.pumpkinLantern.blockID, 3},
				{Block.pumpkinLantern.blockID, 3},
				{Block.cobblestone.blockID},
			},
			{//x = 3
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 4
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 5
				{0},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{0},
			}
		},
		{//y = 1
			{//x = 0
				{Block.wood.blockID},
				{Block.leaves.blockID, 4},
				{Block.leaves.blockID, 4},
				{Block.wood.blockID},
			},
			{//x = 1
				{Block.leaves.blockID, 4},
				{0},
				{0},
				{Block.leaves.blockID, 4},
			},
			{//x = 2
				{Block.leaves.blockID, 4},
				{0},
				{SPAWN_VILLAGER, 1, 11},//Villager
				{Block.leaves.blockID, 4},
			},
			{//x = 3
				{Block.leaves.blockID, 4},
				{0},
				{0},
				{Block.leaves.blockID, 4},
			},
			{//x = 4
				{Block.pumpkinLantern.blockID, 3},
				{Block.doorWood.blockID, 2},
				{Block.doorWood.blockID, 2},
				{Block.pumpkinLantern.blockID, 3},
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
			}
		},
		{//y = 2
			{//x = 0
				{Block.wood.blockID},
				{Block.leaves.blockID, 4},
				{Block.leaves.blockID, 4},
				{Block.wood.blockID},
			},
			{//x = 1
				{Block.leaves.blockID, 4},
				{0},
				{0},
				{Block.leaves.blockID, 4},
			},
			{//x = 2
				{Block.thinGlass.blockID},
				{0},
				{0},
				{Block.thinGlass.blockID},
			},
			{//x = 3
				{Block.leaves.blockID, 4},
				{0},
				{0},
				{Block.leaves.blockID, 4},
			},
			{//x = 4
				{Block.wood.blockID},
				{Block.doorWood.blockID, 9},
				{Block.doorWood.blockID, 8},
				{Block.wood.blockID},
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
			}
		},
		{//y = 3
			{//x = 0
				{Block.wood.blockID},
				{Block.leaves.blockID, 4},
				{Block.leaves.blockID, 4},
				{Block.wood.blockID},
			},
			{//x = 1
				{Block.leaves.blockID, 4},
				{0},
				{0},
				{Block.leaves.blockID, 4},
			},
			{//x = 2
				{Block.leaves.blockID, 4},
				{0},
				{0},
				{Block.leaves.blockID, 4},
			},
			{//x = 3
				{Block.leaves.blockID, 4},
				{0},
				{0},
				{Block.leaves.blockID, 4},
			},
			{//x = 4
				{Block.wood.blockID},
				{Block.leaves.blockID, 4},
				{Block.leaves.blockID, 4},
				{Block.wood.blockID},
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
			}
		},
		{//y = 4
			{//x = 0
				{Block.pumpkin.blockID, 1},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.pumpkin.blockID, 1},
			},
			{//x = 1
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
			},
			{//x = 2
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
			},
			{//x = 3
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
			},
			{//x = 4
				{Block.pumpkin.blockID, 3},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.pumpkin.blockID, 3},
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
			}
		},
		{//y = 5
			{//x = 0
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 1
				{0},
				{Block.pumpkin.blockID, 1},
				{Block.pumpkin.blockID, 1},
				{0},
			},
			{//x = 2
				{0},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{0},
			},
			{//x = 3
				{0},
				{Block.pumpkin.blockID, 3},
				{Block.pumpkin.blockID, 3},
				{0},
			},
			{//x = 4
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
			}
		},
		{//y = 6
			{//x = 0
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 1
				{0},
				{Block.torchWood.blockID, 5},
				{Block.torchWood.blockID, 5},
				{0},
			},
			{//x = 2
				{0},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{0},
			},
			{//x = 3
				{0},
				{Block.torchWood.blockID, 5},
				{Block.torchWood.blockID, 5},
				{0},
			},
			{//x = 4
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
			}
		},
		{//y = 7
			{//x = 0
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 2
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
			},
			{//x = 3
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 4
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
			}
		},
		{//y = 8
			{//x = 0
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 2
				{Block.torchWood.blockID, 5},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.torchWood.blockID, 5},
			},
			{//x = 3
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 4
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
			}
		},
		{//y = 9
			{//x = 0
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 2
				{0},
				{Block.pumpkin.blockID, 3},
				{Block.pumpkin.blockID, 3},
				{0},
			},
			{//x = 3
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 4
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 5
				{0},
				{0},
				{0},
				{0},
			}}};
}