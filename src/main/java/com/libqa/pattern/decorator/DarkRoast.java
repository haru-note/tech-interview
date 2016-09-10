package com.libqa.pattern.decorator;

/**
 * @Author : yion
 * @Date : 2016. 9. 10.
 * @Description :
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "다크로스트";
    }

    @Override
    public double cost() {
        return 2.8;
    }
}
