package net.minecraft.world;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public abstract class World implements IBlockAccess {
    public boolean isRemote = false;
    public Random rand = new Random();
    public WorldProvider provider = new WorldProvider();
    public List<EntityPlayer> playerEntities = new ArrayList<>();
    public World() {}
    public Block getBlock(int x, int y, int z) { return null; }
    public int getBlockMetadata(int x, int y, int z) { return 0; }
    public boolean setBlock(int x, int y, int z, Block block) { return false; }
    public boolean setBlock(int x, int y, int z, Block block, int meta, int flags) { return false; }
    public boolean setBlockToAir(int x, int y, int z) { return false; }
    public boolean setBlockMetadataWithNotify(int x, int y, int z, int meta, int flags) { return false; }
    public TileEntity getTileEntity(int x, int y, int z) { return null; }
    public void setTileEntity(int x, int y, int z, TileEntity te) {}
    public void removeTileEntity(int x, int y, int z) {}
    public boolean spawnEntityInWorld(Entity entity) { return false; }
    public void playSound(double x, double y, double z, String name, float volume, float pitch, boolean distDelay) {}
    public void playSoundAtEntity(net.minecraft.entity.Entity entity, String name, float volume, float pitch) {}
    public void playAuxSFXAtEntity(net.minecraft.entity.player.EntityPlayer player, int id, int x, int y, int z, int data) {}
    public void spawnParticle(String name, double x, double y, double z, double vx, double vy, double vz) {}
    public void playSound(String name, double x, double y, double z, float volume, float pitch) {}
    public void playAuxSFX(int x, double y, int z, int w, int t) {}
    public BiomeGenBase getBiomeGenForCoords(int x, int z) { return null; }
    public boolean isAirBlock(int x, int y, int z) { return false; }
    public boolean blockExists(int x, int y, int z) { return true; }
    public List<?> getCollidingBoundingBoxes(Entity entity, AxisAlignedBB aabb) { return new ArrayList<>(); }
    @SuppressWarnings({"unchecked","rawtypes"}) public java.util.List getEntitiesWithinAABB(Class cls, AxisAlignedBB aabb) { return new ArrayList(); }
    public GameRules getGameRules() { return new GameRules(); }
    public static boolean doesBlockHaveSolidTopSurface(IBlockAccess world, int x, int y, int z) { return false; }
    public net.minecraft.entity.Entity newExplosion(Entity entity, double x, double y, double z, float strength, boolean isSmoking, boolean isFlaming) { return null; }
    public Block func_147439_a(int x, int y, int z) { return null; }
    public net.minecraft.util.MovingObjectPosition func_147447_a(net.minecraft.util.Vec3 src, net.minecraft.util.Vec3 dst, boolean par3, boolean par4, boolean par5) { return null; }
    public boolean func_147480_a(int x, int y, int z, boolean par4) { return false; }
    public int func_147453_f(int x, int y, int z, Block block) { return 0; }
    public int getLightBrightnessForSkyBlocks(int x, int y, int z, int minBlock) { return 0; }
    public int getHeight() { return 256; }
    public void markBlockForUpdate(int x, int y, int z) {}
    public void notifyBlocksOfNeighborChange(int x, int y, int z, Block block) {}
}
