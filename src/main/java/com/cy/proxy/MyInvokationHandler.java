package com.cy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvokationHandler implements InvocationHandler {

    private Object target;

    public MyInvokationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理逻辑代码前");
        method.invoke(target,args);
        System.out.println("代理逻辑代码后");
        return null;
    }
}
