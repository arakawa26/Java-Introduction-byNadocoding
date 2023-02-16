package chap_08.Camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다");
    }
    public void recordVideo() {
        System.out.println("영상을 녹화합니다.");
    }
    public abstract void showMainFeature(); // 추상메소드 -> 이 클래스의 자식클래스에서 형식에맞게 구현해야함
}
