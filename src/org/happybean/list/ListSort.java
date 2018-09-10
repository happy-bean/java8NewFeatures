package org.happybean.list;

import org.happybean.common.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author wgt
 * @date 2018-09-11
 * @description list排序
 **/
public class ListSort {

    public static void main(String[] args) {

        List<Person> list = Person.getPersonListData();
        listSort(list);
        System.out.println("personList:" + list);

        listSortASC(list);
        System.out.println("personList:" + list);

        listSortDESC(list);
        System.out.println("personList:" + list);
    }

    public static void listSort(List<Person> list) {

        list.sort((Person p1, Person p2) -> p2.getName().compareTo(p1.getName()));

        // or list.sort((p1, p2) -> p2.getName().compareTo(p1.getName()));
    }

    public static void listSortASC(List<Person> list) {

        Collections.sort(list, Comparator.comparing(Person::getAge));
    }

    public static void listSortDESC(List<Person> list) {

        Collections.sort(list, Comparator.comparing(Person::getAge).reversed());
    }
}
