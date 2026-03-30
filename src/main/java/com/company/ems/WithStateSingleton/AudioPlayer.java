package com.company.ems.WithStateSingleton;

public class AudioPlayer {
    private State state;

    public AudioPlayer() {
        this.state = ReadyState.getInstance(); // singleton
    }
    
    // Lấy trạng thái hiện tại (Singleton)
    public State getState(){
        return state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void pressPlay() {
        state.clickPlay(this); 
    }

    public void pressLock() {
        state.clickLock(this);
    }
}