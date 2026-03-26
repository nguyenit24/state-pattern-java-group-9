package com.company.ems.WithStateSingleton;

public class Test {
    public static void main(String[] args) {
        AudioPlayer player1 = new AudioPlayer();
        System.out.println("--- Start ---");
        player1.pressPlay();
        player1.pressPlay();
        System.out.print(System.identityHashCode(player1.getState()));

        AudioPlayer player2 = new AudioPlayer();
        System.out.println("\n--- Another Player ---");
        player2.pressPlay();
        player2.pressLock();
        player2.pressLock();
        System.out.print(System.identityHashCode(player2.getState()));

    }
}