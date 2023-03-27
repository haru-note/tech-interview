package net.harunote.pattern.strategy.application;

import net.harunote.pattern.strategy.common.QuackBehavior;

/**
 * @Author : yion
 * @Date : 2016. 9. 9.
 * @Description :
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<조용>>");
    }
}
