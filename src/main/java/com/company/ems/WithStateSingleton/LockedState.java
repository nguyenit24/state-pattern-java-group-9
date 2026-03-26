package com.company.ems.WithStateSingleton;

public class LockedState implements State {
    private static final LockedState INSTANCE = new LockedState();

    private LockedState() {}

    public static LockedState getInstance() {
        return INSTANCE;
    }

    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println("!! Locked → Do nothing");
    }

    @Override
    public void clickLock(AudioPlayer player) {
        System.out.println(">> Locked → Unlock");
        player.changeState(ReadyState.getInstance());
    }
}