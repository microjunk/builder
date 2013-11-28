package builder.structures.viking;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class VikingHouse
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayHouse =
	{
		{//y = 0
			{//x = 0
				{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.dirt.blockID},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.dirt.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID}
			},
			{//x = 1
				{Block.grass.blockID},{Block.grass.blockID},{Block.dirt.blockID},{Block.dirt.blockID},{Block.dirt.blockID},{Block.dirt.blockID},{Block.dirt.blockID},{Block.dirt.blockID},{Block.dirt.blockID},{Block.grass.blockID},{Block.grass.blockID}
			},
			{//x = 2
				{Block.grass.blockID},{Block.grass.blockID},{Block.dirt.blockID},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.dirt.blockID},{Block.grass.blockID},{Block.grass.blockID}
			},
			{//x = 3
				{Block.grass.blockID},{Block.grass.blockID},{Block.dirt.blockID},{Block.wood.blockID, 1},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID, 1},{Block.dirt.blockID},{Block.grass.blockID},{Block.grass.blockID}
			},
			{//x = 4
				{Block.grass.blockID},{Block.grass.blockID},{Block.dirt.blockID},{Block.wood.blockID, 1},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID, 1},{Block.dirt.blockID},{Block.grass.blockID},{Block.grass.blockID}
			},
			{//x = 5
				{Block.grass.blockID},{Block.grass.blockID},{Block.dirt.blockID},{Block.wood.blockID, 1},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID, 1},{Block.dirt.blockID},{Block.grass.blockID},{Block.grass.blockID}
			},
			{//x = 6
				{Block.grass.blockID},{Block.grass.blockID},{Block.dirt.blockID},{Block.wood.blockID, 1},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID, 1},{Block.dirt.blockID},{Block.grass.blockID},{Block.grass.blockID}
			},
			{//x = 7
				{Block.grass.blockID},{Block.grass.blockID},{Block.dirt.blockID},{Block.wood.blockID, 1},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID, 1},{Block.dirt.blockID},{Block.grass.blockID},{Block.grass.blockID}
			},
			{//x = 8
				{Block.grass.blockID},{Block.grass.blockID},{Block.dirt.blockID},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.dirt.blockID},{Block.grass.blockID},{Block.grass.blockID}
			},
			{//x = 9
				{Block.grass.blockID},{Block.grass.blockID},{Block.dirt.blockID},{Block.wood.blockID, 1},{Block.dirt.blockID},{Block.wood.blockID, 1},{Block.dirt.blockID},{Block.wood.blockID, 1},{Block.dirt.blockID},{Block.grass.blockID},{Block.grass.blockID}
			},
			{//x = 10
				{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.dirt.blockID},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.dirt.blockID},{Block.grass.blockID},{Block.grass.blockID},{Block.grass.blockID}
			}
		},
		{//y = 1
			{//x = 0
				{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{0},{0},{0},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0},{0}
			},
			{//x = 1
				{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{Block.planks.blockID},{Block.wood.blockID, 1},{Block.stoneDoubleSlab.blockID, 3},{Block.wood.blockID, 1},{Block.planks.blockID},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0}
			},
			{//x = 2
				{0},{Block.stairsWoodSpruce.blockID, 2},{Block.stoneBrick.blockID},{0},{0},{0},{0},{0},{Block.stoneBrick.blockID},{Block.stairsWoodSpruce.blockID, 3},{0}
			},
			{//x = 3
				{0},{Block.stairsWoodSpruce.blockID, 2},{Block.stoneBrick.blockID},{0},{0},{0},{0},{0},{Block.stoneBrick.blockID},{Block.stairsWoodSpruce.blockID, 3},{0}
			},
			{//x = 4
				{0},{Block.stairsWoodSpruce.blockID, 2},{Block.stoneBrick.blockID},{0},{0},{SPAWN_VILLAGER, 1, 52},{0},{0},{Block.stoneBrick.blockID},{Block.stairsWoodSpruce.blockID, 3},{0}
			},
			{//x = 5
				{0},{Block.stairsWoodSpruce.blockID, 2},{Block.stoneBrick.blockID},{0},{0},{0},{0},{0},{Block.stoneBrick.blockID},{Block.stairsWoodSpruce.blockID, 3},{0}
			},
			{//x = 6
				{0},{Block.stairsWoodSpruce.blockID, 2},{Block.stoneBrick.blockID},{0},{0},{0},{0},{0},{Block.stoneBrick.blockID},{Block.stairsWoodSpruce.blockID, 3},{0}
			},
			{//x = 7
				{0},{Block.stairsWoodSpruce.blockID, 2},{Block.stoneBrick.blockID},{0},{0},{0},{0},{0},{Block.stoneBrick.blockID},{Block.stairsWoodSpruce.blockID, 3},{0}
			},
			{//x = 8
				{0},{Block.stairsWoodSpruce.blockID, 2},{Block.stoneBrick.blockID},{0},{0},{0},{0},{0},{Block.stoneBrick.blockID},{Block.stairsWoodSpruce.blockID, 3},{0}
			},
			{//x = 9
				{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{Block.torchWood.blockID, 2},{Block.wood.blockID, 1},{Block.doorWood.blockID},{Block.wood.blockID, 1},{Block.torchWood.blockID, 2},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0}
			},
			{//x = 10
				{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{0},{0},{0},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0},{0}
			}
		},
		{//y = 2
			{//x = 0
				{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{0},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0}
			},
			{//x = 1
				{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{Block.torchWood.blockID, 1},{Block.wood.blockID, 1},{Block.torchWood.blockID, 1},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0},{0}
			},
			{//x = 2
				{0},{0},{Block.stairsWoodSpruce.blockID, 2},{0},{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 3},{0},{0}
			},
			{//x = 3
				{0},{Block.torchWood.blockID, 4},{Block.wood.blockID, 1},{0},{0},{0},{0},{0},{Block.wood.blockID, 1},{Block.torchWood.blockID, 3},{0}
			},
			{//x = 4
				{0},{0},{Block.stairsWoodSpruce.blockID, 2},{0},{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 3},{0},{0}
			},
			{//x = 5
				{0},{0},{Block.stairsWoodSpruce.blockID, 2},{0},{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 3},{0},{0}
			},
			{//x = 6
				{0},{0},{Block.stairsWoodSpruce.blockID, 2},{0},{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 3},{0},{0}
			},
			{//x = 7
				{0},{Block.torchWood.blockID, 4},{Block.wood.blockID, 1},{0},{0},{0},{0},{0},{Block.wood.blockID, 1},{Block.torchWood.blockID, 3},{0}
			},
			{//x = 8
				{0},{0},{Block.stairsWoodSpruce.blockID, 2},{0},{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 3},{0},{0}
			},
			{//x = 9
				{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.doorWood.blockID, 8},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0},{0}
			},
			{//x = 10
				{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{0},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0}
			}
		},
		{//y = 3
			{//x = 0
				{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{Block.planks.blockID},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0}
			},
			{//x = 2
				{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0}
			},
			{//x = 3
				{0},{Block.stoneSingleSlab.blockID, 3},{Block.stoneSingleSlab.blockID, 3},{Block.stairsCobblestone.blockID, 2},{0},{0},{0},{Block.stairsCobblestone.blockID, 3},{Block.stoneSingleSlab.blockID, 3},{Block.stoneSingleSlab.blockID, 3},{0}
			},
			{//x = 4
				{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0}
			},
			{//x = 5
				{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0}
			},
			{//x = 6
				{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0}
			},
			{//x = 7
				{0},{Block.stoneSingleSlab.blockID, 3},{Block.stoneSingleSlab.blockID, 3},{Block.stairsCobblestone.blockID, 2},{0},{0},{0},{Block.stairsCobblestone.blockID, 3},{Block.stoneSingleSlab.blockID, 3},{Block.stoneSingleSlab.blockID, 3},{0}
			},
			{//x = 8
				{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0}
			},
			{//x = 9
				{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0}
			},
			{//x = 10
				{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0},{0}
			}
		},
		{//y = 4
			{//x = 0
				{0},{0},{0},{0},{0},{Block.stairsCobblestone.blockID},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0},{0}
			},
			{//x = 2
				{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.planks.blockID},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0},{0}
			},
			{//x = 3
				{0},{0},{0},{0},{Block.stairsCobblestone.blockID, 2},{Block.planks.blockID},{Block.stairsCobblestone.blockID, 3},{0},{0},{0},{0}
			},
			{//x = 4
				{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.planks.blockID},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0},{0}
			},
			{//x = 5
				{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.planks.blockID},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0},{0}
			},
			{//x = 6
				{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.planks.blockID},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0},{0}
			},
			{//x = 7
				{0},{0},{0},{0},{Block.stairsCobblestone.blockID, 2},{Block.planks.blockID},{Block.stairsCobblestone.blockID, 3},{0},{0},{0},{0}
			},
			{//x = 8
				{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.planks.blockID},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0},{0}
			},
			{//x = 9
				{0},{0},{0},{0},{Block.stairsWoodSpruce.blockID, 2},{Block.wood.blockID, 1},{Block.stairsWoodSpruce.blockID, 3},{0},{0},{0},{0}
			},
			{//x = 10
				{0},{0},{0},{0},{0},{Block.stairsCobblestone.blockID, 1},{0},{0},{0},{0},{0}
			}
		},
		{//y = 5
			{//x = 0
				{0},{0},{0},{0},{0},{Block.stairsCobblestone.blockID},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID, 3},{0},{0},{0},{0},{0}
			},
			{//x = 2
				{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID, 3},{0},{0},{0},{0},{0}
			},
			{//x = 3
				{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID, 3},{0},{0},{0},{0},{0}
			},
			{//x = 4
				{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID, 3},{0},{0},{0},{0},{0}
			},
			{//x = 5
				{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID, 3},{0},{0},{0},{0},{0}
			},
			{//x = 6
				{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID, 3},{0},{0},{0},{0},{0}
			},
			{//x = 7
				{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID, 3},{0},{0},{0},{0},{0}
			},
			{//x = 8
				{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID, 3},{0},{0},{0},{0},{0}
			},
			{//x = 9
				{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID, 3},{0},{0},{0},{0},{0}
			},
			{//x = 10
				{0},{0},{0},{0},{0},{Block.stairsCobblestone.blockID, 1},{0},{0},{0},{0},{0}
			}}};
}