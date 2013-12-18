package builder.handlers;

import builder.EntitySanta;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;

public class BuilderVillagers 
{
	public static void initVillagers() 
	{
		//Hallow Villagers_____________________________________Hallow Villagers
		VillagerRegistry.instance().registerVillagerId(6);
		VillagerRegistry.instance().registerVillagerSkin(6, new ResourceLocation("builder", "textures/peeps/hallow/jack.png"));
		VillagerRegistry.instance().registerVillagerId(7);
		VillagerRegistry.instance().registerVillagerSkin(7, new ResourceLocation("builder", "textures/peeps/hallow/hallowpriest.png"));
		VillagerRegistry.instance().registerVillagerId(8);
		VillagerRegistry.instance().registerVillagerSkin(8, new ResourceLocation("builder", "textures/peeps/hallow/skelesmith.png"));
		VillagerRegistry.instance().registerVillagerId(9);
		VillagerRegistry.instance().registerVillagerSkin(9, new ResourceLocation("builder", "textures/peeps/hallow/hallowfarmer.png"));
		VillagerRegistry.instance().registerVillagerId(10);
		VillagerRegistry.instance().registerVillagerSkin(10, new ResourceLocation("builder", "textures/peeps/hallow/hallowbutcher.png"));
		VillagerRegistry.instance().registerVillagerId(11);
		VillagerRegistry.instance().registerVillagerSkin(11, new ResourceLocation("builder", "textures/peeps/hallow/villager.png"));
		
		//Modern Villagers_____________________________________Modern Villagers
		VillagerRegistry.instance().registerVillagerId(12);
		VillagerRegistry.instance().registerVillagerSkin(12, new ResourceLocation("builder", "textures/peeps/modern/fathersteve.png"));
		VillagerRegistry.instance().registerVillagerId(13);
		VillagerRegistry.instance().registerVillagerSkin(13, new ResourceLocation("builder", "textures/peeps/modern/gardner.png"));
		VillagerRegistry.instance().registerVillagerId(14);
		VillagerRegistry.instance().registerVillagerSkin(14, new ResourceLocation("builder", "textures/peeps/modern/blacksmith.png"));
		VillagerRegistry.instance().registerVillagerId(15);
		VillagerRegistry.instance().registerVillagerSkin(15, new ResourceLocation("builder", "textures/peeps/modern/farmer.png"));
		VillagerRegistry.instance().registerVillagerId(16);
		VillagerRegistry.instance().registerVillagerSkin(16, new ResourceLocation("builder", "textures/peeps/modern/joe.png"));
		
		//Oriental Villagers_____________________________________Oriental Villagers
		VillagerRegistry.instance().registerVillagerId(17);
		VillagerRegistry.instance().registerVillagerSkin(17, new ResourceLocation("builder", "textures/peeps/oriental/priest.png"));
		VillagerRegistry.instance().registerVillagerId(18);
		VillagerRegistry.instance().registerVillagerSkin(18, new ResourceLocation("builder", "textures/peeps/oriental/blacksmith.png"));
		VillagerRegistry.instance().registerVillagerId(19);
		VillagerRegistry.instance().registerVillagerSkin(19, new ResourceLocation("builder", "textures/peeps/oriental/librarian.png"));
		VillagerRegistry.instance().registerVillagerId(20);
		VillagerRegistry.instance().registerVillagerSkin(20, new ResourceLocation("builder", "textures/peeps/oriental/farmer.png"));
		VillagerRegistry.instance().registerVillagerId(21);
		VillagerRegistry.instance().registerVillagerSkin(21, new ResourceLocation("builder", "textures/peeps/oriental/villager.png"));
		
		//Medieval Villagers_____________________________________Medieval Villagers
		VillagerRegistry.instance().registerVillagerId(22);
		VillagerRegistry.instance().registerVillagerSkin(22, new ResourceLocation("builder", "textures/peeps/medieval/medpriest.png"));
		VillagerRegistry.instance().registerVillagerId(23);
		VillagerRegistry.instance().registerVillagerSkin(23, new ResourceLocation("builder", "textures/peeps/medieval/medsmith.png"));
		VillagerRegistry.instance().registerVillagerId(24);
		VillagerRegistry.instance().registerVillagerSkin(24, new ResourceLocation("builder", "textures/peeps/medieval/medbutcher.png"));
		VillagerRegistry.instance().registerVillagerId(25);
		VillagerRegistry.instance().registerVillagerSkin(25, new ResourceLocation("builder", "textures/peeps/medieval/medfarmer.png"));
		VillagerRegistry.instance().registerVillagerId(26);
		VillagerRegistry.instance().registerVillagerSkin(26, new ResourceLocation("builder", "textures/peeps/medieval/medkeeper.png"));
		VillagerRegistry.instance().registerVillagerId(27);
		VillagerRegistry.instance().registerVillagerSkin(27, new ResourceLocation("builder", "textures/peeps/medieval/medchemist.png"));
		VillagerRegistry.instance().registerVillagerId(28);
		VillagerRegistry.instance().registerVillagerSkin(28, new ResourceLocation("builder", "textures/peeps/medieval/medguard.png"));
		
		//Indian Villagers_____________________________________Indian Villagers
		VillagerRegistry.instance().registerVillagerId(29);
		VillagerRegistry.instance().registerVillagerSkin(29, new ResourceLocation("builder", "textures/peeps/indian/chief.png"));
		VillagerRegistry.instance().registerVillagerId(30);
		VillagerRegistry.instance().registerVillagerSkin(30, new ResourceLocation("builder", "textures/peeps/indian/indian.png"));
		
		//OldWest Villagers_____________________________________OldWest Villagers
		VillagerRegistry.instance().registerVillagerId(31);
		VillagerRegistry.instance().registerVillagerSkin(31, new ResourceLocation("builder", "textures/peeps/oldwest/priest.png"));
		VillagerRegistry.instance().registerVillagerId(32);
		VillagerRegistry.instance().registerVillagerSkin(32, new ResourceLocation("builder", "textures/peeps/oldwest/smith.png"));
		VillagerRegistry.instance().registerVillagerId(33);
		VillagerRegistry.instance().registerVillagerSkin(33, new ResourceLocation("builder", "textures/peeps/oldwest/banker.png"));
		VillagerRegistry.instance().registerVillagerId(34);
		VillagerRegistry.instance().registerVillagerSkin(34, new ResourceLocation("builder", "textures/peeps/oldwest/clerk.png"));
		VillagerRegistry.instance().registerVillagerId(35);
		VillagerRegistry.instance().registerVillagerSkin(35, new ResourceLocation("builder", "textures/peeps/oldwest/sheriff.png"));
		VillagerRegistry.instance().registerVillagerId(36);
		VillagerRegistry.instance().registerVillagerSkin(36, new ResourceLocation("builder", "textures/peeps/oldwest/villager.png"));
		
		//Russian Villagers_____________________________________Russian Villagers
		VillagerRegistry.instance().registerVillagerId(37);
		VillagerRegistry.instance().registerVillagerSkin(37, new ResourceLocation("builder", "textures/peeps/russian/priest.png"));
		VillagerRegistry.instance().registerVillagerId(38);
		VillagerRegistry.instance().registerVillagerSkin(38, new ResourceLocation("builder", "textures/peeps/russian/blacksmith.png"));
		VillagerRegistry.instance().registerVillagerId(39);
		VillagerRegistry.instance().registerVillagerSkin(39, new ResourceLocation("builder", "textures/peeps/russian/soldier.png"));
		VillagerRegistry.instance().registerVillagerId(40);
		VillagerRegistry.instance().registerVillagerSkin(40, new ResourceLocation("builder", "textures/peeps/russian/farmer.png"));
		VillagerRegistry.instance().registerVillagerId(41);
		VillagerRegistry.instance().registerVillagerSkin(41, new ResourceLocation("builder", "textures/peeps/russian/villager.png"));
		
		//Roman Villagers_____________________________________Roman Villagers
		VillagerRegistry.instance().registerVillagerId(42);
		VillagerRegistry.instance().registerVillagerSkin(42, new ResourceLocation("builder", "textures/peeps/roman/priest.png"));
		VillagerRegistry.instance().registerVillagerId(43);
		VillagerRegistry.instance().registerVillagerSkin(43, new ResourceLocation("builder", "textures/peeps/roman/warrior.png"));
		VillagerRegistry.instance().registerVillagerId(44);
		VillagerRegistry.instance().registerVillagerSkin(44, new ResourceLocation("builder", "textures/peeps/roman/farmer.png"));
		VillagerRegistry.instance().registerVillagerId(45);
		VillagerRegistry.instance().registerVillagerSkin(45, new ResourceLocation("builder", "textures/peeps/roman/blacksmith.png"));
		VillagerRegistry.instance().registerVillagerId(46);
		VillagerRegistry.instance().registerVillagerSkin(46, new ResourceLocation("builder", "textures/peeps/roman/villager.png"));
		VillagerRegistry.instance().registerVillagerId(47);
		VillagerRegistry.instance().registerVillagerSkin(47, new ResourceLocation("builder", "textures/peeps/roman/librarian.png"));
		
		//Viking Villagers_____________________________________Viking Villagers
		VillagerRegistry.instance().registerVillagerId(48);
		VillagerRegistry.instance().registerVillagerSkin(48, new ResourceLocation("builder", "textures/peeps/viking/priest.png"));
		VillagerRegistry.instance().registerVillagerId(49);
		VillagerRegistry.instance().registerVillagerSkin(49, new ResourceLocation("builder", "textures/peeps/viking/farmer.png"));
		VillagerRegistry.instance().registerVillagerId(50);
		VillagerRegistry.instance().registerVillagerSkin(50, new ResourceLocation("builder", "textures/peeps/viking/smith.png"));
		VillagerRegistry.instance().registerVillagerId(51);
		VillagerRegistry.instance().registerVillagerSkin(51, new ResourceLocation("builder", "textures/peeps/viking/villager.png"));
		VillagerRegistry.instance().registerVillagerId(52);
		VillagerRegistry.instance().registerVillagerSkin(52, new ResourceLocation("builder", "textures/peeps/viking/villager.png"));
		
		//Santa Villagers_______________________________________Sand Villagers
		VillagerRegistry.instance().registerVillagerId(53);
		VillagerRegistry.instance().registerVillagerSkin(53, new ResourceLocation("builder", "textures/peeps/christmas/santa.png"));
		
		VillagerRegistry.instance().getRegisteredVillagers();
	}
}
