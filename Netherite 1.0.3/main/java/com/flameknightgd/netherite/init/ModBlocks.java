package com.flameknightgd.netherite.init;

import java.util.ArrayList;
import java.util.List;

import com.flameknightgd.netherite.objects.blocks.AncientDebris;
import com.flameknightgd.netherite.objects.blocks.NetheriteBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Material Blocks
	public static final Block NETHERITE_BLOCK = new NetheriteBlock("netherite_block", Material.IRON);
	
	//Nether Ores
	public static final Block ANCIENT_DEBRIS = new AncientDebris("ancient_debris", Material.ROCK);
}
