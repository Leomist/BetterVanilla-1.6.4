package net.minecraft.tileentity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.world.World;
public class TileEntity {
    public int xCoord, yCoord, zCoord;
    public World worldObj;
    protected boolean tileEntityInvalid = false;
    public void writeToNBT(NBTTagCompound nbt) {}
    public void readFromNBT(NBTTagCompound nbt) {}
    public Packet getDescriptionPacket() { return null; }
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {}
    public void markDirty() {}
    public boolean isInvalid() { return tileEntityInvalid; }
    public void invalidate() { tileEntityInvalid = true; }
    public void updateEntity() {}
}
