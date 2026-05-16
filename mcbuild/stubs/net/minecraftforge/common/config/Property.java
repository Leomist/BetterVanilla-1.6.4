package net.minecraftforge.common.config;
public class Property {
    public String comment = "";
    public boolean getBoolean(boolean def) { return def; }
    public boolean getBoolean() { return false; }
    public double getDouble(double def) { return def; }
    public String[] getStringList() { return new String[0]; }
    public String getString() { return ""; }
}
