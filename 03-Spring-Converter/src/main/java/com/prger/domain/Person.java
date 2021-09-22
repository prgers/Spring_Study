package com.prger.domain;

import java.util.Date;

public class Person {

    private Date birthday;

    public Person() {
    }

    public Person(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthday=" + birthday +
                '}';
    }
}
