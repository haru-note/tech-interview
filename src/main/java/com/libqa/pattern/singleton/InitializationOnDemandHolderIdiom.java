package com.libqa.pattern.singleton;

/**
 * @Author : yion
 * @Date : 2016. 9. 17.
 * @Description : static inner class 를 이용하여 instance를 생성한다.
 *  jvm 의 class loader의 매커니즘과 class의 load 시점을 이용하여 내부 class를 생성시킴으로 thread 간의 동기화 문제를 해결한다.
 */
public class InitializationOnDemandHolderIdiom {
    private InitializationOnDemandHolderIdiom() {}

    private static class Singleton {
        private static final InitializationOnDemandHolderIdiom instance = new InitializationOnDemandHolderIdiom();
    }

    public static InitializationOnDemandHolderIdiom getInstance() {
        System.out.println("InitializationOnDemandHolderIdiom create instance");
        return Singleton.instance;
    }
}
