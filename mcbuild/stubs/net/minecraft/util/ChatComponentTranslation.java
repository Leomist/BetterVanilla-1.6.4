package net.minecraft.util;
public class ChatComponentTranslation {
    private final String key;
    public ChatComponentTranslation(String key, Object... args) { this.key = key; }
    public String getUnformattedText() { return key; }
}
