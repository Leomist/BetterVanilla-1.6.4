package net.minecraft.potion;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.BaseAttributeMap;
public class Potion {
    public static final Potion[] potionTypes = new Potion[256];
    public int id;
    public Potion(int id, boolean isBadEffect, int liquidColor) { this.id = id; }
    public Potion setPotionName(String name) { return this; }
    public boolean isInstant() { return false; }
    public boolean isReady(int duration, int amplifier) { return false; }
    public void performEffect(EntityLivingBase entity, int amplifier) {}
    public void affectEntity(Object source, Object indirectSource, EntityLivingBase entity, int amplifier, double health) {}
    public void affectEntity(EntityLivingBase source, EntityLivingBase target, int amplifier, double health) {}
    public void removeAttributesModifiersFromEntity(EntityLivingBase entity, BaseAttributeMap map, int amplifier) {}
}
