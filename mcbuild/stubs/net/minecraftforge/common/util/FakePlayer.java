package net.minecraftforge.common.util;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.WorldServer;
public class FakePlayer extends EntityPlayerMP {
    public FakePlayer(WorldServer world) { super(world); }
}
