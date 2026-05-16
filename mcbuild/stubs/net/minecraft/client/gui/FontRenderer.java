package net.minecraft.client.gui;
public class FontRenderer {
    public int getStringWidth(String s) { return s.length() * 6; }
    public void drawString(String s, int x, int y, int color) {}
    public void drawString(String s, float x, float y, int color) {}
}
