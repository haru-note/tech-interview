package net.harunote.java8.lambda.runnable;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable 구현 " + Thread.currentThread().getName());
    }
}

