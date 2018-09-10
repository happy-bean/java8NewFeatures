package org.happybean.list;

import org.happybean.common.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wgt
 * @date 2018-09-10
 * @description list按条件过滤
 **/
public class ListFilter {

    public static void main(String[] args) {

        List<Person> list = Person.getPersonListData();
        List<Person> personFilterList = personListFilterByAge(list);
        System.out.println("personFilterList:"+personFilterList);
    }

    public static List<Person> personListFilterByAge(List<Person> list) {

        List<Person> personList
                = list.stream().filter(person -> (person.getAge() > 19)).collect(Collectors.toList());
        return personList;
    }
}
