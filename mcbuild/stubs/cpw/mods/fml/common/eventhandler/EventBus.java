package cpw.mods.fml.common.eventhandler;
public class EventBus {
    public void register(Object listener) {}
    public void unregister(Object listener) {}
    public boolean post(Event event) { return false; }
}
