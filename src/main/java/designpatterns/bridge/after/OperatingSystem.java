package designpatterns.bridge.after;

public abstract class OperatingSystem {
    private Driver driver;

    public OperatingSystem(Driver driver) {
        this.driver = driver;
    }

    public void manage() {
        driver.manage();
    }

}
