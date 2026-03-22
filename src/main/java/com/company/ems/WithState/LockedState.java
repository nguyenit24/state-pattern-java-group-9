package com.company.ems.WithState;

public class LockedState implements State {
    private AudioPlayer player;
    public LockedState(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void clickPlay() {
        System.out.println("!! Đang khóa: Không làm gì cả.");
    }

    @Override
    public void clickLock() {
        System.out.println(">> Đang khóa: Mở khóa.");
        player.changeState(new ReadyState(player));
    }
}
