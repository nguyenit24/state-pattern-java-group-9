package com.company.ems.WithoutState;

public class Test {
    public static void main(String[] args) {
        AudioPlayer myPlayer = new AudioPlayer();

        System.out.println("--- Bắt đầu sử dụng máy nghe nhạc ---");
        
        myPlayer.pressPlay(); // Ready -> Playing
        myPlayer.pressLock(); // Playing -> Locked
        myPlayer.pressPlay(); // Vẫn là Locked (Vô tác dụng)
        myPlayer.pressLock(); // Locked -> Ready
        myPlayer.pressPlay(); // Ready -> Playing
    }
}
