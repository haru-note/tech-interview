package net.harunote.pattern.factory.legacy;

public class Car {
    public static final String SMALL_CAR = "small";
    public static final String SEDAN_CAR = "sedan";
    public static final String LUXURY_CAR = "luxury";

    private String productName;

    public Car(String name) {
        this.productName = name;
    }

    @Override
    public String toString() {
        return "Car productName = '" + productName + '\'';
    }
}
