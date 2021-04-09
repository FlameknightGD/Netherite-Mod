package com.flameknightgd.netherite.objects.armor;

import java.util.UUID;

import com.google.common.collect.Multimap;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;

public class NetheriteArmor extends ArmorBase
{

	public NetheriteArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(name, materialIn, renderIndexIn, equipmentSlotIn);
	}
	
	/*@Override
	public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
	{
		Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);
		UUID uuid = new UUID();
	    if (equipmentSlot == this.armorType)
	    {
	        multimap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName(), new AttributeModifier(uuid, "generic.knockbackResistance", 2, 0));
	    }

	    return multimap;
	}*/
}