package com.libqa.pattern.decorator;

/**
 * @Author : yion
 * @Date : 2016. 9. 10.
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
