package builder.structures.viking;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class VikingTower
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int CUSTOM_CHEST1 = 4116, SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayTower =
	{
		{//y = 0
			{//x = 0
				{0},{Block.wood.blockID, 1},{0},{0},{0},{Block.wood.blockID, 1}
			},
			{//x = 1
				{0},{0},{Block.fence.blockID},{Block.wood.blockID, 1},{Block.fence.blockID},{0}
			},
			{//x = 2
				{0},{0},{0},{Block.ladder.blockID, 5},{0},{0}
			},
			{//x = 3
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 4
				{0},{Block.wood.blockID, 1},{0},{0},{0},{Block.wood.blockID, 1}
			}
		},
		{//y = 1
			{//x = 0
				{0},{Block.wood.blockID, 1},{0},{0},{0},{Block.wood.blockID, 1}
			},
			{//x = 1
				{0},{0},{Block.fence.blockID},{Block.wood.blockID, 1},{Block.fence.blockID},{0}
			},
			{//x = 2
				{0},{0},{0},{Block.ladder.blockID, 5},{0},{0}
			},
			{//x = 3
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 4
				{0},{Block.wood.blockID, 1},{0},{0},{0},{Block.wood.blockID, 1}
			}
		},
		{//y = 2
			{//x = 0
				{0},{Block.wood.blockID, 1},{0},{0},{0},{Block.wood.blockID, 1}
			},
			{//x = 1
				{0},{0},{Block.fence.blockID},{Block.wood.blockID, 1},{Block.fence.blockID},{0}
			},
			{//x = 2
				{0},{0},{0},{Block.ladder.blockID, 5},{0},{0}
			},
			{//x = 3
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 4
				{0},{Block.wood.blockID, 1},{0},{0},{0},{Block.wood.blockID, 1}
			}
		},
		{//y = 3
			{//x = 0
				{0},{Block.wood.blockID, 1},{0},{0},{0},{Block.wood.blockID, 1}
			},
			{//x = 1
				{0},{0},{Block.fence.blockID},{Block.wood.blockID, 1},{Block.fence.blockID},{0}
			},
			{//x = 2
				{0},{0},{0},{Block.ladder.blockID, 5},{0},{0}
			},
			{//x = 3
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 4
				{0},{Block.wood.blockID, 1},{0},{0},{0},{Block.wood.blockID, 1}
			}
		},
		{//y = 4
			{//x = 0
				{0},{Block.wood.blockID, 1},{Block.fence.blockID},{Block.fence.blockID},{Block.fence.blockID},{Block.wood.blockID, 1}
			},
			{//x = 1
				{0},{Block.fence.blockID},{Block.woodSingleSlab.blockID, 1},{Block.wood.blockID, 1},{Block.woodSingleSlab.blockID, 1},{Block.fence.blockID}
			},
			{//x = 2
				{0},{Block.fence.blockID},{Block.woodSingleSlab.blockID, 1},{Block.ladder.blockID, 5},{Block.woodSingleSlab.blockID, 1},{Block.fence.blockID}
			},
			{//x = 3
				{0},{Block.fence.blockID},{Block.woodSingleSlab.blockID, 1},{Block.woodSingleSlab.blockID, 1},{Block.woodSingleSlab.blockID, 1},{Block.fence.blockID}
			},
			{//x = 4
				{0},{Block.wood.blockID, 1},{Block.fence.blockID},{Block.fence.blockID},{Block.fence.blockID},{Block.wood.blockID, 1}
			}
		},
		{//y = 5
			{//x = 0
				{0},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{Block.woodDoubleSlab.blockID, 1},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},
			},
			{//x = 1
				{0},{Block.stairsWoodSpruce.blockID, 1},{0},{Block.torchWood.blockID, 0, 1},{0},{Block.stairsWoodSpruce.blockID, 1},
			},
			{//x = 2
				{0},{Block.woodDoubleSlab.blockID, 1},{Block.torchWood.blockID, 0, 3},{0},{Block.torchWood.blockID, 0, 4},{Block.woodDoubleSlab.blockID, 1},
			},
			{//x = 3
				{0},{Block.stairsWoodSpruce.blockID, 0},{0},{Block.torchWood.blockID, 0, 2},{0},{Block.stairsWoodSpruce.blockID, 0},
			},
			{//x = 4
				{0},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{Block.woodDoubleSlab.blockID, 1},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},
			}
		},
		{//y = 6
			{//x = 0
				{0},{Block.wood.blockID, 1},{0},{0},{0},{Block.wood.blockID, 1},
			},
			{//x = 1
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 2
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 3
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 4
				{0},{Block.wood.blockID, 1},{0},{0},{0},{Block.wood.blockID, 1},
			}
		},
		{//y = 7
			{//x = 0
				{0},{Block.wood.blockID, 1},{Block.fence.blockID},{Block.fence.blockID},{Block.fence.blockID},{Block.wood.blockID, 1},
			},
			{//x = 1
				{0},{Block.fence.blockID},{0},{0},{0},{Block.fence.blockID},
			},
			{//x = 2
				{0},{Block.fence.blockID},{0},{0},{0},{Block.fence.blockID},
			},
			{//x = 3
				{0},{Block.fence.blockID},{0},{0},{0},{Block.fence.blockID},
			},
			{//x = 4
				{0},{Block.wood.blockID, 1},{Block.fence.blockID},{Block.fence.blockID},{Block.fence.blockID},{Block.wood.blockID, 1},
			}
		},
		{//y = 8
			{//x = 0
				{0},{Block.woodSingleSlab.blockID, 1},{Block.stairsWoodSpruce.blockID, 0},{Block.stairsWoodSpruce.blockID, 0},{Block.stairsWoodSpruce.blockID, 0},{Block.woodSingleSlab.blockID, 1},
			},
			{//x = 1
				{0},{Block.stairsWoodSpruce.blockID, 2},{Block.woodSingleSlab.blockID, 1},{Block.woodSingleSlab.blockID, 1},{Block.woodSingleSlab.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},
			},
			{//x = 2
				{0},{Block.stairsWoodSpruce.blockID, 2},{Block.woodSingleSlab.blockID, 1},{0},{Block.woodSingleSlab.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},
			},
			{//x = 3
				{0},{Block.stairsWoodSpruce.blockID, 2},{Block.woodSingleSlab.blockID, 1},{Block.woodSingleSlab.blockID, 1},{Block.woodSingleSlab.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},
			},
			{//x = 4
				{0},{Block.woodSingleSlab.blockID, 1},{Block.stairsWoodSpruce.blockID, 1},{Block.stairsWoodSpruce.blockID, 1},{Block.stairsWoodSpruce.blockID, 1},{Block.woodSingleSlab.blockID, 1},
			}
		},
		{//y = 9
			{//x = 0
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{0},{0},{Block.stairsWoodSpruce.blockID, 0},{0},{0}
			},
			{//x = 2
				{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0}
			},
			{//x = 3
				{0},{0},{0},{Block.stairsWoodSpruce.blockID, 1},{0},{0}
			},
			{//x = 4
				{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 10
			{//x = 0
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 2
				{0},{0},{0},{Block.fence.blockID},{0},{0}
			},
			{//x = 3
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 4
				{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 11
			{//x = 0
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 2
				{0},{0},{Block.cloth.blockID, 1, 14},{Block.fence.blockID},{0},{0}
			},
			{//x = 3
				{0},{Block.cloth.blockID, 1, 14},{0},{0},{0},{0}
			},
			{//x = 4
				{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 12
			{//x = 0
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 2
				{0},{0},{Block.cloth.blockID, 1, 14},{Block.fence.blockID},{0},{0}
			},
			{//x = 3
				{Block.cloth.blockID, 1, 14},{Block.cloth.blockID, 1, 14},{0},{0},{0},{0}
			},
			{//x = 4
				{Block.cloth.blockID, 1, 14},{0},{0},{0},{0},{0}
			}}};
}