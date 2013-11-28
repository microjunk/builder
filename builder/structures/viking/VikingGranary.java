package builder.structures.viking;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class VikingGranary
{
	public static final int[][][][] blockArrayGranary =
	{
		{//y = 0
			{//x = 0
				{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID}
			},
			{//x = 1
				{Block.grass.blockID},{Block.dirt.blockID},{Block.dirt.blockID},{Block.dirt.blockID},{Block.dirt.blockID},{Block.dirt.blockID},{Block.grass.blockID}
			},
			{//x = 2
				{Block.grass.blockID},{Block.dirt.blockID},{Block.gravel.blockID},{Block.gravel.blockID},{Block.gravel.blockID},{Block.dirt.blockID},{Block.grass.blockID}
			},
			{//x = 3
				{Block.grass.blockID},{Block.dirt.blockID},{Block.gravel.blockID},{Block.gravel.blockID},{Block.gravel.blockID},{Block.dirt.blockID},{Block.grass.blockID}
			},
			{//x = 4
				{Block.grass.blockID},{Block.dirt.blockID},{Block.gravel.blockID},{Block.gravel.blockID},{Block.gravel.blockID},{Block.dirt.blockID},{Block.grass.blockID}
			},
			{//x = 5
				{Block.grass.blockID},{Block.dirt.blockID},{Block.dirt.blockID},{Block.gravel.blockID},{Block.dirt.blockID},{Block.dirt.blockID},{Block.grass.blockID}
			},
			{//x = 6
				{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.gravel.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID}
			},
			{//x = 7
				{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.gravel.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID}
			}
		},
		{//y = 1
			{//x = 0
				{0},{0},{Block.stairsStoneBrick.blockID, 0},{Block.stairsStoneBrick.blockID, 0},{Block.stairsStoneBrick.blockID, 0},{0},{0}
			},
			{//x = 1
				{0},{Block.wood.blockID},{Block.stoneBrick.blockID},{Block.stoneBrick.blockID},{Block.stoneBrick.blockID},{Block.wood.blockID},{0}
			},
			{//x = 2
				{Block.stairsStoneBrick.blockID, 2},{Block.stoneBrick.blockID},{Block.melon.blockID},{Block.melon.blockID},{Block.pumpkin.blockID, 2},{Block.stoneBrick.blockID},{Block.stairsStoneBrick.blockID, 3},
			},
			{//x = 3
				{Block.stairsStoneBrick.blockID, 2},{Block.stoneBrick.blockID},{Block.melon.blockID},{Block.pumpkin.blockID},{Block.pumpkin.blockID},{Block.stoneBrick.blockID},{Block.stairsStoneBrick.blockID, 3},
			},
			{//x = 4
				{Block.stairsStoneBrick.blockID, 2},{Block.stoneBrick.blockID},{0},{0},{Block.pumpkin.blockID, 3},{Block.stoneBrick.blockID},{Block.stairsStoneBrick.blockID, 3},
			},
			{//x = 5
				{0},{Block.wood.blockID},{Block.stoneBrick.blockID},{0},{Block.stoneBrick.blockID},{Block.wood.blockID},{0}
			},
			{//x = 6
				{0},{0},{Block.stairsStoneBrick.blockID, 1},{0},{Block.stairsStoneBrick.blockID, 1},{0},{0}
			},
			{//x = 7
				{0},{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 2
			{//x = 0
				{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{Block.wood.blockID},{Block.stoneBrick.blockID},{Block.stoneBrick.blockID},{Block.stoneBrick.blockID},{Block.wood.blockID},{0}
			},
			{//x = 2
				{0},{Block.stoneBrick.blockID},{Block.melon.blockID},{0},{Block.pumpkin.blockID, 1},{Block.stoneBrick.blockID},{0}
			},
			{//x = 3
				{0},{Block.stoneBrick.blockID},{0},{0},{0},{Block.stoneBrick.blockID},{0}
			},
			{//x = 4
				{0},{Block.stoneBrick.blockID},{0},{0},{0},{Block.stoneBrick.blockID},{0}
			},
			{//x = 5
				{0},{Block.wood.blockID},{Block.stoneBrick.blockID},{0},{Block.stoneBrick.blockID},{Block.wood.blockID},{0}
			},
			{//x = 6
				{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 7
				{0},{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 3
			{//x = 0
				{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{Block.trapdoor.blockID, 2},{Block.stairsStoneBrick.blockID, 0},{Block.stairsStoneBrick.blockID, 0},{Block.stairsStoneBrick.blockID, 0},{Block.trapdoor.blockID, 2},{0}
			},
			{//x = 2
				{0},{Block.stairsStoneBrick.blockID, 2},{Block.stoneBrick.blockID},{Block.stoneBrick.blockID},{Block.stoneBrick.blockID},{Block.stairsStoneBrick.blockID, 3},{0}
			},
			{//x = 3
				{0},{Block.stairsStoneBrick.blockID, 2},{Block.stoneBrick.blockID},{Block.stoneBrick.blockID},{Block.stoneBrick.blockID},{Block.stairsStoneBrick.blockID, 3},{0}
			},
			{//x = 4
				{0},{Block.stairsStoneBrick.blockID, 2},{Block.stoneBrick.blockID},{Block.stoneBrick.blockID},{Block.stoneBrick.blockID},{Block.stairsStoneBrick.blockID, 3},{0}
			},
			{//x = 5
				{0},{Block.trapdoor.blockID, 3},{Block.stairsStoneBrick.blockID, 1},{Block.stairsStoneBrick.blockID, 1},{Block.stairsStoneBrick.blockID, 1},{Block.trapdoor.blockID, 3},{0}
			},
			{//x = 6
				{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 7
				{0},{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 4
			{//x = 0
				{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 2
				{0},{0},{Block.stoneSingleSlab.blockID, 5},{Block.stoneSingleSlab.blockID, 5},{Block.stoneSingleSlab.blockID, 5},{0},{0}
			},
			{//x = 3
				{0},{0},{Block.stoneSingleSlab.blockID, 5},{Block.stoneBrick.blockID},{Block.stoneSingleSlab.blockID, 5},{0},{0}
			},
			{//x = 4
				{0},{0},{Block.stoneSingleSlab.blockID, 5},{Block.stoneSingleSlab.blockID, 5},{Block.stoneSingleSlab.blockID, 5},{0},{0}
			},
			{//x = 5
					{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 6
				{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 7
				{0},{0},{0},{0},{0},{0},{0}
			}}};
}