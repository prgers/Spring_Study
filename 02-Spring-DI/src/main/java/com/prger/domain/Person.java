package com.prger.domain;

import java.beans.ConstructorProperties;

/**
 * Created by prgers on 2021/9/22 12:59 下午
 */
public class Person {
    private String name;
    private String age;

    public Person() {
    }

    @ConstructorProperties({"name", "age"})
    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
