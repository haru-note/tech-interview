package com.libqa.pattern.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "다크로스트";
    }

    @Override
    public double cost() {
        return 2.8;
    }
}
