package com.study.designpattern.decorator;

/**
 * 장식 테두리를 나타내는 추상클래스
 * */
public abstract class Border implements Display {

    protected Display display; // 위임 대상을 내부 필드에 지닌다.

    protected Border(Display display){
        this.display = display;
    }
}
