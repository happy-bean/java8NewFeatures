package org.happybean.list;

import org.happybean.common.Person;

import java.util.Comparator;
import java.util.List;

/**
 * @author wgt
 * @date 2018-09-11
 * @description list多条件排序
 **/
public class ListConditionSort {

    public static void main(String[] args) {

        List<Person> list = Person.getPersonListData();

        listConditionSortASC(list);
        System.out.println("personList:" + list);

        listConditionSortDESC(list);
        System.out.println("personList:" + list);
    }

    public static void listConditionSortASC(List<Person> list) {

        list.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
    }

    public static void listConditionSortDESC(List<Person> list) {

        list.sort(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getName));
    }
}
