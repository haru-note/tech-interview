package com.libqa.pattern.factory.pizzastore;

import java.util.ArrayList;

/**
 * @Author : yion
 * @Date : 2016. 9. 11.
 * @Description : 팩토리 패턴 - 객체 생성하는 부분을 서브 클래스에게 위임
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... " );
        System.out.println("adding sauce... " );
        System.out.println("adding toppings... " );

        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }



}
