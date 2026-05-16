package net.minecraftforge.event.entity.player;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
public class PlayerInteractEvent extends Event {
    public enum Action { RIGHT_CLICK_AIR, RIGHT_CLICK_BLOCK, LEFT_CLICK_BLOCK; }
    public final EntityPlayer entityPlayer;
    public final Action action;
    public Result useBlock = Result.DEFAULT;
    public Result useItem = Result.DEFAULT;
    public final World world;
    public final int x, y, z;
    public PlayerInteractEvent(EntityPlayer player, Action action, int x, int y, int z, World world) {
        this.entityPlayer = player; this.action = action;
        this.x = x; this.y = y; this.z = z; this.world = world;
    }
}
