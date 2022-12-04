package zhentox.dragoneggpreventgen.dragoneggpreventgen;

import io.papermc.paper.event.block.DragonEggFormEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class DragonEggPreventGenListener implements Listener {
    private DragonEggPreventGen plugin;

    public DragonEggPreventGenListener(DragonEggPreventGen plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void firstDragonKilled(DragonEggFormEvent defe) {
        defe.setCancelled(true);
    }
}
