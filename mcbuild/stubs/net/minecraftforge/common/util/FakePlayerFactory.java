package net.minecraftforge.common.util;
import net.minecraft.world.WorldServer;
public class FakePlayerFactory {
    public static FakePlayer getMinecraft(WorldServer world) { return new FakePlayer(world); }
}
