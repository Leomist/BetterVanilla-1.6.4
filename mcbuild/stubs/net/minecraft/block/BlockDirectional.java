package net.minecraft.block;
import net.minecraft.block.material.Material;
public class BlockDirectional extends Block {
    public BlockDirectional(Material mat) { super(mat); }
    public static int getDirection(int meta) { return meta & 3; }
}
