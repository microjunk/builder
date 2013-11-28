package builder.structures.npc;

import net.minecraft.block.Block;

public class NPCFarmEquipment
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int CUSTOM_CHEST1 = 4116;

	public static final int[][][][] blockArrayNPCFarmEquipment =
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
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 2
				{Block.stairsCobblestone.blockID, 2},
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 3
				{0},
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 4
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
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
			},
			{//x = 1
				{0},
				{Block.planks.blockID},
				{Block.chest.blockID, 5},
				{Block.chest.blockID, 5},
				{Block.planks.blockID},
			},
			{//x = 2
				{0},
				{Block.doorWood.blockID, 1},
				{0},
				{0},
				{Block.planks.blockID},
			},
			{//x = 3
				{0},
				{Block.planks.blockID},
				{Block.workbench.blockID},
				{0},
				{Block.planks.blockID},
			},
			{//x = 4
				{0},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
			}			
		},
		{//y = 2
			{//x = 0
				{0},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
			},
			{//x = 1
				{0},
				{Block.planks.blockID},
				{0},
				{0},
				{Block.planks.blockID},
			},
			{//x = 2
				{0},
				{Block.doorWood.blockID, 10},
				{0},
				{0},
				{Block.thinGlass.blockID},
			},
			{//x = 3
				{0},
				{Block.planks.blockID},
				{0},
				{0},
				{Block.planks.blockID},
			},
			{//x = 4
				{0},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
			}
		},
		{//y = 3
			{//x = 0
				{0},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
			},
			{//x = 1
				{0},
				{Block.planks.blockID},
				{0},
				{0},
				{Block.planks.blockID},
			},
			{//x = 2
				{0},
				{Block.planks.blockID},
				{Block.torchWood.blockID, 3},
				{0},
				{Block.planks.blockID},
			},
			{//x = 3
				{0},
				{Block.planks.blockID},
				{0},
				{0},
				{Block.planks.blockID},
			},
			{//x = 4
				{0},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
			}
		},
		{//y = 4
			{//x = 0
				{0},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
			},
			{//x = 1
				{0},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
			},
			{//x = 2
				{0},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
			},
			{//x = 3
				{0},
				{Block.wood.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
			},
			{//x = 4
				{0},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
				{Block.wood.blockID},
			}}};
}