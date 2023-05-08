package org.yourpackage.example;

import net.spigotcloud.lobby.command.SubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;

public class ExampleCommand extends SubCommand {

    public ExampleCommand() {
        super("example", "Example Sub-Command");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        sender.sendMessage("§8// Paste your code here ;P");
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String s, String[] strings) {
        return null;
    }
}
