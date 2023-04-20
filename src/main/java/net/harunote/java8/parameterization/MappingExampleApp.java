package net.harunote.java8.parameterization;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MappingExampleApp {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("green", "blue", "yellow", "red", "white");
        
        List<Integer> wordLengths = map(words, String::length);
        System.out.println(wordLengths);
    }
    // map 메서드를 구현할 때 Function 인터페이스를 파라미터로 받아서 Stream.map 메서드를 호출하고 있다.
    // 이를 통해 각 단어의 길이를 구하고, 이를 새로운 리스트에 담아 반환할 수 있다.
    public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
        return list.stream().map(mapper).collect(Collectors.toList());
    }
}