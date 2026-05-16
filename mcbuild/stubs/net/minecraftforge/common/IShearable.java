package net.minecraftforge.common;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import java.util.ArrayList;
public interface IShearable {
    boolean isShearable(ItemStack item, IBlockAccess world, int x, int y, int z);
    ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world, int x, int y, int z, int fortune);
}
