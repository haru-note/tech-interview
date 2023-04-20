package net.harunote.java8.parameterization;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CombinationExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("green", "blue", "yellow", "red", "white");
        
        Predicate<String> startsWithB = s -> s.startsWith("b");
        Function<String, Integer> lengthMapper = String::length;
        
        List<Integer> filteredWordLengths = words.stream()
                .filter(startsWithB)
                .map(lengthMapper)
                .collect(Collectors.toList());
        System.out.println(filteredWordLengths);
    }
}