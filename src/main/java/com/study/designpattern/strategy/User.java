package com.study.designpattern.strategy;

public class User {
    public boolean firstVisit;
    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
