package net.minecraft.entity.ai.attributes;
public interface IAttribute {
    String getAttributeUnlocalizedName();
    double getDefaultValue();
    boolean getShouldWatch();
}
