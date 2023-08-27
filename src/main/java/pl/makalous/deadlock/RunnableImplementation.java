package pl.makalous.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableImplementation implements Runnable {
    private String name;
    private Long id;

    public RunnableImplementation(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void run() {
        // Do some logic with id and name
        System.out.println("Running in thread: " + Thread.currentThread().getName());
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public void doSomethingFunny() {
        // Create an ExecutorService (thread pool) with two threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit tasks to the executor
        executor.submit(new RunnableImplementation("Something1", 1L));
        executor.submit(new RunnableImplementation("Something2", 2L));

        // Shutdown the executor when done
        executor.shutdown();
    }

    public static void main(String[] args) {
        RunnableImplementation runnable = new RunnableImplementation("Main", 0L);
        runnable.doSomethingFunny();
    }
}

