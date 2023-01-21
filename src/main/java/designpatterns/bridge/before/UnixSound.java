package designpatterns.bridge.before;

public class UnixSound extends Sound {
    @Override
    public void manage() {
        System.out.println("Unix sound driver working");
    }
}
