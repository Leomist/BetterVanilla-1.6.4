package net.minecraft.entity.player;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
public class InventoryPlayer implements IInventory {
    public int currentItem = 0;
    public EntityPlayer player;
    public ItemStack[] mainInventory = new ItemStack[36];
    public InventoryPlayer(EntityPlayer player) { this.player = player; }
    public ItemStack getCurrentItem() { return null; }
    public boolean addItemStackToInventory(ItemStack stack) { return false; }
    public void setInventorySlotContents(int slot, ItemStack stack) {}
    public ItemStack decrStackSize(int slot, int amount) { return null; }
    public int getSizeInventory() { return 36; }
    public ItemStack getStackInSlot(int slot) { return null; }
    public ItemStack getStackInSlotOnClosing(int slot) { return null; }
    public String getInventoryName() { return "inventory"; }
    public boolean hasCustomInventoryName() { return false; }
    public int getInventoryStackLimit() { return 64; }
    public void markDirty() {}
    public boolean isUseableByPlayer(EntityPlayer player) { return true; }
    public void openInventory() {}
    public void closeInventory() {}
    public boolean isItemValidForSlot(int slot, ItemStack stack) { return true; }
}
