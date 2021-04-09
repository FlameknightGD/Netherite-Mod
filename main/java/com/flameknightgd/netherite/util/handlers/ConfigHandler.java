package com.flameknightgd.netherite.util.handlers;

import java.io.File;

import com.flameknightgd.netherite.Main;
import com.flameknightgd.netherite.util.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler 
{
	public static Configuration config;
	
	//Ancient Debris Generation 1
	public static int ancientDebris1VeinSize = 3;
    public static int ancientDebris1Chance = 1;
    public static int ancientDebris1MinHeight = 8;
    public static int ancientDebris1MaxHeight = 22;
    
    //Ancient Debris Generation 2
  	public static int ancientDebris2VeinSize = 2;
    public static int ancientDebris2Chance = 1;
    public static int ancientDebris2MinHeight = 8;
    public static int ancientDebris2MaxHeight = 119;
    
	public static void init(File file)
	{
		config = new Configuration(file);
		
		String category;
		
		category = "Ore Generation";
        config.addCustomCategoryComment(category, "Ore Generation");
        
        ancientDebris1VeinSize = config.getInt("Ancient Debris 1 Vein Size", category, 3, 0, 128, "Set Ancient Debris 1 Vein Size");
        ancientDebris1Chance = config.getInt("Ancient Debris 1 Chance", category, 1, 0, 256, "Set Ancient Debris 1 Chance");
        ancientDebris1MinHeight = config.getInt("Ancient Debris 1 Minimum Height", category, 8, 0, 128, "Set Ancient Debris 1 Minimum Height");
        ancientDebris1MaxHeight = config.getInt("Ancient Debris 1 Maximum Height", category, 22, 0, 128, "Set Ancient Debris 1 Maximum Height");
        
        ancientDebris2VeinSize = config.getInt("Ancient Debris 2 Vein Size", category, 2, 0, 128, "Set Ancient Debris 2 Vein Size");
        ancientDebris2Chance = config.getInt("Ancient Debris 2 Chance", category, 1, 0, 256, "Set Ancient Debris 2 Chance");
        ancientDebris2MinHeight = config.getInt("Ancient Debris 2 Minimum Height", category, 8, 0, 128, "Set Ancient Debris 2 Minimum Height");
        ancientDebris2MaxHeight = config.getInt("Ancient Debris 2 Maximum Height", category, 119, 0, 128, "Set Ancient Debris 2 Maximum Height");
        
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MOD_ID + ".cfg"));
	}
}