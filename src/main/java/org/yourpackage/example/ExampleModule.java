package org.yourpackage.example;

import net.spigotcloud.lobby.item.LobbyItem;
import net.spigotcloud.lobby.module.Module;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

public class ExampleModule extends Module {

    public ExampleModule() {
        super(new LobbyItem(Material.DIAMOND).setName("§1Test Item").build(), 4);
    }

    @Override
    public void onEnable() {

        // You can register listeners like normal
        registerListener(new ExampleListener());

        // Easily register sub-commands for '/lobby'
        registerSubCommand("example", new ExampleCommand());

    }

    @Override
    public void onDisable() {

        // Shutdown logic

    }

    @Override
    public void onItemClick(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        player.sendMessage("You clicked the item!");
    }

}

