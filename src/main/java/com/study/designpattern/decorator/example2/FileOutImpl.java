package com.study.designpattern.decorator.example2;

// 실제 파일출력기능 구현체는 여기!
public class FileOutImpl implements FileOut {

    @Override
    public void write(byte[] data) {
        System.out.println("데이터를 파일에 쓰는 중입니다...");
    }
}
