package com.libqa.duck.application;

import com.libqa.duck.common.FlyBehavior;

/**
 * @Author : yion
 * @Date : 2016. 9. 9.
 * @Description :
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날고 있음!");
    }
}
