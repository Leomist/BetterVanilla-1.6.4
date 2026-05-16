package net.minecraftforge.fluids;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
public class BlockFluidClassic extends Block {
    public float maxY = 0.875f;
    protected final Fluid fluid;
    public BlockFluidClassic(Fluid fluid, Material mat) { super(mat); this.fluid = fluid; }
    public boolean canDisplace(IBlockAccess world, int x, int y, int z) { return false; }
    public boolean displaceIfPossible(World world, int x, int y, int z) { return false; }
    public int getRenderType() { return 0; }
    public boolean isOpaqueCube() { return false; }
    public boolean renderAsNormalBlock() { return false; }
}
