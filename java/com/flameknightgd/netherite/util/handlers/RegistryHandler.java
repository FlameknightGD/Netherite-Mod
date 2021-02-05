package com.flameknightgd.netherite.util.handlers;

import com.flameknightgd.netherite.init.ModBlocks;
import com.flameknightgd.netherite.init.ModItems;
import com.flameknightgd.netherite.util.IHasModel;
import com.flameknightgd.netherite.util.compat.OreDictionaryCompat;
import com.flameknightgd.netherite.world.gen.WorldGenCustomOres;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
		//Ore Generation
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		
		//Config File
		ConfigHandler.registerConfig(event);
	}
	
	public static void initRegistries(FMLInitializationEvent event)
	{
		//Ore Dictionary
		OreDictionaryCompat.registerOres();
		
		//Sounds
		SoundsHandler.registerSounds();
	}
}