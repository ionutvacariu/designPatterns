package application.javaRecap.threads;

public class Sender {

    public void send(String msg) {

        System.out.println("\n" + msg + " Sent in progress");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
        System.out.println("\n" + msg + " Sent");

    }

}
