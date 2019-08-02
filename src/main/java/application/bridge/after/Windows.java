package application.bridge.after;

public class Windows extends OperatingSystem {
    public Windows(Driver driver) {
        super(driver);
    }

    @Override
    public void manage() {
        System.out.print("Windows ");
        super.manage();
    }
}
