package net.minecraft.dispenser;
import net.minecraft.world.World;
public interface IBlockSource {
    World getWorld();
    int getXInt();
    int getYInt();
    int getZInt();
    int getBlockMetadata();
    double getX();
    double getY();
    double getZ();
}
