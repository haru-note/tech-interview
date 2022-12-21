package com.libqa.pattern.factory.car;

public abstract class Car {
    private CarType model;

    public Car(CarType model) {
        this.model = model;
        arrangePart();
    }

    protected void arrangePart() {
        // Do one time processing here
        System.out.println("Do one time processing here");
    }

    // Do subclass level processing in this method
    protected abstract void construct();

}
