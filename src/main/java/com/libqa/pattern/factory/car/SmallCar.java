package com.libqa.pattern.factory.car;

/**
 * @Author : yion
 * @Date : 2016. 9. 17.
 * @Description :
 */
public class SmallCar extends Car {

    SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building small car");
        // add accessories
    }
}
