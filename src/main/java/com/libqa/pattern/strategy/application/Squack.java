package com.libqa.pattern.strategy.application;

import com.libqa.pattern.strategy.common.QuackBehavior;

/**
 * @Author : yion
 * @Date : 2016. 9. 9.
 * @Description :
 */
public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑 삑~");
    }
}
