package builder.structures.oldwest;

import net.minecraft.block.Block;

public class OldWestBlackSmith1 
{
	/** Some predefined values for custom hooks that I use in the demo 
	 * structure 
	 **/
	public static final int CUSTOM_CHEST1 = 4116, SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayBlackSmith1 =
	{
		{//y = 0
			{//x = 0
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			},
			{//x = 1
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.dirt.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			},
			{//x = 2
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 3
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.cobblestone.blockID},
				{Block.lavaStill.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 4
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.cobblestone.blockID},
				{Block.lavaStill.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 5
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 6
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.gravel.blockID},
				{Block.dirt.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			},
			{//x = 7
				{Block.planks.blockID, 1},
				{Block.planks.blockID, 1},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			}
		},
		{//y = 1
			{//x = 0
				{0},
				{Block.fence.blockID},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 1
				{0},
				{0},
				{Block.planks.blockID, 3},
				{Block.chest.blockID, 5},
				{Block.chest.blockID, 5},
				{Block.stone.blockID},
				{Block.stone.blockID},
				{0},
				{Block.anvil.blockID, 4},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 2
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
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
				{0},
				{Block.cobblestone.blockID},
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
				{Block.cobblestone.blockID},
			},
			{//x = 5
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{SPAWN_VILLAGER, 1, 32},
				{0},
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 6
				{0},
				{0},
				{Block.planks.blockID, 3},
				{Block.workbench.blockID},
				{0},
				{Block.furnaceIdle.blockID, 4},
				{Block.furnaceIdle.blockID, 4},
				{Block.stoneSingleSlab.blockID},
				{Block.anvil.blockID, 2},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 7
				{0},
				{Block.fence.blockID},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{0},
				{0},
			}
		},
		{//y = 2
			{//x = 0
				{0},
				{Block.torchWood.blockID, 5},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 1
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 2
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
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
				{Block.cobblestone.blockID},
				{0},
				{Block.fenceIron.blockID},
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
				{Block.cobblestone.blockID},
				{0},
				{Block.fenceIron.blockID},
			},
			{//x = 5
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 6
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
				{Block.furnaceIdle.blockID, 4},
				{Block.furnaceIdle.blockID, 4},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 7
				{0},
				{Block.torchWood.blockID, 5},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{0},
				{0},
			}
		},
		{//y = 3
			{//x = 0
				{0},
				{0},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.fence.blockID},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.fence.blockID},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 1
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 2
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 3},
				{Block.stairsCobblestone.blockID},
				{Block.stairsCobblestone.blockID, 3},
			},
			{//x = 3
				{0},
				{0},
				{Block.stairsWoodJungle.blockID, 6},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
				{0},
				{Block.stairsCobblestone.blockID, 3},
			},
			{//x = 4
				{0},
				{0},
				{Block.stairsWoodJungle.blockID, 6},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
				{0},
				{Block.stairsCobblestone.blockID, 3},
			},
			{//x = 5
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 3},
				{Block.stairsCobblestone.blockID, 1},
				{Block.stairsCobblestone.blockID, 3},
			},
			{//x = 6
				{0},
				{0},
				{Block.planks.blockID, 3},
				{Block.fence.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 7
				{0},
				{0},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.fence.blockID},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.fence.blockID},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{0},
				{0},
			}
		},
		{//y = 4
			{//x = 0
				{0},
				{Block.stairsWoodSpruce.blockID, 6},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 1
				{0},
				{Block.stairsWoodSpruce.blockID, 6},
				{Block.planks.blockID, 3},
				{Block.web.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 2
				{0},
				{Block.stairsWoodSpruce.blockID, 6},
				{Block.planks.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 3
				{0},
				{Block.stairsWoodSpruce.blockID, 6},
				{Block.planks.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
				{Block.stairsCobblestone.blockID, 3},
				{0},
			},
			{//x = 4
				{0},
				{Block.stairsWoodSpruce.blockID, 6},
				{Block.planks.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
				{Block.stairsCobblestone.blockID, 3},
				{0},
			},
			{//x = 5
				{0},
				{Block.stairsWoodSpruce.blockID, 6},
				{Block.planks.blockID, 3},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 6
				{0},
				{Block.stairsWoodSpruce.blockID, 6},
				{Block.planks.blockID, 3},
				{Block.torchWood.blockID, 5},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID, 3},
				{0},
				{0},
			},
			{//x = 7
				{0},
				{Block.stairsWoodSpruce.blockID, 6},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{Block.planks.blockID, 3},
				{0},
				{0},
			}
		},
		{//y = 5
			{//x = 0
				{0},
				{0},
				{Block.stairsWoodJungle.blockID},
				{Block.stairsWoodJungle.blockID},
				{Block.stairsWoodJungle.blockID},
				{Block.stairsWoodJungle.blockID},
				{Block.stairsWoodJungle.blockID},
				{Block.stairsWoodJungle.blockID},
				{Block.stairsWoodJungle.blockID},
				{Block.stairsWoodJungle.blockID},
				{Block.stairsWoodJungle.blockID, 3},
				{0},
				{0},
			},
			{//x = 1
				{0},
				{0},
				{Block.stairsWoodJungle.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.stairsWoodJungle.blockID, 3},
				{0},
				{0},
			},
			{//x = 2
				{0},
				{0},
				{Block.stairsWoodJungle.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.stairsWoodJungle.blockID, 3},
				{0},
				{0},
			},
			{//x = 3
				{0},
				{0},
				{Block.stairsWoodJungle.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.stairsWoodJungle.blockID, 3},
				{0},
				{0},
			},
			{//x = 4
				{0},
				{0},
				{Block.stairsWoodJungle.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.stairsWoodJungle.blockID, 3},
				{0},
				{0},
			},
			{//x = 5
				{0},
				{0},
				{Block.stairsWoodJungle.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.stairsWoodJungle.blockID, 3},
				{0},
				{0},
			},
			{//x = 6
				{0},
				{0},
				{Block.stairsWoodJungle.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.woodSingleSlab.blockID, 3},
				{Block.stairsWoodJungle.blockID, 3},
				{0},
				{0},
			},
			{//x = 7
				{0},
				{0},
				{Block.stairsWoodJungle.blockID, 1},
				{Block.stairsWoodJungle.blockID, 1},
				{Block.stairsWoodJungle.blockID, 1},
				{Block.stairsWoodJungle.blockID, 1},
				{Block.stairsWoodJungle.blockID, 1},
				{Block.stairsWoodJungle.blockID, 1},
				{Block.stairsWoodJungle.blockID, 1},
				{Block.stairsWoodJungle.blockID, 1},
				{Block.stairsWoodJungle.blockID, 1},
				{0},
				{0},
			}}};
}