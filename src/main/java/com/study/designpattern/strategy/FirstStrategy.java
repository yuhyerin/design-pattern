package com.study.designpattern.strategy;

public class FirstStrategy implements BannerStrategy {
    @Override
    public void showBanner() {
        System.out.printf("1순위 배너 노출입니다...");
    }
}
