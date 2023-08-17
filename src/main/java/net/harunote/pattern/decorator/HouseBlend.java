package net.harunote.pattern.decorator;

/**
 * @Author : CodeVillains
 * @Description :
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "하우스 브렌드 커피";
    }

    @Override
    public double cost() {
        return .89;
    }

}
