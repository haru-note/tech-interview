package com.libqa.pattern.command;

/**
 * @Author : yion
 * @Date : 2016. 9. 25.
 * @Description :
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [Name : " + name + " Quantity : " + quantity + "] bought");
    }

    public void sell() {
        System.out.println("Stock [Name : " + name + " Quantity : " + quantity + "] sold");
    }
}
