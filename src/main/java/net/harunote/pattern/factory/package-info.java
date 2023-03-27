/**
 * @Author : yion
 * @Date : 2016. 9. 17.
 * @Description : 팩토리 패턴
 * - Object 생성시 new 를 사용하여 생성할 경우 Concrete class 를 의존하여 코딩하기 때문에 결합도가 매우 높다. (수정시 의존도가 높고 유연성이 떨어짐)
 * - Factorty Pattern을 통해 실제 사용하는 곳에서 Concrete class를 정하지 않고 Factory 를 사용하여 의존성을 받도록 하여 Concrete class를
 * 전혀 의존하지 않도록 한다 (DIP : Depencency Inversion Priciple)
 */
package net.harunote.pattern.factory;