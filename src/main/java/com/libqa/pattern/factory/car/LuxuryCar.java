package com.libqa.pattern.factory.car;

/**
 * @Author : yion
 * @Date : 2016. 9. 17.
 * @Description :
 */
public class LuxuryCar extends Car {
    LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury Car");
        // add accessories
    }
}
