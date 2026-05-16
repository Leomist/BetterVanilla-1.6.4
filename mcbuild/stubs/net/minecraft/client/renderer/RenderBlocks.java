package net.minecraft.client.renderer;
import net.minecraft.block.Block;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
public class RenderBlocks {
    public IBlockAccess blockAccess;
    public boolean renderAllFaces = false;
    public RenderBlocks() {}
    public RenderBlocks(IBlockAccess access) { this.blockAccess = access; }
    public boolean renderStandardBlock(Block block, int x, int y, int z) { return true; }
    public boolean renderFaceXPos(Block block, double x, double y, double z, IIcon icon) { return true; }
    public boolean renderFaceXNeg(Block block, double x, double y, double z, IIcon icon) { return true; }
    public boolean renderFaceYPos(Block block, double x, double y, double z, IIcon icon) { return true; }
    public boolean renderFaceYNeg(Block block, double x, double y, double z, IIcon icon) { return true; }
    public boolean renderFaceZPos(Block block, double x, double y, double z, IIcon icon) { return true; }
    public boolean renderFaceZNeg(Block block, double x, double y, double z, IIcon icon) { return true; }
}
