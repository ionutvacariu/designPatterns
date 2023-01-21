package designpatterns;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);


        List<Integer> l = Arrays.asList(1,2,3,4,56,7,88,88,99);
//  cu stream
        l.stream().filter(integer -> integer > 10).forEach(i  -> System.out.println(i));

//for clasic
        for(int i = 0 ; i < l.size(); i++){
            if(l.get(i) > 10){
                System.out.println(l.get(i));
            }
        }

      /*  for (int i = 0; i < 5; i++) {

            final int j = i;
            executor.execute((() -> {

                try {

                    int milis = j * 1000;
                    System.out.println(Calendar.getInstance().getTime() + " " + Thread.currentThread().getId() +
                            " waiting " + TimeUnit.MILLISECONDS.toSeconds(milis));
                    Thread.sleep(milis);
                    System.out.println("WAI CE FACI");
                    System.out.println(Calendar.getInstance().getTime() + " " + Thread.currentThread().getId());

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }));
        }

        executor.shutdown();

        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        System.out.println("am ternat blea");*/


    }
}
