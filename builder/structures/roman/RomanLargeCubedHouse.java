package builder.structures.roman;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class RomanLargeCubedHouse
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayLgCubedHouse =
	{
		{//y = 0
			{//x = 0
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 2
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 4
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 5
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 6
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 7
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 8
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 9
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			}
		},
		{//y = 1
			{//x = 0
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0},
				{Block.stairsSandStone.blockID, 2, 0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
			},
			{//x = 2
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
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
			},
			{//x = 5
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
			},
			{//x = 6
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 7
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
			},
			{//x = 8
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
			},
			{//x = 9
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			}
		},
		{//y = 2
			{//x = 0
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.stairsSandStone.blockID, 2, 0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
			},
			{//x = 2
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
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
			},
			{//x = 5
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
			},
			{//x = 6
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 7
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
			},
			{//x = 8
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
			},
			{//x = 9
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			}
		},
		{//y = 3
			{//x = 0
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.stairsSandStone.blockID, 2, 0},
				{0},
				{0},
				{0},
			},
			{//x = 2
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
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
			},
			{//x = 5
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
			},
			{//x = 6
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 7
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
			},
			{//x = 8
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
			},
			{//x = 9
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			}
		},
		{//y = 4
			{//x = 0
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{Block.stairsSandStone.blockID, 2, 0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 2
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 4
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 5
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 6
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 7
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 8
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 9
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			}
		},
		{//y = 5
			{//x = 0
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 2
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.stairsSandStone.blockID, 3, 0},
				{0},
				{0},
				{0},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
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
			},
			{//x = 5
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
			},
			{//x = 6
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 7
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
			},
			{//x = 8
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
			},
			{//x = 9
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			}
		},
		{//y = 6
			{//x = 0
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 2
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{Block.stairsSandStone.blockID, 3, 0},
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
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
			},
			{//x = 5
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
			},
			{//x = 6
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 7
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
			},
			{//x = 8
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
			},
			{//x = 9
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			}
		},
		{//y = 7
			{//x = 0
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 2
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.stairsSandStone.blockID, 3, 0},
				{0},
				{0},
				{0},
				{0},
				{0},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
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
			},
			{//x = 5
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
			},
			{//x = 6
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 7
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
			},
			{//x = 8
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
			},
			{//x = 9
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			}
		},
		{//y = 8
			{//x = 0
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 2
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.stairsSandStone.blockID, 3, 0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 4
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 5
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 6
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 7
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 8
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 9
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			}
		},
		{//y = 9
			{//x = 0
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 2
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 4
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 5
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 6
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 7
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 8
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 9
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			}
		},
		{//y = 10
			{//x = 0
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 1
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
			},
			{//x = 2
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
			},
			{//x = 3
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
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
			},
			{//x = 5
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
			},
			{//x = 6
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 7
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
			},
			{//x = 8
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
			},
			{//x = 9
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
				{0},
				{0},
				{Block.sandStone.blockID},
			}
		},
		{//y = 11
			{//x = 0
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 2
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 4
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 5
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 6
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 7
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 8
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 9
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			}
		},
		{//y = 12
			{//x = 0
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 2
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 4
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 5
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 6
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 7
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 8
				{Block.sandStone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.sandStone.blockID},
			},
			{//x = 9
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			}
		},
		{//y = 13
			{//x = 0
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
			},
			{//x = 1
				{0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stairsSandStone.blockID},
				{Block.stairsSandStone.blockID},
				{Block.stairsSandStone.blockID},
				{Block.stairsSandStone.blockID},
				{Block.stairsSandStone.blockID},
				{Block.stairsSandStone.blockID},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{0},
			},
			{//x = 2
				{0},
				{Block.stairsSandStone.blockID, 2, 0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.stairsSandStone.blockID, 3, 0},
				{0},
			},
			{//x = 3
				{0},
				{Block.stairsSandStone.blockID, 2, 0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.stairsSandStone.blockID, 3, 0},
				{0},
			},
			{//x = 4
				{0},
				{Block.stairsSandStone.blockID, 2, 0},
				{0},
				{0},
				{0},
				{SPAWN_VILLAGER, 1, 43},
				{0},
				{0},
				{Block.stairsSandStone.blockID, 3, 0},
				{0},
			},
			{//x = 5
				{0},
				{Block.stairsSandStone.blockID, 2, 0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.stairsSandStone.blockID, 3, 0},
				{0},
			},
			{//x = 6
				{0},
				{Block.stairsSandStone.blockID, 2, 0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.stairsSandStone.blockID, 3, 0},
				{0},
			},
			{//x = 7
				{0},
				{Block.stairsSandStone.blockID, 2, 0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.stairsSandStone.blockID, 3, 0},
				{0},
			},
			{//x = 8
				{0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stairsSandStone.blockID, 1, 0},
				{Block.stairsSandStone.blockID, 1, 0},
				{Block.stairsSandStone.blockID, 1, 0},
				{Block.stairsSandStone.blockID, 1, 0},
				{Block.stairsSandStone.blockID, 1, 0},
				{Block.stairsSandStone.blockID, 1, 0},
				{0},
				{0},
			},
			{//x = 9
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
			}
		},
		{//y = 14
			{//x = 0
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
			},
			{//x = 1
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
			},
			{//x = 2
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{0},
				{0},
			},
			{//x = 3
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{0},
				{0},
			},
			{//x = 4
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{0},
				{0},
			},
			{//x = 5
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{0},
				{0},
			},
			{//x = 6
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{0},
				{0},
			},
			{//x = 7
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{Block.stoneSingleSlab.blockID, 1, 0},
				{0},
				{0},
			},
			{//x = 8
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
			},
			{//x = 9
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
			}}};
}