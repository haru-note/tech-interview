package net.harunote.java8.functional.function;

import java.util.function.Function;

public class StringLengthExample {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();

        String str = "Hello, World!";
        int length = stringLength.apply(str);

        System.out.println("\""+str + "\" 문자의 길이는 " + length + " 입니다.");
    }
}