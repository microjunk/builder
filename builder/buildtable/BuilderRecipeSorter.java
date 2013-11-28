package builder.buildtable;

import java.util.Comparator;

import builder.utils.BuilderCraftingManager;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;

public class BuilderRecipeSorter implements Comparator
{
    final BuilderCraftingManager builderCraftingManager;

    public BuilderRecipeSorter(BuilderCraftingManager par1BuilderCraftingManager)
    {
        this.builderCraftingManager = par1BuilderCraftingManager;
    }

    public int compareRecipes(IRecipe par1IRecipe, IRecipe par2IRecipe)
    {
        return par1IRecipe instanceof BuilderShapelessRecipes && par2IRecipe instanceof BuilderShapedRecipes ? 1 : (par2IRecipe instanceof BuilderShapelessRecipes && par1IRecipe instanceof BuilderShapedRecipes ? -1 : (par2IRecipe.getRecipeSize() < par1IRecipe.getRecipeSize() ? -1 : (par2IRecipe.getRecipeSize() > par1IRecipe.getRecipeSize() ? 1 : 0)));
    }

    public int compare(Object par1Obj, Object par2Obj)
    {
        return this.compareRecipes((IRecipe)par1Obj, (IRecipe)par2Obj);
    }
}