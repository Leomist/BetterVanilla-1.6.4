package net.minecraft.dispenser;
import net.minecraft.item.ItemStack;
public abstract class BehaviorDefaultDispenseItem {
    public ItemStack dispense(IBlockSource source, ItemStack stack) { return dispenseStack(source, stack); }
    protected abstract ItemStack dispenseStack(IBlockSource source, ItemStack stack);
    protected void playDispenseSound(IBlockSource source) {}
}
