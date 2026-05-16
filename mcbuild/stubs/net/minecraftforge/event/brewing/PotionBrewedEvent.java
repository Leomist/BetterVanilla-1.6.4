package net.minecraftforge.event.brewing;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.item.ItemStack;
public class PotionBrewedEvent extends Event {
    public final ItemStack[] brewingStacks;
    public PotionBrewedEvent() { brewingStacks = new ItemStack[0]; }
    public PotionBrewedEvent(ItemStack[] stacks) { brewingStacks = stacks; }
}
