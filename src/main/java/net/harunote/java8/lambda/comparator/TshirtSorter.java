package net.harunote.java8.lambda.comparator;

import net.harunote.java8.functional.predicate.Tshirt;

import java.util.Arrays;
import java.util.Comparator;

public class TshirtSorter {
    public static void main(String[] args) {
        Tshirt[] tshirts = {new Tshirt(10000, "red"), new Tshirt(5000, "blue"), new Tshirt(8000, "green")};

        // 익명 클래스를 이용한 정렬
        Comparator<Tshirt> priceComparator = new Comparator<Tshirt>() {
            @Override
            public int compare(Tshirt o1, Tshirt o2) {
                return o1.getPrice() - o2.getPrice();
            }
        };


        Arrays.sort(tshirts, priceComparator);

        for (Tshirt tshirt : tshirts) {
            System.out.println(tshirt);
        }
    }
}
