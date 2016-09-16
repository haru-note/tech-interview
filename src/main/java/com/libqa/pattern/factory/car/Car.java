package com.libqa.pattern.factory.car;

/**
 * @Author : yion
 * @Date : 2016. 9. 17.
 * @Description :
 */
public abstract class Car {
    private CarType model;
    public Car(CarType model) {
        this.model = model;
        arrangePart();
    }

    protected void arrangePart() {
        // Do one time processing here

    }

    // Do subclass level processing in this method
    protected abstract void construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
