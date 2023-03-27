package net.harunote.pattern.decorator;

/**
 * @Author : yion
 * @Date : 2016. 9. 10.
 * @Description :
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";

    }

    @Override
    public double cost() {
        return .50 + beverage.cost();
    }
}
