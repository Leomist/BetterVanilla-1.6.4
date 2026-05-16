package cpw.mods.fml.common.eventhandler;
public class Event {
    public enum Result { DENY, DEFAULT, ALLOW; }
    private Result result = Result.DEFAULT;
    private boolean canceled = false;
    public boolean isCancelable() { return false; }
    public boolean isCanceled() { return canceled; }
    public void setCanceled(boolean c) { canceled = c; }
    public Result getResult() { return result; }
    public void setResult(Result r) { this.result = r; }
}
