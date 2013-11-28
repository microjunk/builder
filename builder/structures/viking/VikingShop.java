package builder.structures.viking;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class VikingShop
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int CUSTOM_CHEST1 = 4116, SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayShop =
	{
		{//y = 0
			{//x = 0
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.wood.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			},
			{//x = 1
				{Block.grass.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.wood.blockID},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.grass.blockID},
			},
			{//x = 2
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
			},
			{//x = 3
				{Block.wood.blockID},
				{Block.dirt.blockID},
				{Block.wood.blockID, 1},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.wood.blockID, 1},
				{Block.dirt.blockID},
				{Block.wood.blockID},
			},
			{//x = 4
				{Block.wood.blockID},
				{Block.dirt.blockID},
				{Block.wood.blockID, 1},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.wood.blockID, 1},
				{Block.cobblestone.blockID},
				{Block.wood.blockID},
			},
			{//x = 5
				{Block.wood.blockID},
				{Block.dirt.blockID},
				{Block.wood.blockID, 1},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.wood.blockID, 1},
				{Block.dirt.blockID},
				{Block.wood.blockID},
			},
			{//x = 6
				{Block.dirt.blockID},
				{Block.dirt.blockID},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.dirt.blockID},
				{Block.dirt.blockID},
			},
			{//x = 7
				{Block.grass.blockID},
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
			},
			{//x = 8
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			}
		},
		{//y = 1
			{//x = 0
				{0},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsWoodSpruce.blockID},
				{0},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsWoodSpruce.blockID},
				{0},
			},
			{//x = 1
				{Block.stairsWoodSpruce.blockID},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.doorWood.blockID, 2},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.stairsWoodSpruce.blockID},
			},
			{//x = 2
				{Block.wood.blockID},
				{Block.planks.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID},
				{Block.wood.blockID},
			},
			{//x = 3
				{0},
				{Block.wood.blockID, 1},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.wood.blockID, 1},
				{0},
			},
			{//x = 4
				{0},
				{Block.cobblestone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
				{0},
			},
			{//x = 5
				{0},
				{Block.wood.blockID, 1},
				{0},
				{0},
				{0},
				{SPAWN_VILLAGER, 1, 51},
				{0},
				{0},
				{0},
				{Block.wood.blockID, 1},
				{0},
			},
			{//x = 6
				{Block.wood.blockID},
				{Block.planks.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID},
				{Block.wood.blockID},
			},
			{//x = 7
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.stoneBrick.blockID},
				{Block.stairsWoodSpruce.blockID, 1},
			},
			{//x = 8
				{0},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
			}
		},
		{//y = 2
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
				{0},
			},
			{//x = 1
				{0},
				{Block.stairsWoodSpruce.blockID},
				{Block.fence.blockID},
				{0},
				{Block.fence.blockID},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsWoodSpruce.blockID},
				{Block.doorWood.blockID, 10},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsWoodSpruce.blockID},
				{0},
			},
			{//x = 2
				{Block.stairsWoodSpruce.blockID},
				{Block.wood.blockID, 1},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.wood.blockID, 1},
				{Block.stairsWoodSpruce.blockID},
			},
			{//x = 3
				{Block.wood.blockID},
				{Block.torchWood.blockID, 1},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.torchWood.blockID, 1},
				{Block.wood.blockID},
			},
			{//x = 4
				{0},
				{Block.wood.blockID, 1},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.wood.blockID, 1},
				{0},
			},
			{//x = 5
				{Block.wood.blockID},
				{Block.torchWood.blockID, 1},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.torchWood.blockID, 1},
				{Block.wood.blockID},
			},
			{//x = 6
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.wood.blockID, 1},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.wood.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
			},
			{//x = 7
				{0},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{0},
			},
			{//x = 8
				{0},
				{0},
				{0},
				{0},
				{Block.torchWood.blockID, 1},
				{0},
				{0},
				{0},
				{Block.torchWood.blockID, 1},
				{0},
				{0},
				{0},
			}
		},
		{//y = 3
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
				{0},
			},
			{//x = 1
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0},
				{0},
			},
			{//x = 2
				{0},
				{Block.stairsWoodSpruce.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsCobblestone.blockID},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsWoodSpruce.blockID},
				{0},
			},
			{//x = 3
				{Block.stairsWoodSpruce.blockID},
				{Block.wood.blockID, 1},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.wood.blockID, 1},
				{Block.stairsWoodSpruce.blockID},
			},
			{//x = 4
				{Block.wood.blockID},
				{Block.planks.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID},
				{Block.wood.blockID},
			},
			{//x = 5
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.wood.blockID, 1},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.wood.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
			},
			{//x = 6
				{0},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsCobblestone.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsCobblestone.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{0},
			},
			{//x = 7
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0},
				{0},
			},
			{//x = 8
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0},
				{0},
				{Block.stoneSingleSlab.blockID, 3},
				{0},
				{0},
				{0},
			}
		},
		{//y = 4
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
				{0},
			},
			{//x = 3
				{0},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsCobblestone.blockID},
				{Block.stairsCobblestone.blockID},
				{Block.stairsCobblestone.blockID},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsCobblestone.blockID},
				{Block.stairsWoodSpruce.blockID},
				{Block.stairsWoodSpruce.blockID},
				{0},
			},
			{//x = 4
				{Block.stairsCobblestone.blockID, 2},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.wood.blockID, 1},
				{Block.stairsCobblestone.blockID, 3},
			},
			{//x = 5
				{0},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsCobblestone.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsCobblestone.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
				{Block.stairsWoodSpruce.blockID, 1},
			},
			{//x = 6
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
				{0},
			}
		},
		{//y = 5
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
				{0},
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
			},
			{//x = 4
				{Block.stairsCobblestone.blockID, 2},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stoneSingleSlab.blockID, 3},
				{Block.stairsCobblestone.blockID, 3},
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
				{0},
			},
			{//x = 6
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
				{0},
			}}};
}