package net.minecraft.stats;
public class StatList {
    public static StatBase[] mineBlockStatArray = new StatBase[4096];
    static {
        for (int i = 0; i < mineBlockStatArray.length; i++) {
            mineBlockStatArray[i] = new StatBase("mine_" + i);
        }
    }
}
