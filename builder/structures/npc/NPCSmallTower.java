package builder.structures.npc;

import net.minecraft.block.Block;

public class NPCSmallTower
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int CUSTOM_CHEST1 = 4116, SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayNPCSmallTower =
	{
		{//y = 0
			{//x = 0
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{0},
			},
			{//x = 1
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{0},
			},
			{//x = 2
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.stairsCobblestone.blockID, 3},
			},
			{//x = 3
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{0},
			}
		},
		{//y = 1
			{//x = 0
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{0},
			},
			{//x = 1
				{Block.wood.blockID},
				{Block.ladder.blockID, 3},
				{0},
				{Block.fence.blockID},
				{Block.wood.blockID},
				{0},
			},
			{//x = 2
				{Block.wood.blockID},
				{0},
				{0},
				{0},
				{Block.doorWood.blockID, 3},
				{0},
			},
			{//x = 3
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{0},
			}
		},
		{//y = 2
			{//x = 0
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.thinGlass.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
				{0},
			},
			{//x = 1
				{Block.planks.blockID},
				{Block.ladder.blockID, 3},
				{0},
				{Block.pressurePlatePlanks.blockID},
				{Block.planks.blockID},
				{0},
			},
			{//x = 2
				{Block.planks.blockID},
				{0},
				{0},
				{0},
				{Block.doorWood.blockID, 11},
				{0},
			},
			{//x = 3
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.thinGlass.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
				{0},
			}
		},
		{//y = 3
			{//x = 0
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
				{0},
			},
			{//x = 1
				{Block.planks.blockID},
				{Block.ladder.blockID, 3},
				{0},
				{0},
				{Block.planks.blockID},
				{0},
			},
			{//x = 2
				{Block.planks.blockID},
				{0},
				{0},
				{Block.torchWood.blockID, 4},
				{Block.planks.blockID},
				{0},
			},
			{//x = 3
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
				{0},
			}
		},
		{//y = 4
			{//x = 0
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{0},
			},
			{//x = 1
				{Block.cobblestone.blockID},
				{Block.ladder.blockID, 3},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{0},
			},
			{//x = 2
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{0},
			},
			{//x = 3
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{0},
			}
		},
		{//y = 5
			{//x = 0
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{0},
			},
			{//x = 1
				{Block.wood.blockID},
				{Block.ladder.blockID, 3},
				{0},
				{0},
				{Block.wood.blockID},
				{0},
			},
			{//x = 2
				{Block.wood.blockID},
				{0},
				{0},
				{Block.chest.blockID, 2},
				{Block.wood.blockID},
				{0},
			},
			{//x = 3
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{0},
			}
		},
		{//y = 6
			{//x = 0
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.thinGlass.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
				{0},
			},
			{//x = 1
				{Block.planks.blockID},
				{0},
				{0},
				{0},
				{Block.planks.blockID},
				{0},
			},
			{//x = 2
				{Block.planks.blockID},
				{0},
				{0},
				{0},
				{Block.planks.blockID},
				{0},
			},
			{//x = 3
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.thinGlass.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
				{0},
			}
		},
		{//y = 7
			{//x = 0
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
				{0},
			},
			{//x = 1
				{Block.planks.blockID},
				{0},
				{0},
				{Block.torchWood.blockID, 4},
				{Block.planks.blockID},
				{0},
			},
			{//x = 2
				{Block.planks.blockID},
				{0},
				{0},
				{0},
				{Block.planks.blockID},
				{0},
			},
			{//x = 3
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
				{0},
			}
		},
		{//y = 8
			{//x = 0
				{0},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{0},
				{0},
			},
			{//x = 1
				{Block.wood.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.wood.blockID},
				{0},
			},
			{//x = 2
				{Block.wood.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.wood.blockID},
				{0},
			},
			{//x = 3
				{0},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{0},
				{0},
			}}};
}