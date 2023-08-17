package net.harunote.pattern.factory.legacy;

/**
 * @author CodeVillains
 * @version 2022/12/20
 * @implNote
 */
public class CarTest {

    public static void main(String[] args) {
        CarTest carTest = new CarTest();

        Car car = carTest.createCar("SEDAN");

        System.out.println(car.toString());
    }

    private Car createCar(String carName) {
        Car car;

        if (carName.equalsIgnoreCase(Car.SEDAN_CAR)) {
            car = new Car(Car.SEDAN_CAR);
        } else if (carName.equalsIgnoreCase(Car.SMALL_CAR)) {
            car = new Car(Car.SMALL_CAR);
        }  else if (carName.equalsIgnoreCase(Car.LUXURY_CAR)) {
            car = new Car(Car.LUXURY_CAR);
        } else {
            car = new Car("");
        }
        return car;
    }
}
