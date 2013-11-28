package builder.structures.jungle;

public class JungleCube
{
	/** Some predefined values for custom hooks that I use in the demo structure */
	public static final int SPAWN_VILLAGER = 4100;

	public static final int[][][][] blockArrayJungleCube =
	{
		{//y = 0
			{//x = 0
				world.setBlock(i + 0, j + 0, k + 0, 0);
				world.setBlock(i + 0, j + 0, k + 1, 0);
				world.setBlock(i + 0, j + 0, k + 2, 0);
				world.setBlock(i + 0, j + 0, k + 3, 0);
				world.setBlock(i + 0, j + 0, k + 4, 0);
				world.setBlock(i + 0, j + 0, k + 5, 0);
				world.setBlock(i + 0, j + 0, k + 6, 0);
				world.setBlock(i + 0, j + 0, k + 7, 0);
				world.setBlock(i + 0, j + 0, k + 8, 0);
				world.setBlock(i + 0, j + 0, k + 9, 0);
				world.setBlock(i + 0, j + 0, k + 10, 0);
				world.setBlock(i + 0, j + 0, k + 11, 0);
				world.setBlock(i + 0, j + 0, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 0, k + 0, 0);
				world.setBlock(i + 1, j + 0, k + 1, 0);
				world.setBlock(i + 1, j + 0, k + 2, 0);
				world.setBlock(i + 1, j + 0, k + 3, 0);
				world.setBlock(i + 1, j + 0, k + 4, 0);
				world.setBlock(i + 1, j + 0, k + 5, 0);
				world.setBlock(i + 1, j + 0, k + 6, 0);
				world.setBlock(i + 1, j + 0, k + 7, 0);
				world.setBlock(i + 1, j + 0, k + 8, 0);
				world.setBlock(i + 1, j + 0, k + 9, 0);
				world.setBlock(i + 1, j + 0, k + 10, 0);
				world.setBlock(i + 1, j + 0, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 0, k + 0, 0);
				world.setBlock(i + 2, j + 0, k + 1, 0);
				world.setBlock(i + 2, j + 0, k + 2, 0);
				world.setBlock(i + 2, j + 0, k + 3, 0);
				world.setBlock(i + 2, j + 0, k + 4, 0);
				world.setBlock(i + 2, j + 0, k + 5, 0);
				world.setBlock(i + 2, j + 0, k + 6, 0);
				world.setBlock(i + 2, j + 0, k + 7, 0);
				world.setBlock(i + 2, j + 0, k + 8, 0);
				world.setBlock(i + 2, j + 0, k + 9, 0);
				world.setBlock(i + 2, j + 0, k + 10, 0);
				world.setBlock(i + 2, j + 0, k + 11, 0);
				world.setBlock(i + 2, j + 0, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 0, k + 0, 0);
				world.setBlock(i + 3, j + 0, k + 1, 0);
				world.setBlock(i + 3, j + 0, k + 2, 0);
				world.setBlock(i + 3, j + 0, k + 3, 0);
				world.setBlock(i + 3, j + 0, k + 4, 0);
				world.setBlock(i + 3, j + 0, k + 5, 0);
				world.setBlock(i + 3, j + 0, k + 6, 0);
				world.setBlock(i + 3, j + 0, k + 7, 0);
				world.setBlock(i + 3, j + 0, k + 8, 0);
				world.setBlock(i + 3, j + 0, k + 9, 0);
				world.setBlock(i + 3, j + 0, k + 10, 0);
				world.setBlock(i + 3, j + 0, k + 11, 0);
				world.setBlock(i + 3, j + 0, k + 12, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 0, k + 0, 0);
				world.setBlock(i + 4, j + 0, k + 1, 0);
				world.setBlock(i + 4, j + 0, k + 2, 0);
				world.setBlock(i + 4, j + 0, k + 3, 0);
				world.setBlock(i + 4, j + 0, k + 4, 0);
				world.setBlock(i + 4, j + 0, k + 7, 0);
				world.setBlock(i + 4, j + 0, k + 8, 0);
				world.setBlock(i + 4, j + 0, k + 9, 0);
				world.setBlock(i + 4, j + 0, k + 10, 0);
				world.setBlock(i + 4, j + 0, k + 11, 0);
				world.setBlock(i + 4, j + 0, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 0, k + 0, 0);
				world.setBlock(i + 5, j + 0, k + 1, 0);
				world.setBlock(i + 5, j + 0, k + 2, 0);
				world.setBlock(i + 5, j + 0, k + 3, 0);
				world.setBlock(i + 5, j + 0, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 0, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 0, k + 8, 0);
				world.setBlock(i + 5, j + 0, k + 9, 0);
				world.setBlock(i + 5, j + 0, k + 10, 0);
				world.setBlock(i + 5, j + 0, k + 11, 0);
				world.setBlock(i + 5, j + 0, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 0, k + 0, 0);
				world.setBlock(i + 6, j + 0, k + 1, 0);
				world.setBlock(i + 6, j + 0, k + 2, 0);
				world.setBlock(i + 6, j + 0, k + 3, 0);
				world.setBlock(i + 6, j + 0, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 0, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 0, k + 8, 0);
				world.setBlock(i + 6, j + 0, k + 9, 0);
				world.setBlock(i + 6, j + 0, k + 10, 0);
				world.setBlock(i + 6, j + 0, k + 11, 0);
				world.setBlock(i + 6, j + 0, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 0, k + 0, 0);
				world.setBlock(i + 7, j + 0, k + 1, 0);
				world.setBlock(i + 7, j + 0, k + 2, 0);
				world.setBlock(i + 7, j + 0, k + 3, 0);
				world.setBlock(i + 7, j + 0, k + 4, 0);
				world.setBlock(i + 7, j + 0, k + 7, 0);
				world.setBlock(i + 7, j + 0, k + 8, 0);
				world.setBlock(i + 7, j + 0, k + 9, 0);
				world.setBlock(i + 7, j + 0, k + 10, 0);
				world.setBlock(i + 7, j + 0, k + 11, 0);
				world.setBlock(i + 7, j + 0, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 0, k + 0, 0);
				world.setBlock(i + 8, j + 0, k + 1, 0);
				world.setBlock(i + 8, j + 0, k + 2, 0);
				world.setBlock(i + 8, j + 0, k + 3, 0);
				world.setBlock(i + 8, j + 0, k + 4, 0);
				world.setBlock(i + 8, j + 0, k + 5, 0);
				world.setBlock(i + 8, j + 0, k + 6, 0);
				world.setBlock(i + 8, j + 0, k + 7, 0);
				world.setBlock(i + 8, j + 0, k + 8, 0);
				world.setBlock(i + 8, j + 0, k + 9, 0);
				world.setBlock(i + 8, j + 0, k + 10, 0);
				world.setBlock(i + 8, j + 0, k + 11, 0);
				world.setBlock(i + 8, j + 0, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 0, k + 0, 0);
				world.setBlock(i + 9, j + 0, k + 1, 0);
				world.setBlock(i + 9, j + 0, k + 2, 0);
				world.setBlock(i + 9, j + 0, k + 3, 0);
				world.setBlock(i + 9, j + 0, k + 4, 0);
				world.setBlock(i + 9, j + 0, k + 5, 0);
				world.setBlock(i + 9, j + 0, k + 6, 0);
				world.setBlock(i + 9, j + 0, k + 7, 0);
				world.setBlock(i + 9, j + 0, k + 8, 0);
				world.setBlock(i + 9, j + 0, k + 9, 0);
				world.setBlock(i + 9, j + 0, k + 10, 0);
				world.setBlock(i + 9, j + 0, k + 11, 0);
				world.setBlock(i + 9, j + 0, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 0, k + 0, 0);
				world.setBlock(i + 10, j + 0, k + 1, 0);
				world.setBlock(i + 10, j + 0, k + 2, 0);
				world.setBlock(i + 10, j + 0, k + 3, 0);
				world.setBlock(i + 10, j + 0, k + 4, 0);
				world.setBlock(i + 10, j + 0, k + 5, 0);
				world.setBlock(i + 10, j + 0, k + 6, 0);
				world.setBlock(i + 10, j + 0, k + 7, 0);
				world.setBlock(i + 10, j + 0, k + 8, 0);
				world.setBlock(i + 10, j + 0, k + 9, 0);
				world.setBlock(i + 10, j + 0, k + 10, 0);
				world.setBlock(i + 10, j + 0, k + 11, 0);
				world.setBlock(i + 10, j + 0, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 0, k + 0, 0);
				world.setBlock(i + 11, j + 0, k + 1, 0);
				world.setBlock(i + 11, j + 0, k + 2, 0);
				world.setBlock(i + 11, j + 0, k + 3, 0);
				world.setBlock(i + 11, j + 0, k + 4, 0);
				world.setBlock(i + 11, j + 0, k + 5, 0);
				world.setBlock(i + 11, j + 0, k + 6, 0);
				world.setBlock(i + 11, j + 0, k + 7, 0);
				world.setBlock(i + 11, j + 0, k + 8, 0);
				world.setBlock(i + 11, j + 0, k + 9, 0);
				world.setBlock(i + 11, j + 0, k + 10, 0);
				world.setBlock(i + 11, j + 0, k + 11, 0);
				world.setBlock(i + 11, j + 0, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 0, k + 0, 0);
				world.setBlock(i + 12, j + 0, k + 1, 0);
				world.setBlock(i + 12, j + 0, k + 2, 0);
				world.setBlock(i + 12, j + 0, k + 3, 0);
				world.setBlock(i + 12, j + 0, k + 4, 0);
				world.setBlock(i + 12, j + 0, k + 5, 0);
				world.setBlock(i + 12, j + 0, k + 6, 0);
				world.setBlock(i + 12, j + 0, k + 7, 0);
				world.setBlock(i + 12, j + 0, k + 8, 0);
				world.setBlock(i + 12, j + 0, k + 9, 0);
				world.setBlock(i + 12, j + 0, k + 10, 0);
				world.setBlock(i + 12, j + 0, k + 11, 0);
				world.setBlock(i + 12, j + 0, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 0, k + 0, 0);
				world.setBlock(i + 13, j + 0, k + 1, 0);
				world.setBlock(i + 13, j + 0, k + 2, 0);
				world.setBlock(i + 13, j + 0, k + 3, 0);
				world.setBlock(i + 13, j + 0, k + 4, 0);
				world.setBlock(i + 13, j + 0, k + 5, 0);
				world.setBlock(i + 13, j + 0, k + 6, 0);
				world.setBlock(i + 13, j + 0, k + 7, 0);
				world.setBlock(i + 13, j + 0, k + 8, 0);
				world.setBlock(i + 13, j + 0, k + 9, 0);
				world.setBlock(i + 13, j + 0, k + 10, 0);
				world.setBlock(i + 13, j + 0, k + 11, 0);
				world.setBlock(i + 13, j + 0, k + 12, 0);
			}
		},
		{//y = 1
			{//x = 0
				world.setBlock(i + 0, j + 1, k + 0, 0);
				world.setBlock(i + 0, j + 1, k + 1, 0);
				world.setBlock(i + 0, j + 1, k + 2, 0);
				world.setBlock(i + 0, j + 1, k + 3, 0);
				world.setBlock(i + 0, j + 1, k + 4, 0);
				world.setBlock(i + 0, j + 1, k + 5, 0);
				world.setBlock(i + 0, j + 1, k + 6, 0);
				world.setBlock(i + 0, j + 1, k + 7, 0);
				world.setBlock(i + 0, j + 1, k + 8, 0);
				world.setBlock(i + 0, j + 1, k + 9, 0);
				world.setBlock(i + 0, j + 1, k + 10, 0);
				world.setBlock(i + 0, j + 1, k + 11, 0);
				world.setBlock(i + 0, j + 1, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 1, k + 0, 0);
				world.setBlock(i + 1, j + 1, k + 1, 0);
				world.setBlock(i + 1, j + 1, k + 2, 0);
				world.setBlock(i + 1, j + 1, k + 3, 0);
				world.setBlock(i + 1, j + 1, k + 4, 0);
				world.setBlock(i + 1, j + 1, k + 5, 0);
				world.setBlock(i + 1, j + 1, k + 6, 0);
				world.setBlock(i + 1, j + 1, k + 7, 0);
				world.setBlock(i + 1, j + 1, k + 8, 0);
				world.setBlock(i + 1, j + 1, k + 9, 0);
				world.setBlock(i + 1, j + 1, k + 10, 0);
				world.setBlock(i + 1, j + 1, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 1, k + 0, 0);
				world.setBlock(i + 2, j + 1, k + 1, 0);
				world.setBlock(i + 2, j + 1, k + 2, 0);
				world.setBlock(i + 2, j + 1, k + 3, 0);
				world.setBlock(i + 2, j + 1, k + 4, 0);
				world.setBlock(i + 2, j + 1, k + 5, 0);
				world.setBlock(i + 2, j + 1, k + 6, 0);
				world.setBlock(i + 2, j + 1, k + 7, 0);
				world.setBlock(i + 2, j + 1, k + 8, 0);
				world.setBlock(i + 2, j + 1, k + 9, 0);
				world.setBlock(i + 2, j + 1, k + 10, 0);
				world.setBlock(i + 2, j + 1, k + 11, 0);
				world.setBlock(i + 2, j + 1, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 1, k + 0, 0);
				world.setBlock(i + 3, j + 1, k + 1, 0);
				world.setBlock(i + 3, j + 1, k + 2, 0);
				world.setBlock(i + 3, j + 1, k + 3, 0);
				world.setBlock(i + 3, j + 1, k + 4, 0);
				world.setBlock(i + 3, j + 1, k + 5, 0);
				world.setBlock(i + 3, j + 1, k + 6, 0);
				world.setBlock(i + 3, j + 1, k + 7, 0);
				world.setBlock(i + 3, j + 1, k + 8, 0);
				world.setBlock(i + 3, j + 1, k + 9, 0);
				world.setBlock(i + 3, j + 1, k + 10, 0);
				world.setBlock(i + 3, j + 1, k + 11, 0);
				world.setBlock(i + 3, j + 1, k + 12, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 1, k + 0, 0);
				world.setBlock(i + 4, j + 1, k + 1, 0);
				world.setBlock(i + 4, j + 1, k + 2, 0);
				world.setBlock(i + 4, j + 1, k + 3, 0);
				world.setBlock(i + 4, j + 1, k + 4, 0);
				world.setBlock(i + 4, j + 1, k + 7, 0);
				world.setBlock(i + 4, j + 1, k + 8, 0);
				world.setBlock(i + 4, j + 1, k + 9, 0);
				world.setBlock(i + 4, j + 1, k + 10, 0);
				world.setBlock(i + 4, j + 1, k + 11, 0);
				world.setBlock(i + 4, j + 1, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 1, k + 0, 0);
				world.setBlock(i + 5, j + 1, k + 1, 0);
				world.setBlock(i + 5, j + 1, k + 2, 0);
				world.setBlock(i + 5, j + 1, k + 3, 0);
				world.setBlock(i + 5, j + 1, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 1, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 1, k + 8, 0);
				world.setBlock(i + 5, j + 1, k + 9, 0);
				world.setBlock(i + 5, j + 1, k + 10, 0);
				world.setBlock(i + 5, j + 1, k + 11, 0);
				world.setBlock(i + 5, j + 1, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 1, k + 0, 0);
				world.setBlock(i + 6, j + 1, k + 1, 0);
				world.setBlock(i + 6, j + 1, k + 2, 0);
				world.setBlock(i + 6, j + 1, k + 3, 0);
				world.setBlock(i + 6, j + 1, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 1, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 1, k + 8, 0);
				world.setBlock(i + 6, j + 1, k + 9, 0);
				world.setBlock(i + 6, j + 1, k + 10, 0);
				world.setBlock(i + 6, j + 1, k + 11, 0);
				world.setBlock(i + 6, j + 1, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 1, k + 0, 0);
				world.setBlock(i + 7, j + 1, k + 1, 0);
				world.setBlock(i + 7, j + 1, k + 2, 0);
				world.setBlock(i + 7, j + 1, k + 3, 0);
				world.setBlock(i + 7, j + 1, k + 4, 0);
				world.setBlock(i + 7, j + 1, k + 7, 0);
				world.setBlock(i + 7, j + 1, k + 8, 0);
				world.setBlock(i + 7, j + 1, k + 9, 0);
				world.setBlock(i + 7, j + 1, k + 10, 0);
				world.setBlock(i + 7, j + 1, k + 11, 0);
				world.setBlock(i + 7, j + 1, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 1, k + 0, 0);
				world.setBlock(i + 8, j + 1, k + 1, 0);
				world.setBlock(i + 8, j + 1, k + 2, 0);
				world.setBlock(i + 8, j + 1, k + 3, 0);
				world.setBlock(i + 8, j + 1, k + 4, 0);
				world.setBlock(i + 8, j + 1, k + 5, 0);
				world.setBlock(i + 8, j + 1, k + 6, 0);
				world.setBlock(i + 8, j + 1, k + 7, 0);
				world.setBlock(i + 8, j + 1, k + 8, 0);
				world.setBlock(i + 8, j + 1, k + 9, 0);
				world.setBlock(i + 8, j + 1, k + 10, 0);
				world.setBlock(i + 8, j + 1, k + 11, 0);
				world.setBlock(i + 8, j + 1, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 1, k + 0, 0);
				world.setBlock(i + 9, j + 1, k + 1, 0);
				world.setBlock(i + 9, j + 1, k + 2, 0);
				world.setBlock(i + 9, j + 1, k + 3, 0);
				world.setBlock(i + 9, j + 1, k + 4, 0);
				world.setBlock(i + 9, j + 1, k + 5, 0);
				world.setBlock(i + 9, j + 1, k + 6, 0);
				world.setBlock(i + 9, j + 1, k + 7, 0);
				world.setBlock(i + 9, j + 1, k + 8, 0);
				world.setBlock(i + 9, j + 1, k + 9, 0);
				world.setBlock(i + 9, j + 1, k + 10, 0);
				world.setBlock(i + 9, j + 1, k + 11, 0);
				world.setBlock(i + 9, j + 1, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 1, k + 0, 0);
				world.setBlock(i + 10, j + 1, k + 1, 0);
				world.setBlock(i + 10, j + 1, k + 2, 0);
				world.setBlock(i + 10, j + 1, k + 3, 0);
				world.setBlock(i + 10, j + 1, k + 4, 0);
				world.setBlock(i + 10, j + 1, k + 5, 0);
				world.setBlock(i + 10, j + 1, k + 6, 0);
				world.setBlock(i + 10, j + 1, k + 7, 0);
				world.setBlock(i + 10, j + 1, k + 8, 0);
				world.setBlock(i + 10, j + 1, k + 9, 0);
				world.setBlock(i + 10, j + 1, k + 10, 0);
				world.setBlock(i + 10, j + 1, k + 11, 0);
				world.setBlock(i + 10, j + 1, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 1, k + 0, 0);
				world.setBlock(i + 11, j + 1, k + 1, 0);
				world.setBlock(i + 11, j + 1, k + 2, 0);
				world.setBlock(i + 11, j + 1, k + 3, 0);
				world.setBlock(i + 11, j + 1, k + 4, 0);
				world.setBlock(i + 11, j + 1, k + 5, 0);
				world.setBlock(i + 11, j + 1, k + 6, 0);
				world.setBlock(i + 11, j + 1, k + 7, 0);
				world.setBlock(i + 11, j + 1, k + 8, 0);
				world.setBlock(i + 11, j + 1, k + 9, 0);
				world.setBlock(i + 11, j + 1, k + 10, 0);
				world.setBlock(i + 11, j + 1, k + 11, 0);
				world.setBlock(i + 11, j + 1, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 1, k + 0, 0);
				world.setBlock(i + 12, j + 1, k + 1, 0);
				world.setBlock(i + 12, j + 1, k + 2, 0);
				world.setBlock(i + 12, j + 1, k + 3, 0);
				world.setBlock(i + 12, j + 1, k + 4, 0);
				world.setBlock(i + 12, j + 1, k + 5, 0);
				world.setBlock(i + 12, j + 1, k + 6, 0);
				world.setBlock(i + 12, j + 1, k + 7, 0);
				world.setBlock(i + 12, j + 1, k + 8, 0);
				world.setBlock(i + 12, j + 1, k + 9, 0);
				world.setBlock(i + 12, j + 1, k + 10, 0);
				world.setBlock(i + 12, j + 1, k + 11, 0);
				world.setBlock(i + 12, j + 1, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 1, k + 0, 0);
				world.setBlock(i + 13, j + 1, k + 1, 0);
				world.setBlock(i + 13, j + 1, k + 2, 0);
				world.setBlock(i + 13, j + 1, k + 3, 0);
				world.setBlock(i + 13, j + 1, k + 4, 0);
				world.setBlock(i + 13, j + 1, k + 5, 0);
				world.setBlock(i + 13, j + 1, k + 6, 0);
				world.setBlock(i + 13, j + 1, k + 7, 0);
				world.setBlock(i + 13, j + 1, k + 8, 0);
				world.setBlock(i + 13, j + 1, k + 9, 0);
				world.setBlock(i + 13, j + 1, k + 10, 0);
				world.setBlock(i + 13, j + 1, k + 11, 0);
				world.setBlock(i + 13, j + 1, k + 12, 0);
			}
		},
		{//y = 2
			{//x = 0
				world.setBlock(i + 0, j + 2, k + 0, 0);
				world.setBlock(i + 0, j + 2, k + 1, 0);
				world.setBlock(i + 0, j + 2, k + 2, 0);
				world.setBlock(i + 0, j + 2, k + 3, 0);
				world.setBlock(i + 0, j + 2, k + 4, 0);
				world.setBlock(i + 0, j + 2, k + 5, 0);
				world.setBlock(i + 0, j + 2, k + 6, 0);
				world.setBlock(i + 0, j + 2, k + 7, 0);
				world.setBlock(i + 0, j + 2, k + 8, 0);
				world.setBlock(i + 0, j + 2, k + 9, 0);
				world.setBlock(i + 0, j + 2, k + 10, 0);
				world.setBlock(i + 0, j + 2, k + 11, 0);
				world.setBlock(i + 0, j + 2, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 2, k + 0, 0);
				world.setBlock(i + 1, j + 2, k + 1, 0);
				world.setBlock(i + 1, j + 2, k + 2, 0);
				world.setBlock(i + 1, j + 2, k + 3, 0);
				world.setBlock(i + 1, j + 2, k + 4, 0);
				world.setBlock(i + 1, j + 2, k + 5, 0);
				world.setBlock(i + 1, j + 2, k + 6, 0);
				world.setBlock(i + 1, j + 2, k + 7, 0);
				world.setBlock(i + 1, j + 2, k + 8, 0);
				world.setBlock(i + 1, j + 2, k + 9, 0);
				world.setBlock(i + 1, j + 2, k + 10, 0);
				world.setBlock(i + 1, j + 2, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 2, k + 0, 0);
				world.setBlock(i + 2, j + 2, k + 1, 0);
				world.setBlock(i + 2, j + 2, k + 2, 0);
				world.setBlock(i + 2, j + 2, k + 3, 0);
				world.setBlock(i + 2, j + 2, k + 4, 0);
				world.setBlock(i + 2, j + 2, k + 5, 0);
				world.setBlock(i + 2, j + 2, k + 6, 0);
				world.setBlock(i + 2, j + 2, k + 7, 0);
				world.setBlock(i + 2, j + 2, k + 8, 0);
				world.setBlock(i + 2, j + 2, k + 9, 0);
				world.setBlock(i + 2, j + 2, k + 10, 0);
				world.setBlock(i + 2, j + 2, k + 11, 0);
				world.setBlock(i + 2, j + 2, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 2, k + 0, 0);
				world.setBlock(i + 3, j + 2, k + 1, 0);
				world.setBlock(i + 3, j + 2, k + 2, 0);
				world.setBlock(i + 3, j + 2, k + 3, 0);
				world.setBlock(i + 3, j + 2, k + 4, 0);
				world.setBlock(i + 3, j + 2, k + 5, 0);
				world.setBlock(i + 3, j + 2, k + 6, 0);
				world.setBlock(i + 3, j + 2, k + 7, 0);
				world.setBlock(i + 3, j + 2, k + 8, 0);
				world.setBlock(i + 3, j + 2, k + 9, 0);
				world.setBlock(i + 3, j + 2, k + 10, 0);
				world.setBlock(i + 3, j + 2, k + 11, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 2, k + 0, 0);
				world.setBlock(i + 4, j + 2, k + 1, 0);
				world.setBlock(i + 4, j + 2, k + 2, 0);
				world.setBlock(i + 4, j + 2, k + 3, 0);
				world.setBlock(i + 4, j + 2, k + 4, 0);
				world.setBlock(i + 4, j + 2, k + 7, 0);
				world.setBlock(i + 4, j + 2, k + 8, 0);
				world.setBlock(i + 4, j + 2, k + 9, 0);
				world.setBlock(i + 4, j + 2, k + 10, 0);
				world.setBlock(i + 4, j + 2, k + 11, 0);
				world.setBlock(i + 4, j + 2, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 2, k + 0, 0);
				world.setBlock(i + 5, j + 2, k + 1, 0);
				world.setBlock(i + 5, j + 2, k + 2, 0);
				world.setBlock(i + 5, j + 2, k + 3, 0);
				world.setBlock(i + 5, j + 2, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 2, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 2, k + 8, 0);
				world.setBlock(i + 5, j + 2, k + 9, 0);
				world.setBlock(i + 5, j + 2, k + 10, 0);
				world.setBlock(i + 5, j + 2, k + 11, 0);
				world.setBlock(i + 5, j + 2, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 2, k + 0, 0);
				world.setBlock(i + 6, j + 2, k + 1, 0);
				world.setBlock(i + 6, j + 2, k + 2, 0);
				world.setBlock(i + 6, j + 2, k + 3, 0);
				world.setBlock(i + 6, j + 2, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 2, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 2, k + 8, 0);
				world.setBlock(i + 6, j + 2, k + 9, 0);
				world.setBlock(i + 6, j + 2, k + 10, 0);
				world.setBlock(i + 6, j + 2, k + 11, 0);
				world.setBlock(i + 6, j + 2, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 2, k + 0, 0);
				world.setBlock(i + 7, j + 2, k + 1, 0);
				world.setBlock(i + 7, j + 2, k + 2, 0);
				world.setBlock(i + 7, j + 2, k + 3, 0);
				world.setBlock(i + 7, j + 2, k + 4, 0);
				world.setBlock(i + 7, j + 2, k + 7, 0);
				world.setBlock(i + 7, j + 2, k + 8, 0);
				world.setBlock(i + 7, j + 2, k + 9, 0);
				world.setBlock(i + 7, j + 2, k + 10, 0);
				world.setBlock(i + 7, j + 2, k + 11, 0);
				world.setBlock(i + 7, j + 2, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 2, k + 0, 0);
				world.setBlock(i + 8, j + 2, k + 1, 0);
				world.setBlock(i + 8, j + 2, k + 2, 0);
				world.setBlock(i + 8, j + 2, k + 3, 0);
				world.setBlock(i + 8, j + 2, k + 4, 0);
				world.setBlock(i + 8, j + 2, k + 5, 0);
				world.setBlock(i + 8, j + 2, k + 6, 0);
				world.setBlock(i + 8, j + 2, k + 7, 0);
				world.setBlock(i + 8, j + 2, k + 8, 0);
				world.setBlock(i + 8, j + 2, k + 9, 0);
				world.setBlock(i + 8, j + 2, k + 10, 0);
				world.setBlock(i + 8, j + 2, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 2, k + 0, 0);
				world.setBlock(i + 9, j + 2, k + 1, 0);
				world.setBlock(i + 9, j + 2, k + 2, 0);
				world.setBlock(i + 9, j + 2, k + 3, 0);
				world.setBlock(i + 9, j + 2, k + 4, 0);
				world.setBlock(i + 9, j + 2, k + 5, 0);
				world.setBlock(i + 9, j + 2, k + 6, 0);
				world.setBlock(i + 9, j + 2, k + 7, 0);
				world.setBlock(i + 9, j + 2, k + 8, 0);
				world.setBlock(i + 9, j + 2, k + 9, 0);
				world.setBlock(i + 9, j + 2, k + 10, 0);
				world.setBlock(i + 9, j + 2, k + 11, 0);
				world.setBlock(i + 9, j + 2, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 2, k + 0, 0);
				world.setBlock(i + 10, j + 2, k + 1, 0);
				world.setBlock(i + 10, j + 2, k + 2, 0);
				world.setBlock(i + 10, j + 2, k + 3, 0);
				world.setBlock(i + 10, j + 2, k + 4, 0);
				world.setBlock(i + 10, j + 2, k + 5, 0);
				world.setBlock(i + 10, j + 2, k + 6, 0);
				world.setBlock(i + 10, j + 2, k + 7, 0);
				world.setBlock(i + 10, j + 2, k + 8, 0);
				world.setBlock(i + 10, j + 2, k + 9, 0);
				world.setBlock(i + 10, j + 2, k + 10, 0);
				world.setBlock(i + 10, j + 2, k + 11, 0);
				world.setBlock(i + 10, j + 2, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 2, k + 0, 0);
				world.setBlock(i + 11, j + 2, k + 1, 0);
				world.setBlock(i + 11, j + 2, k + 2, 0);
				world.setBlock(i + 11, j + 2, k + 3, 0);
				world.setBlock(i + 11, j + 2, k + 4, 0);
				world.setBlock(i + 11, j + 2, k + 5, 0);
				world.setBlock(i + 11, j + 2, k + 6, 0);
				world.setBlock(i + 11, j + 2, k + 7, 0);
				world.setBlock(i + 11, j + 2, k + 8, 0);
				world.setBlock(i + 11, j + 2, k + 9, 0);
				world.setBlock(i + 11, j + 2, k + 10, 0);
				world.setBlock(i + 11, j + 2, k + 11, 0);
				world.setBlock(i + 11, j + 2, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 2, k + 0, 0);
				world.setBlock(i + 12, j + 2, k + 1, 0);
				world.setBlock(i + 12, j + 2, k + 2, 0);
				world.setBlock(i + 12, j + 2, k + 3, 0);
				world.setBlock(i + 12, j + 2, k + 4, 0);
				world.setBlock(i + 12, j + 2, k + 5, 0);
				world.setBlock(i + 12, j + 2, k + 6, 0);
				world.setBlock(i + 12, j + 2, k + 7, 0);
				world.setBlock(i + 12, j + 2, k + 8, 0);
				world.setBlock(i + 12, j + 2, k + 9, 0);
				world.setBlock(i + 12, j + 2, k + 10, 0);
				world.setBlock(i + 12, j + 2, k + 11, 0);
				world.setBlock(i + 12, j + 2, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 2, k + 0, 0);
				world.setBlock(i + 13, j + 2, k + 1, 0);
				world.setBlock(i + 13, j + 2, k + 2, 0);
				world.setBlock(i + 13, j + 2, k + 3, 0);
				world.setBlock(i + 13, j + 2, k + 4, 0);
				world.setBlock(i + 13, j + 2, k + 5, 0);
				world.setBlock(i + 13, j + 2, k + 6, 0);
				world.setBlock(i + 13, j + 2, k + 7, 0);
				world.setBlock(i + 13, j + 2, k + 8, 0);
				world.setBlock(i + 13, j + 2, k + 9, 0);
				world.setBlock(i + 13, j + 2, k + 10, 0);
				world.setBlock(i + 13, j + 2, k + 11, 0);
				world.setBlock(i + 13, j + 2, k + 12, 0);
			}
		},
		{//y = 3
			{//x = 0
				world.setBlock(i + 0, j + 3, k + 0, 0);
				world.setBlock(i + 0, j + 3, k + 1, 0);
				world.setBlock(i + 0, j + 3, k + 2, 0);
				world.setBlock(i + 0, j + 3, k + 3, 0);
				world.setBlock(i + 0, j + 3, k + 4, 0);
				world.setBlock(i + 0, j + 3, k + 5, 0);
				world.setBlock(i + 0, j + 3, k + 6, 0);
				world.setBlock(i + 0, j + 3, k + 7, 0);
				world.setBlock(i + 0, j + 3, k + 8, 0);
				world.setBlock(i + 0, j + 3, k + 9, 0);
				world.setBlock(i + 0, j + 3, k + 10, 0);
				world.setBlock(i + 0, j + 3, k + 11, 0);
				world.setBlock(i + 0, j + 3, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 3, k + 0, 0);
				world.setBlock(i + 1, j + 3, k + 1, 0);
				world.setBlock(i + 1, j + 3, k + 2, 0);
				world.setBlock(i + 1, j + 3, k + 3, 0);
				world.setBlock(i + 1, j + 3, k + 4, 0);
				world.setBlock(i + 1, j + 3, k + 5, 0);
				world.setBlock(i + 1, j + 3, k + 6, 0);
				world.setBlock(i + 1, j + 3, k + 7, 0);
				world.setBlock(i + 1, j + 3, k + 8, 0);
				world.setBlock(i + 1, j + 3, k + 9, 0);
				world.setBlock(i + 1, j + 3, k + 10, 0);
				world.setBlock(i + 1, j + 3, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 3, k + 0, 0);
				world.setBlock(i + 2, j + 3, k + 1, 0);
				world.setBlock(i + 2, j + 3, k + 2, 0);
				world.setBlock(i + 2, j + 3, k + 3, 0);
				world.setBlock(i + 2, j + 3, k + 4, 0);
				world.setBlock(i + 2, j + 3, k + 5, 0);
				world.setBlock(i + 2, j + 3, k + 6, 0);
				world.setBlock(i + 2, j + 3, k + 7, 0);
				world.setBlock(i + 2, j + 3, k + 8, 0);
				world.setBlock(i + 2, j + 3, k + 9, 0);
				world.setBlock(i + 2, j + 3, k + 10, 0);
				world.setBlock(i + 2, j + 3, k + 11, 0);
				world.setBlock(i + 2, j + 3, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 3, k + 0, 0);
				world.setBlock(i + 3, j + 3, k + 1, 0);
				world.setBlock(i + 3, j + 3, k + 2, 0);
				world.setBlock(i + 3, j + 3, k + 3, 0);
				world.setBlock(i + 3, j + 3, k + 4, 0);
				world.setBlock(i + 3, j + 3, k + 5, 0);
				world.setBlock(i + 3, j + 3, k + 6, 0);
				world.setBlock(i + 3, j + 3, k + 7, 0);
				world.setBlock(i + 3, j + 3, k + 8, 0);
				world.setBlock(i + 3, j + 3, k + 9, 0);
				world.setBlock(i + 3, j + 3, k + 10, 0);
				world.setBlock(i + 3, j + 3, k + 11, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 3, k + 0, 0);
				world.setBlock(i + 4, j + 3, k + 1, 0);
				world.setBlock(i + 4, j + 3, k + 2, 0);
				world.setBlock(i + 4, j + 3, k + 3, 0);
				world.setBlock(i + 4, j + 3, k + 4, 0);
				world.setBlock(i + 4, j + 3, k + 7, 0);
				world.setBlock(i + 4, j + 3, k + 8, 0);
				world.setBlock(i + 4, j + 3, k + 9, 0);
				world.setBlock(i + 4, j + 3, k + 10, 0);
				world.setBlock(i + 4, j + 3, k + 11, 0);
				world.setBlock(i + 4, j + 3, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 3, k + 0, 0);
				world.setBlock(i + 5, j + 3, k + 1, 0);
				world.setBlock(i + 5, j + 3, k + 2, 0);
				world.setBlock(i + 5, j + 3, k + 3, 0);
				world.setBlock(i + 5, j + 3, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 3, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 3, k + 8, 0);
				world.setBlock(i + 5, j + 3, k + 9, 0);
				world.setBlock(i + 5, j + 3, k + 10, 0);
				world.setBlock(i + 5, j + 3, k + 11, 0);
				world.setBlock(i + 5, j + 3, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 3, k + 0, 0);
				world.setBlock(i + 6, j + 3, k + 1, 0);
				world.setBlock(i + 6, j + 3, k + 2, 0);
				world.setBlock(i + 6, j + 3, k + 3, 0);
				world.setBlock(i + 6, j + 3, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 3, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 3, k + 8, 0);
				world.setBlock(i + 6, j + 3, k + 9, 0);
				world.setBlock(i + 6, j + 3, k + 10, 0);
				world.setBlock(i + 6, j + 3, k + 11, 0);
				world.setBlock(i + 6, j + 3, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 3, k + 0, 0);
				world.setBlock(i + 7, j + 3, k + 1, 0);
				world.setBlock(i + 7, j + 3, k + 2, 0);
				world.setBlock(i + 7, j + 3, k + 3, 0);
				world.setBlock(i + 7, j + 3, k + 4, 0);
				world.setBlock(i + 7, j + 3, k + 7, 0);
				world.setBlock(i + 7, j + 3, k + 8, 0);
				world.setBlock(i + 7, j + 3, k + 9, 0);
				world.setBlock(i + 7, j + 3, k + 10, 0);
				world.setBlock(i + 7, j + 3, k + 11, 0);
				world.setBlock(i + 7, j + 3, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 3, k + 0, 0);
				world.setBlock(i + 8, j + 3, k + 1, 0);
				world.setBlock(i + 8, j + 3, k + 2, 0);
				world.setBlock(i + 8, j + 3, k + 3, 0);
				world.setBlock(i + 8, j + 3, k + 4, 0);
				world.setBlock(i + 8, j + 3, k + 5, 0);
				world.setBlock(i + 8, j + 3, k + 6, 0);
				world.setBlock(i + 8, j + 3, k + 7, 0);
				world.setBlock(i + 8, j + 3, k + 8, 0);
				world.setBlock(i + 8, j + 3, k + 9, 0);
				world.setBlock(i + 8, j + 3, k + 10, 0);
				world.setBlock(i + 8, j + 3, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 3, k + 0, 0);
				world.setBlock(i + 9, j + 3, k + 1, 0);
				world.setBlock(i + 9, j + 3, k + 2, 0);
				world.setBlock(i + 9, j + 3, k + 3, 0);
				world.setBlock(i + 9, j + 3, k + 4, 0);
				world.setBlock(i + 9, j + 3, k + 5, 0);
				world.setBlock(i + 9, j + 3, k + 6, 0);
				world.setBlock(i + 9, j + 3, k + 7, 0);
				world.setBlock(i + 9, j + 3, k + 8, 0);
				world.setBlock(i + 9, j + 3, k + 9, 0);
				world.setBlock(i + 9, j + 3, k + 10, 0);
				world.setBlock(i + 9, j + 3, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 3, k + 0, 0);
				world.setBlock(i + 10, j + 3, k + 1, 0);
				world.setBlock(i + 10, j + 3, k + 2, 0);
				world.setBlock(i + 10, j + 3, k + 3, 0);
				world.setBlock(i + 10, j + 3, k + 4, 0);
				world.setBlock(i + 10, j + 3, k + 5, 0);
				world.setBlock(i + 10, j + 3, k + 6, 0);
				world.setBlock(i + 10, j + 3, k + 7, 0);
				world.setBlock(i + 10, j + 3, k + 8, 0);
				world.setBlock(i + 10, j + 3, k + 9, 0);
				world.setBlock(i + 10, j + 3, k + 10, 0);
				world.setBlock(i + 10, j + 3, k + 11, 0);
				world.setBlock(i + 10, j + 3, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 3, k + 0, 0);
				world.setBlock(i + 11, j + 3, k + 1, 0);
				world.setBlock(i + 11, j + 3, k + 2, 0);
				world.setBlock(i + 11, j + 3, k + 3, 0);
				world.setBlock(i + 11, j + 3, k + 4, 0);
				world.setBlock(i + 11, j + 3, k + 5, 0);
				world.setBlock(i + 11, j + 3, k + 6, 0);
				world.setBlock(i + 11, j + 3, k + 7, 0);
				world.setBlock(i + 11, j + 3, k + 8, 0);
				world.setBlock(i + 11, j + 3, k + 9, 0);
				world.setBlock(i + 11, j + 3, k + 10, 0);
				world.setBlock(i + 11, j + 3, k + 11, 0);
				world.setBlock(i + 11, j + 3, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 3, k + 0, 0);
				world.setBlock(i + 12, j + 3, k + 1, 0);
				world.setBlock(i + 12, j + 3, k + 2, 0);
				world.setBlock(i + 12, j + 3, k + 3, 0);
				world.setBlock(i + 12, j + 3, k + 4, 0);
				world.setBlock(i + 12, j + 3, k + 5, 0);
				world.setBlock(i + 12, j + 3, k + 6, 0);
				world.setBlock(i + 12, j + 3, k + 7, 0);
				world.setBlock(i + 12, j + 3, k + 8, 0);
				world.setBlock(i + 12, j + 3, k + 9, 0);
				world.setBlock(i + 12, j + 3, k + 10, 0);
				world.setBlock(i + 12, j + 3, k + 11, 0);
				world.setBlock(i + 12, j + 3, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 3, k + 0, 0);
				world.setBlock(i + 13, j + 3, k + 1, 0);
				world.setBlock(i + 13, j + 3, k + 2, 0);
				world.setBlock(i + 13, j + 3, k + 3, 0);
				world.setBlock(i + 13, j + 3, k + 4, 0);
				world.setBlock(i + 13, j + 3, k + 5, 0);
				world.setBlock(i + 13, j + 3, k + 6, 0);
				world.setBlock(i + 13, j + 3, k + 7, 0);
				world.setBlock(i + 13, j + 3, k + 8, 0);
				world.setBlock(i + 13, j + 3, k + 9, 0);
				world.setBlock(i + 13, j + 3, k + 10, 0);
				world.setBlock(i + 13, j + 3, k + 11, 0);
				world.setBlock(i + 13, j + 3, k + 12, 0);
			}
		},
		{//y = 4
			{//x = 0
				world.setBlock(i + 0, j + 4, k + 0, 0);
				world.setBlock(i + 0, j + 4, k + 1, 0);
				world.setBlock(i + 0, j + 4, k + 2, 0);
				world.setBlock(i + 0, j + 4, k + 3, 0);
				world.setBlock(i + 0, j + 4, k + 4, 0);
				world.setBlock(i + 0, j + 4, k + 5, 0);
				world.setBlock(i + 0, j + 4, k + 6, 0);
				world.setBlock(i + 0, j + 4, k + 7, 0);
				world.setBlock(i + 0, j + 4, k + 8, 0);
				world.setBlock(i + 0, j + 4, k + 9, 0);
				world.setBlock(i + 0, j + 4, k + 10, 0);
				world.setBlock(i + 0, j + 4, k + 11, 0);
				world.setBlock(i + 0, j + 4, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 4, k + 0, 0);
				world.setBlock(i + 1, j + 4, k + 1, 0);
				world.setBlock(i + 1, j + 4, k + 2, 0);
				world.setBlock(i + 1, j + 4, k + 3, 0);
				world.setBlock(i + 1, j + 4, k + 4, 0);
				world.setBlock(i + 1, j + 4, k + 5, 0);
				world.setBlock(i + 1, j + 4, k + 6, 0);
				world.setBlock(i + 1, j + 4, k + 7, 0);
				world.setBlock(i + 1, j + 4, k + 8, 0);
				world.setBlock(i + 1, j + 4, k + 9, 0);
				world.setBlock(i + 1, j + 4, k + 10, 0);
				world.setBlock(i + 1, j + 4, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 4, k + 0, 0);
				world.setBlock(i + 2, j + 4, k + 1, 0);
				world.setBlock(i + 2, j + 4, k + 2, 0);
				world.setBlock(i + 2, j + 4, k + 3, 0);
				world.setBlock(i + 2, j + 4, k + 4, 0);
				world.setBlock(i + 2, j + 4, k + 5, 0);
				world.setBlock(i + 2, j + 4, k + 6, 0);
				world.setBlock(i + 2, j + 4, k + 7, 0);
				world.setBlock(i + 2, j + 4, k + 8, 0);
				world.setBlock(i + 2, j + 4, k + 9, 0);
				world.setBlock(i + 2, j + 4, k + 10, 0);
				world.setBlock(i + 2, j + 4, k + 11, 0);
				world.setBlock(i + 2, j + 4, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 4, k + 0, 0);
				world.setBlock(i + 3, j + 4, k + 1, 0);
				world.setBlock(i + 3, j + 4, k + 2, 0);
				world.setBlock(i + 3, j + 4, k + 3, 0);
				world.setBlock(i + 3, j + 4, k + 4, 0);
				world.setBlock(i + 3, j + 4, k + 5, 0);
				world.setBlock(i + 3, j + 4, k + 6, 0);
				world.setBlock(i + 3, j + 4, k + 7, 0);
				world.setBlock(i + 3, j + 4, k + 8, 0);
				world.setBlock(i + 3, j + 4, k + 9, 0);
				world.setBlock(i + 3, j + 4, k + 10, 0);
				world.setBlock(i + 3, j + 4, k + 11, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 4, k + 0, 0);
				world.setBlock(i + 4, j + 4, k + 1, 0);
				world.setBlock(i + 4, j + 4, k + 2, 0);
				world.setBlock(i + 4, j + 4, k + 3, 0);
				world.setBlock(i + 4, j + 4, k + 4, 0);
				world.setBlock(i + 4, j + 4, k + 7, 0);
				world.setBlock(i + 4, j + 4, k + 8, 0);
				world.setBlock(i + 4, j + 4, k + 9, 0);
				world.setBlock(i + 4, j + 4, k + 10, 0);
				world.setBlock(i + 4, j + 4, k + 11, 0);
				world.setBlock(i + 4, j + 4, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 4, k + 0, 0);
				world.setBlock(i + 5, j + 4, k + 1, 0);
				world.setBlock(i + 5, j + 4, k + 2, 0);
				world.setBlock(i + 5, j + 4, k + 3, 0);
				world.setBlock(i + 5, j + 4, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 4, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 4, k + 8, 0);
				world.setBlock(i + 5, j + 4, k + 9, 0);
				world.setBlock(i + 5, j + 4, k + 10, 0);
				world.setBlock(i + 5, j + 4, k + 11, 0);
				world.setBlock(i + 5, j + 4, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 4, k + 0, 0);
				world.setBlock(i + 6, j + 4, k + 1, 0);
				world.setBlock(i + 6, j + 4, k + 2, 0);
				world.setBlock(i + 6, j + 4, k + 3, 0);
				world.setBlock(i + 6, j + 4, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 4, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 4, k + 8, 0);
				world.setBlock(i + 6, j + 4, k + 9, 0);
				world.setBlock(i + 6, j + 4, k + 10, 0);
				world.setBlock(i + 6, j + 4, k + 11, 0);
				world.setBlock(i + 6, j + 4, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 4, k + 0, 0);
				world.setBlock(i + 7, j + 4, k + 1, 0);
				world.setBlock(i + 7, j + 4, k + 2, 0);
				world.setBlock(i + 7, j + 4, k + 3, 0);
				world.setBlock(i + 7, j + 4, k + 4, 0);
				world.setBlock(i + 7, j + 4, k + 7, 0);
				world.setBlock(i + 7, j + 4, k + 8, 0);
				world.setBlock(i + 7, j + 4, k + 9, 0);
				world.setBlock(i + 7, j + 4, k + 10, 0);
				world.setBlock(i + 7, j + 4, k + 11, 0);
				world.setBlock(i + 7, j + 4, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 4, k + 0, 0);
				world.setBlock(i + 8, j + 4, k + 1, 0);
				world.setBlock(i + 8, j + 4, k + 2, 0);
				world.setBlock(i + 8, j + 4, k + 3, 0);
				world.setBlock(i + 8, j + 4, k + 4, 0);
				world.setBlock(i + 8, j + 4, k + 5, 0);
				world.setBlock(i + 8, j + 4, k + 6, 0);
				world.setBlock(i + 8, j + 4, k + 7, 0);
				world.setBlock(i + 8, j + 4, k + 8, 0);
				world.setBlock(i + 8, j + 4, k + 9, 0);
				world.setBlock(i + 8, j + 4, k + 10, 0);
				world.setBlock(i + 8, j + 4, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 4, k + 0, 0);
				world.setBlock(i + 9, j + 4, k + 1, 0);
				world.setBlock(i + 9, j + 4, k + 2, 0);
				world.setBlock(i + 9, j + 4, k + 3, 0);
				world.setBlock(i + 9, j + 4, k + 4, 0);
				world.setBlock(i + 9, j + 4, k + 5, 0);
				world.setBlock(i + 9, j + 4, k + 6, 0);
				world.setBlock(i + 9, j + 4, k + 7, 0);
				world.setBlock(i + 9, j + 4, k + 8, 0);
				world.setBlock(i + 9, j + 4, k + 9, 0);
				world.setBlock(i + 9, j + 4, k + 10, 0);
				world.setBlock(i + 9, j + 4, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 4, k + 0, 0);
				world.setBlock(i + 10, j + 4, k + 1, 0);
				world.setBlock(i + 10, j + 4, k + 2, 0);
				world.setBlock(i + 10, j + 4, k + 3, 0);
				world.setBlock(i + 10, j + 4, k + 4, 0);
				world.setBlock(i + 10, j + 4, k + 5, 0);
				world.setBlock(i + 10, j + 4, k + 6, 0);
				world.setBlock(i + 10, j + 4, k + 7, 0);
				world.setBlock(i + 10, j + 4, k + 8, 0);
				world.setBlock(i + 10, j + 4, k + 9, 0);
				world.setBlock(i + 10, j + 4, k + 10, 0);
				world.setBlock(i + 10, j + 4, k + 11, 0);
				world.setBlock(i + 10, j + 4, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 4, k + 0, 0);
				world.setBlock(i + 11, j + 4, k + 1, 0);
				world.setBlock(i + 11, j + 4, k + 2, 0);
				world.setBlock(i + 11, j + 4, k + 3, 0);
				world.setBlock(i + 11, j + 4, k + 4, 0);
				world.setBlock(i + 11, j + 4, k + 5, 0);
				world.setBlock(i + 11, j + 4, k + 6, 0);
				world.setBlock(i + 11, j + 4, k + 7, 0);
				world.setBlock(i + 11, j + 4, k + 8, 0);
				world.setBlock(i + 11, j + 4, k + 9, 0);
				world.setBlock(i + 11, j + 4, k + 10, 0);
				world.setBlock(i + 11, j + 4, k + 11, 0);
				world.setBlock(i + 11, j + 4, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 4, k + 0, 0);
				world.setBlock(i + 12, j + 4, k + 1, 0);
				world.setBlock(i + 12, j + 4, k + 2, 0);
				world.setBlock(i + 12, j + 4, k + 3, 0);
				world.setBlock(i + 12, j + 4, k + 4, 0);
				world.setBlock(i + 12, j + 4, k + 5, 0);
				world.setBlock(i + 12, j + 4, k + 6, 0);
				world.setBlock(i + 12, j + 4, k + 7, 0);
				world.setBlock(i + 12, j + 4, k + 8, 0);
				world.setBlock(i + 12, j + 4, k + 9, 0);
				world.setBlock(i + 12, j + 4, k + 10, 0);
				world.setBlock(i + 12, j + 4, k + 11, 0);
				world.setBlock(i + 12, j + 4, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 4, k + 0, 0);
				world.setBlock(i + 13, j + 4, k + 1, 0);
				world.setBlock(i + 13, j + 4, k + 2, 0);
				world.setBlock(i + 13, j + 4, k + 3, 0);
				world.setBlock(i + 13, j + 4, k + 4, 0);
				world.setBlock(i + 13, j + 4, k + 5, 0);
				world.setBlock(i + 13, j + 4, k + 6, 0);
				world.setBlock(i + 13, j + 4, k + 7, 0);
				world.setBlock(i + 13, j + 4, k + 8, 0);
				world.setBlock(i + 13, j + 4, k + 9, 0);
				world.setBlock(i + 13, j + 4, k + 10, 0);
				world.setBlock(i + 13, j + 4, k + 11, 0);
				world.setBlock(i + 13, j + 4, k + 12, 0);
			}
		},
		{//y = 5
			{//x = 0
				world.setBlock(i + 0, j + 5, k + 0, 0);
				world.setBlock(i + 0, j + 5, k + 1, 0);
				world.setBlock(i + 0, j + 5, k + 2, 0);
				world.setBlock(i + 0, j + 5, k + 3, 0);
				world.setBlock(i + 0, j + 5, k + 4, 0);
				world.setBlock(i + 0, j + 5, k + 5, 0);
				world.setBlock(i + 0, j + 5, k + 6, 0);
				world.setBlock(i + 0, j + 5, k + 7, 0);
				world.setBlock(i + 0, j + 5, k + 8, 0);
				world.setBlock(i + 0, j + 5, k + 9, 0);
				world.setBlock(i + 0, j + 5, k + 10, 0);
				world.setBlock(i + 0, j + 5, k + 11, 0);
				world.setBlock(i + 0, j + 5, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 5, k + 0, 0);
				world.setBlock(i + 1, j + 5, k + 1, 0);
				world.setBlock(i + 1, j + 5, k + 2, 0);
				world.setBlock(i + 1, j + 5, k + 3, 0);
				world.setBlock(i + 1, j + 5, k + 4, 0);
				world.setBlock(i + 1, j + 5, k + 5, 0);
				world.setBlock(i + 1, j + 5, k + 6, 0);
				world.setBlock(i + 1, j + 5, k + 7, 0);
				world.setBlock(i + 1, j + 5, k + 8, 0);
				world.setBlock(i + 1, j + 5, k + 9, 0);
				world.setBlock(i + 1, j + 5, k + 10, 0);
				world.setBlock(i + 1, j + 5, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 5, k + 0, 0);
				world.setBlock(i + 2, j + 5, k + 1, 0);
				world.setBlock(i + 2, j + 5, k + 2, 0);
				world.setBlock(i + 2, j + 5, k + 3, 0);
				world.setBlock(i + 2, j + 5, k + 4, 0);
				world.setBlock(i + 2, j + 5, k + 5, 0);
				world.setBlock(i + 2, j + 5, k + 6, 0);
				world.setBlock(i + 2, j + 5, k + 7, 0);
				world.setBlock(i + 2, j + 5, k + 8, 0);
				world.setBlock(i + 2, j + 5, k + 9, 0);
				world.setBlock(i + 2, j + 5, k + 10, 0);
				world.setBlock(i + 2, j + 5, k + 11, 0);
				world.setBlock(i + 2, j + 5, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 5, k + 0, 0);
				world.setBlock(i + 3, j + 5, k + 1, 0);
				world.setBlock(i + 3, j + 5, k + 2, 0);
				world.setBlock(i + 3, j + 5, k + 3, 0);
				world.setBlock(i + 3, j + 5, k + 4, 0);
				world.setBlock(i + 3, j + 5, k + 5, 0);
				world.setBlock(i + 3, j + 5, k + 6, 0);
				world.setBlock(i + 3, j + 5, k + 7, 0);
				world.setBlock(i + 3, j + 5, k + 8, 0);
				world.setBlock(i + 3, j + 5, k + 9, 0);
				world.setBlock(i + 3, j + 5, k + 10, 0);
				world.setBlock(i + 3, j + 5, k + 11, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 5, k + 0, 0);
				world.setBlock(i + 4, j + 5, k + 1, 0);
				world.setBlock(i + 4, j + 5, k + 2, 0);
				world.setBlock(i + 4, j + 5, k + 3, 0);
				world.setBlock(i + 4, j + 5, k + 4, 0);
				world.setBlock(i + 4, j + 5, k + 7, 0);
				world.setBlock(i + 4, j + 5, k + 8, 0);
				world.setBlock(i + 4, j + 5, k + 9, 0);
				world.setBlock(i + 4, j + 5, k + 10, 0);
				world.setBlock(i + 4, j + 5, k + 11, 0);
				world.setBlock(i + 4, j + 5, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 5, k + 0, 0);
				world.setBlock(i + 5, j + 5, k + 1, 0);
				world.setBlock(i + 5, j + 5, k + 2, 0);
				world.setBlock(i + 5, j + 5, k + 3, 0);
				world.setBlock(i + 5, j + 5, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 5, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 5, k + 8, 0);
				world.setBlock(i + 5, j + 5, k + 9, 0);
				world.setBlock(i + 5, j + 5, k + 10, 0);
				world.setBlock(i + 5, j + 5, k + 11, 0);
				world.setBlock(i + 5, j + 5, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 5, k + 0, 0);
				world.setBlock(i + 6, j + 5, k + 1, 0);
				world.setBlock(i + 6, j + 5, k + 2, 0);
				world.setBlock(i + 6, j + 5, k + 3, 0);
				world.setBlock(i + 6, j + 5, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 5, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 5, k + 8, 0);
				world.setBlock(i + 6, j + 5, k + 9, 0);
				world.setBlock(i + 6, j + 5, k + 10, 0);
				world.setBlock(i + 6, j + 5, k + 11, 0);
				world.setBlock(i + 6, j + 5, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 5, k + 0, 0);
				world.setBlock(i + 7, j + 5, k + 1, 0);
				world.setBlock(i + 7, j + 5, k + 2, 0);
				world.setBlock(i + 7, j + 5, k + 3, 0);
				world.setBlock(i + 7, j + 5, k + 4, 0);
				world.setBlock(i + 7, j + 5, k + 7, 0);
				world.setBlock(i + 7, j + 5, k + 8, 0);
				world.setBlock(i + 7, j + 5, k + 9, 0);
				world.setBlock(i + 7, j + 5, k + 10, 0);
				world.setBlock(i + 7, j + 5, k + 11, 0);
				world.setBlock(i + 7, j + 5, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 5, k + 0, 0);
				world.setBlock(i + 8, j + 5, k + 1, 0);
				world.setBlock(i + 8, j + 5, k + 2, 0);
				world.setBlock(i + 8, j + 5, k + 3, 0);
				world.setBlock(i + 8, j + 5, k + 4, 0);
				world.setBlock(i + 8, j + 5, k + 5, 0);
				world.setBlock(i + 8, j + 5, k + 6, 0);
				world.setBlock(i + 8, j + 5, k + 7, 0);
				world.setBlock(i + 8, j + 5, k + 8, 0);
				world.setBlock(i + 8, j + 5, k + 9, 0);
				world.setBlock(i + 8, j + 5, k + 10, 0);
				world.setBlock(i + 8, j + 5, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 5, k + 0, 0);
				world.setBlock(i + 9, j + 5, k + 1, 0);
				world.setBlock(i + 9, j + 5, k + 2, 0);
				world.setBlock(i + 9, j + 5, k + 3, 0);
				world.setBlock(i + 9, j + 5, k + 4, 0);
				world.setBlock(i + 9, j + 5, k + 5, 0);
				world.setBlock(i + 9, j + 5, k + 6, 0);
				world.setBlock(i + 9, j + 5, k + 7, 0);
				world.setBlock(i + 9, j + 5, k + 8, 0);
				world.setBlock(i + 9, j + 5, k + 9, 0);
				world.setBlock(i + 9, j + 5, k + 10, 0);
				world.setBlock(i + 9, j + 5, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 5, k + 0, 0);
				world.setBlock(i + 10, j + 5, k + 1, 0);
				world.setBlock(i + 10, j + 5, k + 2, 0);
				world.setBlock(i + 10, j + 5, k + 3, 0);
				world.setBlock(i + 10, j + 5, k + 4, 0);
				world.setBlock(i + 10, j + 5, k + 5, 0);
				world.setBlock(i + 10, j + 5, k + 6, 0);
				world.setBlock(i + 10, j + 5, k + 7, 0);
				world.setBlock(i + 10, j + 5, k + 8, 0);
				world.setBlock(i + 10, j + 5, k + 9, 0);
				world.setBlock(i + 10, j + 5, k + 10, 0);
				world.setBlock(i + 10, j + 5, k + 11, 0);
				world.setBlock(i + 10, j + 5, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 5, k + 0, 0);
				world.setBlock(i + 11, j + 5, k + 1, 0);
				world.setBlock(i + 11, j + 5, k + 2, 0);
				world.setBlock(i + 11, j + 5, k + 3, 0);
				world.setBlock(i + 11, j + 5, k + 4, 0);
				world.setBlock(i + 11, j + 5, k + 5, 0);
				world.setBlock(i + 11, j + 5, k + 6, 0);
				world.setBlock(i + 11, j + 5, k + 7, 0);
				world.setBlock(i + 11, j + 5, k + 8, 0);
				world.setBlock(i + 11, j + 5, k + 9, 0);
				world.setBlock(i + 11, j + 5, k + 10, 0);
				world.setBlock(i + 11, j + 5, k + 11, 0);
				world.setBlock(i + 11, j + 5, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 5, k + 0, 0);
				world.setBlock(i + 12, j + 5, k + 2, 0);
				world.setBlock(i + 12, j + 5, k + 3, 0);
				world.setBlock(i + 12, j + 5, k + 4, 0);
				world.setBlock(i + 12, j + 5, k + 5, 0);
				world.setBlock(i + 12, j + 5, k + 7, 0);
				world.setBlock(i + 12, j + 5, k + 8, 0);
				world.setBlock(i + 12, j + 5, k + 9, 0);
				world.setBlock(i + 12, j + 5, k + 10, 0);
				world.setBlock(i + 12, j + 5, k + 11, 0);
				world.setBlock(i + 12, j + 5, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 5, k + 0, 0);
				world.setBlock(i + 13, j + 5, k + 1, 0);
				world.setBlock(i + 13, j + 5, k + 2, 0);
				world.setBlock(i + 13, j + 5, k + 3, 0);
				world.setBlock(i + 13, j + 5, k + 4, 0);
				world.setBlock(i + 13, j + 5, k + 5, 0);
				world.setBlock(i + 13, j + 5, k + 6, 0);
				world.setBlock(i + 13, j + 5, k + 7, 0);
				world.setBlock(i + 13, j + 5, k + 8, 0);
				world.setBlock(i + 13, j + 5, k + 9, 0);
				world.setBlock(i + 13, j + 5, k + 10, 0);
				world.setBlock(i + 13, j + 5, k + 11, 0);
				world.setBlock(i + 13, j + 5, k + 12, 0);
			}
		},
		{//y = 6
			{//x = 0
				world.setBlock(i + 0, j + 6, k + 0, 0);
				world.setBlock(i + 0, j + 6, k + 1, 0);
				world.setBlock(i + 0, j + 6, k + 2, 0);
				world.setBlock(i + 0, j + 6, k + 3, 0);
				world.setBlock(i + 0, j + 6, k + 4, 0);
				world.setBlock(i + 0, j + 6, k + 5, 0);
				world.setBlock(i + 0, j + 6, k + 6, 0);
				world.setBlock(i + 0, j + 6, k + 7, 0);
				world.setBlock(i + 0, j + 6, k + 8, 0);
				world.setBlock(i + 0, j + 6, k + 9, 0);
				world.setBlock(i + 0, j + 6, k + 10, 0);
				world.setBlock(i + 0, j + 6, k + 11, 0);
				world.setBlock(i + 0, j + 6, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 6, k + 0, 0);
				world.setBlock(i + 1, j + 6, k + 1, 0);
				world.setBlock(i + 1, j + 6, k + 2, 0);
				world.setBlock(i + 1, j + 6, k + 3, 0);
				world.setBlock(i + 1, j + 6, k + 4, 0);
				world.setBlock(i + 1, j + 6, k + 5, 0);
				world.setBlock(i + 1, j + 6, k + 6, 0);
				world.setBlock(i + 1, j + 6, k + 7, 0);
				world.setBlock(i + 1, j + 6, k + 8, 0);
				world.setBlock(i + 1, j + 6, k + 9, 0);
				world.setBlock(i + 1, j + 6, k + 10, 0);
				world.setBlock(i + 1, j + 6, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 6, k + 0, 0);
				world.setBlock(i + 2, j + 6, k + 1, 0);
				world.setBlock(i + 2, j + 6, k + 2, 0);
				world.setBlock(i + 2, j + 6, k + 3, 0);
				world.setBlock(i + 2, j + 6, k + 4, 0);
				world.setBlock(i + 2, j + 6, k + 5, 0);
				world.setBlock(i + 2, j + 6, k + 6, 0);
				world.setBlock(i + 2, j + 6, k + 7, 0);
				world.setBlock(i + 2, j + 6, k + 8, 0);
				world.setBlock(i + 2, j + 6, k + 9, 0);
				world.setBlock(i + 2, j + 6, k + 10, 0);
				world.setBlock(i + 2, j + 6, k + 11, 0);
				world.setBlock(i + 2, j + 6, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 6, k + 0, 0);
				world.setBlock(i + 3, j + 6, k + 1, 0);
				world.setBlock(i + 3, j + 6, k + 2, 0);
				world.setBlock(i + 3, j + 6, k + 3, 0);
				world.setBlock(i + 3, j + 6, k + 4, 0);
				world.setBlock(i + 3, j + 6, k + 5, 0);
				world.setBlock(i + 3, j + 6, k + 6, 0);
				world.setBlock(i + 3, j + 6, k + 7, 0);
				world.setBlock(i + 3, j + 6, k + 8, 0);
				world.setBlock(i + 3, j + 6, k + 9, 0);
				world.setBlock(i + 3, j + 6, k + 10, 0);
				world.setBlock(i + 3, j + 6, k + 11, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 6, k + 0, 0);
				world.setBlock(i + 4, j + 6, k + 1, 0);
				world.setBlock(i + 4, j + 6, k + 2, 0);
				world.setBlock(i + 4, j + 6, k + 3, 0);
				world.setBlock(i + 4, j + 6, k + 4, 0);
				world.setBlock(i + 4, j + 6, k + 7, 0);
				world.setBlock(i + 4, j + 6, k + 8, 0);
				world.setBlock(i + 4, j + 6, k + 9, 0);
				world.setBlock(i + 4, j + 6, k + 10, 0);
				world.setBlock(i + 4, j + 6, k + 11, 0);
				world.setBlock(i + 4, j + 6, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 6, k + 0, 0);
				world.setBlock(i + 5, j + 6, k + 1, 0);
				world.setBlock(i + 5, j + 6, k + 2, 0);
				world.setBlock(i + 5, j + 6, k + 3, 0);
				world.setBlock(i + 5, j + 6, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 6, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 6, k + 8, 0);
				world.setBlock(i + 5, j + 6, k + 9, 0);
				world.setBlock(i + 5, j + 6, k + 10, 0);
				world.setBlock(i + 5, j + 6, k + 11, 0);
				world.setBlock(i + 5, j + 6, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 6, k + 0, 0);
				world.setBlock(i + 6, j + 6, k + 1, 0);
				world.setBlock(i + 6, j + 6, k + 2, 0);
				world.setBlock(i + 6, j + 6, k + 3, 0);
				world.setBlock(i + 6, j + 6, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 6, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 6, k + 8, 0);
				world.setBlock(i + 6, j + 6, k + 9, 0);
				world.setBlock(i + 6, j + 6, k + 10, 0);
				world.setBlock(i + 6, j + 6, k + 11, 0);
				world.setBlock(i + 6, j + 6, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 6, k + 0, 0);
				world.setBlock(i + 7, j + 6, k + 1, 0);
				world.setBlock(i + 7, j + 6, k + 2, 0);
				world.setBlock(i + 7, j + 6, k + 3, 0);
				world.setBlock(i + 7, j + 6, k + 4, 0);
				world.setBlock(i + 7, j + 6, k + 7, 0);
				world.setBlock(i + 7, j + 6, k + 8, 0);
				world.setBlock(i + 7, j + 6, k + 9, 0);
				world.setBlock(i + 7, j + 6, k + 10, 0);
				world.setBlock(i + 7, j + 6, k + 11, 0);
				world.setBlock(i + 7, j + 6, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 6, k + 0, 0);
				world.setBlock(i + 8, j + 6, k + 1, 0);
				world.setBlock(i + 8, j + 6, k + 2, 0);
				world.setBlock(i + 8, j + 6, k + 3, 0);
				world.setBlock(i + 8, j + 6, k + 4, 0);
				world.setBlock(i + 8, j + 6, k + 5, 0);
				world.setBlock(i + 8, j + 6, k + 6, 0);
				world.setBlock(i + 8, j + 6, k + 7, 0);
				world.setBlock(i + 8, j + 6, k + 8, 0);
				world.setBlock(i + 8, j + 6, k + 9, 0);
				world.setBlock(i + 8, j + 6, k + 10, 0);
				world.setBlock(i + 8, j + 6, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 6, k + 0, 0);
				world.setBlock(i + 9, j + 6, k + 1, 0);
				world.setBlock(i + 9, j + 6, k + 2, 0);
				world.setBlock(i + 9, j + 6, k + 3, 0);
				world.setBlock(i + 9, j + 6, k + 4, 0);
				world.setBlock(i + 9, j + 6, k + 5, 0);
				world.setBlock(i + 9, j + 6, k + 6, 0);
				world.setBlock(i + 9, j + 6, k + 7, 0);
				world.setBlock(i + 9, j + 6, k + 8, 0);
				world.setBlock(i + 9, j + 6, k + 9, 0);
				world.setBlock(i + 9, j + 6, k + 10, 0);
				world.setBlock(i + 9, j + 6, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 6, k + 0, 0);
				world.setBlock(i + 10, j + 6, k + 1, 0);
				world.setBlock(i + 10, j + 6, k + 2, 0);
				world.setBlock(i + 10, j + 6, k + 3, 0);
				world.setBlock(i + 10, j + 6, k + 4, 0);
				world.setBlock(i + 10, j + 6, k + 5, 0);
				world.setBlock(i + 10, j + 6, k + 6, 0);
				world.setBlock(i + 10, j + 6, k + 7, 0);
				world.setBlock(i + 10, j + 6, k + 8, 0);
				world.setBlock(i + 10, j + 6, k + 9, 0);
				world.setBlock(i + 10, j + 6, k + 10, 0);
				world.setBlock(i + 10, j + 6, k + 11, 0);
				world.setBlock(i + 10, j + 6, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 6, k + 0, 0);
				world.setBlock(i + 11, j + 6, k + 1, 0);
				world.setBlock(i + 11, j + 6, k + 2, 0);
				world.setBlock(i + 11, j + 6, k + 3, 0);
				world.setBlock(i + 11, j + 6, k + 4, 0);
				world.setBlock(i + 11, j + 6, k + 5, 0);
				world.setBlock(i + 11, j + 6, k + 6, 0);
				world.setBlock(i + 11, j + 6, k + 7, 0);
				world.setBlock(i + 11, j + 6, k + 8, 0);
				world.setBlock(i + 11, j + 6, k + 9, 0);
				world.setBlock(i + 11, j + 6, k + 10, 0);
				world.setBlock(i + 11, j + 6, k + 11, 0);
				world.setBlock(i + 11, j + 6, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 6, k + 0, 0);
				world.setBlock(i + 12, j + 6, k + 2, 0);
				world.setBlock(i + 12, j + 6, k + 3, 0);
				world.setBlock(i + 12, j + 6, k + 4, 0);
				world.setBlock(i + 12, j + 6, k + 5, 0);
				world.setBlock(i + 12, j + 6, k + 7, 0);
				world.setBlock(i + 12, j + 6, k + 8, 0);
				world.setBlock(i + 12, j + 6, k + 9, 0);
				world.setBlock(i + 12, j + 6, k + 10, 0);
				world.setBlock(i + 12, j + 6, k + 11, 0);
				world.setBlock(i + 12, j + 6, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 6, k + 0, 0);
				world.setBlock(i + 13, j + 6, k + 1, 0);
				world.setBlock(i + 13, j + 6, k + 2, 0);
				world.setBlock(i + 13, j + 6, k + 3, 0);
				world.setBlock(i + 13, j + 6, k + 4, 0);
				world.setBlock(i + 13, j + 6, k + 5, 0);
				world.setBlock(i + 13, j + 6, k + 6, 0);
				world.setBlock(i + 13, j + 6, k + 7, 0);
				world.setBlock(i + 13, j + 6, k + 8, 0);
				world.setBlock(i + 13, j + 6, k + 9, 0);
				world.setBlock(i + 13, j + 6, k + 10, 0);
				world.setBlock(i + 13, j + 6, k + 11, 0);
				world.setBlock(i + 13, j + 6, k + 12, 0);
			}
		},
		{//y = 7
			{//x = 0
				world.setBlock(i + 0, j + 7, k + 0, 0);
				world.setBlock(i + 0, j + 7, k + 1, 0);
				world.setBlock(i + 0, j + 7, k + 2, 0);
				world.setBlock(i + 0, j + 7, k + 3, 0);
				world.setBlock(i + 0, j + 7, k + 4, 0);
				world.setBlock(i + 0, j + 7, k + 5, 0);
				world.setBlock(i + 0, j + 7, k + 6, 0);
				world.setBlock(i + 0, j + 7, k + 7, 0);
				world.setBlock(i + 0, j + 7, k + 8, 0);
				world.setBlock(i + 0, j + 7, k + 9, 0);
				world.setBlock(i + 0, j + 7, k + 10, 0);
				world.setBlock(i + 0, j + 7, k + 11, 0);
				world.setBlock(i + 0, j + 7, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 7, k + 0, 0);
				world.setBlock(i + 1, j + 7, k + 1, 0);
				world.setBlock(i + 1, j + 7, k + 2, 0);
				world.setBlock(i + 1, j + 7, k + 3, 0);
				world.setBlock(i + 1, j + 7, k + 4, 0);
				world.setBlock(i + 1, j + 7, k + 5, 0);
				world.setBlock(i + 1, j + 7, k + 6, 0);
				world.setBlock(i + 1, j + 7, k + 7, 0);
				world.setBlock(i + 1, j + 7, k + 8, 0);
				world.setBlock(i + 1, j + 7, k + 9, 0);
				world.setBlock(i + 1, j + 7, k + 10, 0);
				world.setBlock(i + 1, j + 7, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 7, k + 0, 0);
				world.setBlock(i + 2, j + 7, k + 1, 0);
				world.setBlock(i + 2, j + 7, k + 2, 0);
				world.setBlock(i + 2, j + 7, k + 3, 0);
				world.setBlock(i + 2, j + 7, k + 4, 0);
				world.setBlock(i + 2, j + 7, k + 5, 0);
				world.setBlock(i + 2, j + 7, k + 6, 0);
				world.setBlock(i + 2, j + 7, k + 7, 0);
				world.setBlock(i + 2, j + 7, k + 8, 0);
				world.setBlock(i + 2, j + 7, k + 9, 0);
				world.setBlock(i + 2, j + 7, k + 10, 0);
				world.setBlock(i + 2, j + 7, k + 11, 0);
				world.setBlock(i + 2, j + 7, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 7, k + 0, 0);
				world.setBlock(i + 3, j + 7, k + 1, 0);
				world.setBlock(i + 3, j + 7, k + 2, 0);
				world.setBlock(i + 3, j + 7, k + 3, 0);
				world.setBlock(i + 3, j + 7, k + 4, 0);
				world.setBlock(i + 3, j + 7, k + 5, 0);
				world.setBlock(i + 3, j + 7, k + 6, 0);
				world.setBlock(i + 3, j + 7, k + 7, 0);
				world.setBlock(i + 3, j + 7, k + 8, 0);
				world.setBlock(i + 3, j + 7, k + 9, 0);
				world.setBlock(i + 3, j + 7, k + 10, 0);
				world.setBlock(i + 3, j + 7, k + 11, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 7, k + 0, 0);
				world.setBlock(i + 4, j + 7, k + 1, 0);
				world.setBlock(i + 4, j + 7, k + 2, 0);
				world.setBlock(i + 4, j + 7, k + 3, 0);
				world.setBlock(i + 4, j + 7, k + 4, 0);
				world.setBlock(i + 4, j + 7, k + 7, 0);
				world.setBlock(i + 4, j + 7, k + 8, 0);
				world.setBlock(i + 4, j + 7, k + 9, 0);
				world.setBlock(i + 4, j + 7, k + 10, 0);
				world.setBlock(i + 4, j + 7, k + 11, 0);
				world.setBlock(i + 4, j + 7, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 7, k + 0, 0);
				world.setBlock(i + 5, j + 7, k + 1, 0);
				world.setBlock(i + 5, j + 7, k + 2, 0);
				world.setBlock(i + 5, j + 7, k + 3, 0);
				world.setBlock(i + 5, j + 7, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 7, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 7, k + 8, 0);
				world.setBlock(i + 5, j + 7, k + 9, 0);
				world.setBlock(i + 5, j + 7, k + 10, 0);
				world.setBlock(i + 5, j + 7, k + 11, 0);
				world.setBlock(i + 5, j + 7, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 7, k + 0, 0);
				world.setBlock(i + 6, j + 7, k + 1, 0);
				world.setBlock(i + 6, j + 7, k + 2, 0);
				world.setBlock(i + 6, j + 7, k + 3, 0);
				world.setBlock(i + 6, j + 7, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 7, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 7, k + 8, 0);
				world.setBlock(i + 6, j + 7, k + 9, 0);
				world.setBlock(i + 6, j + 7, k + 10, 0);
				world.setBlock(i + 6, j + 7, k + 11, 0);
				world.setBlock(i + 6, j + 7, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 7, k + 0, 0);
				world.setBlock(i + 7, j + 7, k + 1, 0);
				world.setBlock(i + 7, j + 7, k + 2, 0);
				world.setBlock(i + 7, j + 7, k + 3, 0);
				world.setBlock(i + 7, j + 7, k + 4, 0);
				world.setBlock(i + 7, j + 7, k + 5, 0);
				world.setBlock(i + 7, j + 7, k + 7, 0);
				world.setBlock(i + 7, j + 7, k + 8, 0);
				world.setBlock(i + 7, j + 7, k + 9, 0);
				world.setBlock(i + 7, j + 7, k + 10, 0);
				world.setBlock(i + 7, j + 7, k + 11, 0);
				world.setBlock(i + 7, j + 7, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 7, k + 0, 0);
				world.setBlock(i + 8, j + 7, k + 1, 0);
				world.setBlock(i + 8, j + 7, k + 2, 0);
				world.setBlock(i + 8, j + 7, k + 3, 0);
				world.setBlock(i + 8, j + 7, k + 4, 0);
				world.setBlock(i + 8, j + 7, k + 5, 0);
				world.setBlock(i + 8, j + 7, k + 6, 0);
				world.setBlock(i + 8, j + 7, k + 7, 0);
				world.setBlock(i + 8, j + 7, k + 8, 0);
				world.setBlock(i + 8, j + 7, k + 9, 0);
				world.setBlock(i + 8, j + 7, k + 10, 0);
				world.setBlock(i + 8, j + 7, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 7, k + 0, 0);
				world.setBlock(i + 9, j + 7, k + 1, 0);
				world.setBlock(i + 9, j + 7, k + 2, 0);
				world.setBlock(i + 9, j + 7, k + 3, 0);
				world.setBlock(i + 9, j + 7, k + 4, 0);
				world.setBlock(i + 9, j + 7, k + 5, 0);
				world.setBlock(i + 9, j + 7, k + 6, 0);
				world.setBlock(i + 9, j + 7, k + 7, 0);
				world.setBlock(i + 9, j + 7, k + 8, 0);
				world.setBlock(i + 9, j + 7, k + 9, 0);
				world.setBlock(i + 9, j + 7, k + 10, 0);
				world.setBlock(i + 9, j + 7, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 7, k + 0, 0);
				world.setBlock(i + 10, j + 7, k + 1, 0);
				world.setBlock(i + 10, j + 7, k + 2, 0);
				world.setBlock(i + 10, j + 7, k + 3, 0);
				world.setBlock(i + 10, j + 7, k + 4, 0);
				world.setBlock(i + 10, j + 7, k + 5, 0);
				world.setBlock(i + 10, j + 7, k + 6, 0);
				world.setBlock(i + 10, j + 7, k + 7, 0);
				world.setBlock(i + 10, j + 7, k + 8, 0);
				world.setBlock(i + 10, j + 7, k + 9, 0);
				world.setBlock(i + 10, j + 7, k + 10, 0);
				world.setBlock(i + 10, j + 7, k + 11, 0);
				world.setBlock(i + 10, j + 7, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 7, k + 0, 0);
				world.setBlock(i + 11, j + 7, k + 1, 0);
				world.setBlock(i + 11, j + 7, k + 2, 0);
				world.setBlock(i + 11, j + 7, k + 3, 0);
				world.setBlock(i + 11, j + 7, k + 4, 0);
				world.setBlock(i + 11, j + 7, k + 5, 0);
				world.setBlock(i + 11, j + 7, k + 6, 0);
				world.setBlock(i + 11, j + 7, k + 7, 0);
				world.setBlock(i + 11, j + 7, k + 8, 0);
				world.setBlock(i + 11, j + 7, k + 9, 0);
				world.setBlock(i + 11, j + 7, k + 10, 0);
				world.setBlock(i + 11, j + 7, k + 11, 0);
				world.setBlock(i + 11, j + 7, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 7, k + 0, 0);
				world.setBlock(i + 12, j + 7, k + 2, 0);
				world.setBlock(i + 12, j + 7, k + 3, 0);
				world.setBlock(i + 12, j + 7, k + 4, 0);
				world.setBlock(i + 12, j + 7, k + 5, 0);
				world.setBlock(i + 12, j + 7, k + 7, 0);
				world.setBlock(i + 12, j + 7, k + 8, 0);
				world.setBlock(i + 12, j + 7, k + 9, 0);
				world.setBlock(i + 12, j + 7, k + 10, 0);
				world.setBlock(i + 12, j + 7, k + 11, 0);
				world.setBlock(i + 12, j + 7, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 7, k + 0, 0);
				world.setBlock(i + 13, j + 7, k + 1, 0);
				world.setBlock(i + 13, j + 7, k + 2, 0);
				world.setBlock(i + 13, j + 7, k + 3, 0);
				world.setBlock(i + 13, j + 7, k + 4, 0);
				world.setBlock(i + 13, j + 7, k + 5, 0);
				world.setBlock(i + 13, j + 7, k + 6, 0);
				world.setBlock(i + 13, j + 7, k + 7, 0);
				world.setBlock(i + 13, j + 7, k + 8, 0);
				world.setBlock(i + 13, j + 7, k + 9, 0);
				world.setBlock(i + 13, j + 7, k + 10, 0);
				world.setBlock(i + 13, j + 7, k + 11, 0);
				world.setBlock(i + 13, j + 7, k + 12, 0);
			}
		},
		{//y = 8
			{//x = 0
				world.setBlock(i + 0, j + 8, k + 0, 0);
				world.setBlock(i + 0, j + 8, k + 1, 0);
				world.setBlock(i + 0, j + 8, k + 2, 0);
				world.setBlock(i + 0, j + 8, k + 3, 0);
				world.setBlock(i + 0, j + 8, k + 4, 0);
				world.setBlock(i + 0, j + 8, k + 5, 0);
				world.setBlock(i + 0, j + 8, k + 6, 0);
				world.setBlock(i + 0, j + 8, k + 7, 0);
				world.setBlock(i + 0, j + 8, k + 8, 0);
				world.setBlock(i + 0, j + 8, k + 9, 0);
				world.setBlock(i + 0, j + 8, k + 10, 0);
				world.setBlock(i + 0, j + 8, k + 11, 0);
				world.setBlock(i + 0, j + 8, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 8, k + 0, 0);
				world.setBlock(i + 1, j + 8, k + 1, 0);
				world.setBlock(i + 1, j + 8, k + 2, 0);
				world.setBlock(i + 1, j + 8, k + 3, 0);
				world.setBlock(i + 1, j + 8, k + 4, 0);
				world.setBlock(i + 1, j + 8, k + 5, 0);
				world.setBlock(i + 1, j + 8, k + 6, 0);
				world.setBlock(i + 1, j + 8, k + 7, 0);
				world.setBlock(i + 1, j + 8, k + 8, 0);
				world.setBlock(i + 1, j + 8, k + 9, 0);
				world.setBlock(i + 1, j + 8, k + 10, 0);
				world.setBlock(i + 1, j + 8, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 8, k + 0, 0);
				world.setBlock(i + 2, j + 8, k + 1, 0);
				world.setBlock(i + 2, j + 8, k + 2, 0);
				world.setBlock(i + 2, j + 8, k + 3, 0);
				world.setBlock(i + 2, j + 8, k + 4, 0);
				world.setBlock(i + 2, j + 8, k + 5, 0);
				world.setBlock(i + 2, j + 8, k + 6, 0);
				world.setBlock(i + 2, j + 8, k + 7, 0);
				world.setBlock(i + 2, j + 8, k + 8, 0);
				world.setBlock(i + 2, j + 8, k + 9, 0);
				world.setBlock(i + 2, j + 8, k + 10, 0);
				world.setBlock(i + 2, j + 8, k + 11, 0);
				world.setBlock(i + 2, j + 8, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 8, k + 0, 0);
				world.setBlock(i + 3, j + 8, k + 1, 0);
				world.setBlock(i + 3, j + 8, k + 2, 0);
				world.setBlock(i + 3, j + 8, k + 3, 0);
				world.setBlock(i + 3, j + 8, k + 4, 0);
				world.setBlock(i + 3, j + 8, k + 5, 0);
				world.setBlock(i + 3, j + 8, k + 6, 0);
				world.setBlock(i + 3, j + 8, k + 7, 0);
				world.setBlock(i + 3, j + 8, k + 8, 0);
				world.setBlock(i + 3, j + 8, k + 9, 0);
				world.setBlock(i + 3, j + 8, k + 10, 0);
				world.setBlock(i + 3, j + 8, k + 11, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 8, k + 0, 0);
				world.setBlock(i + 4, j + 8, k + 1, 0);
				world.setBlock(i + 4, j + 8, k + 2, 0);
				world.setBlock(i + 4, j + 8, k + 3, 0);
				world.setBlock(i + 4, j + 8, k + 4, 0);
				world.setBlock(i + 4, j + 8, k + 5, 0);
				world.setBlock(i + 4, j + 8, k + 7, 0);
				world.setBlock(i + 4, j + 8, k + 8, 0);
				world.setBlock(i + 4, j + 8, k + 9, 0);
				world.setBlock(i + 4, j + 8, k + 10, 0);
				world.setBlock(i + 4, j + 8, k + 11, 0);
				world.setBlock(i + 4, j + 8, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 8, k + 0, 0);
				world.setBlock(i + 5, j + 8, k + 1, 0);
				world.setBlock(i + 5, j + 8, k + 2, 0);
				world.setBlock(i + 5, j + 8, k + 3, 0);
				world.setBlock(i + 5, j + 8, k + 4, 0);
				world.setBlock(i + 5, j + 8, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 8, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 8, k + 8, 0);
				world.setBlock(i + 5, j + 8, k + 9, 0);
				world.setBlock(i + 5, j + 8, k + 10, 0);
				world.setBlock(i + 5, j + 8, k + 11, 0);
				world.setBlock(i + 5, j + 8, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 8, k + 0, 0);
				world.setBlock(i + 6, j + 8, k + 1, 0);
				world.setBlock(i + 6, j + 8, k + 2, 0);
				world.setBlock(i + 6, j + 8, k + 3, 0);
				world.setBlock(i + 6, j + 8, k + 4, 0);
				world.setBlock(i + 6, j + 8, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 8, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 8, k + 8, 0);
				world.setBlock(i + 6, j + 8, k + 9, 0);
				world.setBlock(i + 6, j + 8, k + 10, 0);
				world.setBlock(i + 6, j + 8, k + 11, 0);
				world.setBlock(i + 6, j + 8, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 8, k + 0, 0);
				world.setBlock(i + 7, j + 8, k + 1, 0);
				world.setBlock(i + 7, j + 8, k + 2, 0);
				world.setBlock(i + 7, j + 8, k + 3, 0);
				world.setBlock(i + 7, j + 8, k + 4, 0);
				world.setBlock(i + 7, j + 8, k + 5, 0);
				world.setBlock(i + 7, j + 8, k + 7, 0);
				world.setBlock(i + 7, j + 8, k + 8, 0);
				world.setBlock(i + 7, j + 8, k + 9, 0);
				world.setBlock(i + 7, j + 8, k + 10, 0);
				world.setBlock(i + 7, j + 8, k + 11, 0);
				world.setBlock(i + 7, j + 8, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 8, k + 0, 0);
				world.setBlock(i + 8, j + 8, k + 1, 0);
				world.setBlock(i + 8, j + 8, k + 2, 0);
				world.setBlock(i + 8, j + 8, k + 3, 0);
				world.setBlock(i + 8, j + 8, k + 4, 0);
				world.setBlock(i + 8, j + 8, k + 5, 0);
				world.setBlock(i + 8, j + 8, k + 6, 0);
				world.setBlock(i + 8, j + 8, k + 7, 0);
				world.setBlock(i + 8, j + 8, k + 8, 0);
				world.setBlock(i + 8, j + 8, k + 9, 0);
				world.setBlock(i + 8, j + 8, k + 10, 0);
				world.setBlock(i + 8, j + 8, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 8, k + 1, 0);
				world.setBlock(i + 9, j + 8, k + 2, 0);
				world.setBlock(i + 9, j + 8, k + 3, 0);
				world.setBlock(i + 9, j + 8, k + 4, 0);
				world.setBlock(i + 9, j + 8, k + 5, 0);
				world.setBlock(i + 9, j + 8, k + 6, 0);
				world.setBlock(i + 9, j + 8, k + 7, 0);
				world.setBlock(i + 9, j + 8, k + 8, 0);
				world.setBlock(i + 9, j + 8, k + 9, 0);
				world.setBlock(i + 9, j + 8, k + 10, 0);
				world.setBlock(i + 9, j + 8, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 8, k + 0, 0);
				world.setBlock(i + 10, j + 8, k + 1, 0);
				world.setBlock(i + 10, j + 8, k + 2, 0);
				world.setBlock(i + 10, j + 8, k + 3, 0);
				world.setBlock(i + 10, j + 8, k + 4, 0);
				world.setBlock(i + 10, j + 8, k + 5, 0);
				world.setBlock(i + 10, j + 8, k + 6, 0);
				world.setBlock(i + 10, j + 8, k + 7, 0);
				world.setBlock(i + 10, j + 8, k + 8, 0);
				world.setBlock(i + 10, j + 8, k + 9, 0);
				world.setBlock(i + 10, j + 8, k + 10, 0);
				world.setBlock(i + 10, j + 8, k + 11, 0);
				world.setBlock(i + 10, j + 8, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 8, k + 0, 0);
				world.setBlock(i + 11, j + 8, k + 1, 0);
				world.setBlock(i + 11, j + 8, k + 2, 0);
				world.setBlock(i + 11, j + 8, k + 3, 0);
				world.setBlock(i + 11, j + 8, k + 4, 0);
				world.setBlock(i + 11, j + 8, k + 5, 0);
				world.setBlock(i + 11, j + 8, k + 6, 0);
				world.setBlock(i + 11, j + 8, k + 7, 0);
				world.setBlock(i + 11, j + 8, k + 8, 0);
				world.setBlock(i + 11, j + 8, k + 9, 0);
				world.setBlock(i + 11, j + 8, k + 10, 0);
				world.setBlock(i + 11, j + 8, k + 11, 0);
				world.setBlock(i + 11, j + 8, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 8, k + 0, 0);
				world.setBlock(i + 12, j + 8, k + 2, 0);
				world.setBlock(i + 12, j + 8, k + 3, 0);
				world.setBlock(i + 12, j + 8, k + 4, 0);
				world.setBlock(i + 12, j + 8, k + 5, 0);
				world.setBlock(i + 12, j + 8, k + 7, 0);
				world.setBlock(i + 12, j + 8, k + 8, 0);
				world.setBlock(i + 12, j + 8, k + 9, 0);
				world.setBlock(i + 12, j + 8, k + 10, 0);
				world.setBlock(i + 12, j + 8, k + 11, 0);
				world.setBlock(i + 12, j + 8, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 8, k + 0, 0);
				world.setBlock(i + 13, j + 8, k + 1, 0);
				world.setBlock(i + 13, j + 8, k + 2, 0);
				world.setBlock(i + 13, j + 8, k + 3, 0);
				world.setBlock(i + 13, j + 8, k + 4, 0);
				world.setBlock(i + 13, j + 8, k + 5, 0);
				world.setBlock(i + 13, j + 8, k + 6, 0);
				world.setBlock(i + 13, j + 8, k + 7, 0);
				world.setBlock(i + 13, j + 8, k + 8, 0);
				world.setBlock(i + 13, j + 8, k + 9, 0);
				world.setBlock(i + 13, j + 8, k + 10, 0);
				world.setBlock(i + 13, j + 8, k + 11, 0);
				world.setBlock(i + 13, j + 8, k + 12, 0);
			}
		},
		{//y = 9
			{//x = 0
				world.setBlock(i + 0, j + 9, k + 0, 0);
				world.setBlock(i + 0, j + 9, k + 1, 0);
				world.setBlock(i + 0, j + 9, k + 2, 0);
				world.setBlock(i + 0, j + 9, k + 3, 0);
				world.setBlock(i + 0, j + 9, k + 4, 0);
				world.setBlock(i + 0, j + 9, k + 5, 0);
				world.setBlock(i + 0, j + 9, k + 6, 0);
				world.setBlock(i + 0, j + 9, k + 7, 0);
				world.setBlock(i + 0, j + 9, k + 8, 0);
				world.setBlock(i + 0, j + 9, k + 9, 0);
				world.setBlock(i + 0, j + 9, k + 10, 0);
				world.setBlock(i + 0, j + 9, k + 11, 0);
				world.setBlock(i + 0, j + 9, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 9, k + 0, 0);
				world.setBlock(i + 1, j + 9, k + 1, 0);
				world.setBlock(i + 1, j + 9, k + 2, 0);
				world.setBlock(i + 1, j + 9, k + 3, 0);
				world.setBlock(i + 1, j + 9, k + 4, 0);
				world.setBlock(i + 1, j + 9, k + 5, 0);
				world.setBlock(i + 1, j + 9, k + 6, 0);
				world.setBlock(i + 1, j + 9, k + 7, 0);
				world.setBlock(i + 1, j + 9, k + 8, 0);
				world.setBlock(i + 1, j + 9, k + 9, 0);
				world.setBlock(i + 1, j + 9, k + 10, 0);
				world.setBlock(i + 1, j + 9, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 9, k + 0, 0);
				world.setBlock(i + 2, j + 9, k + 1, 0);
				world.setBlock(i + 2, j + 9, k + 2, 0);
				world.setBlock(i + 2, j + 9, k + 3, 0);
				world.setBlock(i + 2, j + 9, k + 4, 0);
				world.setBlock(i + 2, j + 9, k + 5, 0);
				world.setBlock(i + 2, j + 9, k + 6, 0);
				world.setBlock(i + 2, j + 9, k + 7, 0);
				world.setBlock(i + 2, j + 9, k + 8, 0);
				world.setBlock(i + 2, j + 9, k + 9, 0);
				world.setBlock(i + 2, j + 9, k + 10, 0);
				world.setBlock(i + 2, j + 9, k + 11, 0);
				world.setBlock(i + 2, j + 9, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 9, k + 0, 0);
				world.setBlock(i + 3, j + 9, k + 1, 0);
				world.setBlock(i + 3, j + 9, k + 2, 0);
				world.setBlock(i + 3, j + 9, k + 3, 0);
				world.setBlock(i + 3, j + 9, k + 4, 0);
				world.setBlock(i + 3, j + 9, k + 5, 0);
				world.setBlock(i + 3, j + 9, k + 6, 0);
				world.setBlock(i + 3, j + 9, k + 7, 0);
				world.setBlock(i + 3, j + 9, k + 8, 0);
				world.setBlock(i + 3, j + 9, k + 9, 0);
				world.setBlock(i + 3, j + 9, k + 10, 0);
				world.setBlock(i + 3, j + 9, k + 11, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 9, k + 0, 0);
				world.setBlock(i + 4, j + 9, k + 1, 0);
				world.setBlock(i + 4, j + 9, k + 2, 0);
				world.setBlock(i + 4, j + 9, k + 3, 0);
				world.setBlock(i + 4, j + 9, k + 4, 0);
				world.setBlock(i + 4, j + 9, k + 5, 0);
				world.setBlock(i + 4, j + 9, k + 7, 0);
				world.setBlock(i + 4, j + 9, k + 8, 0);
				world.setBlock(i + 4, j + 9, k + 9, 0);
				world.setBlock(i + 4, j + 9, k + 10, 0);
				world.setBlock(i + 4, j + 9, k + 11, 0);
				world.setBlock(i + 4, j + 9, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 9, k + 0, 0);
				world.setBlock(i + 5, j + 9, k + 1, 0);
				world.setBlock(i + 5, j + 9, k + 2, 0);
				world.setBlock(i + 5, j + 9, k + 3, 0);
				world.setBlock(i + 5, j + 9, k + 4, 0);
				world.setBlock(i + 5, j + 9, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 9, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 9, k + 8, 0);
				world.setBlock(i + 5, j + 9, k + 9, 0);
				world.setBlock(i + 5, j + 9, k + 10, 0);
				world.setBlock(i + 5, j + 9, k + 11, 0);
				world.setBlock(i + 5, j + 9, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 9, k + 0, 0);
				world.setBlock(i + 6, j + 9, k + 1, 0);
				world.setBlock(i + 6, j + 9, k + 2, 0);
				world.setBlock(i + 6, j + 9, k + 3, 0);
				world.setBlock(i + 6, j + 9, k + 4, 0);
				world.setBlock(i + 6, j + 9, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 9, k + 6, Block.wood.blockID, 3);
				world.setBlock(i + 6, j + 9, k + 8, 0);
				world.setBlock(i + 6, j + 9, k + 9, 0);
				world.setBlock(i + 6, j + 9, k + 10, 0);
				world.setBlock(i + 6, j + 9, k + 11, 0);
				world.setBlock(i + 6, j + 9, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 9, k + 0, 0);
				world.setBlock(i + 7, j + 9, k + 1, 0);
				world.setBlock(i + 7, j + 9, k + 2, 0);
				world.setBlock(i + 7, j + 9, k + 3, 0);
				world.setBlock(i + 7, j + 9, k + 4, 0);
				world.setBlock(i + 7, j + 9, k + 5, 0);
				world.setBlock(i + 7, j + 9, k + 7, 0);
				world.setBlock(i + 7, j + 9, k + 8, 0);
				world.setBlock(i + 7, j + 9, k + 9, 0);
				world.setBlock(i + 7, j + 9, k + 10, 0);
				world.setBlock(i + 7, j + 9, k + 11, 0);
				world.setBlock(i + 7, j + 9, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 9, k + 0, 0);
				world.setBlock(i + 8, j + 9, k + 1, 0);
				world.setBlock(i + 8, j + 9, k + 2, 0);
				world.setBlock(i + 8, j + 9, k + 3, 0);
				world.setBlock(i + 8, j + 9, k + 4, 0);
				world.setBlock(i + 8, j + 9, k + 5, 0);
				world.setBlock(i + 8, j + 9, k + 6, 0);
				world.setBlock(i + 8, j + 9, k + 7, 0);
				world.setBlock(i + 8, j + 9, k + 8, 0);
				world.setBlock(i + 8, j + 9, k + 9, 0);
				world.setBlock(i + 8, j + 9, k + 10, 0);
				world.setBlock(i + 8, j + 9, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 9, k + 1, 0);
				world.setBlock(i + 9, j + 9, k + 2, 0);
				world.setBlock(i + 9, j + 9, k + 3, 0);
				world.setBlock(i + 9, j + 9, k + 4, 0);
				world.setBlock(i + 9, j + 9, k + 5, 0);
				world.setBlock(i + 9, j + 9, k + 6, 0);
				world.setBlock(i + 9, j + 9, k + 7, 0);
				world.setBlock(i + 9, j + 9, k + 8, 0);
				world.setBlock(i + 9, j + 9, k + 9, 0);
				world.setBlock(i + 9, j + 9, k + 10, 0);
				world.setBlock(i + 9, j + 9, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 9, k + 0, 0);
				world.setBlock(i + 10, j + 9, k + 1, 0);
				world.setBlock(i + 10, j + 9, k + 2, 0);
				world.setBlock(i + 10, j + 9, k + 3, 0);
				world.setBlock(i + 10, j + 9, k + 4, 0);
				world.setBlock(i + 10, j + 9, k + 5, 0);
				world.setBlock(i + 10, j + 9, k + 6, 0);
				world.setBlock(i + 10, j + 9, k + 7, 0);
				world.setBlock(i + 10, j + 9, k + 8, 0);
				world.setBlock(i + 10, j + 9, k + 9, 0);
				world.setBlock(i + 10, j + 9, k + 10, 0);
				world.setBlock(i + 10, j + 9, k + 11, 0);
				world.setBlock(i + 10, j + 9, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 9, k + 0, 0);
				world.setBlock(i + 11, j + 9, k + 1, 0);
				world.setBlock(i + 11, j + 9, k + 2, 0);
				world.setBlock(i + 11, j + 9, k + 3, 0);
				world.setBlock(i + 11, j + 9, k + 4, 0);
				world.setBlock(i + 11, j + 9, k + 5, 0);
				world.setBlock(i + 11, j + 9, k + 6, 0);
				world.setBlock(i + 11, j + 9, k + 7, 0);
				world.setBlock(i + 11, j + 9, k + 8, 0);
				world.setBlock(i + 11, j + 9, k + 9, 0);
				world.setBlock(i + 11, j + 9, k + 10, 0);
				world.setBlock(i + 11, j + 9, k + 11, 0);
				world.setBlock(i + 11, j + 9, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 9, k + 0, 0);
				world.setBlock(i + 12, j + 9, k + 2, 0);
				world.setBlock(i + 12, j + 9, k + 3, 0);
				world.setBlock(i + 12, j + 9, k + 4, 0);
				world.setBlock(i + 12, j + 9, k + 5, 0);
				world.setBlock(i + 12, j + 9, k + 7, 0);
				world.setBlock(i + 12, j + 9, k + 8, 0);
				world.setBlock(i + 12, j + 9, k + 9, 0);
				world.setBlock(i + 12, j + 9, k + 10, 0);
				world.setBlock(i + 12, j + 9, k + 11, 0);
				world.setBlock(i + 12, j + 9, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 9, k + 0, 0);
				world.setBlock(i + 13, j + 9, k + 1, 0);
				world.setBlock(i + 13, j + 9, k + 2, 0);
				world.setBlock(i + 13, j + 9, k + 4, 0);
				world.setBlock(i + 13, j + 9, k + 5, 0);
				world.setBlock(i + 13, j + 9, k + 6, 0);
				world.setBlock(i + 13, j + 9, k + 7, 0);
				world.setBlock(i + 13, j + 9, k + 8, 0);
				world.setBlock(i + 13, j + 9, k + 9, 0);
				world.setBlock(i + 13, j + 9, k + 10, 0);
				world.setBlock(i + 13, j + 9, k + 11, 0);
				world.setBlock(i + 13, j + 9, k + 12, 0);
			}
		},
		{//y = 10
			{//x = 0
				world.setBlock(i + 0, j + 10, k + 0, 0);
				world.setBlock(i + 0, j + 10, k + 1, 0);
				world.setBlock(i + 0, j + 10, k + 2, 0);
				world.setBlock(i + 0, j + 10, k + 3, 0);
				world.setBlock(i + 0, j + 10, k + 4, 0);
				world.setBlock(i + 0, j + 10, k + 5, 0);
				world.setBlock(i + 0, j + 10, k + 6, 0);
				world.setBlock(i + 0, j + 10, k + 7, 0);
				world.setBlock(i + 0, j + 10, k + 8, 0);
				world.setBlock(i + 0, j + 10, k + 9, 0);
				world.setBlock(i + 0, j + 10, k + 10, 0);
				world.setBlock(i + 0, j + 10, k + 11, 0);
				world.setBlock(i + 0, j + 10, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 10, k + 0, 0);
				world.setBlock(i + 1, j + 10, k + 1, 0);
				world.setBlock(i + 1, j + 10, k + 2, 0);
				world.setBlock(i + 1, j + 10, k + 3, 0);
				world.setBlock(i + 1, j + 10, k + 4, 0);
				world.setBlock(i + 1, j + 10, k + 5, Block.planks.blockID, 1);
				world.setBlock(i + 1, j + 10, k + 6, Block.planks.blockID, 1);
				world.setBlock(i + 1, j + 10, k + 7, Block.planks.blockID, 1);
				world.setBlock(i + 1, j + 10, k + 8, Block.planks.blockID, 1);
				world.setBlock(i + 1, j + 10, k + 9, Block.planks.blockID, 1);
				world.setBlock(i + 1, j + 10, k + 10, 0);
				world.setBlock(i + 1, j + 10, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 10, k + 0, 0);
				world.setBlock(i + 2, j + 10, k + 1, 0);
				world.setBlock(i + 2, j + 10, k + 2, 0);
				world.setBlock(i + 2, j + 10, k + 3, 0);
				world.setBlock(i + 2, j + 10, k + 4, 0);
				world.setBlock(i + 2, j + 10, k + 5, Block.planks.blockID, 1);
				world.setBlock(i + 2, j + 10, k + 6, Block.woodSingleSlab.blockID, 1);
				world.setBlock(i + 2, j + 10, k + 7, Block.woodSingleSlab.blockID, 1);
				world.setBlock(i + 2, j + 10, k + 8, Block.woodSingleSlab.blockID, 1);
				world.setBlock(i + 2, j + 10, k + 9, Block.planks.blockID, 1);
				world.setBlock(i + 2, j + 10, k + 10, 0);
				world.setBlock(i + 2, j + 10, k + 11, 0);
				world.setBlock(i + 2, j + 10, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 10, k + 0, 0);
				world.setBlock(i + 3, j + 10, k + 1, 0);
				world.setBlock(i + 3, j + 10, k + 2, 0);
				world.setBlock(i + 3, j + 10, k + 3, 0);
				world.setBlock(i + 3, j + 10, k + 4, 0);
				world.setBlock(i + 3, j + 10, k + 5, Block.planks.blockID, 1);
				world.setBlock(i + 3, j + 10, k + 6, Block.woodSingleSlab.blockID, 1);
				world.setBlock(i + 3, j + 10, k + 7, Block.woodSingleSlab.blockID, 1);
				world.setBlock(i + 3, j + 10, k + 8, Block.woodSingleSlab.blockID, 1);
				world.setBlock(i + 3, j + 10, k + 9, Block.planks.blockID, 1);
				world.setBlock(i + 3, j + 10, k + 10, 0);
				world.setBlock(i + 3, j + 10, k + 11, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 10, k + 0, 0);
				world.setBlock(i + 4, j + 10, k + 1, 0);
				world.setBlock(i + 4, j + 10, k + 2, 0);
				world.setBlock(i + 4, j + 10, k + 3, 0);
				world.setBlock(i + 4, j + 10, k + 4, 0);
				world.setBlock(i + 4, j + 10, k + 5, Block.planks.blockID, 1);
				world.setBlock(i + 4, j + 10, k + 6, Block.woodSingleSlab.blockID, 1);
				world.setBlock(i + 4, j + 10, k + 7, Block.woodSingleSlab.blockID, 1);
				world.setBlock(i + 4, j + 10, k + 8, Block.woodSingleSlab.blockID, 1);
				world.setBlock(i + 4, j + 10, k + 9, Block.planks.blockID, 1);
				world.setBlock(i + 4, j + 10, k + 10, 0);
				world.setBlock(i + 4, j + 10, k + 11, 0);
				world.setBlock(i + 4, j + 10, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 10, k + 0, 0);
				world.setBlock(i + 5, j + 10, k + 1, 0);
				world.setBlock(i + 5, j + 10, k + 2, 0);
				world.setBlock(i + 5, j + 10, k + 3, 0);
				world.setBlock(i + 5, j + 10, k + 4, 0);
				world.setBlock(i + 5, j + 10, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 10, k + 6, Block.wood.blockID, 11);
				world.setBlock(i + 5, j + 10, k + 7, Block.wood.blockID, 11);
				world.setBlock(i + 5, j + 10, k + 8, Block.wood.blockID, 11);
				world.setBlock(i + 5, j + 10, k + 9, Block.wood.blockID, 7);
				world.setBlock(i + 5, j + 10, k + 10, 0);
				world.setBlock(i + 5, j + 10, k + 11, 0);
				world.setBlock(i + 5, j + 10, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 10, k + 0, 0);
				world.setBlock(i + 6, j + 10, k + 1, 0);
				world.setBlock(i + 6, j + 10, k + 2, 0);
				world.setBlock(i + 6, j + 10, k + 3, 0);
				world.setBlock(i + 6, j + 10, k + 4, 0);
				world.setBlock(i + 6, j + 10, k + 5, Block.wood.blockID, 7);
				world.setBlock(i + 6, j + 10, k + 6, Block.planks.blockID, 3);
				world.setBlock(i + 6, j + 10, k + 7, Block.planks.blockID, 3);
				world.setBlock(i + 6, j + 10, k + 8, Block.planks.blockID, 3);
				world.setBlock(i + 6, j + 10, k + 9, Block.wood.blockID, 11);
				world.setBlock(i + 6, j + 10, k + 10, 0);
				world.setBlock(i + 6, j + 10, k + 11, 0);
				world.setBlock(i + 6, j + 10, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 10, k + 0, 0);
				world.setBlock(i + 7, j + 10, k + 1, 0);
				world.setBlock(i + 7, j + 10, k + 2, 0);
				world.setBlock(i + 7, j + 10, k + 3, 0);
				world.setBlock(i + 7, j + 10, k + 4, 0);
				world.setBlock(i + 7, j + 10, k + 5, Block.planks.blockID, 3);
				world.setBlock(i + 7, j + 10, k + 7, Block.planks.blockID, 3);
				world.setBlock(i + 7, j + 10, k + 8, Block.planks.blockID, 3);
				world.setBlock(i + 7, j + 10, k + 9, Block.wood.blockID, 11);
				world.setBlock(i + 7, j + 10, k + 10, 0);
				world.setBlock(i + 7, j + 10, k + 11, 0);
				world.setBlock(i + 7, j + 10, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 10, k + 0, 0);
				world.setBlock(i + 8, j + 10, k + 1, 0);
				world.setBlock(i + 8, j + 10, k + 2, 0);
				world.setBlock(i + 8, j + 10, k + 3, 0);
				world.setBlock(i + 8, j + 10, k + 4, 0);
				world.setBlock(i + 8, j + 10, k + 5, 0);
				world.setBlock(i + 8, j + 10, k + 6, Block.planks.blockID, 3);
				world.setBlock(i + 8, j + 10, k + 7, Block.planks.blockID, 3);
				world.setBlock(i + 8, j + 10, k + 8, Block.planks.blockID, 3);
				world.setBlock(i + 8, j + 10, k + 9, Block.wood.blockID, 11);
				world.setBlock(i + 8, j + 10, k + 10, 0);
				world.setBlock(i + 8, j + 10, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 10, k + 1, 0);
				world.setBlock(i + 9, j + 10, k + 2, 0);
				world.setBlock(i + 9, j + 10, k + 3, 0);
				world.setBlock(i + 9, j + 10, k + 4, 0);
				world.setBlock(i + 9, j + 10, k + 5, Block.wood.blockID, 11);
				world.setBlock(i + 9, j + 10, k + 6, Block.wood.blockID, 7);
				world.setBlock(i + 9, j + 10, k + 7, Block.wood.blockID, 11);
				world.setBlock(i + 9, j + 10, k + 8, Block.wood.blockID, 11);
				world.setBlock(i + 9, j + 10, k + 9, Block.wood.blockID, 11);
				world.setBlock(i + 9, j + 10, k + 10, 0);
				world.setBlock(i + 9, j + 10, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 10, k + 0, 0);
				world.setBlock(i + 10, j + 10, k + 1, 0);
				world.setBlock(i + 10, j + 10, k + 2, 0);
				world.setBlock(i + 10, j + 10, k + 3, 0);
				world.setBlock(i + 10, j + 10, k + 4, 0);
				world.setBlock(i + 10, j + 10, k + 5, 0);
				world.setBlock(i + 10, j + 10, k + 6, 0);
				world.setBlock(i + 10, j + 10, k + 7, 0);
				world.setBlock(i + 10, j + 10, k + 8, 0);
				world.setBlock(i + 10, j + 10, k + 9, 0);
				world.setBlock(i + 10, j + 10, k + 10, 0);
				world.setBlock(i + 10, j + 10, k + 11, 0);
				world.setBlock(i + 10, j + 10, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 10, k + 0, 0);
				world.setBlock(i + 11, j + 10, k + 1, 0);
				world.setBlock(i + 11, j + 10, k + 2, 0);
				world.setBlock(i + 11, j + 10, k + 3, 0);
				world.setBlock(i + 11, j + 10, k + 4, 0);
				world.setBlock(i + 11, j + 10, k + 5, 0);
				world.setBlock(i + 11, j + 10, k + 6, 0);
				world.setBlock(i + 11, j + 10, k + 7, 0);
				world.setBlock(i + 11, j + 10, k + 8, 0);
				world.setBlock(i + 11, j + 10, k + 9, 0);
				world.setBlock(i + 11, j + 10, k + 10, 0);
				world.setBlock(i + 11, j + 10, k + 11, 0);
				world.setBlock(i + 11, j + 10, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 10, k + 0, 0);
				world.setBlock(i + 12, j + 10, k + 2, 0);
				world.setBlock(i + 12, j + 10, k + 3, 0);
				world.setBlock(i + 12, j + 10, k + 4, 0);
				world.setBlock(i + 12, j + 10, k + 5, 0);
				world.setBlock(i + 12, j + 10, k + 7, 0);
				world.setBlock(i + 12, j + 10, k + 8, 0);
				world.setBlock(i + 12, j + 10, k + 9, 0);
				world.setBlock(i + 12, j + 10, k + 10, 0);
				world.setBlock(i + 12, j + 10, k + 11, 0);
				world.setBlock(i + 12, j + 10, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 10, k + 0, 0);
				world.setBlock(i + 13, j + 10, k + 1, 0);
				world.setBlock(i + 13, j + 10, k + 2, 0);
				world.setBlock(i + 13, j + 10, k + 4, 0);
				world.setBlock(i + 13, j + 10, k + 5, 0);
				world.setBlock(i + 13, j + 10, k + 6, 0);
				world.setBlock(i + 13, j + 10, k + 7, 0);
				world.setBlock(i + 13, j + 10, k + 8, 0);
				world.setBlock(i + 13, j + 10, k + 9, 0);
				world.setBlock(i + 13, j + 10, k + 10, 0);
				world.setBlock(i + 13, j + 10, k + 11, 0);
				world.setBlock(i + 13, j + 10, k + 12, 0);
			}
		},
		{//y = 11
			{//x = 0
				world.setBlock(i + 0, j + 11, k + 0, 0);
				world.setBlock(i + 0, j + 11, k + 1, 0);
				world.setBlock(i + 0, j + 11, k + 2, 0);
				world.setBlock(i + 0, j + 11, k + 3, 0);
				world.setBlock(i + 0, j + 11, k + 4, 0);
				world.setBlock(i + 0, j + 11, k + 5, 0);
				world.setBlock(i + 0, j + 11, k + 6, 0);
				world.setBlock(i + 0, j + 11, k + 7, 0);
				world.setBlock(i + 0, j + 11, k + 8, 0);
				world.setBlock(i + 0, j + 11, k + 9, 0);
				world.setBlock(i + 0, j + 11, k + 10, 0);
				world.setBlock(i + 0, j + 11, k + 11, 0);
				world.setBlock(i + 0, j + 11, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 11, k + 0, 0);
				world.setBlock(i + 1, j + 11, k + 1, 0);
				world.setBlock(i + 1, j + 11, k + 2, 0);
				world.setBlock(i + 1, j + 11, k + 3, 0);
				world.setBlock(i + 1, j + 11, k + 4, 0);
				world.setBlock(i + 1, j + 11, k + 5, Block.fence.blockID);
				world.setBlock(i + 1, j + 11, k + 6, Block.fence.blockID);
				world.setBlock(i + 1, j + 11, k + 7, Block.fence.blockID);
				world.setBlock(i + 1, j + 11, k + 8, Block.fence.blockID);
				world.setBlock(i + 1, j + 11, k + 9, Block.fence.blockID);
				world.setBlock(i + 1, j + 11, k + 10, 0);
				world.setBlock(i + 1, j + 11, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 11, k + 0, 0);
				world.setBlock(i + 2, j + 11, k + 1, 0);
				world.setBlock(i + 2, j + 11, k + 2, 0);
				world.setBlock(i + 2, j + 11, k + 3, 0);
				world.setBlock(i + 2, j + 11, k + 4, 0);
				world.setBlock(i + 2, j + 11, k + 5, Block.fence.blockID);
				world.setBlock(i + 2, j + 11, k + 6, 0);
				world.setBlock(i + 2, j + 11, k + 7, 0);
				world.setBlock(i + 2, j + 11, k + 8, 0);
				world.setBlock(i + 2, j + 11, k + 9, Block.fence.blockID);
				world.setBlock(i + 2, j + 11, k + 10, 0);
				world.setBlock(i + 2, j + 11, k + 11, 0);
				world.setBlock(i + 2, j + 11, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 11, k + 0, 0);
				world.setBlock(i + 3, j + 11, k + 1, 0);
				world.setBlock(i + 3, j + 11, k + 2, 0);
				world.setBlock(i + 3, j + 11, k + 3, 0);
				world.setBlock(i + 3, j + 11, k + 4, 0);
				world.setBlock(i + 3, j + 11, k + 5, Block.fence.blockID);
				world.setBlock(i + 3, j + 11, k + 6, 0);
				world.setBlock(i + 3, j + 11, k + 7, 0);
				world.setBlock(i + 3, j + 11, k + 8, 0);
				world.setBlock(i + 3, j + 11, k + 9, Block.fence.blockID);
				world.setBlock(i + 3, j + 11, k + 10, 0);
				world.setBlock(i + 3, j + 11, k + 11, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 11, k + 0, 0);
				world.setBlock(i + 4, j + 11, k + 1, 0);
				world.setBlock(i + 4, j + 11, k + 2, 0);
				world.setBlock(i + 4, j + 11, k + 3, 0);
				world.setBlock(i + 4, j + 11, k + 4, 0);
				world.setBlock(i + 4, j + 11, k + 5, Block.fence.blockID);
				world.setBlock(i + 4, j + 11, k + 6, 0);
				world.setBlock(i + 4, j + 11, k + 7, 0);
				world.setBlock(i + 4, j + 11, k + 8, 0);
				world.setBlock(i + 4, j + 11, k + 9, Block.fence.blockID);
				world.setBlock(i + 4, j + 11, k + 10, 0);
				world.setBlock(i + 4, j + 11, k + 11, 0);
				world.setBlock(i + 4, j + 11, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 11, k + 0, 0);
				world.setBlock(i + 5, j + 11, k + 1, 0);
				world.setBlock(i + 5, j + 11, k + 2, 0);
				world.setBlock(i + 5, j + 11, k + 3, 0);
				world.setBlock(i + 5, j + 11, k + 4, 0);
				world.setBlock(i + 5, j + 11, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 11, k + 6, Block.planks.blockID, 3);
				world.setBlock(i + 5, j + 11, k + 7, 0);
				world.setBlock(i + 5, j + 11, k + 8, Block.planks.blockID, 3);
				world.setBlock(i + 5, j + 11, k + 9, Block.wood.blockID, 11);
				world.setBlock(i + 5, j + 11, k + 10, 0);
				world.setBlock(i + 5, j + 11, k + 11, 0);
				world.setBlock(i + 5, j + 11, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 11, k + 0, 0);
				world.setBlock(i + 6, j + 11, k + 1, 0);
				world.setBlock(i + 6, j + 11, k + 2, 0);
				world.setBlock(i + 6, j + 11, k + 3, 0);
				world.setBlock(i + 6, j + 11, k + 4, 0);
				world.setBlock(i + 6, j + 11, k + 5, Block.planks.blockID, 3);
				world.setBlock(i + 6, j + 11, k + 7, 0);
				world.setBlock(i + 6, j + 11, k + 8, 0);
				world.setBlock(i + 6, j + 11, k + 9, Block.planks.blockID, 3);
				world.setBlock(i + 6, j + 11, k + 10, 0);
				world.setBlock(i + 6, j + 11, k + 11, 0);
				world.setBlock(i + 6, j + 11, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 11, k + 0, 0);
				world.setBlock(i + 7, j + 11, k + 1, 0);
				world.setBlock(i + 7, j + 11, k + 2, 0);
				world.setBlock(i + 7, j + 11, k + 3, 0);
				world.setBlock(i + 7, j + 11, k + 4, 0);
				world.setBlock(i + 7, j + 11, k + 5, Block.planks.blockID, 3);
				world.setBlock(i + 7, j + 11, k + 6, 0);
				world.setBlock(i + 7, j + 11, k + 7, 0);
				world.setBlock(i + 7, j + 11, k + 8, 0);
				world.setBlock(i + 7, j + 11, k + 9, Block.planks.blockID, 3);
				world.setBlock(i + 7, j + 11, k + 10, 0);
				world.setBlock(i + 7, j + 11, k + 11, 0);
				world.setBlock(i + 7, j + 11, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 11, k + 0, 0);
				world.setBlock(i + 8, j + 11, k + 1, 0);
				world.setBlock(i + 8, j + 11, k + 2, 0);
				world.setBlock(i + 8, j + 11, k + 3, 0);
				world.setBlock(i + 8, j + 11, k + 4, 0);
				world.setBlock(i + 8, j + 11, k + 5, Block.planks.blockID, 3);
				world.setBlock(i + 8, j + 11, k + 6, 0);
				world.setBlock(i + 8, j + 11, k + 7, 0);
				world.setBlock(i + 8, j + 11, k + 8, 0);
				world.setBlock(i + 8, j + 11, k + 9, Block.planks.blockID, 3);
				world.setBlock(i + 8, j + 11, k + 10, 0);
				world.setBlock(i + 8, j + 11, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 11, k + 1, 0);
				world.setBlock(i + 9, j + 11, k + 2, 0);
				world.setBlock(i + 9, j + 11, k + 3, 0);
				world.setBlock(i + 9, j + 11, k + 4, 0);
				world.setBlock(i + 9, j + 11, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 9, j + 11, k + 6, Block.planks.blockID, 3);
				world.setBlock(i + 9, j + 11, k + 7, Block.planks.blockID, 3);
				world.setBlock(i + 9, j + 11, k + 8, Block.planks.blockID, 3);
				world.setBlock(i + 9, j + 11, k + 9, Block.wood.blockID, 3);
				world.setBlock(i + 9, j + 11, k + 10, 0);
				world.setBlock(i + 9, j + 11, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 11, k + 0, 0);
				world.setBlock(i + 10, j + 11, k + 1, 0);
				world.setBlock(i + 10, j + 11, k + 2, 0);
				world.setBlock(i + 10, j + 11, k + 3, 0);
				world.setBlock(i + 10, j + 11, k + 4, 0);
				world.setBlock(i + 10, j + 11, k + 5, 0);
				world.setBlock(i + 10, j + 11, k + 6, 0);
				world.setBlock(i + 10, j + 11, k + 7, 0);
				world.setBlock(i + 10, j + 11, k + 8, 0);
				world.setBlock(i + 10, j + 11, k + 9, 0);
				world.setBlock(i + 10, j + 11, k + 10, 0);
				world.setBlock(i + 10, j + 11, k + 11, 0);
				world.setBlock(i + 10, j + 11, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 11, k + 0, 0);
				world.setBlock(i + 11, j + 11, k + 1, 0);
				world.setBlock(i + 11, j + 11, k + 2, 0);
				world.setBlock(i + 11, j + 11, k + 3, 0);
				world.setBlock(i + 11, j + 11, k + 4, 0);
				world.setBlock(i + 11, j + 11, k + 5, 0);
				world.setBlock(i + 11, j + 11, k + 6, 0);
				world.setBlock(i + 11, j + 11, k + 7, 0);
				world.setBlock(i + 11, j + 11, k + 8, 0);
				world.setBlock(i + 11, j + 11, k + 9, 0);
				world.setBlock(i + 11, j + 11, k + 10, 0);
				world.setBlock(i + 11, j + 11, k + 11, 0);
				world.setBlock(i + 11, j + 11, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 11, k + 0, 0);
				world.setBlock(i + 12, j + 11, k + 2, 0);
				world.setBlock(i + 12, j + 11, k + 3, 0);
				world.setBlock(i + 12, j + 11, k + 4, 0);
				world.setBlock(i + 12, j + 11, k + 5, 0);
				world.setBlock(i + 12, j + 11, k + 7, 0);
				world.setBlock(i + 12, j + 11, k + 8, 0);
				world.setBlock(i + 12, j + 11, k + 9, 0);
				world.setBlock(i + 12, j + 11, k + 10, 0);
				world.setBlock(i + 12, j + 11, k + 11, 0);
				world.setBlock(i + 12, j + 11, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 11, k + 0, 0);
				world.setBlock(i + 13, j + 11, k + 1, 0);
				world.setBlock(i + 13, j + 11, k + 2, 0);
				world.setBlock(i + 13, j + 11, k + 4, 0);
				world.setBlock(i + 13, j + 11, k + 5, 0);
				world.setBlock(i + 13, j + 11, k + 6, 0);
				world.setBlock(i + 13, j + 11, k + 7, 0);
				world.setBlock(i + 13, j + 11, k + 8, 0);
				world.setBlock(i + 13, j + 11, k + 9, 0);
				world.setBlock(i + 13, j + 11, k + 10, 0);
				world.setBlock(i + 13, j + 11, k + 11, 0);
				world.setBlock(i + 13, j + 11, k + 12, 0);
			}
		},
		{//y = 12
			{//x = 0
				world.setBlock(i + 0, j + 12, k + 0, 0);
				world.setBlock(i + 0, j + 12, k + 1, 0);
				world.setBlock(i + 0, j + 12, k + 2, 0);
				world.setBlock(i + 0, j + 12, k + 3, 0);
				world.setBlock(i + 0, j + 12, k + 4, 0);
				world.setBlock(i + 0, j + 12, k + 5, 0);
				world.setBlock(i + 0, j + 12, k + 6, 0);
				world.setBlock(i + 0, j + 12, k + 7, 0);
				world.setBlock(i + 0, j + 12, k + 8, 0);
				world.setBlock(i + 0, j + 12, k + 9, 0);
				world.setBlock(i + 0, j + 12, k + 10, 0);
				world.setBlock(i + 0, j + 12, k + 11, 0);
				world.setBlock(i + 0, j + 12, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 12, k + 0, 0);
				world.setBlock(i + 1, j + 12, k + 1, 0);
				world.setBlock(i + 1, j + 12, k + 2, 0);
				world.setBlock(i + 1, j + 12, k + 3, 0);
				world.setBlock(i + 1, j + 12, k + 4, 0);
				world.setBlock(i + 1, j + 12, k + 5, 0);
				world.setBlock(i + 1, j + 12, k + 6, 0);
				world.setBlock(i + 1, j + 12, k + 7, 0);
				world.setBlock(i + 1, j + 12, k + 8, 0);
				world.setBlock(i + 1, j + 12, k + 9, 0);
				world.setBlock(i + 1, j + 12, k + 10, 0);
				world.setBlock(i + 1, j + 12, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 12, k + 0, 0);
				world.setBlock(i + 2, j + 12, k + 1, 0);
				world.setBlock(i + 2, j + 12, k + 2, 0);
				world.setBlock(i + 2, j + 12, k + 3, 0);
				world.setBlock(i + 2, j + 12, k + 4, 0);
				world.setBlock(i + 2, j + 12, k + 5, 0);
				world.setBlock(i + 2, j + 12, k + 6, 0);
				world.setBlock(i + 2, j + 12, k + 7, 0);
				world.setBlock(i + 2, j + 12, k + 8, 0);
				world.setBlock(i + 2, j + 12, k + 9, 0);
				world.setBlock(i + 2, j + 12, k + 10, 0);
				world.setBlock(i + 2, j + 12, k + 11, 0);
				world.setBlock(i + 2, j + 12, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 12, k + 0, 0);
				world.setBlock(i + 3, j + 12, k + 1, 0);
				world.setBlock(i + 3, j + 12, k + 2, 0);
				world.setBlock(i + 3, j + 12, k + 3, 0);
				world.setBlock(i + 3, j + 12, k + 4, 0);
				world.setBlock(i + 3, j + 12, k + 5, 0);
				world.setBlock(i + 3, j + 12, k + 6, 0);
				world.setBlock(i + 3, j + 12, k + 7, 0);
				world.setBlock(i + 3, j + 12, k + 8, 0);
				world.setBlock(i + 3, j + 12, k + 9, 0);
				world.setBlock(i + 3, j + 12, k + 10, 0);
				world.setBlock(i + 3, j + 12, k + 11, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 12, k + 0, 0);
				world.setBlock(i + 4, j + 12, k + 1, 0);
				world.setBlock(i + 4, j + 12, k + 2, 0);
				world.setBlock(i + 4, j + 12, k + 3, 0);
				world.setBlock(i + 4, j + 12, k + 4, 0);
				world.setBlock(i + 4, j + 12, k + 5, 0);
				world.setBlock(i + 4, j + 12, k + 6, 0);
				world.setBlock(i + 4, j + 12, k + 7, 0);
				world.setBlock(i + 4, j + 12, k + 8, 0);
				world.setBlock(i + 4, j + 12, k + 9, 0);
				world.setBlock(i + 4, j + 12, k + 10, 0);
				world.setBlock(i + 4, j + 12, k + 11, 0);
				world.setBlock(i + 4, j + 12, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 12, k + 0, 0);
				world.setBlock(i + 5, j + 12, k + 1, 0);
				world.setBlock(i + 5, j + 12, k + 2, 0);
				world.setBlock(i + 5, j + 12, k + 3, 0);
				world.setBlock(i + 5, j + 12, k + 4, 0);
				world.setBlock(i + 5, j + 12, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 12, k + 6, Block.planks.blockID, 3);
				world.setBlock(i + 5, j + 12, k + 7, 0);
				world.setBlock(i + 5, j + 12, k + 8, Block.planks.blockID, 3);
				world.setBlock(i + 5, j + 12, k + 9, Block.wood.blockID, 7);
				world.setBlock(i + 5, j + 12, k + 10, 0);
				world.setBlock(i + 5, j + 12, k + 11, 0);
				world.setBlock(i + 5, j + 12, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 12, k + 0, 0);
				world.setBlock(i + 6, j + 12, k + 1, 0);
				world.setBlock(i + 6, j + 12, k + 2, 0);
				world.setBlock(i + 6, j + 12, k + 3, 0);
				world.setBlock(i + 6, j + 12, k + 4, 0);
				world.setBlock(i + 6, j + 12, k + 5, Block.planks.blockID, 3);
				world.setBlock(i + 6, j + 12, k + 7, 0);
				world.setBlock(i + 6, j + 12, k + 8, 0);
				world.setBlock(i + 6, j + 12, k + 9, Block.planks.blockID, 3);
				world.setBlock(i + 6, j + 12, k + 10, 0);
				world.setBlock(i + 6, j + 12, k + 11, 0);
				world.setBlock(i + 6, j + 12, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 12, k + 0, 0);
				world.setBlock(i + 7, j + 12, k + 1, 0);
				world.setBlock(i + 7, j + 12, k + 2, 0);
				world.setBlock(i + 7, j + 12, k + 3, 0);
				world.setBlock(i + 7, j + 12, k + 4, 0);
				world.setBlock(i + 7, j + 12, k + 5, Block.planks.blockID, 3);
				world.setBlock(i + 7, j + 12, k + 6, 0);
				world.setBlock(i + 7, j + 12, k + 7, 0);
				world.setBlock(i + 7, j + 12, k + 8, 0);
				world.setBlock(i + 7, j + 12, k + 9, Block.thinGlass.blockID);
				world.setBlock(i + 7, j + 12, k + 10, 0);
				world.setBlock(i + 7, j + 12, k + 11, 0);
				world.setBlock(i + 7, j + 12, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 12, k + 0, 0);
				world.setBlock(i + 8, j + 12, k + 1, 0);
				world.setBlock(i + 8, j + 12, k + 2, 0);
				world.setBlock(i + 8, j + 12, k + 3, 0);
				world.setBlock(i + 8, j + 12, k + 4, 0);
				world.setBlock(i + 8, j + 12, k + 5, Block.thinGlass.blockID);
				world.setBlock(i + 8, j + 12, k + 6, 0);
				world.setBlock(i + 8, j + 12, k + 7, 0);
				world.setBlock(i + 8, j + 12, k + 8, 0);
				world.setBlock(i + 8, j + 12, k + 9, Block.planks.blockID, 3);
				world.setBlock(i + 8, j + 12, k + 10, 0);
				world.setBlock(i + 8, j + 12, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 12, k + 1, 0);
				world.setBlock(i + 9, j + 12, k + 2, 0);
				world.setBlock(i + 9, j + 12, k + 3, 0);
				world.setBlock(i + 9, j + 12, k + 4, 0);
				world.setBlock(i + 9, j + 12, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 9, j + 12, k + 6, Block.planks.blockID, 3);
				world.setBlock(i + 9, j + 12, k + 7, Block.thinGlass.blockID);
				world.setBlock(i + 9, j + 12, k + 8, Block.planks.blockID, 3);
				world.setBlock(i + 9, j + 12, k + 9, Block.wood.blockID, 3);
				world.setBlock(i + 9, j + 12, k + 10, 0);
				world.setBlock(i + 9, j + 12, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 12, k + 0, 0);
				world.setBlock(i + 10, j + 12, k + 1, 0);
				world.setBlock(i + 10, j + 12, k + 2, 0);
				world.setBlock(i + 10, j + 12, k + 3, 0);
				world.setBlock(i + 10, j + 12, k + 4, 0);
				world.setBlock(i + 10, j + 12, k + 5, 0);
				world.setBlock(i + 10, j + 12, k + 6, 0);
				world.setBlock(i + 10, j + 12, k + 7, 0);
				world.setBlock(i + 10, j + 12, k + 8, 0);
				world.setBlock(i + 10, j + 12, k + 9, 0);
				world.setBlock(i + 10, j + 12, k + 10, 0);
				world.setBlock(i + 10, j + 12, k + 11, 0);
				world.setBlock(i + 10, j + 12, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 12, k + 0, 0);
				world.setBlock(i + 11, j + 12, k + 1, 0);
				world.setBlock(i + 11, j + 12, k + 2, 0);
				world.setBlock(i + 11, j + 12, k + 3, 0);
				world.setBlock(i + 11, j + 12, k + 4, 0);
				world.setBlock(i + 11, j + 12, k + 5, 0);
				world.setBlock(i + 11, j + 12, k + 6, 0);
				world.setBlock(i + 11, j + 12, k + 7, 0);
				world.setBlock(i + 11, j + 12, k + 8, 0);
				world.setBlock(i + 11, j + 12, k + 9, 0);
				world.setBlock(i + 11, j + 12, k + 10, 0);
				world.setBlock(i + 11, j + 12, k + 11, 0);
				world.setBlock(i + 11, j + 12, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 12, k + 0, 0);
				world.setBlock(i + 12, j + 12, k + 2, 0);
				world.setBlock(i + 12, j + 12, k + 3, 0);
				world.setBlock(i + 12, j + 12, k + 4, 0);
				world.setBlock(i + 12, j + 12, k + 5, 0);
				world.setBlock(i + 12, j + 12, k + 7, 0);
				world.setBlock(i + 12, j + 12, k + 8, 0);
				world.setBlock(i + 12, j + 12, k + 9, 0);
				world.setBlock(i + 12, j + 12, k + 10, 0);
				world.setBlock(i + 12, j + 12, k + 11, 0);
				world.setBlock(i + 12, j + 12, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 12, k + 0, 0);
				world.setBlock(i + 13, j + 12, k + 1, 0);
				world.setBlock(i + 13, j + 12, k + 2, 0);
				world.setBlock(i + 13, j + 12, k + 4, 0);
				world.setBlock(i + 13, j + 12, k + 5, 0);
				world.setBlock(i + 13, j + 12, k + 6, 0);
				world.setBlock(i + 13, j + 12, k + 7, 0);
				world.setBlock(i + 13, j + 12, k + 8, 0);
				world.setBlock(i + 13, j + 12, k + 9, 0);
				world.setBlock(i + 13, j + 12, k + 10, 0);
				world.setBlock(i + 13, j + 12, k + 11, 0);
				world.setBlock(i + 13, j + 12, k + 12, 0);
			}
		},
		{//y = 13
			{//x = 0
				world.setBlock(i + 0, j + 13, k + 0, 0);
				world.setBlock(i + 0, j + 13, k + 1, 0);
				world.setBlock(i + 0, j + 13, k + 2, 0);
				world.setBlock(i + 0, j + 13, k + 3, 0);
				world.setBlock(i + 0, j + 13, k + 4, 0);
				world.setBlock(i + 0, j + 13, k + 5, 0);
				world.setBlock(i + 0, j + 13, k + 6, 0);
				world.setBlock(i + 0, j + 13, k + 7, 0);
				world.setBlock(i + 0, j + 13, k + 8, 0);
				world.setBlock(i + 0, j + 13, k + 9, 0);
				world.setBlock(i + 0, j + 13, k + 10, 0);
				world.setBlock(i + 0, j + 13, k + 11, 0);
				world.setBlock(i + 0, j + 13, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 13, k + 0, 0);
				world.setBlock(i + 1, j + 13, k + 1, 0);
				world.setBlock(i + 1, j + 13, k + 2, 0);
				world.setBlock(i + 1, j + 13, k + 3, 0);
				world.setBlock(i + 1, j + 13, k + 4, 0);
				world.setBlock(i + 1, j + 13, k + 5, 0);
				world.setBlock(i + 1, j + 13, k + 6, 0);
				world.setBlock(i + 1, j + 13, k + 7, 0);
				world.setBlock(i + 1, j + 13, k + 8, 0);
				world.setBlock(i + 1, j + 13, k + 9, 0);
				world.setBlock(i + 1, j + 13, k + 10, 0);
				world.setBlock(i + 1, j + 13, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 13, k + 0, 0);
				world.setBlock(i + 2, j + 13, k + 1, 0);
				world.setBlock(i + 2, j + 13, k + 2, 0);
				world.setBlock(i + 2, j + 13, k + 3, 0);
				world.setBlock(i + 2, j + 13, k + 4, 0);
				world.setBlock(i + 2, j + 13, k + 5, 0);
				world.setBlock(i + 2, j + 13, k + 6, 0);
				world.setBlock(i + 2, j + 13, k + 7, 0);
				world.setBlock(i + 2, j + 13, k + 8, 0);
				world.setBlock(i + 2, j + 13, k + 9, 0);
				world.setBlock(i + 2, j + 13, k + 10, 0);
				world.setBlock(i + 2, j + 13, k + 11, 0);
				world.setBlock(i + 2, j + 13, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 13, k + 0, 0);
				world.setBlock(i + 3, j + 13, k + 1, 0);
				world.setBlock(i + 3, j + 13, k + 2, 0);
				world.setBlock(i + 3, j + 13, k + 3, 0);
				world.setBlock(i + 3, j + 13, k + 4, 0);
				world.setBlock(i + 3, j + 13, k + 5, 0);
				world.setBlock(i + 3, j + 13, k + 6, 0);
				world.setBlock(i + 3, j + 13, k + 7, 0);
				world.setBlock(i + 3, j + 13, k + 8, 0);
				world.setBlock(i + 3, j + 13, k + 9, 0);
				world.setBlock(i + 3, j + 13, k + 10, 0);
				world.setBlock(i + 3, j + 13, k + 11, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 13, k + 0, 0);
				world.setBlock(i + 4, j + 13, k + 1, 0);
				world.setBlock(i + 4, j + 13, k + 2, 0);
				world.setBlock(i + 4, j + 13, k + 3, 0);
				world.setBlock(i + 4, j + 13, k + 4, 0);
				world.setBlock(i + 4, j + 13, k + 5, 0);
				world.setBlock(i + 4, j + 13, k + 6, 0);
				world.setBlock(i + 4, j + 13, k + 7, 0);
				world.setBlock(i + 4, j + 13, k + 8, 0);
				world.setBlock(i + 4, j + 13, k + 9, 0);
				world.setBlock(i + 4, j + 13, k + 10, 0);
				world.setBlock(i + 4, j + 13, k + 11, 0);
				world.setBlock(i + 4, j + 13, k + 12, 0);
			},
			{//x = 5
				world.setBlock(i + 5, j + 13, k + 0, 0);
				world.setBlock(i + 5, j + 13, k + 1, 0);
				world.setBlock(i + 5, j + 13, k + 2, 0);
				world.setBlock(i + 5, j + 13, k + 3, 0);
				world.setBlock(i + 5, j + 13, k + 4, 0);
				world.setBlock(i + 5, j + 13, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 5, j + 13, k + 6, Block.planks.blockID, 3);
				world.setBlock(i + 5, j + 13, k + 7, Block.planks.blockID, 3);
				world.setBlock(i + 5, j + 13, k + 8, Block.planks.blockID, 3);
				world.setBlock(i + 5, j + 13, k + 9, Block.wood.blockID, 11);
				world.setBlock(i + 5, j + 13, k + 10, 0);
				world.setBlock(i + 5, j + 13, k + 11, 0);
				world.setBlock(i + 5, j + 13, k + 12, 0);
			},
			{//x = 6
				world.setBlock(i + 6, j + 13, k + 0, 0);
				world.setBlock(i + 6, j + 13, k + 1, 0);
				world.setBlock(i + 6, j + 13, k + 2, 0);
				world.setBlock(i + 6, j + 13, k + 3, 0);
				world.setBlock(i + 6, j + 13, k + 4, 0);
				world.setBlock(i + 6, j + 13, k + 5, Block.planks.blockID, 3);
				world.setBlock(i + 6, j + 13, k + 7, 0);
				world.setBlock(i + 6, j + 13, k + 8, 0);
				world.setBlock(i + 6, j + 13, k + 9, Block.planks.blockID, 3);
				world.setBlock(i + 6, j + 13, k + 10, 0);
				world.setBlock(i + 6, j + 13, k + 11, 0);
				world.setBlock(i + 6, j + 13, k + 12, 0);
			},
			{//x = 7
				world.setBlock(i + 7, j + 13, k + 0, 0);
				world.setBlock(i + 7, j + 13, k + 1, 0);
				world.setBlock(i + 7, j + 13, k + 2, 0);
				world.setBlock(i + 7, j + 13, k + 3, 0);
				world.setBlock(i + 7, j + 13, k + 4, 0);
				world.setBlock(i + 7, j + 13, k + 5, Block.planks.blockID, 3);
				world.setBlock(i + 7, j + 13, k + 6, 0);
				world.setBlock(i + 7, j + 13, k + 7, 0);
				world.setBlock(i + 7, j + 13, k + 8, 0);
				world.setBlock(i + 7, j + 13, k + 9, Block.planks.blockID, 3);
				world.setBlock(i + 7, j + 13, k + 10, 0);
				world.setBlock(i + 7, j + 13, k + 11, 0);
				world.setBlock(i + 7, j + 13, k + 12, 0);
			},
			{//x = 8
				world.setBlock(i + 8, j + 13, k + 0, 0);
				world.setBlock(i + 8, j + 13, k + 1, 0);
				world.setBlock(i + 8, j + 13, k + 2, 0);
				world.setBlock(i + 8, j + 13, k + 3, 0);
				world.setBlock(i + 8, j + 13, k + 4, 0);
				world.setBlock(i + 8, j + 13, k + 5, Block.planks.blockID, 3);
				world.setBlock(i + 8, j + 13, k + 6, 0);
				world.setBlock(i + 8, j + 13, k + 7, 0);
				world.setBlock(i + 8, j + 13, k + 8, 0);
				world.setBlock(i + 8, j + 13, k + 9, Block.planks.blockID, 3);
				world.setBlock(i + 8, j + 13, k + 12, 0);
			},
			{//x = 9
				world.setBlock(i + 9, j + 13, k + 1, 0);
				world.setBlock(i + 9, j + 13, k + 2, 0);
				world.setBlock(i + 9, j + 13, k + 3, 0);
				world.setBlock(i + 9, j + 13, k + 4, 0);
				world.setBlock(i + 9, j + 13, k + 5, Block.wood.blockID, 3);
				world.setBlock(i + 9, j + 13, k + 6, Block.planks.blockID, 3);
				world.setBlock(i + 9, j + 13, k + 7, Block.planks.blockID, 3);
				world.setBlock(i + 9, j + 13, k + 8, Block.planks.blockID, 3);
				world.setBlock(i + 9, j + 13, k + 9, Block.wood.blockID, 3);
				world.setBlock(i + 9, j + 13, k + 10, 0);
				world.setBlock(i + 9, j + 13, k + 12, 0);
			},
			{//x = 10
				world.setBlock(i + 10, j + 13, k + 0, 0);
				world.setBlock(i + 10, j + 13, k + 1, 0);
				world.setBlock(i + 10, j + 13, k + 2, 0);
				world.setBlock(i + 10, j + 13, k + 3, 0);
				world.setBlock(i + 10, j + 13, k + 4, 0);
				world.setBlock(i + 10, j + 13, k + 5, 0);
				world.setBlock(i + 10, j + 13, k + 6, 0);
				world.setBlock(i + 10, j + 13, k + 7, 0);
				world.setBlock(i + 10, j + 13, k + 8, 0);
				world.setBlock(i + 10, j + 13, k + 9, 0);
				world.setBlock(i + 10, j + 13, k + 10, 0);
				world.setBlock(i + 10, j + 13, k + 11, 0);
				world.setBlock(i + 10, j + 13, k + 12, 0);
			},
			{//x = 11
				world.setBlock(i + 11, j + 13, k + 0, 0);
				world.setBlock(i + 11, j + 13, k + 1, 0);
				world.setBlock(i + 11, j + 13, k + 2, 0);
				world.setBlock(i + 11, j + 13, k + 3, 0);
				world.setBlock(i + 11, j + 13, k + 4, 0);
				world.setBlock(i + 11, j + 13, k + 5, 0);
				world.setBlock(i + 11, j + 13, k + 6, 0);
				world.setBlock(i + 11, j + 13, k + 7, 0);
				world.setBlock(i + 11, j + 13, k + 8, 0);
				world.setBlock(i + 11, j + 13, k + 9, 0);
				world.setBlock(i + 11, j + 13, k + 10, 0);
				world.setBlock(i + 11, j + 13, k + 11, 0);
				world.setBlock(i + 11, j + 13, k + 12, 0);
			},
			{//x = 12
				world.setBlock(i + 12, j + 13, k + 0, 0);
				world.setBlock(i + 12, j + 13, k + 2, 0);
				world.setBlock(i + 12, j + 13, k + 3, 0);
				world.setBlock(i + 12, j + 13, k + 4, 0);
				world.setBlock(i + 12, j + 13, k + 5, 0);
				world.setBlock(i + 12, j + 13, k + 7, 0);
				world.setBlock(i + 12, j + 13, k + 8, 0);
				world.setBlock(i + 12, j + 13, k + 9, 0);
				world.setBlock(i + 12, j + 13, k + 10, 0);
				world.setBlock(i + 12, j + 13, k + 11, 0);
				world.setBlock(i + 12, j + 13, k + 12, 0);
			},
			{//x = 13
				world.setBlock(i + 13, j + 13, k + 0, 0);
				world.setBlock(i + 13, j + 13, k + 1, 0);
				world.setBlock(i + 13, j + 13, k + 2, 0);
				world.setBlock(i + 13, j + 13, k + 4, 0);
				world.setBlock(i + 13, j + 13, k + 5, 0);
				world.setBlock(i + 13, j + 13, k + 6, 0);
				world.setBlock(i + 13, j + 13, k + 7, 0);
				world.setBlock(i + 13, j + 13, k + 8, 0);
				world.setBlock(i + 13, j + 13, k + 9, 0);
				world.setBlock(i + 13, j + 13, k + 10, 0);
				world.setBlock(i + 13, j + 13, k + 11, 0);
				world.setBlock(i + 13, j + 13, k + 12, 0);
			}
		},
		{//y = 14
			{//x = 0
				world.setBlock(i + 0, j + 14, k + 0, 0);
				world.setBlock(i + 0, j + 14, k + 1, 0);
				world.setBlock(i + 0, j + 14, k + 2, 0);
				world.setBlock(i + 0, j + 14, k + 3, 0);
				world.setBlock(i + 0, j + 14, k + 4, 0);
				world.setBlock(i + 0, j + 14, k + 5, 0);
				world.setBlock(i + 0, j + 14, k + 6, 0);
				world.setBlock(i + 0, j + 14, k + 7, 0);
				world.setBlock(i + 0, j + 14, k + 8, 0);
				world.setBlock(i + 0, j + 14, k + 9, 0);
				world.setBlock(i + 0, j + 14, k + 10, 0);
				world.setBlock(i + 0, j + 14, k + 11, 0);
				world.setBlock(i + 0, j + 14, k + 12, 0);
			},
			{//x = 1
				world.setBlock(i + 1, j + 14, k + 0, 0);
				world.setBlock(i + 1, j + 14, k + 1, 0);
				world.setBlock(i + 1, j + 14, k + 2, 0);
				world.setBlock(i + 1, j + 14, k + 3, 0);
				world.setBlock(i + 1, j + 14, k + 4, 0);
				world.setBlock(i + 1, j + 14, k + 5, 0);
				world.setBlock(i + 1, j + 14, k + 6, 0);
				world.setBlock(i + 1, j + 14, k + 7, 0);
				world.setBlock(i + 1, j + 14, k + 8, 0);
				world.setBlock(i + 1, j + 14, k + 9, 0);
				world.setBlock(i + 1, j + 14, k + 10, 0);
				world.setBlock(i + 1, j + 14, k + 12, 0);
			},
			{//x = 2
				world.setBlock(i + 2, j + 14, k + 0, 0);
				world.setBlock(i + 2, j + 14, k + 1, 0);
				world.setBlock(i + 2, j + 14, k + 2, 0);
				world.setBlock(i + 2, j + 14, k + 3, 0);
				world.setBlock(i + 2, j + 14, k + 4, 0);
				world.setBlock(i + 2, j + 14, k + 5, 0);
				world.setBlock(i + 2, j + 14, k + 6, 0);
				world.setBlock(i + 2, j + 14, k + 7, 0);
				world.setBlock(i + 2, j + 14, k + 8, 0);
				world.setBlock(i + 2, j + 14, k + 9, 0);
				world.setBlock(i + 2, j + 14, k + 10, 0);
				world.setBlock(i + 2, j + 14, k + 11, 0);
				world.setBlock(i + 2, j + 14, k + 12, 0);
			},
			{//x = 3
				world.setBlock(i + 3, j + 14, k + 0, 0);
				world.setBlock(i + 3, j + 14, k + 1, 0);
				world.setBlock(i + 3, j + 14, k + 2, 0);
				world.setBlock(i + 3, j + 14, k + 3, 0);
				world.setBlock(i + 3, j + 14, k + 4, 0);
				world.setBlock(i + 3, j + 14, k + 5, 0);
				world.setBlock(i + 3, j + 14, k + 6, 0);
				world.setBlock(i + 3, j + 14, k + 7, 0);
				world.setBlock(i + 3, j + 14, k + 8, 0);
				world.setBlock(i + 3, j + 14, k + 9, 0);
				world.setBlock(i + 3, j + 14, k + 10, 0);
				world.setBlock(i + 3, j + 14, k + 11, 0);
			},
			{//x = 4
				world.setBlock(i + 4, j + 14, k + 0, 0);
				world.setBlock(i + 4, j + 14, k + 1, 0);
				world.setBlock(i + 4, j + 14, k + 2, 0);
				world.setBlock(i + 4, j + 14, k + 3, 0);
				world.setBlock(i + 4, j + 14, k + 4, 0);
				world.setBlock(i + 4, j + 14, k + 5, 0);
				world.setBlock(i + 4, j + 14, k + 6, 0);
				world.setBlock(i + 4, j + 14, k + 7, 0);
				world.setBlock(i + 4, j + 14, k + 8, 0);
				world.setBlock(i + 4, j + 14, k + 9, 0);
				world.setBlock(i + 4, j + 14, k + 10, 0);
				world.setBlock(i + 4, j + 14, k + 11, 0);
				world.setBlock(i + 4, j + 14, k + 12, 0);
			},
			{//x = 5
				
			},
			{//x = 6
				
			},
			{//x = 7
				
			},
			{//x = 8
				
			},
			{//x = 9
				
			},
			{//x = 10
				
			},
			{//x = 11
				
			},
			{//x = 12
				
			},
			{//x = 13
				
			}
		},
		{//y = 15
			{//x = 0
				
			},
			{//x = 1
				
			},
			{//x = 2
				
			},
			{//x = 3
				
			},
			{//x = 4
				
			},
			{//x = 5
				
			},
			{//x = 6
				
			},
			{//x = 7
				
			},
			{//x = 8
				
			},
			{//x = 9
				
			},
			{//x = 10
				
			},
			{//x = 11
				
			},
			{//x = 12
				
			},
			{//x = 13
				
			}
		},
		{//y = 16
			{//x = 0
				
			},
			{//x = 1
				
			},
			{//x = 2
				
			},
			{//x = 3
				
			},
			{//x = 4
				
			},
			{//x = 5
				
			},
			{//x = 6
				
			},
			{//x = 7
				
			},
			{//x = 8
				
			},
			{//x = 9
				
			},
			{//x = 10
				
			},
			{//x = 11
				
			},
			{//x = 12
				
			},
			{//x = 13
				
			}
		},
		{//y = 17
			{//x = 0
				
			},
			{//x = 1
				
			},
			{//x = 2
				
			},
			{//x = 3
				
			},
			{//x = 4
				
			},
			{//x = 5
				
			},
			{//x = 6
				
			},
			{//x = 7
				
			},
			{//x = 8
				
			},
			{//x = 9
				
			},
			{//x = 10
				
			},
			{//x = 11
				
			},
			{//x = 12
				
			},
			{//x = 13
				
			}
		},
		{//y = 18
			{//x = 0
				
			},
			{//x = 1
				
			},
			{//x = 2
				
			},
			{//x = 3
				
			},
			{//x = 4
				
			},
			{//x = 5
				
			},
			{//x = 6
				
			},
			{//x = 7
				
			},
			{//x = 8
				
			},
			{//x = 9
				
			},
			{//x = 10
				
			},
			{//x = 11
				
			},
			{//x = 12
				
			},
			{//x = 13
				
			}
		},
		{//y = 19
			{//x = 0
				
			},
			{//x = 1
				
			},
			{//x = 2
				
			},
			{//x = 3
				
			},
			{//x = 4
				
			},
			{//x = 5
				
			},
			{//x = 6
				
			},
			{//x = 7
				
			},
			{//x = 8
				
			},
			{//x = 9
				
			},
			{//x = 10
				
			},
			{//x = 11
				
			},
			{//x = 12
				
			},
			{//x = 13
				
			}
		},
		{//y = 20
			{//x = 0
				
			},
			{//x = 1
				
			},
			{//x = 2
				
			},
			{//x = 3
				
			},
			{//x = 4
				
			},
			{//x = 5
				
			},
			{//x = 6
				
			},
			{//x = 7
				
			},
			{//x = 8
				
			},
			{//x = 9
				
			},
			{//x = 10
				
			},
			{//x = 11
				
			},
			{//x = 12
				
			},
			{//x = 13
				
			}
		},
		{//y = 21
			{//x = 0
				
			},
			{//x = 1
				
			},
			{//x = 2
				
			},
			{//x = 3
				
			},
			{//x = 4
				
			},
			{//x = 5
				
			},
			{//x = 6
				
			},
			{//x = 7
				
			},
			{//x = 8
				
			},
			{//x = 9
				
			},
			{//x = 10
				
			},
			{//x = 11
				
			},
			{//x = 12
				
			},
			{//x = 13
				
			}
		},
		{//y = 22
			{//x = 0
				
			},
			{//x = 1
				
			},
			{//x = 2
				
			},
			{//x = 3
				
			},
			{//x = 4
				
			},
			{//x = 5
				
			},
			{//x = 6
				
			},
			{//x = 7
				
			},
			{//x = 8
				
			},
			{//x = 9
				
			},
			{//x = 10
				
			},
			{//x = 11
				
			},
			{//x = 12
				
			},
			{//x = 13
				
			}
		},
		{//y = 23
			{//x = 0
				
			},
			{//x = 1
				
			},
			{//x = 2
				
			},
			{//x = 3
				
			},
			{//x = 4
				
			},
			{//x = 5
				
			},
			{//x = 6
				
			},
			{//x = 7
				
			},
			{//x = 8
				
			},
			{//x = 9
				
			},
			{//x = 10
				
			},
			{//x = 11
				
			},
			{//x = 12
				
			},
			{//x = 13
				
			}
		},
		{//y = 24
			{//x = 0
				
			},
			{//x = 1
				
			},
			{//x = 2
				
			},
			{//x = 3
				
			},
			{//x = 4
				
			},
			{//x = 5
				
			},
			{//x = 6
				
			},
			{//x = 7
				
			},
			{//x = 8
				
			},
			{//x = 9
				
			},
			{//x = 10
				
			},
			{//x = 11
				
			},
			{//x = 12
				
			},
			{//x = 13
				
			}
		},
		{//y = 25
			{//x = 0
				
			},
			{//x = 1
				
			},
			{//x = 2
				
			},
			{//x = 3
				
			},
			{//x = 4
				
			},
			{//x = 5
				
			},
			{//x = 6
				
			},
			{//x = 7
				
			},
			{//x = 8
				
			},
			{//x = 9
				
			},
			{//x = 10
				
			},
			{//x = 11
				
			},
			{//x = 12
				
			},
			{//x = 13
				
			}
		},
		{//y = 26
			{//x = 0
				
			},
			{//x = 1
				
			},
			{//x = 2
				
			},
			{//x = 3
				
			},
			{//x = 4
				
			},
			{//x = 5
				
			},
			{//x = 6
				
			},
			{//x = 7
				
			},
			{//x = 8
				
			},
			{//x = 9
				
			},
			{//x = 10
				
			},
			{//x = 11
				
			},
			{//x = 12
				
			},
			{//x = 13
				
			}}};
}