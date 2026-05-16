package net.minecraft.util;
public class ResourceLocation {
    private final String resourceDomain;
    private final String resourcePath;
    public ResourceLocation(String location) {
        String[] parts = location.split(":", 2);
        if (parts.length == 2) { resourceDomain = parts[0]; resourcePath = parts[1]; }
        else { resourceDomain = "minecraft"; resourcePath = location; }
    }
    public ResourceLocation(String domain, String path) { this.resourceDomain = domain; this.resourcePath = path; }
    public String getResourceDomain() { return resourceDomain; }
    public String getResourcePath() { return resourcePath; }
    public String toString() { return resourceDomain + ":" + resourcePath; }
}
