package designpatterns.bridge.after;

public class Sound implements Driver {
    @Override
    public void manage() {
        System.out.println("Sound is working");
    }
}
