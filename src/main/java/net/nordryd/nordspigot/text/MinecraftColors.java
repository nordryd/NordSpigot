package net.nordryd.nordspigot.text;

/**
 * Color codes to use for cmd.
 */
public enum MinecraftColors
{
    RESET("§r"),
    BLACK("§0"),
    DARK_BLUE("§1"),
    DARK_GREEN("§2"),
    DARK_AQUA("§3"),
    DARK_RED("§4"),
    DARK_PURPLE("§5"),
    GOLD("§6"),
    GRAY("§7"),
    DARK_GRAY("§8"),
    BLUE("§9"),
    GREEN("§a"),
    AQUA("§b"),
    RED("§c"),
    LIGHT_PURPLE("§d"),
    YELLOW("§e"),
    WHITE("§f"),
    BOLD("§l"),
    STRIKETHROUGH("§m"),
    UNDERLINE("§n"),
    ITALIC("§o"),
    OBFUSCATED("§k");

    private final String code;

    MinecraftColors(final String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
