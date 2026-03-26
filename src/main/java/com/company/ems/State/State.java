package com.company.ems.State;

public interface State {
    void setContext(AudioPlayer player);
    void clickPlay();
    void clickLock();
}
