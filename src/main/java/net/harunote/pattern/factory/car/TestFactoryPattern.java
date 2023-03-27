package net.harunote.pattern.factory.car;

public class TestFactoryPattern {

    public static void main(String[] args) {
        // Car car1 = CarFactory.buildCar(CarType.SMALL);
        // Car car2 = CarFactory.buildCar(CarType.SEDAN);
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
