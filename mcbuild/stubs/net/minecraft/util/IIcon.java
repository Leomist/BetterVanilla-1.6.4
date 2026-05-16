package net.minecraft.util;
public interface IIcon {
    float getMinU();
    float getMaxU();
    float getMinV();
    float getMaxV();
    float getInterpolatedU(double u);
    float getInterpolatedV(double v);
    String getIconName();
    int getOriginX();
    int getOriginY();
    int getSheetWidth();
    int getSheetHeight();
    int getIconWidth();
    int getIconHeight();
}
