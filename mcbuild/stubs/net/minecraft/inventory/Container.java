package net.minecraft.inventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import java.util.ArrayList;
import java.util.List;
public abstract class Container {
    @SuppressWarnings("rawtypes")
    public List inventorySlots = new ArrayList();
    @SuppressWarnings("rawtypes")
    public List crafters = new ArrayList();
    protected Slot addSlotToContainer(Slot slot) { inventorySlots.add(slot); return slot; }
    public abstract boolean canInteractWith(EntityPlayer player);
    public ItemStack transferStackInSlot(EntityPlayer player, int index) { return null; }
    public void detectAndSendChanges() {}
    @SuppressWarnings("unchecked")
    public void addCraftingToCrafters(ICrafting crafting) { crafters.add(crafting); }
    public void removeCraftingFromCrafters(ICrafting crafting) { crafters.remove(crafting); }
    public void onContainerClosed(EntityPlayer player) {}
    public void updateProgressBar(int id, int value) {}
    protected boolean mergeItemStack(ItemStack stack, int start, int end, boolean reverse) { return false; }
}
