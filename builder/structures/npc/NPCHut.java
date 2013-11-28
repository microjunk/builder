package builder.structures.npc;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class NPCHut
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayNPCHut =
	{
		{//y = 0
			{//x = 0
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 1
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 2
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 3
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 4
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 5
				{0},{0},{0},{Block.stairsCobblestone.blockID, 1},{0},{0}
			}
		},
		{// y = 1
			{// x = 0 z values:
				{0},{Block.wood.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID},{0}
			},
			{//x = 1
				{0},{Block.planks.blockID},{0},{0},{Block.planks.blockID},{0}
			},
			{//x = 2
				{0},{Block.planks.blockID},{SPAWN_VILLAGER, 1, 0},{0},{Block.planks.blockID},{0}
			},
			{//x = 3
				{0},{Block.planks.blockID},{0},{0},{Block.planks.blockID},{0}
			},
			{//x = 4
				{0},{Block.wood.blockID},{Block.planks.blockID},{Block.doorWood.blockID},{Block.wood.blockID},{0}
			},
			{//x = 5
				{0},{0},{0},{0},{0},{0}
			}
		},
		{// y = 2
			{// x = 0
				{0},{Block.wood.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID},{0}
			},
			{//x = 1
				{0},{Block.planks.blockID},{0},{0},{Block.planks.blockID},{0}
			},
			{//x = 2
				{0},{Block.thinGlass.blockID},{0},{0},{Block.thinGlass.blockID},{0}
			},
			{//x = 3
				{0},{Block.planks.blockID},{0},{0},{Block.planks.blockID},{0}
			},
			{//x = 4
				{0},{Block.wood.blockID},{Block.planks.blockID},{Block.doorWood.blockID, 8},{Block.wood.blockID},{0}
			},
			{//x = 5
				{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 3
			{//x = 0
				{0},{Block.wood.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID},{0}
			},
			{//x = 1
				{0},{Block.planks.blockID},{0},{0},{Block.planks.blockID},{0}
			},
			{//x = 2
				{0},{Block.planks.blockID},{0},{0},{Block.planks.blockID},{0}
			},
			{//x = 3
				{0},{Block.planks.blockID},{0},{0},{Block.planks.blockID},{0}
			},
			{//x = 4
				{0},{Block.wood.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID},{0}
			},
			{//x = 5
				{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 4
			{//x = 0
				{0},{0},{Block.wood.blockID},{Block.wood.blockID},{0},{0}
			},
			{//x = 1
				{0},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{0}
			},
			{//x = 2
				{0},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{0}
			},
			{//x = 3
				{0},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{0}
			},
			{//x = 4
				{0},{0},{Block.wood.blockID},{Block.wood.blockID},{0},{0}
			},
			{//x = 5
				{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 5
			{//x = 0
				{0},{0},{0},{0},{0},{0}
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
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 5
				{0},{0},{0},{0},{0},{0}
			}}};
}