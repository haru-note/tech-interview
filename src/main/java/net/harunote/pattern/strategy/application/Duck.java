package net.harunote.pattern.strategy.application;

import net.harunote.pattern.strategy.common.FlyBehavior;
import net.harunote.pattern.strategy.common.QuackBehavior;

/**
 * @Author : yion
 * @Date : 2016. 9. 9.
 * @Description : Head first 예제
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() { }

    public void setFlyBehavior(FlyBehavior fly) {
        flyBehavior = fly;
    }

    public void setQuackBehavior(QuackBehavior quack) {
        quackBehavior = quack;
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();  // 행동 클래스에 위임
    }

    public void performQuack() {
        quackBehavior.quack();  // 행동 클래스에 위임
    }

    public void swim() {
        System.out.println("Duck - 모든 오리는 뜬다");
    }

}
