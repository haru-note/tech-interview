package net.harunote.pattern.strategy;

/**
 * @author CodeVillains
 */
public class AddOperation implements CalculationStrategy{
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
