package com.study.designpattern.decorator.example2;

public class ZipOut extends Decorator {

    public ZipOut(FileOut delegate){
        super(delegate);
    }

    @Override
    public void write(byte[] data) {
        byte[] zippedData = zip(data);
        super.doDelegate(zippedData);
    }

    private byte[] zip(byte[] data){
        // ... 압축 한다...
        System.out.println("데이터 압축 중입니다...");
        return null;
    }
}
