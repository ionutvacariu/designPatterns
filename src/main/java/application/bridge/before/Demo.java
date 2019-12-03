package application.bridge.before;

/**
 * Imagine if you want to add a new driver, for webcam for example. You have to add new Windows, Unix driver concrete classes :)
 */
public class Demo {
    public static void main(String[] args) {
        Sound sound = new WindowsSound();
        sound.manage();

        Sound sound1 = new UnixSound();
        sound1.manage();
    }

}
