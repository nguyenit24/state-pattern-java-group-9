package com.company.ems.WithState;

public class AudioPlayer {
    private State state;

    public AudioPlayer() {
        // Khởi tạo trạng thái mặc định và truyền 'this' vào
        this.state = new ReadyState(this);
    }

    public void changeState(State newState) {
        this.state = newState;
    }

    // Client gọi nút bấm
    public void pressPlay() {
        state.clickPlay(); // Không cần truyền tham số vì State đã giữ 'player' rồi
    }

    public void pressLock() {
        state.clickLock();
    }
}
