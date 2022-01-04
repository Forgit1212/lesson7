package org.example.metod;

import java.util.concurrent.*;

public class ExecutorApp {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        Future<String> stringFuture = service.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Java";
            }
        });
        try {
            String result = stringFuture.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}
