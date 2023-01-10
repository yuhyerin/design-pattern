package com.study.designpattern.strategy.example2;

public class NonFreshItemDiscountStrategy implements DiscountStrategy {
    @Override
    public int getDiscountPrice(Item item) {
        return (int)(item.getPrice()*0.8);
    }
}
