package net.harunote.pattern.decorator;

/**
 * @Author : CodeVillains
 * @Description :
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "디카프";
    }

    @Override
    public double cost() {
        return 1.2;
    }
}
