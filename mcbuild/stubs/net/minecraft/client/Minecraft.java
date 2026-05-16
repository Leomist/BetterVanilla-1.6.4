package net.minecraft.client;
import net.minecraft.client.renderer.texture.TextureManager;
public class Minecraft {
    public TextureManager renderEngine;
    public TextureManager getTextureManager() { return new TextureManager(); }
}
