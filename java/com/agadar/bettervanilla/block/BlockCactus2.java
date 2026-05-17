package com.agadar.bettervanilla.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockCactus2 extends Block {

	public BlockCactus2() {
		super(resolveCactusMaterial());
		this.setHardness(0.4F);
		this.setStepSound(Block.soundTypeCloth);
		this.setBlockName("cactus2");
		this.setBlockTextureName("cactus");
	}

	private static Material resolveCactusMaterial()
	{
		String[] names = new String[] {"cactus", "field_151572_C", "plants", "field_151585_k"};
		
		for (String name : names)
		{
			try
			{
				Object value = Material.class.getField(name).get(null);
				if (value instanceof Material)
				{
					return (Material)value;
				}
			}
			catch (Throwable ignored)
			{
			}
		}
		
		for (java.lang.reflect.Field field : Material.class.getFields())
		{
			try
			{
				Object value = field.get(null);
				if (value instanceof Material)
				{
					return (Material)value;
				}
			}
			catch (Throwable ignored)
			{
			}
		}
		
		throw new RuntimeException("Could not resolve cactus material");
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
