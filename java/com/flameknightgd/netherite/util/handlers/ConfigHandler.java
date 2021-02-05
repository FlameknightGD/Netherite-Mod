package com.flameknightgd.netherite.util.handlers;

import java.io.File;

import com.flameknightgd.netherite.Main;
import com.flameknightgd.netherite.util.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler 
{
	public static Configuration config;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		String category;
		
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MOD_ID + ".cfg"));
	}
}