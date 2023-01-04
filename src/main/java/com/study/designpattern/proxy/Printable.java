package com.study.designpattern.proxy;

/**
 * Printer , PrinterProxy 공통 인터페이스
 * */
public interface Printable {
    // 이름 설정
    void setPrinterName(String name);

    // 이름 반환
    String getPrinterName();

    // 문자열 표시
    void print(String string);
}
