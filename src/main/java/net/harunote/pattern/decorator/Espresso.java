package net.harunote.pattern.decorator;

/**
 * @Author : yion
 * @Date : 2016. 9. 10.
 * @Description :
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }


}
