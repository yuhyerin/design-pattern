package com.study.designpattern.strategy.example2;

import java.util.List;

/**
 * 계산 모듈 (컨텍스트) v1
 * - 서로 다른 계산 정책들이 한 코드에 섞여 있어,
 * 정책이 추가될수록 코드 분석을 어렵게 만든다.
 * - 가격 정책이 추가될때마다 calculate 메서드를 수정하는 것이 점점 어려워진다.
 * 예를들어, 마지막 손님 50% 할인 정책이 추가될 경우
 * calculate 메서드에 마지막 손님을 구분하기 위한 lastGuest 파라미터가 추가되고
 * if 블록이 하나 더 추가되어야 한다.
 *
 * */
public class Calculator_v1 {

    public int  calculate(boolean firstGuest, List<Item> items){
        int sum = 0;
        for(Item item: items){
            if(firstGuest){
                sum += (int) (item.getPrice()*0.9); // 첫손님 10% 할인
            }else if(! item.isFresh){
                sum += (int) (item.getPrice()*0.8); // 덜 신선한것 20% 할인
            } else{
                sum+= item.getPrice();
            }
        }
        return sum;
    }
}
