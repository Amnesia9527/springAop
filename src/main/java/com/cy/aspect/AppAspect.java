package com.cy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Aspect
@Component
public class AppAspect {

    @Pointcut("execution(* com.cy.dao.*.*(..))")
    public void pointcut(){}

   /* @Before("pointcut()")
    public void before(){
        System.out.println("before通知");
    }*/
    @Around("pointcut()")
    public void arround(ProceedingJoinPoint pjp){
        System.out.println("前执行");
        Object[] args = pjp.getArgs();
        if (args!=null&&args.length>0){
            for (int i = 0;i<args.length;i++){
                args[i]+=" world";
                System.out.println(Arrays.toString(args));
            }
        }
        try {
            Object proceed = pjp.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("后执行");
    }
}
