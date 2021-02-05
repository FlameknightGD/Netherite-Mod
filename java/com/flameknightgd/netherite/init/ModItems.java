package com.flameknightgd.netherite.init;

import java.util.ArrayList;
import java.util.List;

import com.flameknightgd.netherite.objects.armor.ArmorBase;
import com.flameknightgd.netherite.objects.armor.NetheriteArmor;
import com.flameknightgd.netherite.objects.items.ItemBase;
import com.flameknightgd.netherite.objects.tools.ToolAxe;
import com.flameknightgd.netherite.objects.tools.ToolHoe;
import com.flameknightgd.netherite.objects.tools.ToolPickaxe;
import com.flameknightgd.netherite.objects.tools.ToolShovel;
import com.flameknightgd.netherite.objects.tools.ToolSword;
import com.flameknightgd.netherite.util.Reference;
import com.flameknightgd.netherite.util.handlers.ConfigHandler;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_NETHERITE_INGOT = EnumHelper.addToolMaterial("material_netherite_ingot", 3, 2031, 9.0F, 4.0F, 15);
	public static final ArmorMaterial ARMOR_MATERIAL_NETHERITE_INGOT = EnumHelper.addArmorMaterial("armor_material_netherite_ingot", Reference.MOD_ID + ":netherite", 37, new int[] {3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	
	//Items
	public static final Item NETHERITE_INGOT = new ItemBase("netherite_ingot");
	public static final Item NETHERITE_SCRAP = new ItemBase("netherite_scrap");
	
	//Tools
	public static final Item NETHERITE_SWORD = new ToolSword("netherite_sword", MATERIAL_NETHERITE_INGOT);
	public static final Item NETHERITE_SHOVEL = new ToolShovel("netherite_shovel", MATERIAL_NETHERITE_INGOT);
	public static final Item NETHERITE_PICKAXE = new ToolPickaxe("netherite_pickaxe", MATERIAL_NETHERITE_INGOT);
	public static final Item NETHERITE_AXE = new ToolAxe("netherite_axe", MATERIAL_NETHERITE_INGOT);
	public static final Item NETHERITE_HOE = new ToolHoe("netherite_hoe", MATERIAL_NETHERITE_INGOT);
	
	//Armor
	public static final Item NETHERITE_HELMET = new ArmorBase("netherite_helmet", ARMOR_MATERIAL_NETHERITE_INGOT, 1, EntityEquipmentSlot.HEAD);
	public static final Item NETHERITE_CHESTPLATE = new ArmorBase("netherite_chestplate", ARMOR_MATERIAL_NETHERITE_INGOT, 1, EntityEquipmentSlot.CHEST);
	public static final Item NETHERITE_LEGGINGS = new ArmorBase("netherite_leggings", ARMOR_MATERIAL_NETHERITE_INGOT, 2, EntityEquipmentSlot.LEGS);
	public static final Item NETHERITE_BOOTS = new ArmorBase("netherite_boots", ARMOR_MATERIAL_NETHERITE_INGOT, 1, EntityEquipmentSlot.FEET);
}