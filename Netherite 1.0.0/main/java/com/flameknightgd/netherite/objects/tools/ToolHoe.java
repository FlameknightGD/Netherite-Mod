package com.flameknightgd.netherite.objects.tools;

import com.flameknightgd.netherite.Main;
import com.flameknightgd.netherite.init.ModItems;
import com.flameknightgd.netherite.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolHoe extends ItemHoe implements IHasModel
{
	public ToolHoe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}