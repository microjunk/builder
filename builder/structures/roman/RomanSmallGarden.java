package builder.structures.roman;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class RomanSmallGarden
{
	public static final int[][][][] blockArraySmallGarden =
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
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{Block.sandStone.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.sandStone.blockID},
			},
			{//x = 2
				{Block.sandStone.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.sandStone.blockID},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.sandStone.blockID},
			},
			{//x = 4
				{Block.sandStone.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.sandStone.blockID},
			},
			{//x = 5
				{Block.sandStone.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.sandStone.blockID},
			},
			{//x = 6
				{Block.sandStone.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.sandStone.blockID},
			},
			{//x = 7
				{Block.sandStone.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.sandStone.blockID},
			},
			{//x = 8
				{Block.sandStone.blockID},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 2},
				{Block.waterStill.blockID, 1},
				{Block.waterStill.blockID, 8},
				{Block.waterStill.blockID, 1},
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
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			}
		},
		{//y = 1
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
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
			},
			{//x = 1
				{Block.sandStone.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.sandStone.blockID},
			},
			{//x = 2
				{Block.sandStone.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.sandStone.blockID},
			},
			{//x = 3
				{Block.sandStone.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.sandStone.blockID},
			},
			{//x = 4
				{Block.sandStone.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.sandStone.blockID},
			},
			{//x = 5
				{Block.sandStone.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.sandStone.blockID},
			},
			{//x = 6
				{Block.sandStone.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.sandStone.blockID},
			},
			{//x = 7
				{Block.sandStone.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.sandStone.blockID},
			},
			{//x = 8
				{Block.sandStone.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
				{Block.dirt.blockID},
				{Block.tilledField.blockID, 7},
				{Block.waterStill.blockID},
				{Block.tilledField.blockID, 7},
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
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
				{Block.sandStone.blockID},
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
				{0},
				{0},
			},
			{//x = 1
				{0},
				{Block.carrot.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.melonStem.blockID, 7},
				{0},
				{Block.pumpkinStem.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.potato.blockID, 7},
				{0},
			},
			{//x = 2
				{0},
				{Block.carrot.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.melonStem.blockID, 7},
				{0},
				{Block.pumpkinStem.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.potato.blockID, 7},
				{0},
			},
			{//x = 3
				{0},
				{Block.carrot.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.melonStem.blockID, 7},
				{0},
				{Block.pumpkinStem.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.potato.blockID, 7},
				{0},
			},
			{//x = 4
				{0},
				{Block.carrot.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.melonStem.blockID, 7},
				{0},
				{Block.pumpkinStem.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.potato.blockID, 7},
				{0},
			},
			{//x = 5
				{0},
				{Block.carrot.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.melonStem.blockID, 7},
				{0},
				{Block.pumpkinStem.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.potato.blockID, 7},
				{0},
			},
			{//x = 6
				{0},
				{Block.carrot.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.melonStem.blockID, 7},
				{0},
				{Block.pumpkinStem.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.potato.blockID, 7},
				{0},
			},
			{//x = 7
				{0},
				{Block.carrot.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.melonStem.blockID, 7},
				{0},
				{Block.pumpkinStem.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.potato.blockID, 7},
				{0},
			},
			{//x = 8
				{0},
				{Block.carrot.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.melonStem.blockID, 7},
				{0},
				{Block.pumpkinStem.blockID, 7},
				{0},
				{Block.crops.blockID, 7},
				{0},
				{Block.potato.blockID, 7},
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
				{0},
				{0},
				{0},
			}}};
}