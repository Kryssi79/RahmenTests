package com.Kryssi.RahmenTest;

import org.bukkit.Material;
import org.bukkit.block.*;
import org.bukkit.entity.ItemFrame;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.block.Sign;
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
        //this.saveDefaultConfig();
        
		System.out.println("starte:   RahmenTest - Plugin  ");
		
		// Events: 
        getServer().getPluginManager().registerEvents(new RahmenListener(this), this);
	}
	
	
	@Override
	public void onDisable()
	{
		System.out.println("beende:   RahmenTest - Plugin  ");
	}
	
	
	
	
	public void umschauenNachSchild(Block block, BlockRedstoneEvent event)
	{
		handleRedstoneEvent(block.getRelative(0, 0, 0), event, 1);
		handleRedstoneEvent(block.getRelative(1, 0, 0), event, 1);
		handleRedstoneEvent(block.getRelative(-1, 0, 0), event, 1);
		handleRedstoneEvent(block.getRelative(0, 0, 1), event, 1);
		handleRedstoneEvent(block.getRelative(0, 0, -1), event, 1);
	}
	
	public boolean istSchild(Block block)
	{
		if (block.getType().equals(Material.WALL_SIGN)) 
		{
			return true;
		}
		return false;
	}
	
	public void handleRedstoneEvent(Block block, BlockRedstoneEvent event, int delayTicks) 
	{
        if (istSchild(block)) 
        {
        	System.out.println(" plugin:  handleRedstoneEvent()  ");
            Sign signBlock = (Sign) block.getState();
            if (signBlock == null) {
                return;
            }
            if (signBlock.getLine(1) == null) {
                return;
            }
            System.out.println("   .getLine(0)  " + signBlock.getLine(0) );
            System.out.println("   .getLine(1)  " + signBlock.getLine(1) );
            System.out.println("   .getLine(2)  " + signBlock.getLine(2) );
        }
	}
            
            
            
	
	
}
