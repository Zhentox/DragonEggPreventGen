package zhentox.dragoneggpreventgen.dragoneggpreventgen;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class DragonEggPreventGen extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("El plugin arranco correctamente.");
        getServer().getPluginManager().registerEvents(new DragonEggPreventGenListener(this), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("El plugin se apago correctamente.");
    }
}
