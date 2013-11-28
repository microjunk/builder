package builder.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import builder.Builder;
import builder.buildtable.BuilderRecipeSorter;
import builder.buildtable.BuilderShapedRecipes;
import builder.buildtable.BuilderShapelessRecipes;

import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class BuilderCraftingManager
{
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;
	
    /** The static instance of this class */
    private static final BuilderCraftingManager instance = new BuilderCraftingManager();

    /** A list of all the recipes added */
    private List recipes = new ArrayList();

    /**
     * Returns the static instance of this class
     */
    public static final BuilderCraftingManager getInstance()
    {
        return instance;
    }

    private BuilderCraftingManager()
    {
    	recipes = new ArrayList();
    	this.func_92051_a(new ItemStack(Builder.netherEscape, 1), new Object[] {"ROOOR", "OOOOO", "OOROO", "OOOOO", "ROOOR", Character.valueOf('O'), Block.dirt, Character.valueOf('R'), Item.redstone});
		this.func_92051_a(new ItemStack(Builder.orientalVillage, 1), new Object[] {"PHNSP", "PCPCP", "CPCPC", "BBPBB", "PBTBP", Character.valueOf('P'), Block.planks, Character.valueOf('H'), new ItemStack(Builder.hammer, 1, WILDCARD_VALUE), Character.valueOf('S'), new ItemStack(Builder.handSaw, 1, WILDCARD_VALUE), Character.valueOf('N'), Builder.nail, Character.valueOf('C'), Block.cloth, Character.valueOf('B'), Block.stone, Character.valueOf('T'), Block.stairsCobblestone});
		this.func_92051_a(new ItemStack(Builder.normalVillage, 1), new Object[] {"PHNSP", "PCPCP", "PCPCP", "PTPCP", "PCPFP", Character.valueOf('P'), Block.planks, Character.valueOf('H'), new ItemStack(Builder.hammer, 1, WILDCARD_VALUE), Character.valueOf('S'), new ItemStack(Builder.handSaw, 1, WILDCARD_VALUE), Character.valueOf('N'), Builder.nail, Character.valueOf('C'), Block.cobblestone, Character.valueOf('T'), Block.workbench, Character.valueOf('F'), Block.furnaceIdle});
		this.func_92051_a(new ItemStack(Builder.uniqueHomes, 1), new Object[] {"PHNSP", "PCPCP", "PDPDP", "APAPA", "PLPLP", Character.valueOf('P'), Block.planks, Character.valueOf('H'), new ItemStack(Builder.hammer, 1, WILDCARD_VALUE), Character.valueOf('S'), new ItemStack(Builder.handSaw, 1, WILDCARD_VALUE), Character.valueOf('N'), Builder.nail, Character.valueOf('C'), Block.cobblestone, Character.valueOf('D'), Block.sand, Character.valueOf('A'), Block.blockSnow, Character.valueOf('L'), Block.leaves});
		this.func_92051_a(new ItemStack(Builder.medievalVillage, 1), new Object[] {"OHNSO", "PCPCP", "PCWCP", "PFGTP", "OEBEO", Character.valueOf('P'), new ItemStack(Block.wood, 1, 1), Character.valueOf('H'), new ItemStack(Builder.hammer, 1, WILDCARD_VALUE), Character.valueOf('S'), new ItemStack(Builder.handSaw, 1, WILDCARD_VALUE), Character.valueOf('N'), Builder.nail, Character.valueOf('C'), Block.stone, Character.valueOf('W'), Item.bucketWater, Character.valueOf('F'), Block.furnaceIdle, Character.valueOf('G'), Block.fence, Character.valueOf('T'), Block.chest, Character.valueOf('E'), Block.stairsWoodSpruce, Character.valueOf('B'), Block.stairsCobblestone, Character.valueOf('O'), new ItemStack(Block.cloth, 1, 1)});
		this.func_92051_a(new ItemStack(Builder.vikingVillage, 1), new Object[] {"FHNSC", "  P  ", " P P ", "PAPAP", "AAAAA", Character.valueOf('P'), Block.planks, Character.valueOf('H'), new ItemStack(Builder.hammer, 1, WILDCARD_VALUE), Character.valueOf('S'), new ItemStack(Builder.handSaw, 1, WILDCARD_VALUE), Character.valueOf('N'), Builder.nail, Character.valueOf('C'), Block.chest, Character.valueOf('F'), Block.furnaceIdle, Character.valueOf('A'), Block.cobblestone});
		this.func_92051_a(new ItemStack(Builder.romanVillage, 1), new Object[] {"PHNSP", "XRZRX", "XOKOX", "CRWRT", "PAXFP", Character.valueOf('P'), Block.planks, Character.valueOf('H'), new ItemStack(Builder.hammer, 1, WILDCARD_VALUE), Character.valueOf('S'), new ItemStack(Builder.handSaw, 1, WILDCARD_VALUE), Character.valueOf('N'), Builder.nail, Character.valueOf('X'), Block.sandStone, Character.valueOf('R'), Block.stone, Character.valueOf('Z'), Block.stoneSingleSlab, Character.valueOf('O'), new ItemStack(Block.cloth, 1, 1), Character.valueOf('K'), Block.bookShelf, Character.valueOf('C'), Block.chest, Character.valueOf('W'), Item.bucketWater, Character.valueOf('T'), Block.workbench, Character.valueOf('F'), Block.furnaceIdle, Character.valueOf('A'), Block.anvil});		
		this.func_92051_a(new ItemStack(Builder.netherVillage, 1), new Object[] {"RHSNR", "BRRRB", "BGGGB", "BUFUB", "OCATO", Character.valueOf('H'), new ItemStack(Builder.hammer, 1, WILDCARD_VALUE), Character.valueOf('S'), new ItemStack(Builder.handSaw, 1, WILDCARD_VALUE), Character.valueOf('N'), Builder.nail, Character.valueOf('R'), Block.netherrack, Character.valueOf('B'), Block.netherBrick, Character.valueOf('G'), Block.glowStone, Character.valueOf('U'), Block.slowSand, Character.valueOf('O'), Block.oreNetherQuartz, Character.valueOf('A'), Block.stairsNetherBrick, Character.valueOf('C'), Block.chest, Character.valueOf('F'), Block.furnaceIdle, Character.valueOf('T'), Block.workbench});
		this.func_92051_a(new ItemStack(Builder.modernVillage, 1), new Object[] {"AACFT", "HSGGG", "NGDDD", "GQEQI", "BQBQI", Character.valueOf('H'), new ItemStack(Builder.hammer, 1, WILDCARD_VALUE), Character.valueOf('S'), new ItemStack(Builder.handSaw, 1, WILDCARD_VALUE), Character.valueOf('N'), Builder.nail, Character.valueOf('A'), Block.coalBlock, Character.valueOf('B'), new ItemStack(Block.stainedClay, 1, 15), Character.valueOf('C'), Block.chest, Character.valueOf('F'), Block.furnaceIdle, Character.valueOf('T'), Block.workbench, Character.valueOf('G'), new ItemStack(Block.stainedClay, 1, 13), Character.valueOf('D'), Block.glass, Character.valueOf('Q'), Block.blockNetherQuartz, Character.valueOf('I'), Block.blockIron, Character.valueOf('E'), Block.ice});
		this.func_92051_a(new ItemStack(Builder.russianVillage, 1), new Object[] {"PHBSP", "ABNBA", "BBRBB", "BCFTB", "LLOLL", Character.valueOf('H'), new ItemStack(Builder.hammer, 1, WILDCARD_VALUE), Character.valueOf('S'), new ItemStack(Builder.handSaw, 1, WILDCARD_VALUE), Character.valueOf('N'), Builder.nail, Character.valueOf('B'), Block.stoneBrick, Character.valueOf('C'), Block.chest, Character.valueOf('F'), Block.furnaceIdle, Character.valueOf('T'), Block.workbench, Character.valueOf('L'), new ItemStack(Block.wood, 1, 1), Character.valueOf('O'), Block.stairsWoodOak, Character.valueOf('R'), Block.plantRed, Character.valueOf('A'), Block.stoneSingleSlab, Character.valueOf('P'), Block.planks});
		this.func_92051_a(new ItemStack(Builder.oldwestVillage, 1), new Object[] {"PHNSP", "DLLLD", "WCBTW", "WBFBW", "PZAZP", Character.valueOf('H'), new ItemStack(Builder.hammer, 1, WILDCARD_VALUE), Character.valueOf('S'), new ItemStack(Builder.handSaw, 1, WILDCARD_VALUE), Character.valueOf('N'), Builder.nail, Character.valueOf('C'), Block.chest, Character.valueOf('F'), Block.furnaceIdle, Character.valueOf('T'), Block.workbench, Character.valueOf('A'), Block.anvil, Character.valueOf('B'), Block.hay, Character.valueOf('P'), Block.planks, Character.valueOf('Z'), Block.stairsWoodOak, Character.valueOf('W'), Block.cobblestoneWall, Character.valueOf('L'), new ItemStack(Block.wood.blockID, 1, 1), Character.valueOf('D'), Block.hardenedClay});
		this.func_92051_a(new ItemStack(Builder.indianVillage, 1), new Object[] {"PHNSP", "ABUBA", "BWCWB", "ULFLU", "PAXAP", Character.valueOf('H'), new ItemStack(Builder.hammer, 1, WILDCARD_VALUE), Character.valueOf('S'), new ItemStack(Builder.handSaw, 1, WILDCARD_VALUE), Character.valueOf('N'), Builder.nail, Character.valueOf('B'), Item.bone, Character.valueOf('A'), Item.arrow, Character.valueOf('F'), Block.furnaceIdle, Character.valueOf('C'), Block.workbench, Character.valueOf('L'), new ItemStack(Block.stainedClay, 1, 3), Character.valueOf('X'), Item.bow, Character.valueOf('W'), Block.stainedClay, Character.valueOf('U'), new ItemStack(Block.stainedClay, 1, 10), Character.valueOf('P'), Block.planks});
		this.func_92051_a(new ItemStack(Builder.hallowVillage, 1), new Object[] {"WHNSW", "I J I", "PPGPP", "FAOAC", "BLOLB", Character.valueOf('H'), new ItemStack(Builder.hammer, 1, WILDCARD_VALUE), Character.valueOf('S'), new ItemStack(Builder.handSaw, 1, WILDCARD_VALUE), Character.valueOf('N'), Builder.nail, Character.valueOf('W'), Block.web, Character.valueOf('F'), Block.furnaceIdle, Character.valueOf('C'), Block.workbench, Character.valueOf('A'), Block.hay, Character.valueOf('B'), new ItemStack(Block.stainedClay, 1, 15), Character.valueOf('P'), Block.pumpkin, Character.valueOf('J'), Block.pumpkinLantern, Character.valueOf('G'), Block.glowStone, Character.valueOf('L'), Block.stairsWoodSpruce, Character.valueOf('O'), Block.obsidian, Character.valueOf('I'), Block.fenceIron});
		
		Collections.sort(this.recipes, new BuilderRecipeSorter(this));
        System.out.println(this.recipes.size() + " recipes");
    }

    public BuilderShapedRecipes func_92051_a(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        String var3 = "";
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;

        if (par2ArrayOfObj[var4] instanceof String[])
        {
            String[] var7 = (String[])((String[])par2ArrayOfObj[var4++]);

            for (int var8 = 0; var8 < var7.length; ++var8)
            {
                String var9 = var7[var8];
                ++var6;
                var5 = var9.length();
                var3 = var3 + var9;
            }
        }
        else
        {
            while (par2ArrayOfObj[var4] instanceof String)
            {
                String var11 = (String)par2ArrayOfObj[var4++];
                ++var6;
                var5 = var11.length();
                var3 = var3 + var11;
            }
        }

        HashMap var12;

        for (var12 = new HashMap(); var4 < par2ArrayOfObj.length; var4 += 2)
        {
            Character var13 = (Character)par2ArrayOfObj[var4];
            ItemStack var14 = null;

            if (par2ArrayOfObj[var4 + 1] instanceof Item)
            {
                var14 = new ItemStack((Item)par2ArrayOfObj[var4 + 1]);
            }
            else if (par2ArrayOfObj[var4 + 1] instanceof Block)
            {
                var14 = new ItemStack((Block)par2ArrayOfObj[var4 + 1], 1, -1);
            }
            else if (par2ArrayOfObj[var4 + 1] instanceof ItemStack)
            {
                var14 = (ItemStack)par2ArrayOfObj[var4 + 1];
            }

            var12.put(var13, var14);
        }

        ItemStack[] var15 = new ItemStack[var5 * var6];

        for (int var16 = 0; var16 < var5 * var6; ++var16)
        {
            char var10 = var3.charAt(var16);

            if (var12.containsKey(Character.valueOf(var10)))
            {
                var15[var16] = ((ItemStack)var12.get(Character.valueOf(var10))).copy();
            }
            else
            {
                var15[var16] = null;
            }
        }

        BuilderShapedRecipes var17 = new BuilderShapedRecipes(var5, var6, var15, par1ItemStack);
        this.recipes.add(var17);
        return var17;
    }

    public void addBuilderShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        ArrayList var3 = new ArrayList();
        Object[] var4 = par2ArrayOfObj;
        int var5 = par2ArrayOfObj.length;

        for (int var6 = 0; var6 < var5; ++var6)
        {
            Object var7 = var4[var6];

            if (var7 instanceof ItemStack)
            {
                var3.add(((ItemStack)var7).copy());
            }
            else if (var7 instanceof Item)
            {
                var3.add(new ItemStack((Item)var7));
            }
            else
            {
                if (!(var7 instanceof Block))
                {
                    throw new RuntimeException("Invalid shapeless recipy!");
                }

                var3.add(new ItemStack((Block)var7));
            }
        }

        this.recipes.add(new BuilderShapelessRecipes(par1ItemStack, var3));
    }

    public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
    {
        int var3 = 0;
        ItemStack var4 = null;
        ItemStack var5 = null;
        int var6;

        for (var6 = 0; var6 < par1InventoryCrafting.getSizeInventory(); ++var6)
        {
            ItemStack var7 = par1InventoryCrafting.getStackInSlot(var6);

            if (var7 != null)
            {
                if (var3 == 0)
                {
                    var4 = var7;
                }

                if (var3 == 1)
                {
                    var5 = var7;
                }

                ++var3;
            }
        }

        if (var3 == 2 && var4.itemID == var5.itemID && var4.stackSize == 1 && var5.stackSize == 1 && Item.itemsList[var4.itemID].isRepairable())
        {
            Item var11 = Item.itemsList[var4.itemID];
            int var13 = var11.getMaxDamage() - var4.getItemDamageForDisplay();
            int var8 = var11.getMaxDamage() - var5.getItemDamageForDisplay();
            int var9 = var13 + var8 + var11.getMaxDamage() * 5 / 100;
            int var10 = var11.getMaxDamage() - var9;

            if (var10 < 0)
            {
                var10 = 0;
            }

            return new ItemStack(var4.itemID, 1, var10);
        }
        else
        {
            for (var6 = 0; var6 < this.recipes.size(); ++var6)
            {
                IRecipe var12 = (IRecipe)this.recipes.get(var6);

                if (var12.matches(par1InventoryCrafting, par2World))
                {
                    return var12.getCraftingResult(par1InventoryCrafting);
                }
            }

            return null;
        }
    }

    /**
     * returns the List<> of all recipes
     */
    public List getRecipeList()
    {
        return this.recipes;
    }
}