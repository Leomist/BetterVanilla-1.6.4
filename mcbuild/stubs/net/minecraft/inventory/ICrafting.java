package net.minecraft.inventory;
import net.minecraft.item.ItemStack;
import java.util.List;
public interface ICrafting {
    void sendContainerAndContentsToPlayer(Container container, List items);
    void sendSlotContents(Container container, int slot, ItemStack stack);
    void sendProgressBarUpdate(Container container, int var, int val);
    void func_71111_a(Container container, List items);
}
