package com.study.designpattern.decorator;

/**
 * 캐릭터 라인 표시용 인터페이스
 * (Display 추상클래스 or 인터페이스 -> 동일한 구조)
 * */
public interface Display {
    // 열의 문자수 반환
    int getColumns();

    // 행 수 반환
    int getRows();

    // 지정된 행의 문자열 반환
    String getRowText(int row);

    default void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }

}
