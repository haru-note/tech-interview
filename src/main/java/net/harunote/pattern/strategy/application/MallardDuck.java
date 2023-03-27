package net.harunote.pattern.strategy.application;

/**
 * @Author : yion
 * @Date : 2016. 9. 9.
 * @Description :
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("저는 물오리 입니다");
    }
}
