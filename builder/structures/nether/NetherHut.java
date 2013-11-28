package builder.structures.nether;

import net.minecraft.block.Block;

public class NetherHut
{
	public static final int SPAWN_VILLAGER = 4100;
	
	public static final int[][][][] blockArrayNetherHut =
		{
			{// y = 0
				{//x = 0
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
				},
				{//x = 1
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
				},
				{//x = 2
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
				},
				{//x = 3
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
				},
				{//x = 4
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
				},
				{//x = 5
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
					{Block.netherrack.blockID},
				}			
			},
			{//y = 1
				{//x = 0
					{Block.obsidian.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.obsidian.blockID},
				},
				{//x = 1
					{Block.netherBrick.blockID},
					{0},
					{0},
					{0},
					{Block.netherBrick.blockID},
				},
				{//x = 2
					{Block.netherBrick.blockID},
					{0},
					{SPAWN_VILLAGER, 1, 5},
					{0},
					{Block.netherBrick.blockID},
				},
				{//x = 3
					{Block.netherBrick.blockID},
					{0},
					{0},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
				},
				{//x = 4
					{Block.netherBrick.blockID},
					{0},
					{0},
					{Block.stairsNetherBrick.blockID, 2},
					{Block.netherBrick.blockID},
				},
				{//x = 5
					{Block.obsidian.blockID},
					{Block.netherBrick.blockID},
					{0},
					{Block.netherBrick.blockID},
					{Block.obsidian.blockID},
				}			
			},
			{//y = 2
				{//x = 0
					{Block.obsidian.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.obsidian.blockID},
				},
				{//x = 1
					{Block.netherBrick.blockID},
					{0},
					{0},
					{0},
					{Block.netherBrick.blockID},
				},
				{//x = 2
					{Block.netherBrick.blockID},
					{0},
					{0},
					{0},
					{Block.netherBrick.blockID},
				},
				{//x = 3
					{Block.netherBrick.blockID},
					{0},
					{0},
					{Block.stairsNetherBrick.blockID, 1},
					{Block.netherBrick.blockID},
				},
				{//x = 4
					{Block.netherBrick.blockID},
					{0},
					{0},
					{0},
					{Block.netherBrick.blockID},
				},
				{//x = 5
					{Block.obsidian.blockID},
					{Block.netherBrick.blockID},
					{0},
					{Block.netherBrick.blockID},
					{Block.obsidian.blockID},
				}			
			},
			{//y = 3
				{//x = 0
					{Block.obsidian.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.obsidian.blockID},
				},
				{//x = 1
					{Block.netherBrick.blockID},
					{0},
					{0},
					{0},
					{Block.netherBrick.blockID},
				},
				{//x = 2
					{Block.netherBrick.blockID},
					{0},
					{0},
					{Block.stairsNetherBrick.blockID, 1},
					{Block.netherBrick.blockID},
				},
				{//x = 3
					{Block.netherBrick.blockID},
					{0},
					{0},
					{0},
					{Block.netherBrick.blockID},
				},
				{//x = 4
					{Block.netherBrick.blockID},
					{0},
					{0},
					{0},
					{Block.netherBrick.blockID},
				},
				{//x = 5
					{Block.obsidian.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.obsidian.blockID},
				}			
			},
			{//y = 4
				{//x = 0
					{Block.netherrack.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.netherrack.blockID},
				},
				{//x = 1
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.stairsNetherBrick.blockID, 1},
					{Block.netherBrick.blockID},
				},
				{//x = 2
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{0},
					{Block.netherBrick.blockID},
				},
				{//x = 3
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{0},
					{Block.netherBrick.blockID},
				},
				{//x = 4
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{0},
					{Block.netherBrick.blockID},
				},
				{//x = 5
					{Block.netherrack.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.netherBrick.blockID},
					{Block.netherrack.blockID},
				}			
			},
			{//y = 5
				{//x = 0
					{Block.fire.blockID, 15},
					{Block.netherFence.blockID},
					{Block.netherFence.blockID},
					{Block.netherFence.blockID},
					{Block.fire.blockID, 15},
				},
				{//x = 1
					{Block.netherFence.blockID},
					{0},
					{0},
					{0},
					{Block.netherFence.blockID},
				},
				{//x = 2
					{Block.netherFence.blockID},
					{0},
					{0},
					{0},
					{Block.netherFence.blockID},
				},
				{//x = 3
					{Block.netherFence.blockID},
					{0},
					{0},
					{0},
					{Block.netherFence.blockID},
				},
				{//x = 4
					{Block.netherFence.blockID},
					{0},
					{0},
					{0},
					{Block.netherFence.blockID},
				},
				{//x = 5
					{Block.fire.blockID, 15},
					{Block.netherFence.blockID},
					{Block.netherFence.blockID},
					{Block.netherFence.blockID},
					{Block.fire.blockID, 15},
				}}};
}
