package com.study.designpattern.templatemethod;

// 하위 타입에서 특정 단계만 구현할 수 있다.
public class DbAuthenticator extends Authenticator {
    @Override
    protected boolean doAuthenticate(String id, String pw) {
        return false;
    }

    @Override
    protected Auth createAuth(String id) {
        return null;
    }
}
