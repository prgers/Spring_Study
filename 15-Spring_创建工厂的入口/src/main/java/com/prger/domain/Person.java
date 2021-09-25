package com.prger.domain;

import com.prger.service.PersonService;
import com.prger.service.impl.PersonServiceImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan("com.prger.service")
@Import(Dog.class)
public class Person {

}
