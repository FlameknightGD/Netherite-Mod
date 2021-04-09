package com.flameknightgd.netherite.util.compat;

import com.flameknightgd.netherite.init.ModBlocks;
import com.flameknightgd.netherite.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat 
{
	public static void registerOres()
	{
		OreDictionary.registerOre("oreNetherite", ModBlocks.ANCIENT_DEBRIS);
		OreDictionary.registerOre("ingotNetherite", ModItems.NETHERITE_INGOT);
		OreDictionary.registerOre("scrapNetherite", ModItems.NETHERITE_SCRAP);
	}
}