package net.minecraft.entity;
import net.minecraft.world.World;
public abstract class EntityAgeable extends EntityLiving {
    public EntityAgeable(World world) { super(world); }
    public EntityAgeable createChild(EntityAgeable mate) { return null; }
}
