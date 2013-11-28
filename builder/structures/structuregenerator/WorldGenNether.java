package builder.structures.structuregenerator;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import builder.structures.nether.NetherHouse1;
import builder.utils.structuregenerator.LogHelper;
import builder.utils.structuregenerator.Structure;
import builder.utils.structuregenerator.StructureGeneratorBase;

public class WorldGenNether extends StructureGeneratorBase
{
	/** List storing all structures currently available */
	public static final List<Structure> structures = new LinkedList();

	int random_hole;
	// a better way would be to pass World in to the constructors and set the random_hole
	// value there, but I'm feeling lazy
	boolean value_set = false;

	public WorldGenNether(Entity entity, int[][][][] blocks)
	{
		super(entity, blocks);
	}

	public WorldGenNether(Entity entity, int[][][][] blocks, int structureFacing) 
	{
		super(entity, blocks, structureFacing);
	}

	public WorldGenNether(Entity entity, int[][][][] blocks, int structureFacing, int offX, int offY, int offZ) 
	{
		super(entity, blocks, structureFacing, offX, offY, offZ);
	}

	public WorldGenNether() 
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
		case NetherHouse1.SPAWN_VILLAGER:
			return Block.torchWood.blockID; // using this, the villager will be spawned post-generation
		case NetherHouse1.CUSTOM_SKULL:
			return Block.skull.blockID;
		default:
			// note that SPAWN_VILLAGER would return 0 by default if we didn't set a custom id above,
			// which is what we would want for 'air' if we didn't care about post-gen spawning
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
			// if using this method, this should only be done once per structure, preferably with a better method
			// sets one value of RANDOM_HOLE to remove from the structure, allowing for patterns
			random_hole = world.rand.nextInt(5);
			value_set = true;
		}
		int meta = world.getBlockMetadata(x, y, z);
		LogHelper.log(Level.FINE, "Setting custom block info for fake id " + fakeID + " and customData1 " + customData1);
		LogHelper.log(Level.FINEST, "Custom block metadata from world = " + meta);

		switch(fakeID) 
		{
		case NetherHouse1.CUSTOM_SKULL:
			// Easily set the skull type or player name if you know it:
			setSkullData(world, "", customData1, x, y, z);
			break;
		case NetherHouse1.SPAWN_VILLAGER:
			// here I'm using customData as the villagerID
			Entity bob = new EntityVillager(world, customData1);
			//Entity X = new EntityHorse(world);
			//((EntityHorse) X).func_110235_q(1026);

			// Now use the preset method to avoid spawning in walls
			spawnEntityInStructure(world, bob, x, y, z);
			break;
		default:
			LogHelper.log(Level.WARNING, "No custom method defined for id " + fakeID);
		}
	}

	/**
	* Add all structures to the Structure List
	*/
	static
	{
		/*Structure structure = new Structure("Hut");
		structure.addBlockArray(StructureArrays.blockArrayNPCHut);
		structure.setFacing(StructureGeneratorBase.EAST);
		// has a buffer layer on the bottom in case no ground; spawn at y-1 for ground level
		structure.setStructureOffset(0, -1, 0);
		structures.add(structure);

		structure = new Structure("Blacksmith");
		structure.addBlockArray(StructureArrays.blockArrayNPCBlackSmith);
		structure.setFacing(StructureGeneratorBase.NORTH);
		structures.add(structure);

		structure = new Structure("Viking Shop");
		structure.addBlockArray(StructureArrays.blockArrayShop);
		structure.setFacing(StructureGeneratorBase.WEST);
		structures.add(structure);

		structure = new Structure("Redstone Dungeon");
		structure.addBlockArray(StructureArrays.blockArrayRedstone);
		//structure.setFacing(StructureGeneratorBase.EAST);
		structures.add(structure);

		structure = new Structure("Offset Test");
		structure.addBlockArray(StructureArrays.blockArraySpawnTest);
		/*
		structure.addBlockArray(StructureArrays.blockArrayOffsetTest1);
		structure.addBlockArray(StructureArrays.blockArrayOffsetTest2);
		structure.addBlockArray(StructureArrays.blockArrayOffsetTest2);
		structure.addBlockArray(StructureArrays.blockArrayOffsetTest2);
		structure.addBlockArray(StructureArrays.blockArrayOffsetTest1);
		*/
		//structure.setFacing(StructureGeneratorBase.NORTH);
		//structures.add(structure);
	}
}