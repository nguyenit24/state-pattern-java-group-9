package com.company.ems.WithState;

public class Main {
    public static void main(String[] args) {
      
        AudioPlayer myPlayer = new AudioPlayer();
        System.out.println("--- Bắt đầu sử dụng máy nghe nhạc ---");

        myPlayer.pressPlay();
        myPlayer.pressLock();
        myPlayer.pressPlay();
        myPlayer.pressLock();
        myPlayer.pressPlay();
    }
}