package com.company.ems.WithStateSingleton;

public class Test {
    public static void main(String[] args) {
        AudioPlayer player1 = new AudioPlayer();
        System.out.println("--- Player 1 ---");
        player1.pressPlay();
        player1.pressPlay(); // trạng thái Ready
        System.out.print("Player 1 - State HashCode: " + System.identityHashCode(player1.getState()));

        AudioPlayer player2 = new AudioPlayer();
        System.out.println("\n--- Player 2 ---");
        player2.pressLock();
        player2.pressLock(); // Quay về trạng thái Ready
        System.out.print("Player 2 - State HashCode: " + System.identityHashCode(player2.getState()));

    }
}