package org.example.module;

import net.spigotcloud.lobby.command.SubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;

public class ExampleCommand extends SubCommand {

    public ExampleCommand() {
        super("example.permission", "Example Description");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        sender.sendMessage("Sub-Command works!");
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String s, String[] args) {
        return null;
    }
}
