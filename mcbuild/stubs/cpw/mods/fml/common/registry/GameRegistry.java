package cpw.mods.fml.common.registry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
public class GameRegistry {
    public static void registerBlock(Block b, String name) {}
    public static void registerBlock(Block b, Class<?> itemClass, String name) {}
    public static void registerItem(Item i, String name) {}
    public static void registerTileEntity(Class<?> cls, String id) {}
    public static void addRecipe(ItemStack out, Object... ingredients) {}
    public static void addShapelessRecipe(ItemStack out, Object... ingredients) {}
    public static void addSmelting(Item in, ItemStack out, float xp) {}
    public static void addSmelting(Block in, ItemStack out, float xp) {}
    public static void addSmelting(ItemStack in, ItemStack out, float xp) {}
}
