package com.study.designpattern.templatemethod;

import javax.naming.NamingException;
import javax.naming.ldap.LdapContext;

public class LdapAuthenticator extends Authenticator {

    @Override
    protected boolean doAuthenticate(String id, String pw) {
        return IdapClient.authenticate(id, pw);
    }

    @Override
    protected Auth createAuth(String id) {
        LdapContext ctx = IdapClient.find(id);
        try {
            return new Auth(id, ctx.getAttributes("name").toString());
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }

    static class IdapClient {
        public static boolean authenticate(String id, String pw){
            return true;
        }

        public static LdapContext find(String id){
            return null;
        }
    }
}
