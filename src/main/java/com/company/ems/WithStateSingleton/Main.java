package com.company.ems.WithStateSingleton;

public class Main {
    public static void main(String[] args) {
        // 2. Tạo 2 máy nghe nhạc riêng biệt
        AudioPlayer player1 = new AudioPlayer();
        AudioPlayer player2 = new AudioPlayer();

        System.out.println("=== KIỂM TRA MÁY 1 VÀ MÁY 2 ===");

        // Mặc định cả 2 máy đều ở ReadyState
        System.out.println("Player 1 đang ở State ID: " + System.identityHashCode(player1.getState()));
        System.out.println("Player 2 đang ở State ID: " + System.identityHashCode(player2.getState()));
        System.out.println("> Nhận xét: Cả 2 máy đang dùng CHUNG 1 đối tượng ReadyState.\n");

        // 3. Thay đổi trạng thái Máy 1
        System.out.println("--- Máy 1 bấm Play ---");
        player1.pressPlay();
        System.out.println("Player 1 bây giờ ở State ID: " + System.identityHashCode(player1.getState()));

        // 4. Thay đổi trạng thái Máy 2 sang cùng trạng thái với Máy 1
        System.out.println("--- Máy 2 bấm Play ---");
        player2.pressPlay();
        System.out.println("Player 2 bây giờ ở State ID: " + System.identityHashCode(player2.getState()));

        System.out.println("\n> KẾT LUẬN CUỐI CÙNG:");
        if (System.identityHashCode(player1.getState()) == System.identityHashCode(player2.getState())) {
            System.out.println("XÁC NHẬN: Hai máy khác nhau nhưng đang dùng CHUNG một vùng nhớ State!");
        }
    }
}
