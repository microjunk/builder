package builder.structures.npc;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class NPCBigHouseGarden
{
	/** Some predefined values for custom hooks that I use in the demo 
	 * structure 
	 **/
	public static final int CUSTOM_CHEST1 = 4116, SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayNPCBigHouseGarden =
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
				{Block.grass.blockID},
				{Block.grass.blockID},
			},
			{//x = 1
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			},
			{//x = 2
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			},
			{//x = 3
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			},
			{//x = 4
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			},
			{//x = 5
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			},
			{//x = 6
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			},
			{//x = 7
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
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
			},
			{//x = 9
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			},
			{//x = 10
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
				{Block.grass.blockID},
			},
			{//x = 11
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
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{Block.fence.blockID},
				{0},
				{0},
			},
			{//x = 1
				{Block.fence.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
			},
			{//x = 2
				{Block.fence.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
			},
			{//x = 3
				{Block.fence.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
			},
			{//x = 4
				{Block.fence.blockID},
				{0},
				{Block.stairsCobblestone.blockID},
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
			},
			{//x = 5
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 6
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 7
				{Block.cobblestone.blockID},
				{Block.woodDoubleSlab.blockID},
				{Block.woodDoubleSlab.blockID},
				{Block.woodDoubleSlab.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 8
				{Block.cobblestone.blockID},
				{Block.woodDoubleSlab.blockID},
				{Block.woodDoubleSlab.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 9
				{Block.cobblestone.blockID},
				{Block.woodDoubleSlab.blockID},
				{Block.woodDoubleSlab.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 10
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 11
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.stairsCobblestone.blockID, 1},
				{0},
				{0},
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
			},
			{//x = 5
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.doorWood.blockID, 2},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 6
				{Block.cobblestone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.stairsWoodOak.blockID, 1},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 7
				{Block.cobblestone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.fence.blockID},
				{Block.stairsWoodOak.blockID, 2},
				{Block.cobblestone.blockID},
			},
			{//x = 8
				{Block.cobblestone.blockID},
				{0},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
				{SPAWN_VILLAGER, 1, 0},
				{0},
				{Block.cobblestone.blockID},
			},
			{//x = 9
				{Block.cobblestone.blockID},
				{Block.furnaceIdle.blockID, 4},
				{0},
				{Block.fence.blockID},
				{0},
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
			},
			{//x = 10
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
				{Block.doorWood.blockID, 2},
				{Block.cobblestone.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 11
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
			},
			{//x = 5
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.doorWood.blockID, 8},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.thinGlass.blockID},
				{Block.thinGlass.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 6
				{Block.wood.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.wood.blockID},
			},
			{//x = 7
				{Block.thinGlass.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.pressurePlatePlanks.blockID},
				{0},
				{Block.thinGlass.blockID},
			},
			{//x = 8
				{Block.thinGlass.blockID},
				{0},
				{0},
				{Block.pressurePlatePlanks.blockID},
				{0},
				{0},
				{0},
				{0},
				{Block.thinGlass.blockID},
			},
			{//x = 9
				{Block.wood.blockID},
				{0},
				{0},
				{Block.pressurePlatePlanks.blockID},
				{0},
				{0},
				{0},
				{0},
				{Block.wood.blockID},
			},
			{//x = 10
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.thinGlass.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.doorWood.blockID, 8},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 11
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
			},
			{//x = 4
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
			},
			{//x = 5
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 6
				{Block.cobblestone.blockID},
				{0},
				{Block.torchWood.blockID, 1},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
			},
			{//x = 7
				{Block.cobblestone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
			},
			{//x = 8
				{Block.cobblestone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.cobblestone.blockID},
			},
			{//x = 9
				{Block.cobblestone.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.torchWood.blockID, 2},
				{0},
				{Block.cobblestone.blockID},
			},
			{//x = 10
				{Block.cobblestone.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.cobblestone.blockID},
			},
			{//x = 11
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
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
			},
			{//x = 5
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
			},
			{//x = 6
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
			},
			{//x = 7
				{Block.planks.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID},
			},
			{//x = 8
				{Block.planks.blockID},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{0},
				{Block.planks.blockID},
			},
			{//x = 9
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
			},
			{//x = 10
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
			},
			{//x = 11
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
		{//y = 6
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
			},
			{//x = 6
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
			},
			{//x = 7
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
			},
			{//x = 8
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
				{Block.planks.blockID},
			},
			{//x = 9
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
			},
			{//x = 10
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
			{//x = 11
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
		{//y = 7
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
			},
			{//x = 7
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
				{Block.stairsWoodOak.blockID},
			},
			{//x = 8
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
				{Block.stairsWoodOak.blockID, 1},
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
			},
			{//x = 10
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
			{//x = 11
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