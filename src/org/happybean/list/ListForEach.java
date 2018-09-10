package org.happybean.list;

import org.happybean.common.Person;

import java.util.List;

/**
 * @author wgt
 * @date 2018-09-10
 * @description list遍历
 **/
public class ListForEach {

    public static void main(String[] args) {
        List<Person> list = Person.getPersonListData();
        forEachPerson(list);
    }

    public static void forEachPerson(List<Person> list) {
        list.stream().forEach(person -> {
            System.out.println(person);
        });
    }
}
