package net.minecraft.client.renderer.entity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
public abstract class RenderLiving extends Render {
    public RenderLiving(ModelBase model, float shadowSize) {}
    protected ResourceLocation getEntityTexture(Entity e) { return null; }
}
