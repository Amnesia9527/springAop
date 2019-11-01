package com.cy.test;

public class A {

    static {
        System.out.println("1");
    }

    public A(){
        System.out.println("2");
    }
    public A(String s){
        System.out.println(s);
    }
}
