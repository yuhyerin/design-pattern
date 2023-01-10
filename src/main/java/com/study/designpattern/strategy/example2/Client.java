package com.study.designpattern.strategy.example2;

import java.util.List;
/**
 * 컨텍스트를 사용하는 클라이언트가
 * 전략 컨크리트 클래스에 대한 의존이 발생한다.
 * (= 컨텍스트의 클라이언트가 전략의 상세 구현을 알게 된다.)
 * -> 문제처럼 보일 순 있으나,
 * 여기서는 전략의 컨크리트 클래스와, 클라이언트 코드가 쌍을 이루기 때문에 유지보수 문제가 발생할 가능성이 줄어든다.
 * 클라이언트의 버튼 처리 코드에서 전략 객체를 직접 생성하는 것은
 * 오히려 코드 이해를 높이고, 코드 응집도를 높여주는 효과를 갖는다!
 *
 * 전략패턴의 이점
 * 1. 컨텍스트 코드의 변경 없이, 새로운 전략을 추가할 수 있다.
 * 2. 컨텍스트 코드는 할인 정책 확장에는 열려 있고, 변경에는 닫혀있게 된다. (OCP 원칙을 따르는 구조를 갖게 된다.)
 *
 * */
public class Client {

    private DiscountStrategy strategy;


    public void onFirstGuestButtonClick() {
        // 첫 손님 할인 버튼 클릭 시 생성
        strategy = new FirstGuestDiscountStrategy();
    }

    public void onLastGuestButtonClick(){
        // 마지막 손님 할인 버튼 클릭 시 생성
        strategy = new LastGuestDiscountStrategy();
    }

    public void onNonFreshItemButtonClick(){
        // 신선하지 않은 과일 할인 버튼 클릭 시 생성
        strategy = new NonFreshItemDiscountStrategy();
    }

    public void onCalculationButtonClick(){
        // 계산 버튼 누를 때 실행 됨
        Calculator_v2 cal = new Calculator_v2(strategy);
        List<Item> items = List.of(new Item());
        int price = cal.calculate(items);
    }
}
