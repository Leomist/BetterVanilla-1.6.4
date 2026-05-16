package net.minecraft.client.gui.inventory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.inventory.Container;
public abstract class GuiContainer {
    protected Container inventorySlotsEmpty;
    protected int xSize = 176, ySize = 166;
    protected int width = 320, height = 240;
    protected FontRenderer fontRendererObj = new FontRenderer();
    protected Minecraft mc = new Minecraft();
    public GuiContainer(Container container) {}
    protected abstract void drawGuiContainerForegroundLayer(int mouseX, int mouseY);
    protected abstract void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY);
    protected void drawTexturedModalRect(int x, int y, int u, int v, int w, int h) {}
}
