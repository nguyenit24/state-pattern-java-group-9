package com.company.ems.WithStateSingleton;

public class PlayingState implements State {
    private static final PlayingState INSTANCE = new PlayingState();

    private PlayingState() {}

    public static PlayingState getInstance() {
        return INSTANCE;
    }

    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println(">> Playing → Pause");
        player.changeState(ReadyState.getInstance());
    }

    @Override
    public void clickLock(AudioPlayer player) {
        System.out.println(">> Playing → Lock");
        player.changeState(LockedState.getInstance());
    }
}