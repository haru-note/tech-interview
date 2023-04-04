package net.harunote.pattern.strategy;

/**
 * @author CodeVillains
 */
public class Calculation {
    private CalculationStrategy strategy;

    public Calculation(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.calculate(num1, num2);
    }
}
