package net.minecraft.util;
public class MovingObjectPosition {
    public enum MovingObjectType { MISS, BLOCK, ENTITY; }
    public MovingObjectType typeOfHit;
    public int blockX, blockY, blockZ;
    public int sideHit;
    public MovingObjectPosition(int x, int y, int z, int side) { blockX=x; blockY=y; blockZ=z; sideHit=side; typeOfHit = MovingObjectType.BLOCK; }
}
