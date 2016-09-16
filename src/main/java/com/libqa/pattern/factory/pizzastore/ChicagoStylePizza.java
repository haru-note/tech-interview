package com.libqa.pattern.factory.pizzastore;

/**
 * @Author : yion
 * @Date : 2016. 9. 11.
 * @Description :
 */
public class ChicagoStylePizza extends Pizza {
    public ChicagoStylePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
