package net.minecraft.entity.item;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
public class EntityItem extends Entity {
    public int delayBeforeCanPickup = 10;
    public EntityItem(World world, double x, double y, double z, ItemStack stack) { super(world); }
    public ItemStack getEntityItem() { return null; }
    public void onUpdate() {}
}
