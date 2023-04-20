package net.harunote.java8.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author CodeVillains
 */
public class TshirtPredicateApp {
    public static void main(String[] args) {
        List<Tshirt> myShirtList = Arrays.asList(new Tshirt(100, "yellow"),
                new Tshirt(200, "green"),
                new Tshirt(300, "blue"),
                new Tshirt(400, "red"),
                new Tshirt(500, "white"));

        List<Tshirt> priceFilter = filter(myShirtList, new TshirtPricePredicate());
        List<Tshirt> colorFilter = filter(myShirtList, new TshirtColorPredicate());

        System.out.println("price filter = " + priceFilter);
        System.out.println("color filter = " + colorFilter);
    }

    private static List<Tshirt> filter(List<Tshirt> myShirtList, TshirtPredicate predicate) {
        List<Tshirt> list = new ArrayList<>();
        for (Tshirt tshirt : myShirtList) {
            if (predicate.test(tshirt)) {
                list.add(tshirt);
            }
        }
        return list;
    }
}
