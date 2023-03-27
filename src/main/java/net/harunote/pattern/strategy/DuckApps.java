package net.harunote.pattern.strategy;

import net.harunote.pattern.strategy.application.Duck;
import net.harunote.pattern.strategy.application.FlyRocketPowered;
import net.harunote.pattern.strategy.application.MallardDuck;
import net.harunote.pattern.strategy.application.ModelDuck;

/**
 * @Author : yion
 * @Date : 2016. 9. 9.
 * @Description : intro - 상속보다는 구성(composition)을 활용한다
 * Strategy pattern : 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있다
 * (클라이언트와는 독립적으로 알고리즘을 변경할 수 있다)
 */
public class DuckApps {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
