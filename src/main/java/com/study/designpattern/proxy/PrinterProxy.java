package com.study.designpattern.proxy;

public class PrinterProxy implements Printable {

    private String name;
    private Printer real; // 실제 객체를 참조하고 있음.

    public PrinterProxy(){}

    public PrinterProxy(String name){
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
