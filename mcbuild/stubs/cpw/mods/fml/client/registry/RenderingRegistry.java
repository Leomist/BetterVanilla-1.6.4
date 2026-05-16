package cpw.mods.fml.client.registry;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.Render;
public class RenderingRegistry {
    public static int getNextAvailableRenderId() { return 0; }
    public static void registerBlockHandler(ISimpleBlockRenderingHandler handler) {}
    public static void registerEntityRenderingHandler(Class<? extends Entity> entityClass, Render renderer) {}
}
