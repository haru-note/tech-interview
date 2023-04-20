package net.harunote.java8.parameterization;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author CodeVillains
 */
public class EvenNumberPredicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> evenNumber = n -> n % 2 == 0;
        List<Integer> filteredNumbers = numbers.stream()
                .filter(evenNumber)
                .collect(Collectors.toList());

        System.out.println(filteredNumbers); // 2, 4, 6, 8, 10
        System.out.println(evenNumber.test(4)); // true
        System.out.println(evenNumber.test(5)); // false
    }
}
