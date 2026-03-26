package com.company.ems.State;
public class AudioPlayer {
    private State state;

    public AudioPlayer(State initialState) {
        changeState(initialState);
    }

    public void changeState(State newState) {
        this.state = newState;
        this.state.setContext(this); 
    }

    public void pressPlay() {
        state.clickPlay();
    }

    public void pressLock() {
        state.clickLock();
    }
}