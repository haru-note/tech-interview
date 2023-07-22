package net.harunote.java8.lambda.runnable;

public class RunnableInterfaceApp {
    public static void main(String[] args) {
        RunnableThread runnableThread = new RunnableThread();

        // 람다 표현식을 이용한 스레드 새성
        Thread thread1 = new Thread(() -> System.out.println("람다 표현식  " + Thread.currentThread().getName()));

        // 메서드 참조를 사용한 스레드 생성
        Thread thread2 = new Thread(runnableThread::run);

        thread1.start();
        thread2.start();
    }
}
