package net.harunote.pattern.factory.pizzastore;

/**
 * @Author : yion
 * @Date : 2016. 9. 11.
 * @Description :
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
