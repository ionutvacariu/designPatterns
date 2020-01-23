package forms;

import java.util.concurrent.*;

public class Forms {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        CompletionService<Integer> refreshLocalisedCategorytTableService =
                new ExecutorCompletionService<>(Executors.newSingleThreadScheduledExecutor());

        refreshLocalisedCategorytTableService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                wait(11111);
                return 22;
            }
        });
        Integer insertedRecords = refreshLocalisedCategorytTableService.take().get();

        System.out.println(insertedRecords);


    }
}
