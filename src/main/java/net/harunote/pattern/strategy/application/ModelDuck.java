package net.harunote.pattern.strategy.application;

/**
 * @Author : yion
 * @Date : 2016. 9. 9.
 * @Description :
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("모형 오리입니다");
    }
}
