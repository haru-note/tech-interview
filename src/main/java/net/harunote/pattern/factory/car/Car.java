package net.harunote.pattern.factory.car;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Car {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private CarType model;

    public Car(CarType model) {
        this.model = model;
        arrangePart();
    }

    protected void arrangePart() {
        // Do one time processing here
        logger.info("Do one time processing here");
    }

    // Do subclass level processing in this method
    protected abstract void construct();

}
