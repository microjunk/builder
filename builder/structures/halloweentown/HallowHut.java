package builder.structures.halloweentown;

import net.minecraft.block.Block;

public class HallowHut
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int SPAWN_VILLAGER = 4100, CUSTOM_SKULL = 4113;

	public static final int[][][][] blockArrayHut =
	{
		{//y = 0
			{//x = 0
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
			},
			{//x = 1
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
			},
			{//x = 2
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
			},
			{//x = 3
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
			},
			{//x = 4
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
				{Block.cobblestoneMossy.blockID},
			},
			{//x = 5
				{0},
				{Block.stairsCobblestone.blockID, 1},
				{0},
				{0},
			}			
		},
		{//y = 1
			{//x = 0
				{Block.wood.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.wood.blockID, 1},
			},
			{//x = 1
				{Block.planks.blockID, 1},
				{SPAWN_VILLAGER, 1, 11},//Villager
				{Block.bed.blockID, 9},
				{Block.planks.blockID, 1},
			},
			{//x = 2
				{Block.planks.blockID, 1},
				{0},
				{Block.bed.blockID, 1},
				{Block.planks.blockID, 1},
			},
			{//x = 3
				{Block.planks.blockID, 1},
				{0},
				{0},
				{Block.planks.blockID, 1},
			},
			{//x = 4
				{Block.wood.blockID, 1},
				{Block.doorWood.blockID, 2},
				{Block.planks.blockID, 1},
				{Block.wood.blockID, 1},
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
				{Block.wood.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.wood.blockID, 1},
			},
			{//x = 1
				{Block.planks.blockID, 1},
				{0},
				{0},
				{Block.planks.blockID, 1},
			},
			{//x = 2
				{Block.thinGlass.blockID},
				{0},
				{0},
				{Block.thinGlass.blockID},
			},
			{//x = 3
				{Block.planks.blockID, 1},
				{0},
				{0},
				{Block.web.blockID},
			},
			{//x = 4
				{Block.wood.blockID, 1},
				{Block.doorWood.blockID, 8},
				{Block.planks.blockID, 1},
				{Block.wood.blockID, 1},
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
				{Block.wood.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.wood.blockID, 1},
			},
			{//x = 1
				{Block.planks.blockID, 1},
				{0},
				{Block.web.blockID},
				{Block.planks.blockID, 1},
			},
			{//x = 2
				{Block.planks.blockID, 1},
				{0},
				{0},
				{Block.planks.blockID, 1},
			},
			{//x = 3
				{Block.planks.blockID, 1},
				{0},
				{0},
				{Block.planks.blockID, 1},
			},
			{//x = 4
				{Block.wood.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.wood.blockID, 1},
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
				{0},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{0},
			},
			{//x = 1
				{Block.wood.blockID, 1},
				{0},
				{0},
				{Block.wood.blockID, 1},
			},
			{//x = 2
				{Block.wood.blockID, 1},
				{0},
				{0},
				{Block.wood.blockID, 1},
			},
			{//x = 3
				{Block.wood.blockID, 1},
				{0},
				{0},
				{Block.wood.blockID, 1},
			},
			{//x = 4
				{Block.pumpkinLantern.blockID, 3},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{CUSTOM_SKULL, 5, 1},
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
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{0},
			},
			{//x = 2
				{0},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{0},
			},
			{//x = 3
				{0},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
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