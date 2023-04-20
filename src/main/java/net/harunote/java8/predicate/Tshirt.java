package net.harunote.java8.predicate;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author CodeVillains
 */
@Getter
@Setter
@ToString
public class Tshirt {
    private int price;
    private String color;

    public Tshirt(int price, String color) {
        this.price = price;
        this.color = color;
    }

}
