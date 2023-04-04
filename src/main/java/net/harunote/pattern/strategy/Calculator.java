package net.harunote.pattern.strategy;

import java.util.function.BiFunction;

public class Calculator {
    private BiFunction<Integer, Integer, Integer> operation;

    public void setOperation(BiFunction<Integer, Integer, Integer> operation) {
        this.operation = operation;
    }

    public int calculate(int a, int b) {
        return operation.apply(a, b);
    }
}