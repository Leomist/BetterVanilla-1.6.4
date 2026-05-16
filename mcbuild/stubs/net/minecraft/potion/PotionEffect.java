package net.minecraft.potion;
import net.minecraft.nbt.NBTTagCompound;
public class PotionEffect {
    private int potionID, duration, amplifier;
    public PotionEffect(int potionID, int duration, int amplifier) {
        this.potionID = potionID; this.duration = duration; this.amplifier = amplifier;
    }
    public int getPotionID() { return potionID; }
    public int getDuration() { return duration; }
    public int getAmplifier() { return amplifier; }
    public void writeCustomPotionEffectToNBT(NBTTagCompound nbt) {}
    public static PotionEffect readCustomPotionEffectFromNBT(NBTTagCompound nbt) { return null; }
}
