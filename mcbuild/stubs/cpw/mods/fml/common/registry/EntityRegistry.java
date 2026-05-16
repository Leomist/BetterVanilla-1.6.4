package cpw.mods.fml.common.registry;
import net.minecraft.entity.Entity;
public class EntityRegistry {
    public static int findGlobalUniqueEntityId() { return 200; }
    public static void registerGlobalEntityID(Class<? extends Entity> entityClass, String entityName, int id) {}
    public static void registerGlobalEntityID(Class<? extends Entity> entityClass, String entityName, int id, int bg, int fg) {}
}
