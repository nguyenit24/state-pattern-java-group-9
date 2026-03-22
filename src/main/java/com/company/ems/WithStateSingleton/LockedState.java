package com.company.ems.WithStateSingleton;

public class LockedState implements State {
    
    public static final LockedState INSTANCE = new LockedState();
    private LockedState() {}

    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println("!! Máy đang khóa: Nút Play vô tác dụng.");
    }

    @Override
    public void clickLock(AudioPlayer player) {
        System.out.println(">> Máy đang khóa: Mở khóa.");
        player.changeState(ReadyState.INSTANCE);
    }
}
