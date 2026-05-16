package com.agadar.bettervanilla.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockCactus2 extends Block {

	public BlockCactus2() {
		super(Material.cactus);
		this.setHardness(0.4F);
		this.setStepSound(Block.soundTypeCloth);
		this.setBlockName("cactus2");
		this.setBlockTextureName("cactus");
	}

	@Override
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
		Block b = par1World.getBlock(par2, par3 - 1, par4);
		return b == ModBlocks.cactus || b == Blocks.sand;
    }

	@Override
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		par5Entity.attackEntityFrom(DamageSource.cactus, 1.0F);
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}
}
