package net.harunote.java8.parameterization;

public class ExecutionExampleApp {

    public static void main(String[] args) {
        run(() -> System.out.println("Hello, world!"));
    }

    public static void run(Runnable runnable) {
        runnable.run();
    }

    // Thread thread = new Thread(() -> System.out.println("Hello, world!"));
    //        thread.start();
}