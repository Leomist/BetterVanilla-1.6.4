package net.minecraft.block.material;
public class Material {
    public static final Material rock = new Material();
    public static final Material iron = new Material();
    public static final Material water = new Material();
    public static final Material lava = new Material();
    public static final Material cloth = new Material();
    public static final Material cactus = new Material();
    public static final Material air = new Material();
    public static final Material wood = new Material();
    public static final Material grass = new Material();
    public static final Material ground = new Material();
    public static final Material plants = new Material();
    public static final Material gourd = new Material();
    public static final Material sponge = new Material();
    public boolean isLiquid() { return false; }
    public boolean isSolid() { return true; }
    public boolean blocksLight() { return true; }
    public boolean blocksMovement() { return true; }
    public boolean isOpaque() { return true; }
    public boolean getCanBurn() { return false; }
    public boolean replacesGrass() { return false; }
    public boolean isAdventureModeExempt() { return false; }
}
