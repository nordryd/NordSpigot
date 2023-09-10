package net.nordryd.nordspigot.text;

public class PrefixFactory
{
    private static final String RESET_COLOR_CODE = "&r";
    private static final String AQUA_COLOR_CODE = "&b";
    private static final String PLUGIN_PREFIX = AQUA_COLOR_CODE + "[NordSpigot]" + RESET_COLOR_CODE + " ";

    public static String getPrefixedString(final String message) {
        return PLUGIN_PREFIX + message;
    }

    public static String getPrefixedString(final String message, final Object... args) {
        return PLUGIN_PREFIX + String.format(message, args);
    }
}
