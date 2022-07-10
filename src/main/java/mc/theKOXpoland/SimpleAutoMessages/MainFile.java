package mc.theKOXpoland.SimpleAutoMessages;

import mc.theKOXpoland.SimpleAutoMessages.Tasks.AutoMessage;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MainFile extends JavaPlugin {

    @Override
    public void onEnable() {

        saveDefaultConfig();
        getConfig();

        new AutoMessage(this).runTaskTimer(this, 0L, getConfig().getInt("AutoMessageSeconds") * 20L);

        Bukkit.getLogger().info("SimpleAutoMessages - Activated!");
    }

}
