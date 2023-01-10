package com.study.designpattern.strategy.example2;

import java.util.List;

/**
 * 계산 모듈 (컨텍스트) v2
 * - 할인 정책(전략)을 컨텍스트로부터 별도의 객체로 분리해낸다. => 전략 패턴
 *
 * */
public class Calculator_v2 {

    private DiscountStrategy discountStrategy; // 전략

    public Calculator_v2(DiscountStrategy discountStrategy){ // 생성자 주입을 통해 사용할 전략을 주입받음.
        this.discountStrategy = discountStrategy;
    }

    public int calculate(List<Item> items){
        int sum = 0;
        for(Item item : items){
            sum+= discountStrategy.getDiscountPrice(item);
        }
        return sum;
    }
}
