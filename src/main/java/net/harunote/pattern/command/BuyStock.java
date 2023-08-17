package net.harunote.pattern.command;

/**
 * @Author : CodeVillains
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
