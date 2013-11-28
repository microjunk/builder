package builder.structures.npc;

import net.minecraft.block.Block;

public class NPCSmallStorage
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int CUSTOM_CHEST1 = 4116;

	public static final int[][][][] blockArrayNPCSmallStorage =
	{
		{//y = 0
			{//x = 0
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 1
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 2
				{Block.stairsCobblestone.blockID, 2},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 3
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			}
		},
		{//y = 1
			{//x = 0
				{0},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
			},
			{//x = 1
				{0},
				{Block.cobblestone.blockID},
				{0},
				{Block.chest.blockID, 2},
				{Block.cobblestone.blockID},
			},
			{//x = 2
				{0},
				{Block.doorWood.blockID, 1},
				{0},
				{0},
				{Block.cobblestone.blockID},
			},
			{//x = 3
				{0},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
			}			
		},
		{//y = 2
			{//x = 0
				{0},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
			},
			{//x = 1
				{0},
				{Block.cobblestone.blockID},
				{Block.torchWood.blockID, 3},
				{0},
				{Block.cobblestone.blockID},
			},
			{//x = 2
				{0},
				{Block.doorWood.blockID, 10},
				{0},
				{0},
				{Block.cobblestone.blockID},
			},
			{//x = 3
				{0},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
			}
		},
		{//y = 3
			{//x = 0
				{0},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
			},
			{//x = 1
				{0},
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 2
				{0},
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 3
				{0},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
			}}};
}