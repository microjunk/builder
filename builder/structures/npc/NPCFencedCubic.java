package builder.structures.npc;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class NPCFencedCubic
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayNPCFenced =
	{
		{//y = 0
			{//x = 0
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 1
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 2
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 3
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 4
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			}
		},
		{//y = 1
			{//x = 0
				{Block.cobblestone.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.cobblestone.blockID}
			},
			{//x = 1
				{Block.planks.blockID},{0},{0},{Block.ladder.blockID, 5},{Block.planks.blockID}
			},
			{//x = 2
				{Block.planks.blockID},{0},{SPAWN_VILLAGER, 1, 5},{0},{Block.planks.blockID}
			},
			{//x = 3
				{Block.planks.blockID},{0},{0},{0},{Block.planks.blockID}
			},
			{//x = 4
				{Block.cobblestone.blockID},{Block.planks.blockID},{0},{Block.planks.blockID},{Block.cobblestone.blockID}
			}
		},
		{//y = 2
			{//x = 0
				{Block.cobblestone.blockID},{Block.planks.blockID},{Block.thinGlass.blockID},{Block.planks.blockID},{Block.cobblestone.blockID}
			},
			{//x = 1
				{Block.planks.blockID},{0},{0},{Block.ladder.blockID, 5},{Block.planks.blockID}
			},
			{//x = 2
				{Block.thinGlass.blockID},{0},{0},{0},{Block.thinGlass.blockID}
			},
			{//x = 3
				{Block.planks.blockID},{0},{0},{0},{Block.planks.blockID}
			},
			{//x = 4
				{Block.cobblestone.blockID},{Block.planks.blockID},{0},{Block.planks.blockID},{Block.cobblestone.blockID}
			}
		},
		{//y = 3
			{//x = 0
				{Block.cobblestone.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.cobblestone.blockID}
			},
			{//x = 1
				{Block.planks.blockID},{0},{0},{Block.ladder.blockID, 5},{Block.planks.blockID}
			},
			{//x = 2
				{Block.planks.blockID},{0},{0},{0},{Block.planks.blockID}
			},
			{//x = 3
				{Block.planks.blockID},{0},{Block.torchWood.blockID, 2},{0},{Block.planks.blockID}
			},
			{//x = 4
				{Block.cobblestone.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.cobblestone.blockID}
			}
		},
		{//y = 4
			{//x = 0
				{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID}
			},
			{//x = 1
				{Block.wood.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.ladder.blockID, 5},{Block.wood.blockID}
			},
			{//x = 2
				{Block.wood.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID}
			},
			{//x = 3
				{Block.wood.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID}
			},
			{//x = 4
				{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID}
			}
		},
		{//y = 5
			{//x = 0
				{Block.fence.blockID},{Block.fence.blockID},{Block.fence.blockID},{Block.fence.blockID},{Block.fence.blockID}
			},
			{//x = 1
				{Block.fence.blockID},{0},{0},{0},{Block.fence.blockID}
			},
			{//x = 2
				{Block.fence.blockID},{0},{0},{0},{Block.fence.blockID}
			},
			{//x = 3
				{Block.fence.blockID},{0},{0},{0},{Block.fence.blockID}
			},
			{//x = 4{Block.fence.blockID},
				{Block.fence.blockID},{Block.fence.blockID},
				{Block.fence.blockID},{Block.fence.blockID}
				}}};
}