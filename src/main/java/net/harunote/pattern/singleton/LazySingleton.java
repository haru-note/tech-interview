package net.harunote.pattern.singleton;

/**
 * @Author : CodeVillains
 * @Description : 요청이 있을 때에 생성되는 인스턴스. 즉 사용되는 시점에 인스턴스를 생성한다.
 */
public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance(){
        if (instance == null) {
            // 동시에 두개의 스레드가 instance == null 에 접근할 경우 두개의 인스턴스가 생성될 수 도 있다
            // See LazySingletonDoubleCheckLocking
            synchronized (LazySingleton.class) {
                instance = new LazySingleton();
            }
        }

        return instance;
    }
}
