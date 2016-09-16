package com.libqa.pattern.decorator;

/**
 * @Author : yion
 * @Date : 2016. 9. 10.
 * @Description : 객체에 추가 요소를 동적으로 더할 수 있다. 상속을 통해 확장하면 유연성이 떨어진다
 */
public class StarBuzzApps {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("기본 에스프레소 = " + beverage.getDescription() + " : " + beverage.cost());

        Beverage beverage1 = new DarkRoast();

        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println("다크로스트에 모카 추가, 휘핑 추가 = " + beverage1.getDescription() + " : " + beverage1.cost());


        Beverage beverage2 = new HouseBlend();

        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println("하우스에 모카 추가, 두유 추가, 휘핑 추가 = " + beverage2.getDescription() + " : " + beverage2.cost());
    }


}

