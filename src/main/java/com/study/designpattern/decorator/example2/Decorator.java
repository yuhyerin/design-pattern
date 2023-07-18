package com.study.designpattern.decorator.example2;

/**
 * 데코레이터 추상클래스. (추상클래스로 선언 안하면 write 구현안했다고 컴파일에러)
 *
 * - 기능 확장을 위해 FileOutImpl 클래스를 상속받지 않고,
 * Decorator 라는 별도의 추상클래스를 만든다.
 * - Decorator 추상 클래스는 모든 데코레이터를 위한 기반 기능을 제공한다.
 * - 이 클래스의 doDelegate 메소드는 생성자를 통해 전달받은 FileOut 객체에게 쓰기 기능을 위임한다.
 *
 * */
public abstract class Decorator implements FileOut {

    private FileOut delegate; // 내부에 위임 대상을 갖는다.

    public Decorator(FileOut delegate){
        this.delegate = delegate;
    }

    protected void doDelegate(byte[] data) {
        delegate.write(data); // 쓰기 행위를 위임한다.
    }

}
