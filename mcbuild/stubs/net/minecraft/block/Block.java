package net.minecraft.block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import java.util.List;
import java.util.Random;
public class Block {
    public static final StepSound soundTypeStone = new StepSound();
    public static final StepSound soundTypeWood = new StepSound();
    public static final StepSound soundTypeCloth = new StepSound();
    public static final StepSound soundTypeGrass = new StepSound();
    public static final StepSound soundTypeSand = new StepSound();
    public static final StepSound soundTypeMetal = new StepSound();
    public static final StepSound soundTypeGlass = new StepSound();
    public IIcon blockIcon;
    public float maxY = 1.0f;
    public float minX = 0, minY = 0, minZ = 0, maxX = 1, maxZ = 1;
    protected Material blockMaterial;
    protected float hardness;
    protected String blockName;
    protected IIcon[] iconArray;
    public Block(Material mat) { this.blockMaterial = mat; }
    public Block setHardness(float h) { return this; }
    public Block setResistance(float r) { return this; }
    public Block setStepSound(StepSound s) { return this; }
    public Block setBlockName(String name) { this.blockName = name; return this; }
    public Block setBlockTextureName(String name) { return this; }
    public Block setCreativeTab(CreativeTabs tab) { return this; }
    public Block setLightLevel(float f) { return this; }
    public Block setLightOpacity(int i) { return this; }
    public Block disableStats() { return this; }
    public String getUnlocalizedName() { return "tile." + blockName; }
    public Material getMaterial() { return blockMaterial; }
    public IIcon getIcon(int side, int meta) { return blockIcon; }
    public IIcon getBlockTextureFromSide(int side) { return blockIcon; }
    public int getMixedBrightnessForBlock(IBlockAccess world, int x, int y, int z) { return 0; }
    public int colorMultiplier(IBlockAccess world, int x, int y, int z) { return 0xFFFFFF; }
    public void setBlockBounds(float minX, float minY, float minZ, float maxX, float maxY, float maxZ) {}
    public void setBlockBoundsForItemRender() {}
    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {}
    public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB mask, List list, net.minecraft.entity.Entity entity) {}
    public void dropBlockAsItem(World world, int x, int y, int z, int meta, int fortune) {}
    public void dropBlockAsItemWithChance(World world, int x, int y, int z, int meta, float chance, int fortune) {}
    public void breakBlock(World world, int x, int y, int z, Block block, int meta) {}
    public void onBlockHarvested(World world, int x, int y, int z, int meta, EntityPlayer player) {}
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) { return false; }
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighbor) {}
    public void fillWithRain(World world, int x, int y, int z) {}
    public boolean isOpaqueCube() { return true; }
    public boolean renderAsNormalBlock() { return true; }
    public int getRenderType() { return 0; }
    public int getMobilityFlag() { return 0; }
    public boolean hasComparatorInputOverride() { return false; }
    public int getComparatorInputOverride(World world, int x, int y, int z, int side) { return 0; }
    public Item getItemDropped(int meta, Random rand, int fortune) { return null; }
    public Item getItem(World world, int x, int y, int z) { return null; }
    public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int meta) { return false; }
    public void registerBlockIcons(IIconRegister reg) {}
    public int damageDropped(int meta) { return 0; }
    public int quantityDropped(Random rand) { return 1; }
    public int quantityDroppedWithBonus(int fortune, Random rand) { return 1; }
    public boolean isAir(IBlockAccess world, int x, int y, int z) { return false; }
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, net.minecraft.entity.Entity entity) {}
    public void onBlockAdded(World world, int x, int y, int z) {}
    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {}
    public void updateTick(World world, int x, int y, int z, Random rand) {}
    public int tickRate(World world) { return 10; }
    public boolean hasTileEntity(int metadata) { return false; }
    public TileEntity createTileEntity(World world, int metadata) { return null; }
    public int getRenderBlockPass() { return 0; }
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) { return true; }
    public boolean getBlocksMovement(IBlockAccess world, int x, int y, int z) { return false; }
    public boolean canBlockStay(World world, int x, int y, int z) { return true; }
    public String getTextureName() { return blockName; }
    public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) { return blockIcon; }
    public boolean canPlaceBlockAt(World world, int x, int y, int z) { return true; }
    public void onBlockPlacedBy(World world, int x, int y, int z, net.minecraft.entity.EntityLivingBase placer, ItemStack stack) {}
    public static int getIdFromBlock(Block block) { return 0; }
    public static Block getBlockById(int id) { return null; }
    public static class StepSound {
        public String soundName;
        public float volume, frequency;
        public StepSound() {}
        public String getStepSound() { return ""; }
        public String getBreakSound() { return ""; }
        public String getPlaceSound() { return ""; }
        public float getVolume() { return 1.0f; }
        public float getFrequency() { return 1.0f; }
    }
}
