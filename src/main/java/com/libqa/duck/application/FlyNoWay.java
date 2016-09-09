package com.libqa.duck.application;

import com.libqa.duck.common.FlyBehavior;

/**
 * @Author : yion
 * @Date : 2016. 9. 9.
 * @Description :
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("못 날아요!");
    }
}
