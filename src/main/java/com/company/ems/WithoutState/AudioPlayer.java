package com.company.ems.WithoutState;

public class AudioPlayer {

    enum State { READY, PLAYING, LOCKED }

    private State currentState = State.READY;

    public void pressPlay() {
        if (currentState == State.READY) {
            System.out.println(">> Đang chờ: Bắt đầu phát nhạc.");
            currentState = State.PLAYING;

        } else if (currentState == State.PLAYING) {
            System.out.println(">> Đang phát: Tạm dừng.");
            currentState = State.READY;

        } else if (currentState == State.LOCKED) {
            System.out.println("!! Đang khóa: Không làm gì cả.");
        }
    }

    public void pressLock() {
        if (currentState == State.READY) {
            System.out.println(">> Đang chờ: Khóa máy.");
            currentState = State.LOCKED;

        } else if (currentState == State.PLAYING) {
            System.out.println(">> Đang phát: Khóa máy (nhạc vẫn chạy).");
            currentState = State.LOCKED;

        } else if (currentState == State.LOCKED) {
            System.out.println(">> Đang khóa: Mở khóa.");
            currentState = State.READY;
        }
    }
}