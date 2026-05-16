package net.minecraft.entity.passive;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;
public class EntityChicken extends EntityAgeable {
    public int timeUntilNextEgg = 0;
    public boolean isChickenJockey = false;
    public EntityChicken(World world) { super(world); }
    public EntityAgeable createChild(EntityAgeable mate) { return null; }
}
