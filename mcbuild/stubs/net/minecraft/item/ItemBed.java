package net.minecraft.item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
public class ItemBed extends Item {
    public ItemBed() {}
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hx, float hy, float hz) { return false; }
}
