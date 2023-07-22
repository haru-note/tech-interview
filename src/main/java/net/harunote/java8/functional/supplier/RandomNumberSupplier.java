package net.harunote.java8.functional.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberSupplier {
    public static void main(String[] args) {
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(11);

        int randomNumber1 = randomNumberSupplier.get();
        int randomNumber2 = randomNumberSupplier.get();

        System.out.println("Random number 1: " + randomNumber1);
        System.out.println("Random number 2: " + randomNumber2);
    }
}