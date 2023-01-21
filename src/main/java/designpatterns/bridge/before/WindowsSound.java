package designpatterns.bridge.before;

public class WindowsSound extends Sound {

    @Override
    public void manage() {
        System.out.println("Windows sound driver working");
    }
}
