package net.minecraft.item.crafting;
import java.util.ArrayList;
import java.util.List;
public class CraftingManager {
    private static final CraftingManager instance = new CraftingManager();
    public static CraftingManager getInstance() { return instance; }
    public List<IRecipe> getRecipeList() { return new ArrayList<>(); }
}
