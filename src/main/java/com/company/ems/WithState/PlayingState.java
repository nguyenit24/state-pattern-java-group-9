package com.company.ems.WithState;

public class PlayingState implements State {
    private AudioPlayer player;
    public PlayingState(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void clickPlay() {
        System.out.println(">> Đang phát: Tạm dừng.");
        player.changeState(new ReadyState(player));
    }

    @Override
    public void clickLock() {
        System.out.println(">> Đang phát: Khóa máy (nhạc vẫn chạy).");
        player.changeState(new LockedState(player));
    }
}
