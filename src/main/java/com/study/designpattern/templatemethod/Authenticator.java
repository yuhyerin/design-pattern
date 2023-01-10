package com.study.designpattern.templatemethod;
/**
 * 상위 클래스는 실행과정을 구현한 메서드(템플릿 메서드)를 제공한다.
 * 일부 단계는 추상 메서드를 호출하는 방식으로 구현된다.
 *
 * 템플릿 메서드 패턴을 사용하면
 * 1. 동일한 실행 과정의 구현을 제공하면서, 동시에 하위 타입에서 일부 단계를 구현하도록 할 수 있다.
 * -> 각 타입에서 코드가 중복되는 것을 방지한다.
 * 2. 코드 중복 문제를 제거하면서 동시에 코드를 재사용할 수 있게 된다.
 *
 * 템플릿 메서드 패턴 특징
 * 1. 상위 클래스에서 흐름 제어를 한다.
 * -> 일반적인 경우엔 하위 타입이 상위 타입의 기능을 재사용할지 여부를 결정하기 때문에 흐름 제어를 하위타입이 하는데... 다르다!
 * -> 상위 타입의 템플릿 메서드가 모든 실행 흐름을 제어하고, 하위 타입의 메서드는 템플릿 메서드에서 호출되는 구조를 갖게된다.
 * 2. 템플릿 메서드는 외부에 제공하는 기능이기 때문에 -> public
 * 하위 클래스에서 구현하는 메서드는 템플릿 메서드에서 호출되는 메서드로서 protected 범위를 가진다.
 * */
public abstract class Authenticator {
    // 템플릿 메서드
    public Auth authenticate(String id, String pw){
        if(!doAuthenticate(id, pw)){
            throw createException();
        }
        return createAuth(id);
    }

    // 추상클래스로 선언하여 하위클래스에서 구현하도록 강제할 수 있다.
    // doAuthenticate : 인증여부를 확인하는 단계
    protected abstract boolean doAuthenticate(String id, String pw);

    // createAuth : Auth 객체를 생성하는 단계
    protected abstract Auth createAuth(String id);

    private RuntimeException createException(){
        throw new AuthException();
    }
}
