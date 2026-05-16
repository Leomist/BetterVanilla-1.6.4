package net.minecraft.item;
import net.minecraft.potion.PotionEffect;
import java.util.List;
public class ItemPotion extends Item {
    public ItemPotion() {}
    @Override
    public List<PotionEffect> getEffects(ItemStack stack) { return null; }
    public static boolean isSplash(int damage) { return (damage & 16384) != 0; }
    public int getColorFromItemStack(ItemStack stack, int renderPass) { return 0xFFFFFF; }
    public boolean hasEffect(ItemStack stack) { return false; }
}
