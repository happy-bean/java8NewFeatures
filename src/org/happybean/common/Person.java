package org.happybean.common;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wgt
 * @date 2018-09-10
 * @description
 **/
public class Person {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<Person> getPersonListData() {

        List<Person> list = new LinkedList<>();
        list.add(new Person("a", 18));
        list.add(new Person("b", 19));
        list.add(new Person("a", 20));
        return list;
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
