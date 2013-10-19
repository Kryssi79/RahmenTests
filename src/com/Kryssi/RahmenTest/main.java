package com.Kryssi.RahmenTest;

import org.bukkit.entity.ItemFrame;
import org.bukkit.plugin.java.JavaPlugin;



public class main extends JavaPlugin 
{

	public ItemFrame itemFrame1;
	public ItemFrame itemFrame2;
	public ItemFrame itemFrame3;
	
	
	@Override
	public void onEnable()
	{
		// Save a copy of the default config.yml if one is not there
        this.saveDefaultConfig();
        
		System.out.println("starte:   RahmenTest - Plugin  ");
		
		// Events: 
        getServer().getPluginManager().registerEvents(new RahmenListener(this), this);
	}
	
	
	@Override
	public void onDisable()
	{
		System.out.println("beende:   RahmenTest - Plugin  ");
	}
	
	
}
