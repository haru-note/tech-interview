package com.libqa.pattern.factory.car;

/**
 * @Author : yion
 * @Date : 2016. 9. 17.
 * @Description :
 */
public class TestFactoryPattern {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
