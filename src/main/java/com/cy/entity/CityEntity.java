package com.cy.entity;

import com.cy.annotation.Entity;

import java.util.Objects;

@Entity("city")
public class CityEntity implements Comparable<CityEntity>{

    private String id;
    private String name;

    public CityEntity() {
    }

    public CityEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityEntity that = (CityEntity) o;
        return id.equals(that.id) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(CityEntity o) {
        if (this.getId().compareTo(o.getId())<0){
            return 1;
        }else if (this.getId().compareTo(o.getId())>0){
            return -1;
        }
        return 0;
    }
}
