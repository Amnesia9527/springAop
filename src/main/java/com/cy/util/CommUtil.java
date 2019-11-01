package com.cy.util;

import com.cy.annotation.Entity;

public class CommUtil {

    /**
     *
     * @param obj
     */
    public static String buildQuerySqlForEntity(Object obj){

        String value =null;
        Class<?> clazz = obj.getClass();
        System.out.println(clazz.isAnnotationPresent(Entity.class));
        if(clazz.isAnnotationPresent(Entity.class)){
            Entity annotation = clazz.getAnnotation(Entity.class);
            value = annotation.value();
            System.out.println(value);
        }
        return value;

    }
}
