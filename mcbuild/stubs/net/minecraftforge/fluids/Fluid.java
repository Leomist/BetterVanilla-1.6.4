package net.minecraftforge.fluids;
public class Fluid {
    private String name;
    public Fluid(String name) { this.name = name; }
    public String setUnlocalizedName(String name) { return name; }
    public String getUnlocalizedName() { return name; }
    public String getName() { return name; }
}
