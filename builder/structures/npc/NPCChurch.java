package builder.structures.npc;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class NPCChurch
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayNPCChurch =
	{
		{//y = 0
			{//x = 0
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 1
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 2
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 3
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 4
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 5
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 6
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 7
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 8
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 9
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 10
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 11
				{0},{0},{0},{Block.stairsCobblestone.blockID, 1},{0},{0}
			}
		},
		{//y = 1
			{//x = 0
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 1
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 2
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 3
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 4
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.stairsCobblestone.blockID, 1},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 5
				{0},{Block.cobblestone.blockID},{Block.stairsCobblestone.blockID, 1},{0},{Block.stairsCobblestone.blockID, 1},{Block.cobblestone.blockID}
			},
			{//x = 6
				{0},{Block.cobblestone.blockID},{0},{SPAWN_VILLAGER, 1, 2},{0},{Block.cobblestone.blockID}
			},
			{//x = 7
				{0},{Block.cobblestone.blockID},{0},{0},{Block.ladder.blockID, 2},{Block.cobblestone.blockID}
			},
			{//x = 8
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 9
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 10
				{0},{0},{Block.cobblestone.blockID},{Block.doorWood.blockID, 2},{Block.cobblestone.blockID},{0}
			},
			{//x = 11
				{0}, {0}, {0}, {0}, {0}, {0}
			}
		},
		{//y = 2
			{//x = 0
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 1
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 2
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 3
				{0},{Block.cobblestone.blockID},{Block.stairsCobblestone.blockID, 3},{0},{Block.stairsCobblestone.blockID, 2},{Block.cobblestone.blockID}
			},
			{//x = 4
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 5
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 6
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 7
				{0},{Block.cobblestone.blockID},{0},{0},{Block.ladder.blockID, 2},{Block.cobblestone.blockID}
			},
			{//x = 8
				{0},{Block.thinGlass.blockID},{0},{0},{0},{Block.thinGlass.blockID}
			},
			{//x = 9
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 10
				{0},{0},{Block.cobblestone.blockID},{Block.doorWood.blockID, 8},{Block.cobblestone.blockID},{0}
			},
			{//x = 11
				{0}, {0}, {0}, {0}, {0}, {0}
			}
		},
		{//y = 3
			{//x = 0
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 1
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 2
				{0},{0},{Block.cobblestone.blockID},{Block.thinGlass.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 3
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 4
				{0},{Block.thinGlass.blockID},{0},{0},{0},{Block.thinGlass.blockID}
			},
			{//x = 5
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 6
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 7
				{0},{Block.cobblestone.blockID},{0},{0},{Block.ladder.blockID, 2},{Block.cobblestone.blockID}
			},
			{//x = 8
				{0},{Block.thinGlass.blockID},{0},{0},{0},{Block.thinGlass.blockID}
			},
			{//x = 9
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 10
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 11
				{0}, {0}, {0}, {0}, {0}, {0}
			}
		},
		{//y = 4
			{//x = 0
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 1
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 2
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 3
				{0},{Block.cobblestone.blockID},{0},{Block.torchWood.blockID, 1},{0},{Block.cobblestone.blockID}
			},
			{//x = 4
				{0},{Block.cobblestone.blockID},{Block.torchWood.blockID, 3},{0},{Block.torchWood.blockID, 4},{Block.cobblestone.blockID}
			},
			{//x = 5
				{0},{Block.cobblestone.blockID},{0},{Block.torchWood.blockID, 2},{0},{Block.cobblestone.blockID}
			},
			{//x = 6
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 7
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.ladder.blockID, 2},{Block.cobblestone.blockID}
			},
			{//x = 8
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 9
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 10
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 11
				{0}, {0}, {0}, {0}, {0}, {0}
			}
		},
		{//y = 5
			{//x = 0
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 1
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 2
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 3
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 4
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 5
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 6
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 7
				{0},{Block.cobblestone.blockID},{0},{0},{Block.ladder.blockID, 2},{Block.cobblestone.blockID}
			},
			{//x = 8
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 9
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 10
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 11
				{0}, {0}, {0}, {0}, {0}, {0}
			}
		},
		{//y = 6
			{//x = 0
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 1
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 2
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 3
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 4
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 5
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 6
				{0},{0},{Block.cobblestone.blockID},{Block.thinGlass.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 7
				{0},{Block.cobblestone.blockID},{0},{0},{Block.ladder.blockID, 2},{Block.cobblestone.blockID}
			},
			{//x = 8
				{0},{Block.thinGlass.blockID},{0},{0},{0},{Block.thinGlass.blockID}
			},
			{//x = 9
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 10
				{0},{0},{Block.cobblestone.blockID},{Block.thinGlass.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 11
				{0}, {0}, {0}, {0}, {0}, {0}
			}
		},
		{//y = 7
			{//x = 0
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 1
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 2
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 3
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 4
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 5
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 6
				{0},{0},{Block.cobblestone.blockID},{Block.thinGlass.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 7
				{0},{Block.cobblestone.blockID},{0},{0},{Block.ladder.blockID, 2},{Block.cobblestone.blockID}
			},
			{//x = 8
				{0},{Block.thinGlass.blockID},{0},{0},{0},{Block.thinGlass.blockID}
			},
			{//x = 9
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 10
				{0},{0},{Block.cobblestone.blockID},{Block.thinGlass.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 11
				{0}, {0}, {0}, {0}, {0}, {0}
			}
		},
		{//y = 8
			{//x = 0
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 1
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 2
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 3
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 4
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 5
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 6
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 7
				{0},{Block.cobblestone.blockID},{0},{0},{Block.ladder.blockID, 2},{Block.cobblestone.blockID}
			},
			{//x = 8
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 9
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 10
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 11
				{0}, {0}, {0}, {0}, {0}, {0}
			}
		},
		{//y = 9
			{//x = 0
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 1
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 2
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 3
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 4
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 5
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 6
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 7
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 8
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 9
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 10
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 11
				{0}, {0}, {0}, {0}, {0}, {0}
			}
		},
		{//y = 10
			{//x = 0
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 1
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 2
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 3
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 4
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 5
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 6
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 7
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 8
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 9
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 10
				{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 11
				{0}, {0}, {0}, {0}, {0}, {0}
			}
		},
		{//y = 11
			{//x = 0
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 1
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 2
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 3
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 4
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 5
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 6
				{0},{0},{0},{Block.cobblestone.blockID},{0},{0}
			},
			{//x = 7
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 8
				{0},{Block.cobblestone.blockID},{0},{0},{0},{Block.cobblestone.blockID}
			},
			{//x = 9
				{0}, {0}, {0}, {0}, {0}, {0}
			},
			{//x = 10
				{0},{0},{0},{Block.cobblestone.blockID},{0},{0}
			},
			{//x = 11
				{0}, {0}, {0}, {0}, {0}, {0}																																							
				}}};
}