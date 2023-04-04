package net.harunote.pattern.factory.car;


public class SmallCar extends Car {
    SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building small car");
        // do something
    }
}
