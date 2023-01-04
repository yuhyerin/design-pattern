package com.study.designpattern.proxy.example2;

public class ProxyImage implements Image {

    private String path;
    private RealImage image; // 내부에 real 객체 참조.

    public ProxyImage(String path){
        this.path = path;
    }

    @Override
    public void draw() {
        if(image == null){
            image = new RealImage(path); //최초 접근 시 객체 생성
        }
        image.draw(); // real 객체에 위임
    }
}
