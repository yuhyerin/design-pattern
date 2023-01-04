package com.study.designpattern.proxy.example2;

import java.util.List;

public class ListUI {
    private List<Image> images;

    public ListUI(List<Image> images){
        this.images = images;
    }

    public void onScroll(int start, int end){
        // 스크롤 시, 화면에 표시되는 이미지를 표시.
        for(int i=start; i<=end; i++){
            Image image = images.get(i); // draw 메서드가 호출되기 전에는 RealImage 객체가 생성되지 않아 메모리에 이미지를 로딩하지 않는다.
            image.draw();
        }
    }
}
