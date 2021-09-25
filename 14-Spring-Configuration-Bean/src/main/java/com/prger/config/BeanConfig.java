package com.prger.config;

import com.prger.domain.DogFactoryBean;
import com.prger.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("person.properties")
public class BeanConfig {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;

//    @Bean
//    public Person person(Dog dog) {
//        return new Person(dog);
//    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return person;
    }

//    @Bean
//    public Dog dog() {
//        return new Dog();
//    }

    @Bean
    public DogFactoryBean dog() {
        return new DogFactoryBean();
    }
}
