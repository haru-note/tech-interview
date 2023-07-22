package net.harunote.java8.parameterization;

import java.util.Arrays;
import java.util.Comparator;

public class SortingExampleApp {

    public static void main(String[] args) {
        Integer[] numbers = {10, 9, 2, 5, 7, 6};

        // 오름차순 정렬
        sort(numbers, (a, b) -> a.compareTo(b));
        System.out.println(Arrays.toString(numbers));

        // 내림차순 정렬
        sort(numbers, (a, b) -> b.compareTo(a));
        System.out.println(Arrays.toString(numbers));
    }

    public static <T> void sort(T[] array, Comparator<T> comparator) {
        Arrays.sort(array, comparator);
    }
}