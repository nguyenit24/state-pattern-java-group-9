package com.demo.state.State;
public class LockedState implements State {
    private AudioPlayer player;

    @Override
    public void setContext(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void clickPlay() {
        System.out.println("!! Đang khóa: Không làm gì cả.");
    }

    @Override
    public void clickLock() {
        System.out.println(">> Đang khóa: Mở khóa.");
        player.changeState(new ReadyState());
    }
}