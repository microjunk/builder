package builder.structures.npc;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class NPCBlackSmith
{
	/** Some predefined values for custom hooks that I use in the demo 
	 * structure 
	 **/
	public static final int CUSTOM_CHEST1 = 4116, SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayNPCBlackSmith =
	{
		{// y = 0
			{// x = 0
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 1
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 2
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 3
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 4
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 5
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 6
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 7
				{0},{0},{0},{0},{0},{0},{Block.stairsCobblestone.blockID, 1},{Block.stairsCobblestone.blockID, 1},{Block.stairsCobblestone.blockID, 1},{0}
			}
		},
		{//y = 1
			{//x = 0
				{Block.wood.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 1
				{Block.planks.blockID},{Block.planks.blockID},{Block.stairsWoodOak.blockID, 1},{0},{0},{CUSTOM_CHEST1, 5},{Block.cobblestone.blockID},{Block.lavaStill.blockID},{Block.lavaStill.blockID},{Block.cobblestone.blockID}
			},
			{//x = 2
				{Block.planks.blockID},{Block.stairsWoodOak.blockID, 3},{Block.fence.blockID},{0},{SPAWN_VILLAGER, 1, 3},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},
			},
			{//x = 3
				{Block.planks.blockID},{0},{0},{0},{Block.planks.blockID},{Block.planks.blockID},{Block.cobblestone.blockID},{0},{0},{0}
			},
			{//x = 4
				{Block.planks.blockID},{0},{0},{Block.planks.blockID},{0},{0},{0},{0},{0},{0}
			},
			{//x = 5
				{Block.planks.blockID},{0},{0},{0},{0},{0},{0},{0},{Block.anvil.blockID},{0}
			},
			{//x = 6
				{Block.wood.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID},{0},{Block.fence.blockID},{0},{0},{0},{Block.fence.blockID}
			},
			{//x = 7
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 2
			{//x = 0
				{Block.wood.blockID},{Block.planks.blockID},{Block.thinGlass.blockID},{Block.planks.blockID},{Block.thinGlass.blockID},{Block.planks.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 1
				{Block.planks.blockID},{0},{0},{0},{0},{0},{Block.cobblestone.blockID},{0},{0},{Block.fenceIron.blockID}
			},
			{//x = 2
				{Block.thinGlass.blockID},{0},{Block.pressurePlatePlanks.blockID},{0},{0},{0},{Block.cobblestone.blockID},{0},{0},{Block.fenceIron.blockID}
			},
			{//x = 3
				{Block.planks.blockID},{0},{0},{0},{Block.planks.blockID},{Block.planks.blockID},{Block.furnaceIdle.blockID, 5, 0},{0},{0},{0}
			},
			{//x = 4
				{Block.thinGlass.blockID},{0},{0},{Block.planks.blockID},{0},{0},{0},{0},{0},{0}
			},
			{//x = 5
				{Block.planks.blockID},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			},
			{//x = 6
				{Block.wood.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID},{0},{Block.fence.blockID},{0},{0},{0},{Block.fence.blockID}
			},
			{//x = 7
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 3
			{//x 0
				{Block.wood.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 1
				{Block.planks.blockID},{0},{0},{0},{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 2
				{Block.planks.blockID},{0},{0},{0},{0},{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 3
				{Block.planks.blockID},{0},{0},{0},{Block.planks.blockID},{Block.planks.blockID},{Block.furnaceIdle.blockID, 5},{0},{0},{0}
			},
			{//x = 4
				{Block.planks.blockID},{0},{0},{Block.planks.blockID},{0},{0},{0},{0},{0},{0}
			},
			{//x - 5
				{Block.planks.blockID},{0},{0},{Block.planks.blockID},{0},{0},{0},{0},{0},{0}
			},
			{//x = 6
				{Block.wood.blockID},{Block.planks.blockID},{Block.planks.blockID},{Block.wood.blockID},{0},{Block.fence.blockID},{0},{0},{0},{Block.fence.blockID}
			},
			{//x = 7
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 4
			{//x = 0
				{Block.wood.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 1
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 2
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 3
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 4
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 5
				{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 6
				{Block.wood.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.wood.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID}
			},
			{//x = 7
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 5
			{//x = 0
				{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID}
			},
			{//x = 1
				{Block.stoneSingleSlab.blockID},{0},{0},{0},{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID}
			},
			{//x = 2
				{Block.stoneSingleSlab.blockID},{0},{0},{0},{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID}
			},
			{//x = 3
				{Block.stoneSingleSlab.blockID},{0},{0},{0},{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID}
			},
			{//x = 4
				{Block.stoneSingleSlab.blockID},{0},{0},{0},{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID}
			},
			{//x = 5
				{Block.stoneSingleSlab.blockID},{0},{0},{0},{0},{0},{0},{0},{0},{Block.stoneSingleSlab.blockID}
			},
			{//x = 6
				{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID},{Block.stoneSingleSlab.blockID}
			},
			{//x = 7
				{0},{0},{0},{0},{0},{0},{0},{0},{0},{0}
			}}};
}