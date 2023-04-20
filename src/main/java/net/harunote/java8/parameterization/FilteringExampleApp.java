package net.harunote.java8.parameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilteringExampleApp {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("green", "blue", "yellow", "red", "white");
        
        List<String> filteredWords = filter(words, s -> s.startsWith("b"));
        System.out.println(filteredWords);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}