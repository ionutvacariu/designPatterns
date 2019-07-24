package application.javaRecap.threads;

public class Main {


    public static void main(String[] args) {


        Sender sender = new Sender();
        SyncThread st = new SyncThread(sender, "ms");
        SyncThread st2 = new SyncThread(sender, "ms2");
        st.start();
        st2.start();
    }


}
