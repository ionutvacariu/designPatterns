package application.javaRecap.threads;

public class SyncThread extends Thread {

    private Sender sender;


    private String msg;

    public SyncThread(Sender sender, String msg) {
        this.sender = sender;
        this.msg = msg;
    }

    public void run() {
        synchronized (sender) {
            sender.send(msg);
        }

    }


}
