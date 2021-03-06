package com.Kryssi.RahmenTest;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.block.Block;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

import com.Kryssi.RahmenTest.main;


public class RahmenListener implements Listener 
{
	main plugin;
	
	public RahmenListener(main plugin) 
	{
		this.plugin = plugin;
	}
	
	
	
	@EventHandler(priority=EventPriority.HIGH )
	public void onBlockRedstone(BlockRedstoneEvent event) 
	{
		System.out.println("  ");
		Block block = event.getBlock();
		int iBlockID = block.getTypeId();
		if (iBlockID==69 || iBlockID==77 || iBlockID==143) {  return; }
		if(event.getOldCurrent() >=1 && event.getNewCurrent() == 0 ) { return; }
		System.out.println(" plugin:  onBlockRedstone()  ");
		System.out.println("     iBlockID = " + iBlockID);
		if(plugin.itemFrame1 != null)
		{
			//  funzelt  :-)
			//ItemStack  item01 = new ItemStack( Helper.random_IntRange(2, 128) );
			//plugin.itemFrame1.setItem(item01);
		}
		if(event.getNewCurrent()>=1) {
			plugin.umschauenNachSchild(block, event);
		}
		return;
	}
	
	
	
	@EventHandler(priority=EventPriority.NORMAL )
    public void onHangingPlaceEvent(HangingPlaceEvent event) 
	{
		System.out.println(" plugin:  onHangingPlace Event  ");
        if (event.getEntity() instanceof ItemFrame) 
        {
        	Player player = event.getPlayer();
        	System.out.println(" player:  "+player.getDisplayName() );
        	System.out.println(" event.getBlock().getType()  "+event.getBlock().getType() );  // auf was
        	plugin.itemFrame1 = (ItemFrame)event.getEntity();
        }
        System.out.println("  ");
	}
	
	
	@EventHandler(priority=EventPriority.NORMAL )
    public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent event)
	{
        if (event.getRightClicked() instanceof ItemFrame) 
        {
        	System.out.println(" plugin:  onPlayer InteractEntity Event  ");
        	//get the block location of the ItemFrame
            Location itemFrameLocation = event.getRightClicked().getLocation();
            //cast the right clicked on item into an itemFrame
            ItemFrame itemFrame = (ItemFrame) event.getRightClicked();
            plugin.itemFrame1 = itemFrame;
            
            System.out.println("   "+itemFrame.getType());
            System.out.println("   "+itemFrame.getItem().getType());
            
            ItemFrame test = (ItemFrame)(event.getRightClicked());
            boolean isAir = test.getItem().getType().equals(Material.AIR);
        }
	}
	
	
	@EventHandler(priority=EventPriority.NORMAL )
    public void onBlockPlaceEvent(BlockPlaceEvent event) 
	{
        if (event.getBlock().getType().equals(Material.CHEST) || event.getBlock().getType().equals(Material.TRAPPED_CHEST)) 
        {
            //Get the chest Block
            Block chestBlock = event.getBlock();
        }
        System.out.println(" plugin:  onBlockPlace Event  ");
	}
	
	

}
