package net.minecraftforge.event.entity.player;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.world.World;
public class BonemealEvent extends Event {
    public final World world;
    public final int x, y, z;
    public BonemealEvent(World world, int x, int y, int z) { this.world = world; this.x = x; this.y = y; this.z = z; }
}
