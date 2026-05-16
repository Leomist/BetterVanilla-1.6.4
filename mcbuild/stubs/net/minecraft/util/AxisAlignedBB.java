package net.minecraft.util;
public class AxisAlignedBB {
    public double minX, minY, minZ, maxX, maxY, maxZ;
    public AxisAlignedBB(double x1, double y1, double z1, double x2, double y2, double z2) {
        minX=x1; minY=y1; minZ=z1; maxX=x2; maxY=y2; maxZ=z2;
    }
    public static AxisAlignedBB getBoundingBox(double x1, double y1, double z1, double x2, double y2, double z2) {
        return new AxisAlignedBB(x1, y1, z1, x2, y2, z2);
    }
    public static AxisAlignedBB getAABBPool() { return new AxisAlignedBB(0,0,0,1,1,1); }
}
