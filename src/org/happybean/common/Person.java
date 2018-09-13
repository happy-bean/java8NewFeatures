package org.happybean.common;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author wgt
 * @date 2018-09-10
 * @description
 **/
public class Person {

    public Person() {
        this.name = "init";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<Person> getPersonListData() {

        List<Person> list = new LinkedList<>();
        list.add(new Person("a", 18));
        list.add(new Person("b", 19));
        list.add(new Person("c", 20));
        list.add(new Person("d", 20));
        return list;
    }

    public static Map<Integer, Person> getPersonMapData() {

        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("a", 18));
        map.put(2, new Person("b", 19));
        map.put(3, new Person("c", 20));
        map.put(4, new Person("d", 20));
        return map;
    }

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
