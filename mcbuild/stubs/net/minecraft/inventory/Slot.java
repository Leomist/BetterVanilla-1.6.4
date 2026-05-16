package net.minecraft.inventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
public class Slot {
    public final IInventory inventory;
    public final int slotIndex;
    public int xDisplayPosition, yDisplayPosition;
    public Slot(IInventory inv, int idx, int x, int y) {
        this.inventory = inv; this.slotIndex = idx;
        this.xDisplayPosition = x; this.yDisplayPosition = y;
    }
    public boolean isItemValid(ItemStack stack) { return true; }
    public int getSlotStackLimit() { return 64; }
    public ItemStack getStack() { return inventory.getStackInSlot(slotIndex); }
    public void putStack(ItemStack stack) { inventory.setInventorySlotContents(slotIndex, stack); }
    public boolean getHasStack() { return getStack() != null; }
    public void onSlotChange(ItemStack a, ItemStack b) {}
    public void onSlotChanged() {}
    public void onPickupFromSlot(EntityPlayer player, ItemStack stack) {}
}
