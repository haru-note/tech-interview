package net.harunote.pattern.decorator;

/**
 * @Author : CodeVillains
 * @Description :
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유 ";
    }

    @Override
    public double cost() {
        return .70 + beverage.cost();
    }

}
