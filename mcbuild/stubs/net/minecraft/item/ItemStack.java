package net.minecraft.item;
import net.minecraft.nbt.NBTTagCompound;
public class ItemStack {
    public int stackSize;
    public int itemID;
    public NBTTagCompound stackTagCompound;
    public ItemStack(Item item) { this.stackSize = 1; }
    public ItemStack(Item item, int size) { this.stackSize = size; }
    public ItemStack(Item item, int size, int damage) { this.stackSize = size; }
    public ItemStack(net.minecraft.block.Block block) { this.stackSize = 1; }
    public ItemStack(net.minecraft.block.Block block, int size) { this.stackSize = size; }
    public ItemStack(net.minecraft.block.Block block, int size, int damage) { this.stackSize = size; }
    public Item getItem() { return null; }
    public int getItemDamage() { return 0; }
    public void setItemDamage(int damage) {}
    public ItemStack copy() { return this; }
    public boolean isItemEqual(ItemStack other) { return false; }
    public static boolean areItemStacksEqual(ItemStack a, ItemStack b) { return a == b; }
    public boolean hasTagCompound() { return stackTagCompound != null; }
    public NBTTagCompound getTagCompound() { return stackTagCompound; }
    public void setTagCompound(NBTTagCompound nbt) { this.stackTagCompound = nbt; }
    public boolean hasDisplayName() { return false; }
    public String getDisplayName() { return ""; }
    public void writeToNBT(NBTTagCompound nbt) {}
    public static ItemStack loadItemStackFromNBT(NBTTagCompound nbt) { return null; }
    public String getUnlocalizedName() { return ""; }
}
