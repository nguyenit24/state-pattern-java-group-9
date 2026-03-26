package com.company.ems.State;

public class Test {
    public static void main(String[] args) {

        System.out.println("=== (ReadyState) ===");
        ReadyState readyState = new ReadyState();
        AudioPlayer player1 = new AudioPlayer(readyState);

        player1.pressPlay();
        player1.pressLock();
        player1.pressPlay();

        System.out.println("\n=== (LockedState) ===");
        AudioPlayer player2 = new AudioPlayer(new LockedState());

        player2.pressPlay();
        player2.pressLock();
        player2.pressPlay();
    }
}