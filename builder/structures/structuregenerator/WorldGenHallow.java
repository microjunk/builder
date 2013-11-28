package builder.structures.structuregenerator;

/**
Copyright (C) <2013> <coolAlias>

This file is part of coolAlias' Structure Generation Tool; as such,
you can redistribute it and/or modify it under the terms of the GNU
General Public License as published by the Free Software Foundation,
either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import builder.utils.structuregenerator.CustomHooks;
import builder.utils.structuregenerator.LogHelper;
import builder.utils.structuregenerator.Structure;
import builder.structures.halloweentown.HallowBlackSmith;
import builder.structures.halloweentown.HallowHut;
import builder.structures.halloweentown.HallowLibrary;
import builder.structures.halloweentown.HallowRowHomes;
import builder.utils.structuregenerator.StructureGeneratorBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockJukeBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityRecordPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldGenHallow extends StructureGeneratorBase
{
	/** List storing all structures currently available */
	public static final List<Structure> structures = new LinkedList();

	int random_hole;
	// a better way would be to pass World in to the constructors and set the random_hole
	// value there, but I'm feeling lazy
	boolean value_set = false;

	//private BlockJukeBox box;
	private ItemStack record;

	public WorldGenHallow(Entity entity, int[][][][] blocks)
	{
		super(entity, blocks);
	}

	public WorldGenHallow(Entity entity, int[][][][] blocks, int structureFacing) 
	{
		super(entity, blocks, structureFacing);
	}

	public WorldGenHallow(Entity entity, int[][][][] blocks, int structureFacing, int offX, int offY, int offZ) 
	{
		super(entity, blocks, structureFacing, offX, offY, offZ);
	}

	public WorldGenHallow() 
	{
		super();
	}

	/**
	* Allows the use of block ids greater than 4096 as custom 'hooks' to trigger onCustomBlockAdded
	* @param fakeID Identifier for your 'event'. Absolute value must be greater than 4096
	* @param customData Custom data may be used to subtype events for given fakeID
	* @return Returns the real id of the block to spawn in the world; must be <= 4096
	*/
	@Override
	public int getRealBlockID(int fakeID, int customData1) 
	{
		LogHelper.log(Level.FINE, "Getting real id from fake id: " + fakeID);
		switch(fakeID) 
		{
		case HallowBlackSmith.CUSTOM_CHEST1:
			return Block.chest.blockID;
		case HallowLibrary.CUSTOM_CHEST2:
			return Block.chest.blockID;
		case HallowBlackSmith.SPAWN_VILLAGER:
			return Block.torchWood.blockID;
		case HallowHut.CUSTOM_SKULL:
			return Block.skull.blockID;
		case HallowRowHomes.JUKEBOX:
			return Block.jukebox.blockID;
		default:
			return 0;
		}
	}

	/**
	* A custom 'hook' to allow setting of tile entities, spawning entities, etc.
	* @param fakeID The custom identifier used to distinguish between types
	* @param customData1 Custom data used to subtype events for given fakeID
	* @param customData2 Additional custom data
	*/
	@Override
	public void onCustomBlockAdded(World world, int x, int y, int z, int fakeID, int customData1, int customData2)
	{
		if (!value_set) 
		{
			random_hole = world.rand.nextInt(5);
			value_set = true;
		}
		int meta = world.getBlockMetadata(x, y, z);
		LogHelper.log(Level.FINE, "Setting custom block info for fake id " + fakeID + " and customData1 " + customData1);
		LogHelper.log(Level.FINEST, "Custom block metadata from world = " + meta);

		switch(fakeID) 
		{
		case HallowBlackSmith.CUSTOM_CHEST1:
			addItemToTileInventory(world, new ItemStack(Item.diamond, 3), x, y, z);
			addItemToTileInventory(world, new ItemStack(Item.helmetIron, 1), x, y, z);
			addItemToTileInventory(world, new ItemStack(Item.bootsIron, 1), x, y, z);
			addItemToTileInventory(world, new ItemStack(Block.oreCoal, 3), x, y, z);
			break;
		case HallowLibrary.CUSTOM_CHEST2:
			addItemToTileInventory(world, new ItemStack(Item.book, 2), x, y, z);
			addItemToTileInventory(world, new ItemStack(Item.writableBook, 1), x, y, z);
			addItemToTileInventory(world, new ItemStack(Item.feather, 3), x, y, z);
			addItemToTileInventory(world, new ItemStack(Item.paper, 3), x, y, z);
			addItemToTileInventory(world, new ItemStack(Item.dyePowder, 1, 0), x, y, z);
			break;
		case HallowHut.CUSTOM_SKULL:
			setSkullData(world, "wither", customData1, x, y, z);
			break;
		case HallowBlackSmith.SPAWN_VILLAGER:
			Entity bob = new EntityVillager(world, customData1);
			spawnEntityInStructure(world, bob, x, y, z);
			break;
		case HallowRowHomes.JUKEBOX:
			//ItemStack juke = new ItemStack(Item.recordChirp);
			//box.insertRecord(world, x, y, z, juke);
			//world.playRecord("chirp", x, y, z);
			Block block = Block.blocksList[world.getBlockId(x, y, z)];
			if (block instanceof BlockJukeBox)
			{
				((BlockJukeBox) block).insertRecord(world, x, y, z, new ItemStack(Item.recordChirp));
			}
			TileEntityRecordPlayer tileentityrecordplayer = (TileEntityRecordPlayer)world.getBlockTileEntity(x, y, z);

            if (tileentityrecordplayer != null)
            {
                tileentityrecordplayer.func_96098_a(record.copy());
                world.setBlockMetadataWithNotify(x, y, z, 1, 2);
            }
			break;
		default:
			LogHelper.log(Level.WARNING, "No custom method defined for id " + fakeID);
		}
	}
}