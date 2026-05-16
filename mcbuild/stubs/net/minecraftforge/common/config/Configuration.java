package net.minecraftforge.common.config;
import java.io.File;
public class Configuration {
    public Configuration(File file) {}
    public void load() {}
    public void save() {}
    public Property get(String category, String key, boolean defaultValue) { return new Property(); }
    public Property get(String category, String key, double defaultValue) { return new Property(); }
    public Property get(String category, String key, String[] defaultValue) { return new Property(); }
    public Property get(String category, String key, String defaultValue) { return new Property(); }
    public static final String CATEGORY_GENERAL = "general";
}
