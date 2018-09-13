package org.happybean.sam;

import org.happybean.common.Person;

import java.util.Comparator;

/**
 * @author wgt
 * @date 2018-09-13
 * @description Comparator:是老Java中的经典接口， Java 8在此之上添加了多种默认方法
 **/
public class ComparatorDemo {

    public static void main(String[] args) {

        Person p1 = new Person("a", 1);
        Person p2 = new Person("b", 2);

        System.out.println(compare(p1, p2));
    }

    public static int compare(Person p1, Person p2) {

        Comparator<Person> comparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
        return comparator.compare(p1, p2);
        // comparator.reversed().compare(p1, p2);
    }
}
