package net.harunote.pattern.singleton;

/**
 * @Author : yion
 * @Date : 2016. 9. 17.
 * @Description :
 */
public class LazySingletonDoubleCheckLocking {
    private static volatile LazySingletonDoubleCheckLocking instance = null;

    private LazySingletonDoubleCheckLocking(){

    }

    public static LazySingletonDoubleCheckLocking getInstance() {
        if (instance == null) {
            synchronized (LazySingletonDoubleCheckLocking.class) {
                // Double check locking
                if (instance == null) {
                    instance = new LazySingletonDoubleCheckLocking();
                }
            }
        }

        return instance;

    }
}
