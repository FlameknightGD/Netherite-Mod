package com.flameknightgd.netherite.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.ANCIENT_DEBRIS, new ItemStack(ModItems.NETHERITE_SCRAP, 1), 2.0F);
	}
}
