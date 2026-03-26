package com.company.ems.WithStateSingleton;

public class ReadyState implements State {
    private static final ReadyState INSTANCE = new ReadyState();

    private ReadyState() {}

    public static ReadyState getInstance() {
        return INSTANCE;
    }

    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println(">> Ready → Play");
        player.changeState(PlayingState.getInstance());
    }

    @Override
    public void clickLock(AudioPlayer player) {
        System.out.println(">> Ready → Lock");
        player.changeState(LockedState.getInstance());
    }
}