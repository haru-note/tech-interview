package com.libqa.pattern.factory.pizzastore;

/**
 * @Author : yion
 * @Date : 2016. 9. 11.
 * @Description :
 */
public class NyStyleCheesePizza extends Pizza {
    public NyStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
