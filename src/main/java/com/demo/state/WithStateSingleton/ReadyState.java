package com.demo.state.WithStateSingleton;

public class ReadyState implements State {
    private static final ReadyState INSTANCE = new ReadyState();

    private ReadyState() {}

    public static ReadyState getInstance() {
        return INSTANCE;
    }

    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println(">> Đang chờ: Bắt đầu phát nhạc.");
        player.changeState(PlayingState.getInstance());
    }

    @Override
    public void clickLock(AudioPlayer player) {
        System.out.println(">> Đang chờ: Khóa máy.");
        player.changeState(LockedState.getInstance());
    }
}