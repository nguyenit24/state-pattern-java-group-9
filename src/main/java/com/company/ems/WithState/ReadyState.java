package com.company.ems.WithState;

public class ReadyState implements State {
    private AudioPlayer player;
    ReadyState(AudioPlayer player) {
        this.player = player;
    }
    @Override
    public void clickPlay() {
        System.out.println(">> Đang chờ: Bắt đầu phát nhạc.");
        // Tạo state mới và truyền 'player' hiện tại vào
        player.changeState(new PlayingState(player));
    }

    @Override
    public void clickLock() {
        System.out.println(">> Đang chờ: Khóa máy.");
        player.changeState(new LockedState(player));
    }
}
