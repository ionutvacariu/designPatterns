package application.bridge.after;


/**
 * If we will create a mouse driver, we simply implement it, without modifying all operating systems concretes
 * <p>
 * PS: we should have a list of drivers :D:D
 */
public class Demo {

    public static void main(String[] args) {

        Driver sound = new Sound();
        OperatingSystem windowsOp = new Windows(sound);
        windowsOp.manage();


        Driver sound2 = new Sound();
        OperatingSystem unix = new Unix(sound2);
        unix.manage();

        Driver mouse = new Mouse();
        unix = new Unix(mouse);
        unix.manage();

    }
}
