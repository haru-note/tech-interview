package net.harunote.java8.functional.predicate;


import lombok.Getter;
import lombok.ToString;

/**
 * @author CodeVillains
 */
@Getter
@ToString
public class Tshirt {
    private int price;
    private String color;

    public Tshirt(int price, String color) {
        this.price = price;
        this.color = color;
    }

}
