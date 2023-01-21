package designpatterns.bridge.after;

public class Unix extends OperatingSystem {
    public Unix(Driver driver) {
        super(driver);
    }

    @Override
    public void manage() {
        System.out.print("Unix ");
        super.manage();
    }
}
