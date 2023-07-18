package com.study.designpattern.strategy;

public class SecondStrategy implements BannerStrategy {
    @Override
    public void showBanner() {
        System.out.printf("2순위 배너 노출입니다...");
    }
}
