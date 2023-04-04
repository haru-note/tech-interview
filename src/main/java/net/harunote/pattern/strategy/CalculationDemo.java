package net.harunote.pattern.strategy;

/**
 * @author CodeVillains
 */
public class CalculationDemo {
    public static void main(String[] args) {
        Calculation add = new Calculation(new AddOperation());
        System.out.println("8 + 4 = " + add.executeStrategy(8, 4));

        Calculation substract = new Calculation(new SubstractOperation());
        System.out.println("8 - 4 = " + substract.executeStrategy(8, 4));

        Calculation multiply = new Calculation(new MultiplyOperation());
        System.out.println("8 * 4 = " + multiply.executeStrategy(8, 4));

        Calculation divide = new Calculation(new DivideOperation());
        System.out.println("8 / 4 = " + divide.executeStrategy(8, 4));
    }
}
