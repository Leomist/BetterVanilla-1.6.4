package net.minecraft.nbt;
public class NBTTagCompound extends NBTBase {
    public byte getId() { return 10; }
    public void setInteger(String key, int value) {}
    public int getInteger(String key) { return 0; }
    public void setBoolean(String key, boolean value) {}
    public boolean getBoolean(String key) { return false; }
    public void setByte(String key, byte value) {}
    public byte getByte(String key) { return 0; }
    public void setString(String key, String value) {}
    public String getString(String key) { return ""; }
    public void setShort(String key, short value) {}
    public short getShort(String key) { return 0; }
    public void setTag(String key, NBTBase tag) {}
    public NBTBase getTag(String key) { return null; }
    public void setTagList(String key, NBTTagList list) {}
    public NBTTagList getTagList(String key, int type) { return new NBTTagList(); }
    public boolean hasKey(String key) { return false; }
    public boolean hasKey(String key, int type) { return false; }
}
