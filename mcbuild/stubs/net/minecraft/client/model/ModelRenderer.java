package net.minecraft.client.model;
public class ModelRenderer {
    public float rotateAngleX, rotateAngleY, rotateAngleZ;
    public float rotationPointX, rotationPointY, rotationPointZ;
    public ModelRenderer(ModelBase base, String name) {}
    public ModelRenderer(ModelBase base, int x, int y) {}
    public ModelRenderer addBox(float px, float py, float pz, int dx, int dy, int dz) { return this; }
    public void render(float f) {}
}
