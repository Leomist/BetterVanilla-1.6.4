package net.minecraft.block;
import net.minecraft.block.material.Material;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
public class BlockDispenser extends Block {
    public static final DispenserRegistry dispenseBehaviorRegistry = new DispenserRegistry();
    public BlockDispenser() { super(Material.rock); }
    public static EnumFacing func_149937_b(int i) { return EnumFacing.NORTH; }
    public static class DispenserRegistry {
        public void putObject(Item key, BehaviorDefaultDispenseItem val) {}
    }
}
