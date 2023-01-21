package designpatterns.bridge.before;

public class UnixVideo extends Video {
    @Override
    public void manage() {
        System.out.println("Unix video working");
    }
}
