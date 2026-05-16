package net.minecraft.client.renderer.entity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.ResourceLocation;
public class RenderChicken extends RenderLiving {
    public RenderChicken(ModelBase model, float shadowSize) { super(model, shadowSize); }
    protected ResourceLocation getEntityTexture(Entity entity) { return null; }
    protected ResourceLocation func_110820_a(EntityChicken entity) { return null; }
}
