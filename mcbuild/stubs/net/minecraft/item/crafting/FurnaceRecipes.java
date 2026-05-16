package net.minecraft.item.crafting;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
public class FurnaceRecipes {
    private static final FurnaceRecipes smelting = new FurnaceRecipes();
    public static FurnaceRecipes smelting() { return smelting; }
    public void func_151393_a(Block input, ItemStack output, float xp) {}
    public void addSmeltingRecipe(int id, ItemStack output, float xp) {}
    public void addSmeltingRecipeForBlock(Block block, ItemStack output, float xp) {}
    public void addSmeltingRecipe(Item item, ItemStack output, float xp) {}
}
