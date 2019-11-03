package com.cy.stream;

import com.cy.entity.CityEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {
        List<CityEntity> list = new ArrayList();
        CityEntity ct1 = new CityEntity("1", "西安");
        CityEntity ct2 = new CityEntity("2", "渭南");
        CityEntity ct3 = new CityEntity("3", "宝鸡");
        CityEntity ct4 = new CityEntity("1", "西安1");
        CityEntity ct5 = new CityEntity("1", "西安2");
        CityEntity ct6 = new CityEntity("1", "西安3");

        list.add(ct1);
        list.add(ct1);
        list.add(ct2);
        list.add(ct2);
        list.add(ct3);
        list.add(ct3);
        list.add(ct4);
        list.add(ct5);
        list.add(ct6);

        Map map = new HashMap<String,String>();
        map.put("杨过","小龙女");
        Object[] array = list.stream().distinct().toArray();
        for (Object obj:array
             ) {
            System.out.println(obj);
        }
        list.stream().distinct().forEach(ct -> System.out.println(ct.toString()));
        //@FunctionalInterface函数式接口
        //forEach(Consumer<? super T> action  void accept(T t))终结方法
        list.stream().forEach(ct-> System.out.println(ct.getName()));

        //filter(Predicate<? super T> predicate boolean test(T t))延迟方法
        list.stream().filter(ct -> ct.getId().equals("1") )
                     .forEach(ct -> System.out.println(ct.getName()));
    }
}
