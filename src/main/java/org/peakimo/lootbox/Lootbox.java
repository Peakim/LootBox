package org.peakimo.lootbox;

import org.bukkit.plugin.java.JavaPlugin;
import org.peakimo.lootbox.events.lootbox_use;

public final class Lootbox extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new lootbox_use(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
