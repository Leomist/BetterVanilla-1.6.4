package net.minecraft.world;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
public interface IBlockAccess {
    Block getBlock(int x, int y, int z);
    int getBlockMetadata(int x, int y, int z);
    TileEntity getTileEntity(int x, int y, int z);
    int getLightBrightnessForSkyBlocks(int x, int y, int z, int minBlock);
    int getHeight();
}
