package com.study.designpattern.strategy;

public class Context {
    private BannerStrategy strategy;

    public Context(BannerStrategy strategy){
        this.strategy = strategy;
    }

    public void showCutomerBanner(){
        strategy.showBanner();
    }
}
