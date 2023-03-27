package net.harunote.pattern.strategy.application;

import net.harunote.pattern.strategy.common.FlyBehavior;

/**
 * @Author : yion
 * @Date : 2016. 9. 9.
 * @Description :
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("로켓 엔진으로 날아갑니다.");
    }
}
