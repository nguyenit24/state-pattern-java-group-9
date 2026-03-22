package com.company.ems.WithStateSingleton;

public class PlayingState implements State {
    public static final PlayingState INSTANCE = new PlayingState();
    private PlayingState() {}

    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println(">> Đang phát: Tạm dừng nhạc.");
        player.changeState(ReadyState.INSTANCE);
    }

    @Override
    public void clickLock(AudioPlayer player) {
        System.out.println(">> Đang phát: Khóa máy (nhạc vẫn chạy ngầm).");
        player.changeState(LockedState.INSTANCE);
    }
}
