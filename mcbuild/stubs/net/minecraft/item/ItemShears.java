package net.minecraft.item;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
public class ItemShears extends Item {
    public ItemShears() {}
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer player, Entity entity) { return false; }
    public boolean onBlockStartBreak(ItemStack stack, int x, int y, int z, EntityPlayer player) { return false; }
}
