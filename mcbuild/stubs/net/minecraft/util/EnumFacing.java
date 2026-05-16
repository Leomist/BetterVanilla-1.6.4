package net.minecraft.util;
public enum EnumFacing {
    DOWN(0, -1, 0), UP(0, 1, 0), NORTH(0, 0, -1), SOUTH(0, 0, 1), WEST(-1, 0, 0), EAST(1, 0, 0);
    private final int frontOffsetX, frontOffsetY, frontOffsetZ;
    EnumFacing(int x, int y, int z) { frontOffsetX = x; frontOffsetY = y; frontOffsetZ = z; }
    public int getFrontOffsetX() { return frontOffsetX; }
    public int getFrontOffsetY() { return frontOffsetY; }
    public int getFrontOffsetZ() { return frontOffsetZ; }
}
