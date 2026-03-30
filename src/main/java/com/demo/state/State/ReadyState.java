package com.demo.state.State;

public class ReadyState implements State {
    private AudioPlayer player;

    @Override
    public void setContext(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void clickPlay() {
        System.out.println(">> Đang chờ: Bắt đầu phát nhạc.");
        player.changeState(new PlayingState());
    }

    @Override
    public void clickLock() {
        System.out.println(">> Đang chờ: Khóa máy.");
        player.changeState(new LockedState());
    }
}