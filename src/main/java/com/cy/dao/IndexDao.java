package com.cy.dao;

import org.springframework.stereotype.Repository;

@Repository
public class IndexDao implements Dao{


    public void runs(String str){
        System.out.println("目标对象方法");
        System.out.println(str);
    }
}
