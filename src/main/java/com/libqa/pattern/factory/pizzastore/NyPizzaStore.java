package com.libqa.pattern.factory.pizzastore;

/**
 * @Author : yion
 * @Date : 2016. 9. 11.
 * @Description :
 */
public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NyStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NyStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NyStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NyStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
