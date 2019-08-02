package application.bridge.after;

public class Mouse implements Driver {
    @Override
    public void manage() {
        System.out.println("Mouse is working");
    }
}
