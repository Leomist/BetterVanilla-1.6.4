package net.minecraft.nbt;
import java.util.ArrayList;
import java.util.List;
public class NBTTagList extends NBTBase {
    @SuppressWarnings("rawtypes")
    private List tags = new ArrayList();
    @SuppressWarnings("unchecked")
    public void appendTag(NBTBase tag) { tags.add(tag); }
    @SuppressWarnings("unchecked")
    public NBTBase removeTag(int index) { return (NBTBase) tags.remove(index); }
    public int tagCount() { return tags.size(); }
    public NBTTagCompound getCompoundTagAt(int index) { return (NBTTagCompound) tags.get(index); }
    public byte getId() { return 9; }
}
