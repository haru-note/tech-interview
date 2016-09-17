package com.libqa.pattern.singleton;

/**
 * @Author : yion
 * @Date : 2016. 9. 17.
 * @Description : Eager initialization - 정적초기화 구문을 통해서 JVM이 클래스 로딩 타이밍에 인스턴스를 생성하도록 한다.
 * 이미 인스턴스를 생성 했기 때문에 리턴만 해주면 된다. 단, 사용하지 않는다면 이것도 낭비다
 */
public class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();

    // private constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
