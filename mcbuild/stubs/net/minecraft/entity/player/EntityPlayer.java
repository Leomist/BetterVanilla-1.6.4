package net.minecraft.entity.player;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatBase;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
public abstract class EntityPlayer extends EntityLivingBase {
    public enum EnumStatus { OK, NOT_POSSIBLE_NOW, NOT_POSSIBLE_HERE, NOT_SAFE, OTHER_PROBLEM, TOO_FAR_AWAY; }
    public InventoryPlayer inventory = new InventoryPlayer(this);
    public net.minecraft.inventory.Container inventoryContainer;
    public PlayerCapabilities capabilities = new PlayerCapabilities();
    public ChunkCoordinates playerLocation;
    public EntityPlayer(World world) { super(world); }
    public void addChatComponentMessage(ChatComponentTranslation msg) {}
    public EnumStatus sleepInBedAt(int x, int y, int z) { return EnumStatus.OK; }
    public boolean isPlayerSleeping() { return false; }
    public ItemStack getCurrentEquippedItem() { return null; }
    public boolean canPlayerEdit(int x, int y, int z, int side, ItemStack stack) { return true; }
    public net.minecraft.entity.item.EntityItem entityDropItem(ItemStack stack, float offset) { return null; }
    public ChunkCoordinates getPlayerCoordinates() { return new ChunkCoordinates((int)posX, (int)posY, (int)posZ); }
    public float getEyeHeight() { return 1.62f; }
    public float getDefaultEyeHeight() { return 1.62f; }
    public void addStat(StatBase stat, int amount) {}
    public void addExhaustion(float amount) {}
    public void openGui(Object mod, int guiID, World world, int x, int y, int z) {}
}
