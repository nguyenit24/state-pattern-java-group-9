package com.company.ems.WithStateSingleton;

public class ReadyState implements State {
    public static final ReadyState INSTANCE = new ReadyState();
    private ReadyState() {}

    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println(">> Đang chờ: Bắt đầu phát nhạc.");
        player.changeState(PlayingState.INSTANCE);
    }

    @Override
    public void clickLock(AudioPlayer player) {
        System.out.println(">> Đang chờ: Khóa máy.");
        player.changeState(LockedState.INSTANCE);
    }
}
