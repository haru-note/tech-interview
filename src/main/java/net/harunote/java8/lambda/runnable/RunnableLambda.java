package net.harunote.java8.lambda.runnable;

public class RunnableLambda {
    public static void main(String[] args) {
        Runnable runnable1 = () -> System.out.println("Lambda 표현식을 이용한 Runnable");
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스를 이용한 Runnable");
            }
        };

        processRunnable(runnable1);
        processRunnable(runnable2);
        processRunnable(() -> System.out.println("메서드에 직접 전달 Runnable"));

    }

    private static void processRunnable(Runnable runnable) {
        runnable.run();
    }
}