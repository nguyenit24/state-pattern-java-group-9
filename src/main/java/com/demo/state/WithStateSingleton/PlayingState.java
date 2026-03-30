package com.demo.state.WithStateSingleton;

public class PlayingState implements State {
    private static final PlayingState INSTANCE = new PlayingState();

    private PlayingState() {}

    public static PlayingState getInstance() {
        return INSTANCE;
    }

    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println(">> Đang phát: Tạm dừng.");
        player.changeState(ReadyState.getInstance());
    }

    @Override
    public void clickLock(AudioPlayer player) {
        System.out.println(">> Đang phát: Khóa máy (nhạc vẫn chạy).");
        player.changeState(LockedState.getInstance());
    }
}