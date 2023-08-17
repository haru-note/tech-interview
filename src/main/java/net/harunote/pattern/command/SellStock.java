package net.harunote.pattern.command;

/**
 * @Author : CodeVillains
 * @Description :
 */
public class SellStock implements Command {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
