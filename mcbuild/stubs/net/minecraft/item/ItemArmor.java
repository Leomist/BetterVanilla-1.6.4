package net.minecraft.item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
public class ItemArmor extends Item {
    public enum ArmorMaterial {
        CLOTH(0, new int[]{1,3,2,1}, 15),
        CHAIN(0, new int[]{2,5,4,1}, 12),
        IRON(0, new int[]{2,6,5,2}, 9),
        GOLD(0, new int[]{2,5,3,1}, 25),
        DIAMOND(0, new int[]{3,8,6,3}, 10);
        public final int durabilityFactor;
        public final int[] damageReductionAmountArray;
        public final int enchantability;
        ArmorMaterial(int d, int[] a, int e) { durabilityFactor=d; damageReductionAmountArray=a; enchantability=e; }
        public String getName() { return name().toLowerCase(); }
    }
    public final int armorType;
    public final ArmorMaterial armorMaterial;
    public ItemArmor(ArmorMaterial mat, int renderIndex, int armorType) {
        this.armorMaterial = mat; this.armorType = armorType;
    }
    public ArmorMaterial getArmorMaterial() { return armorMaterial; }
    public void removeColor(ItemStack stack) {}
    public String getArmorTexture(ItemStack stack, net.minecraft.entity.Entity entity, int slot, String type) { return ""; }
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) { return false; }
}
