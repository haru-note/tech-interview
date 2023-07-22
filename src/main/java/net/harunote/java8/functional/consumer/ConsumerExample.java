package net.harunote.java8.functional.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("blue", "green", "white", "red", "yellow", "bluesky");

        // Consumer 인터페이스를 구현한 람다식
        Consumer<String> printLength = (color) -> System.out.println(color.length());

        colors.forEach(printLength);
    }
}
