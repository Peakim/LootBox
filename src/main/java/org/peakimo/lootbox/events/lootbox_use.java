package org.peakimo.lootbox.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class lootbox_use implements Listener {

    @EventHandler
    public void onclickblock(PlayerInteractEvent event){
        Player bazikon = event.getPlayer();
        Location BlockLocation = bazikon.getTargetBlock(null,5).getLocation();
        String playername = bazikon.getName();

        if (bazikon.getWorld().getBlockAt(BlockLocation).getType() == Material.ORANGE_GLAZED_TERRACOTTA){

            bazikon.getWorld().getBlockAt(BlockLocation).setType(Material.AIR);

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + playername + " parent addtemp vip+ 5d");


        }


    }
}
