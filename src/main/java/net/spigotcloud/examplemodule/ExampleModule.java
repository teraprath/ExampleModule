package net.spigotcloud.examplemodule;

import net.spigotcloud.examplemodule.listener.ExampleListener;
import net.spigotcloud.lobby.module.Module;

public class ExampleModule extends Module {

    @Override
    public void onEnable() {

        registerListener(new ExampleListener());

    }

    @Override
    public void onDisable() {

    }

}
