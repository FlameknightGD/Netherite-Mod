package com.flameknightgd.netherite.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AncientDebris extends BlockBase
{
	public AncientDebris(String name, Material material)
	{
		super(name, material);

		setSoundType(SoundType.STONE);
		setHardness(30.0F);
		setResistance(1200.0F);
		setHarvestLevel("pickaxe", 3);
		//setLightLevel(0.0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}
}
