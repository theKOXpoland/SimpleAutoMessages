package mc.theKOXpoland.SimpleAutoMessages.Utils;

import org.bukkit.ChatColor;

public class Util {

    public static String fix(String text) {
        return ChatColor.translateAlternateColorCodes('&', text.replace("<<", "«").replace(">>", "»"));
    }

}
