package net.minecraft.util;
public class MathHelper {
    public static int clamp_int(int val, int min, int max) { return Math.max(min, Math.min(max, val)); }
    public static float cos(float f) { return (float) Math.cos(f); }
    public static float sin(float f) { return (float) Math.sin(f); }
    public static int floor_double(double d) { return (int) Math.floor(d); }
    public static double clampedDouble(double d, double min, double max) { return Math.max(min, Math.min(max, d)); }
}
