package builder.structures.npc;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class NPCGardens
{
	public static final int[][][][] blockArrayNPCBigGarden =
	{
		{// y = 0
			{// x = 0
				{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID}
			},
			{//x = 1
				{Block.wood.blockID},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.wood.blockID}
			},
			{//x = 2
				{Block.wood.blockID},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.wood.blockID}
			},
			{//x = 3
				{Block.wood.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.wood.blockID}
			},
			{//x = 4
				{Block.wood.blockID},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.wood.blockID}
			},
			{//x = 5
				{Block.wood.blockID},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.wood.blockID}
			},
			{//x = 6
				{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID}
			},
			{//x = 7
				{Block.wood.blockID},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.wood.blockID}
			},
			{//x = 8
				{Block.wood.blockID},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.wood.blockID}
			},
			{//x = 9
				{Block.wood.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.wood.blockID}
			},
			{//x = 10
				{Block.wood.blockID},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.wood.blockID}
			},
			{//x = 11
				{Block.wood.blockID},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.wood.blockID}
			},
			{//x = 12
				{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID}
			}}};
	
	public static final int[][][][] blockArrayNPCSmallGarden =
	{
		{// y = 0
			{// x = 0
				{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID}
			},
			{//x = 1
				{Block.wood.blockID},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.wood.blockID}
			},
			{//x = 2
				{Block.wood.blockID},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.wood.blockID}
			},
			{//x = 3
				{Block.wood.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.waterStill.blockID},{Block.wood.blockID}
			},
			{//x = 4
				{Block.wood.blockID},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.wood.blockID}
			},
			{//x = 5
				{Block.wood.blockID},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.tilledField.blockID, 7, 0},{Block.wood.blockID}
			},
			{//x = 6
				{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID},{Block.wood.blockID}
				}}};
	
	public static final int[][][][] blockArrayNPCWell =
	{
		{// y = 0
			{// x = 0
				{Block.gravel.blockID}, {Block.gravel.blockID}, {Block.gravel.blockID}, {Block.gravel.blockID}, {Block.gravel.blockID}, {Block.gravel.blockID}
			},
			{//x = 1
				{Block.gravel.blockID}, {Block.cobblestone.blockID}, {Block.cobblestone.blockID}, {Block.cobblestone.blockID}, {Block.cobblestone.blockID}, {Block.gravel.blockID}
			},
			{//x = 2
				{Block.gravel.blockID}, {Block.cobblestone.blockID}, {Block.waterStill.blockID}, {Block.waterStill.blockID}, {Block.cobblestone.blockID}, {Block.gravel.blockID}
			},
			{//x = 3
				{Block.gravel.blockID}, {Block.cobblestone.blockID}, {Block.waterStill.blockID}, {Block.waterStill.blockID}, {Block.cobblestone.blockID}, {Block.gravel.blockID}
			},
			{//x = 4
				{Block.gravel.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.gravel.blockID}
			},
			{//x = 5
				{Block.gravel.blockID},{Block.gravel.blockID},{Block.gravel.blockID},{Block.gravel.blockID},{Block.gravel.blockID},{Block.gravel.blockID}
			}
		},
		{//y = 1
			{//x = 0
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 2
				{0},{Block.cobblestone.blockID},{0},{0},{Block.cobblestone.blockID},{0}
			},
			{//x = 3
				{0},{Block.cobblestone.blockID},{0},{0},{Block.cobblestone.blockID},{0}
			},
			{//x = 4
				{0},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{Block.cobblestone.blockID},{0}
			},
			{//x = 5
				{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 2
			{//x = 0
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{Block.fence.blockID},{0},{0},{Block.fence.blockID},{0}
			},
			{//x = 2
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 3
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 4
				{0},{Block.fence.blockID},{0},{0},{Block.fence.blockID},{0}
			},
			{//x = 5
				{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 3
			{//x = 0
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 1
				{0},{Block.fence.blockID},{0},{0},{Block.fence.blockID},{0}
			},
			{//x = 2
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 3
				{0},{0},{0},{0},{0},{0}
			},
			{//x = 4
				{0},{Block.fence.blockID},{0},{0},{Block.fence.blockID},{0}
			},
			{//x = 5
				{0},{0},{0},{0},{0},{0}
			}
		},
		{//y = 4
			{//x = 0
				{0},{0},{0},{0},{0},{0}
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