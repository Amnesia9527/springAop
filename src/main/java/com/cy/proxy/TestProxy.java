package com.cy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestProxy {

    public static void main(String[] args) {

        UserDao userDao = new UserDaoImpl();
        InvocationHandler handler = new MyInvokationHandler(userDao);

        UserDao instance = (UserDao)Proxy.newProxyInstance(userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(), handler);

        instance.query();

    }
}
