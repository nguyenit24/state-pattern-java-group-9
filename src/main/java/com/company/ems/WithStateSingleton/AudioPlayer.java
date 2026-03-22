package com.company.ems.WithStateSingleton;

public class AudioPlayer {
    private State state = ReadyState.INSTANCE;

    public void changeState(State newState) {
        this.state = newState;
    }

    // method để chứng minh hash id không thay đổi khi chuyển đổi trạng thái
    public State getState() {
        return this.state;
    }

    public void pressPlay() {
        state.clickPlay(this);
    }

    public void pressLock() {
        state.clickLock(this);
    }
}
