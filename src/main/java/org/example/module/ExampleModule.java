package org.example.module;

import net.spigotcloud.lobby.module.Module;
import net.spigotcloud.lobby.module.ModuleItem;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ExampleModule extends Module {

    public ExampleModule() {
        super(new ModuleItem(new ItemStack(Material.DIAMOND), 4).setName("Example-Item"));
    }

    @Override
    public void onEnable() {

        // Register events
        registerListener(new ExampleListener());

        // Register sub-commands
        registerSubCommand("example", new ExampleCommand());

    }

    @Override
    public void onDisable() {
        // Shutdown logic
    }

    @Override
    public void onItemClick(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        player.sendMessage("You've clicked the Example-Item!");
    }

}
