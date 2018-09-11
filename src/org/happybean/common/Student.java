package org.happybean.common;

/**
 * @author wgt
 * @date 2018-09-10
 * @description
 **/
public class Student {

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Person person) {
        this.name = person.getName();
        this.age = person.getAge();
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
