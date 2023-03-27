package net.harunote.pattern.command;

/**
 * @Author : yion
 * @Date : 2016. 9. 25.
 * @Description :
 */
public class BuyStock implements Command {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
