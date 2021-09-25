package com.prger.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("test.properties")
public class Person {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;
    private Dog dog;

    @Autowired
    @Qualifier("dog2")
    public void setDog(Dog dog) {
        this.dog = dog;
    }

//    public Person(Dog dog) {
//        this.dog = dog;
//    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                '}';
    }
}
