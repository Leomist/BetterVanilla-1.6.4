package cpw.mods.fml.client.registry;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;
public interface ISimpleBlockRenderingHandler {
    void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer);
    boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer);
    boolean shouldRender3DInInventory(int modelId);
    int getRenderId();
}
