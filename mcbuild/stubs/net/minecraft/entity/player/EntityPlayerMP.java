package net.minecraft.entity.player;
import net.minecraft.inventory.Container;
import net.minecraft.network.NetworkManager;
import net.minecraft.world.World;
public class EntityPlayerMP extends EntityPlayer {
    public ItemInWorldManager theItemInWorldManager = new ItemInWorldManager();
    public NetworkManager netManager;
    public EntityPlayerMP(World world) { super(world); }
    public void sendContainerToPlayer(Container container) {}
}
