package com.study.designpattern.proxy;

public class Main {
    public static void main(String[] args) {
        // 프록시 객체를 생성.. (heavyJob을 실제 사용할때까지 지연시킴)
        Printable p = new PrinterProxy("Alice");
        System.out.println("현재 이름은 " + p.getPrinterName() + " 입니다.");
        p.setPrinterName("Bob");
        System.out.println("현재 이름은 " + p.getPrinterName() + " 입니다.");

        // 내부적으로 real 객체의 print 를 호출할 때, heavyJob(객체 생성)을 수행함.
        p.print("Hello, world.");
    }
}
