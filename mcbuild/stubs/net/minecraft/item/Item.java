package net.minecraft.item;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import java.util.List;
public class Item {
    public static final ItemRegistry itemRegistry = new ItemRegistry();
    protected String itemName;
    protected IIcon itemIcon;
    protected CreativeTabs tabToDisplayOn;
    public Item() {}
    public Item setUnlocalizedName(String name) { this.itemName = name; return this; }
    public Item setCreativeTab(CreativeTabs tab) { this.tabToDisplayOn = tab; return this; }
    public Item setTextureName(String name) { return this; }
    public Item setMaxStackSize(int size) { return this; }
    public Item setMaxDamage(int damage) { return this; }
    public Item setHasSubtypes(boolean b) { return this; }
    public Item setContainerItem(Item item) { return this; }
    public String getUnlocalizedName() { return "item." + itemName; }
    public String getUnlocalizedName(ItemStack stack) { return getUnlocalizedName(); }
    public String getIconString() { return itemName; }
    public IIcon getIconFromDamage(int damage) { return itemIcon; }
    public IIcon getIcon(ItemStack stack, int renderPass) { return itemIcon; }
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) { return false; }
    public boolean onBlockStartBreak(ItemStack stack, int x, int y, int z, EntityPlayer player) { return false; }
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer player, Entity entity) { return false; }
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) { return stack; }
    public void registerIcons(net.minecraft.client.renderer.texture.IIconRegister register) {}
    public void getSubItems(Item item, CreativeTabs tab, List list) {}
    public boolean isPotionIngredient(ItemStack stack) { return false; }
    public String getPotionEffect(ItemStack stack) { return ""; }
    public boolean hasContainerItem(ItemStack stack) { return false; }
    public ItemStack getContainerItem(ItemStack stack) { return null; }
    public List<PotionEffect> getEffects(int damage) { return null; }
    public List<PotionEffect> getEffects(ItemStack stack) { return null; }
    public List<PotionEffect> getEffectsFromStack(ItemStack stack) { return null; }
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {}
    public static Item getItemById(int id) { return null; }
    public static Item getItemFromBlock(Block block) { return null; }
    public static class ItemRegistry implements Iterable<Item> {
        public java.util.Iterator<Item> iterator() { return java.util.Collections.<Item>emptyList().iterator(); }
    }
}
