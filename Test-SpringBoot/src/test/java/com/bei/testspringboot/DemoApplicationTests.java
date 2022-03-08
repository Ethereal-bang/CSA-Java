package com.bei.testspringboot;

import com.bei.testspringboot.controller.HelloController;
import com.bei.testspringboot.pojo.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {
    @Autowired()
    Person person;
    HelloController controller;
    @Test
    public void contextLoads() {
        System.out.println(person.getBirth());
//        System.out.println(controller.hello());
    }
}
