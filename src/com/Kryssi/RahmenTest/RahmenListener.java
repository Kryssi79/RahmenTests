package com.Kryssi.RahmenTest;

import org.bukkit.block.Block;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;

import com.Kryssi.RahmenTest.main;


public class RahmenListener implements Listener 
{
	main plugin;
	
	public RahmenListener(main plugin) 
	{
		this.plugin = plugin;
	}
	
	
	public void onBlockRedstone(BlockRedstoneEvent event) 
	{
		//wenn: am Block  redstone  gebaut/abgebaut   bzw. Signal 
		Block block = event.getBlock();
		int iBlockID = block.getTypeId();
		System.out.println(" plugin:  onBlockRedstone()  ");
	}
	

}
