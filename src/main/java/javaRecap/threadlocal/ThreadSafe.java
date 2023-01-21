package javaRecap.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadSafeDemo {

    public static ThreadLocal<SimpleDateFormat> df = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyy-MM-dd"));
}


public class ThreadSafe {
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            final int id = i;
            executorService.submit(() -> {
                new Serv().birthDate(id);
            });
        }

    }


}

class Serv {

    public String birthDate(int u) {

        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");

        Date b = new Date(u);
        //final SimpleDateFormat df = ThreadSafeDemo.df.get();


        System.out.println(Thread.currentThread().toString() +  df);
        return df.format(b);
    }
}

