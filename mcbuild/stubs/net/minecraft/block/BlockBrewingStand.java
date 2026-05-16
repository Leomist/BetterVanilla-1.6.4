package net.minecraft.block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
public class BlockBrewingStand extends Block implements ITileEntityProvider {
    public BlockBrewingStand() { super(Material.rock); }
    public net.minecraft.tileentity.TileEntity createNewTileEntity(World world, int meta) { return null; }
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hx, float hy, float hz) { return false; }
}
