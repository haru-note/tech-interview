package net.harunote.pattern.decorator;

/**
 * @Author : yion
 * @Date : 2016. 9. 10.
 * @Description :
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

}
