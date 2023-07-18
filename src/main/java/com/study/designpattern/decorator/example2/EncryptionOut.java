package com.study.designpattern.decorator.example2;

/**
 * 데코레이터 추상클래스를 상속받는 이 클래스는
 * 자신의 기능을 수행한 뒤, 상위 클래스의 doDelegate() 메서드를 호출해서
 * 파일쓰기를 위임하도록 구현한다.
 *
 * - write 메서드는 파일에 쓸 데이터를 암호화 한 뒤에,
 * doDelegate 메서드를 이용해 암호화된 데이터를 전달한다. */
public class EncryptionOut extends Decorator {

    public EncryptionOut(FileOut delegate){
        super(delegate);
    }

    @Override
    public void write(byte[] data) {
        byte[] encryptedData = encrypt(data);
        super.doDelegate(encryptedData);
    }

    private byte[] encrypt(byte[] data){
        // ...
        System.out.println("데이터 암호화 중입니다...");
        return null;
    }
}
