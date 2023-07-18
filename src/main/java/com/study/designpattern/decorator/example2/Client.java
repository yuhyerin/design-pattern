package com.study.designpattern.decorator.example2;

/**
 * EncryptionOut 의 write 메서드를 실행하면,
 * 1. EncryptionOut 의 write 메서드에서 데이터를 암호화 하고,
 * 2. FileOutImpl 객체의 write 메서드에 암호화된 데이터를 전달한다.
 * 즉, EncryptionOut 객체는 FileOutImpl 객체의 "파일 쓰기 기능"에 "암호화 기능"을 추가해 주는 역할을 수행한다.
 * 기존 기능에 새로운 기능을 추가해 준다는 의미에서 데코레이터라고 부른다.!
 *
 * 데코레이터 패턴 장점
 * 1. 조합하는 방식으로 기능 확장이 가능하다.
 * ex) 데이터를 먼저 압축한 후 -> 암호화 해서 -> 파일에 쓰고 싶다면??
 * 2. 각 확장기능들의 구현이 별도의 클래스로 분리되기 때문에,
 * 각 확장 기능 및 원래 기능이 서로 영향 없이 변경할 수 있도록 만들어준다.
 * ex) 암호화 알고리즘이 변경되더라도 -> 다른 데코레이터에 영향을 주지 않음.
 * 즉, 데코레이터 패턴은 단일 책임 원칙을 지킬 수 있도록 해준다. */
public class Client {

    public static void main(String[] args) {
//        FileOut delegate = new FileOutImpl();
//        FileOut fileOut = new EncryptionOut(delegate);
//        fileOut.write( "user1".getBytes() );

        // 데이터를 먼저 압축한 후 -> 암호화 해서 -> 파일에 쓰고 싶다면
        FileOut zip_encrypt_fileOut
                = new ZipOut(new EncryptionOut(new FileOutImpl()));
        zip_encrypt_fileOut.write("user1".getBytes());
    }
}
