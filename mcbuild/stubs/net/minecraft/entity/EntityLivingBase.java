package net.minecraft.entity;
import net.minecraft.entity.ai.attributes.BaseAttributeMap;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import java.util.Collection;
import java.util.Random;
public abstract class EntityLivingBase extends Entity {
    public float renderYawOffset = 0;
    public float prevRenderYawOffset = 0;
    public Random rand = new Random();
    public DataWatcher dataWatcher = new DataWatcher();
    public EntityLivingBase(World world) { super(world); }
    public float getHealth() { return 20f; }
    public void setHealth(float h) {}
    public float getMaxHealth() { return 20f; }
    public boolean isChild() { return false; }
    public void setPositionAndUpdate(double x, double y, double z) {}
    public void curePotionEffects(net.minecraft.item.ItemStack curativeItem) {}
    public void addPotionEffect(PotionEffect effect) {}
    public Collection<PotionEffect> getActivePotionEffects() { return java.util.Collections.emptyList(); }
    public BaseAttributeMap getAttributeMap() { return null; }
    public void onLivingUpdate() {}
    protected void entityInit() {}
    protected void dropFewItems(boolean recentlyHit, int looting) {}
    protected void dropItem(net.minecraft.item.Item item, int amount) {}
    public void writeEntityToNBT(net.minecraft.nbt.NBTTagCompound nbt) {}
    public void readEntityFromNBT(net.minecraft.nbt.NBTTagCompound nbt) {}
    public void onUpdate() {}
}
