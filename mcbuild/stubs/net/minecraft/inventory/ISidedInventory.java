package net.minecraft.inventory;
import net.minecraft.item.ItemStack;
public interface ISidedInventory extends IInventory {
    int[] getAccessibleSlotsFromSide(int side);
    boolean canInsertItem(int slot, ItemStack stack, int side);
    boolean canExtractItem(int slot, ItemStack stack, int side);
}
