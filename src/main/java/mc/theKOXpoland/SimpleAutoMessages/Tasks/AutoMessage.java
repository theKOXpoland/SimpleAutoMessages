package mc.theKOXpoland.SimpleAutoMessages.Tasks;

import mc.theKOXpoland.SimpleAutoMessages.MainFile;
import mc.theKOXpoland.SimpleAutoMessages.Utils.Util;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public class AutoMessage extends BukkitRunnable {

    int count;
    List<String> messages;

    public AutoMessage(MainFile plugin) {
        count = 0;
        messages = plugin.getConfig().getStringList("AutoMessages");
    }

    @Override
    public void run() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage(Util.fix(messages.get(count)));
        }
        count++;
        if (count >= messages.size()) {
            count = 0;
        }
    }
}