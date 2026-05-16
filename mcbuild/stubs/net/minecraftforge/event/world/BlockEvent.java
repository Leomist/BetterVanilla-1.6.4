package net.minecraftforge.event.world;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import java.util.ArrayList;
import java.util.List;
public class BlockEvent extends Event {
    public final World world;
    public final int x, y, z;
    public Block block;
    public int blockMetadata;
    public BlockEvent(World world, int x, int y, int z, Block block, int meta) {
        this.world = world; this.x = x; this.y = y; this.z = z;
        this.block = block; this.blockMetadata = meta;
    }
    public static class BreakEvent extends BlockEvent {
        private EntityPlayer player;
        public BreakEvent(World world, int x, int y, int z, Block block, int meta, EntityPlayer player) {
            super(world, x, y, z, block, meta); this.player = player;
        }
        public EntityPlayer getPlayer() { return player; }
    }
    public static class HarvestDropsEvent extends BlockEvent {
        public List<ItemStack> drops = new ArrayList<>();
        public float dropChance = 1.0f;
        public boolean isSilkTouching = false;
        public int fortuneLevel = 0;
        public EntityPlayer harvester;
        public HarvestDropsEvent(World world, int x, int y, int z, Block block, int meta, float chance, boolean silk, EntityPlayer player, int fortune) {
            super(world, x, y, z, block, meta); dropChance = chance; isSilkTouching = silk; harvester = player; fortuneLevel = fortune;
        }
    }
}
