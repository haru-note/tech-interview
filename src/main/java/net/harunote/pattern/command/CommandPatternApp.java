package net.harunote.pattern.command;

/**
 * @Author : yion
 * @Date : 2016. 9. 25.
 * @Description : Command Pattern - 요청을 하는 객체와 그 요청을 수행하는 객체를 분리하여 메소드 호출을 캡슐화 한다
 */
public class CommandPatternApp {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();

        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();

    }
}
