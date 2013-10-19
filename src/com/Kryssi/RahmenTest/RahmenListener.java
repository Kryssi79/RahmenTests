package com.Kryssi.RahmenTest;

import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.block.Block;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import com.Kryssi.RahmenTest.main;


public class RahmenListener implements Listener 
{
	main plugin;
	
	public RahmenListener(main plugin) 
	{
		this.plugin = plugin;
	}
	
	
	
	@EventHandler(priority=EventPriority.NORMAL )
	public void onBlockRedstone(BlockRedstoneEvent event) 
	{
		//wenn: am Block  redstone  gebaut/abgebaut   bzw. Signal 
		Block block = event.getBlock();
		int iBlockID = block.getTypeId();
		System.out.println(" plugin:  onBlockRedstone()  ");
	}
	
	
	@EventHandler(ignoreCancelled=true)
    public void onHangingPlaceEvent(HangingPlaceEvent event) {
        if (event.getEntity() instanceof ItemFrame) 
        {
        	Player player = event.getPlayer();
        }
	}
	
	
	@EventHandler(ignoreCancelled=true)
    public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent event) 
	{
        if (event.getRightClicked() instanceof ItemFrame) 
        {
        	//get the block location of the ItemFrame
            Location itemFrameLocation = event.getRightClicked().getLocation();
            //cast the right clicked on item into an itemFrame
            ItemFrame itemFrame = (ItemFrame) event.getRightClicked();
        }
	}
	
	
	

}
