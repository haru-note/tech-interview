package net.harunote.pattern.decorator;

/**
 * @Author : yion
 * @Date : 2016. 9. 10.
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
