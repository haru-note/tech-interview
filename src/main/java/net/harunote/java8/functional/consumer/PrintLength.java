package net.harunote.java8.functional.consumer;

import java.util.function.Consumer;

class PrintLength implements Consumer<String> {
    public void accept(String color) {
        System.out.println(color.length());
    }
}