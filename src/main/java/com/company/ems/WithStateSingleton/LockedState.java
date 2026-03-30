package com.company.ems.WithStateSingleton;

public class LockedState implements State {
    private static final LockedState INSTANCE = new LockedState();

    private LockedState() {}

    public static LockedState getInstance() {
        return INSTANCE;
    }

    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println("!! Đang khóa: Không làm gì cả.");
    }

    @Override
    public void clickLock(AudioPlayer player) {
        System.out.println(">> Đang khóa: Mở khóa.");
        player.changeState(ReadyState.getInstance());
    }
}