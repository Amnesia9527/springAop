package com.cy.stream;

import com.cy.entity.CityEntity;

import java.util.Comparator;

public class CityComparator implements Comparator<CityEntity> {
    @Override
    public int compare(CityEntity o1, CityEntity o2) {
        if (o1.getId().compareTo(o2.getId())<0){
            return 1;
        }else if (o1.getId().compareTo(o2.getId())>0){
            return -1;
        }
        return 0;
    }
}
