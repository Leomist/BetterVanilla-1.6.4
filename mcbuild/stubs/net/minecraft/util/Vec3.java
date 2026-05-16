package net.minecraft.util;
public class Vec3 {
    public double xCoord, yCoord, zCoord;
    private Vec3(double x, double y, double z) { xCoord=x; yCoord=y; zCoord=z; }
    public static Vec3 createVectorHelper(double x, double y, double z) { return new Vec3(x,y,z); }
    public Vec3 addVector(double x, double y, double z) { return new Vec3(xCoord+x, yCoord+y, zCoord+z); }
}
