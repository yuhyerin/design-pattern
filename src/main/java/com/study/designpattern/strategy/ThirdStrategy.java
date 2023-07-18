package com.study.designpattern.strategy;

public class ThirdStrategy implements BannerStrategy {
    @Override
    public void showBanner() {
        System.out.printf("3순위 배너 노출입니다...");
    }
}
