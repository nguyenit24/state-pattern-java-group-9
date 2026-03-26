package com.company.ems.State;

public class PlayingState implements State {
    private AudioPlayer player;

    @Override
    public void setContext(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void clickPlay() {
        System.out.println(">> Đang phát: Tạm dừng.");
        player.changeState(new ReadyState());
    }

    @Override
    public void clickLock() {
        System.out.println(">> Đang phát: Khóa máy (nhạc vẫn chạy).");
        player.changeState(new LockedState());
    }
}