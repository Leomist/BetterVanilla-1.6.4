package net.minecraft.entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
public abstract class Entity {
    public World worldObj;
    public double posX, posY, posZ;
    public double prevPosX, prevPosY, prevPosZ;
    public double motionX, motionY, motionZ;
    public float rotationYaw, rotationPitch;
    public float prevRotationYaw, prevRotationPitch;
    public float width = 0.6f, height = 1.8f;
    public boolean isDead;
    public boolean onGround;
    public AxisAlignedBB boundingBox;
    public int entityId;
    public Entity(World world) { this.worldObj = world; }
    public boolean isBurning() { return false; }
    public void setFire(int seconds) {}
    public void extinguish() {}
    public boolean attackEntityFrom(DamageSource source, float amount) { return false; }
    public void setPosition(double x, double y, double z) {}
    public void setPositionAndUpdate(double x, double y, double z) {}
    public boolean isEntityAlive() { return !isDead; }
    public void playSound(String name, float volume, float pitch) {}
    public boolean spawnEntityInWorld(Entity entity) { return false; }
    public float getEyeHeight() { return 1.62f; }
    public void setLocationAndAngles(double x, double y, double z, float yaw, float pitch) {}
    public boolean isSneaking() { return false; }
    public double getDistanceSq(double x, double y, double z) { return 0; }
    public boolean isInWater() { return false; }
    public abstract void onUpdate();
}
