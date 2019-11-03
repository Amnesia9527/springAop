package com.cy.stream;

import com.cy.entity.CityEntity;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Map map = new HashMap<String,String>();
        map.put("杨过","小龙女");
        List<CityEntity> list = new ArrayList();
        list.add(new CityEntity("1","西安"));
        list.add(new CityEntity("4","宝鸡"));
        list.add(new CityEntity("5","咸阳"));
        list.add(new CityEntity("2","渭南"));
        list.stream().sorted().forEach(ct -> System.out.println(ct.getId()+"  "+ct.getName()));
        Collections.sort(list,new CityComparator());
        list.stream().forEach(ct -> System.out.println(ct.getId()+"  "+ct.getName()));
    }




}
