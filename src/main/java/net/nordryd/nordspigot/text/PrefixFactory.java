package net.nordryd.nordspigot.text;

public class PrefixFactory
{
    private static final String PREFIX =
            MinecraftColors.AQUA + "[" + MinecraftColors.DARK_AQUA + "NordSpigot" + MinecraftColors.AQUA + "]" + MinecraftColors.RESET + " ";

    public static String getPrefixedMessage(final String message) {
        return PREFIX + message;
    }

    public static String getPrefixedMessage(final String message, final Object... args) {
        return PREFIX + String.format(message, args);
    }
}
