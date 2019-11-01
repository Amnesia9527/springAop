package com.cy.test;

import com.cy.appconfig.AppConfig;
import com.cy.dao.Dao;

import com.cy.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        /*CityEntity entity = new CityEntity();
        entity.setId("1");
        entity.setName("test");
        String sql = CommUtil.buildQuerySqlForEntity(entity);
        System.out.println(sql);*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Dao indexDao =(Dao) context.getBean("indexDao");
        indexDao.runs("hello");
    }
}
