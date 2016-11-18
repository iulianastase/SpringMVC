package com.endava.model;

import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Size;

/**
 * Created by inastase on 11/17/2016.
 */
public class Users {
    private Integer id;

    @NotNull
    @Size(min = 1,max = 40)
    private String name;

    @NotNull
    @Size(min = 1, max = 40)
    private String position;

    public Users(Integer id, String name, String position, Integer age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }

    @NotNull
    @Size(min = 1)
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
