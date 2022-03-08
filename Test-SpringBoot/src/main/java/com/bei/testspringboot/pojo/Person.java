package com.bei.testspringboot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component  // 注册bean
@ConfigurationProperties(prefix = "person")
public class Person {
    private Boolean happy;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "happy=" + happy +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setHappy(Boolean happy) {
        this.happy = happy;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Boolean getHappy() {
        return happy;
    }

    public Date getBirth() {
        return birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public Dog getDog() {
        return dog;
    }

    public List<Object> getLists() {
        return lists;
    }

    public Person() {}

    public Person(Boolean happy, Date birth, Map<String, Object> maps, List<Object> lists, Dog dog) {
        this.happy = happy;
        this.birth = birth;
        this.maps = maps;
        this.lists = lists;
        this.dog = dog;
    }
}
