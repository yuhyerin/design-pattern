package com.study.designpattern.decorator;

public class HyerinCustomBorder extends Border {

    public HyerinCustomBorder(Display display){
        super(display);
    }
    @Override
    public int getColumns() {
        // 문자수는 내용마지막에 웃는얼굴(4자)를 더한 수
        return display.getColumns()+4;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return display.getRowText(row) + "*^^*";
    }
}
