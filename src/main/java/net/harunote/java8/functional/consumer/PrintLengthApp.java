package net.harunote.java8.functional.consumer;

import java.util.Arrays;
import java.util.List;

/**
 * @author CodeVillains
 */
public class PrintLengthApp {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("blue", "green", "white", "red", "yellow", "bluesky");
        PrintLength printLength = new PrintLength();
        colors.forEach(printLength);
    }
}
