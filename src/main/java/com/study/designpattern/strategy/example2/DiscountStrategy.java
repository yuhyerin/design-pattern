package com.study.designpattern.strategy.example2;
/**
 * 할인 정책 인터페이스 (=전략)
 * - 상품의 할인 금액 계산을 추상화 하였다.
 * - 콘크리트 클래스에서 상황에 맞는 할인 계산 알고리즘을 제공한다.
 * */
public interface DiscountStrategy {
    int getDiscountPrice(Item item); // 상품 별 할인 정책
//    int getDiscountPrice(int totalPrice); // 전체 금액 할인을 위한 메서드 -> 별도의 인터페이스로 분리해도 ok
}
