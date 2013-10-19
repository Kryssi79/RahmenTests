package com.Kryssi.RahmenTest;

import org.bukkit.plugin.java.JavaPlugin;



public class main extends JavaPlugin 
{

	@Override
	public void onEnable()
	{
		System.out.println("starte:   RahmenTest - Plugin  ");
		// Events: 
        // getServer().getPluginManager().registerEvents(new BlaListener(this), this);
	}
	
	@Override
	public void onDisable()
	{
		System.out.println("beende:   RahmenTest - Plugin  ");
	}
	
	
}
