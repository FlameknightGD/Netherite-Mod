package com.flameknightgd.netherite.objects.tools;

import com.flameknightgd.netherite.Main;
import com.flameknightgd.netherite.init.ModItems;
import com.flameknightgd.netherite.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel
{
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 9.0F, -3.0F);
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