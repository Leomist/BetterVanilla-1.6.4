package net.minecraft.client.renderer.entity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
public abstract class Render {
    protected abstract ResourceLocation getEntityTexture(Entity entity);
}
