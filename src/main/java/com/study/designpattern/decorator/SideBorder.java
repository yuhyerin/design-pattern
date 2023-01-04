package com.study.designpattern.decorator;

/**
 * 좌우에 장식 테두리를 붙이는 클래스
 * */
public class SideBorder extends Border {

    public SideBorder(Display display){
        super(display);
    }
    @Override
    public int getColumns() {
        // 문자수는 내용의 양측에 장식한 문자를 더한 수
        return 1+display.getColumns()+1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return "*" + display.getRowText(row) + "*";
    }
}
