package com.cy.proxy;

public class UserDaoImpl implements UserDao {
    @Override
    public void query() {
        System.out.println("目标方法");
    }
}
