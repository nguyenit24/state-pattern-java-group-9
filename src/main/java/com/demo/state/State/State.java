package com.demo.state.State;

public interface State {
    void setContext(AudioPlayer player);
    void clickPlay();
    void clickLock();
}
