package builder.structures.halloweentown;

import net.minecraft.block.Block;

public class HallowLantern
{
	public static final int[][][][] blockArrayLantern =
	{
		{// y = 0
			{//x = 0
				{0},
				{0},
				{0},
			},
			{//x = 1
				{0},
				{Block.netherFence.blockID},
				{0},
			},
			{//x = 2
				{0},
				{0},
				{0},
			}			
		},
		{//y = 1
			{//x = 0
				{0},
				{0},
				{0},
			},
			{//x = 1
				{Block.netherFence.blockID},
				{Block.netherFence.blockID},
				{Block.netherFence.blockID},
			},
			{//x = 2
				{0},
				{0},
				{0},
			}			
		},
		{//y = 2
			{//x = 0
				{0},
				{0},
				{0},
			},
			{//x = 1
				{Block.torchWood.blockID},
				{Block.netherFence.blockID},
				{Block.torchWood.blockID},
			},
			{//x = 2
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
			},
			{//x = 1
				{0},
				{Block.pumpkinLantern.blockID, 3},
				{0},
			},
			{//x = 2
				{0},
				{0},
				{0},
			}}};
}