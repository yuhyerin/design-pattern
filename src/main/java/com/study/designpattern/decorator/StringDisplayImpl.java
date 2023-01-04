package com.study.designpattern.decorator;

/**
 * 1행으로만 이루어진 캐릭터의 라인 표시용 클래스
 * */
public class StringDisplayImpl implements Display {

    private String string;

    public StringDisplayImpl(String string){
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        return (row==0)? string : null;
    }
}
