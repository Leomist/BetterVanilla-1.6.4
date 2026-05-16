package net.minecraft.util;
public class DamageSource {
    public static final DamageSource lava = new DamageSource("lava");
    public static final DamageSource inFire = new DamageSource("inFire");
    public static final DamageSource generic = new DamageSource("generic");
    private String damageType;
    public DamageSource(String type) { this.damageType = type; }
    public String getDamageType() { return damageType; }
}
