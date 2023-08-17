package net.harunote.pattern.factory.pizzastore;

/**
 * @Author : CodeVillains
 * @Description :
 */
public class PizzaStoreTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("first ordered " + pizza.getName() + " from ny store\n");

        Pizza pizza1 = chicagoStore.orderPizza("cheese");
        System.out.println("second ordered " + pizza1.getName() + " from chicago store");
    }
}
