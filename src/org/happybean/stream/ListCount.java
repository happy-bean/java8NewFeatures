package org.happybean.stream;

import org.happybean.common.Person;

import java.util.List;

/**
 * @author wgt
 * @date 2018-09-11
 * @description list计数
 **/
public class ListCount {

    public static void main(String[] args) {

        List<Person> list = Person.getPersonListData();
        long count = personCountFilterByAge(list);
        System.out.println("person count:" + count);
    }

    public static long personCountFilterByAge(List<Person> list) {

        long count = list.stream().filter(person -> (person.getAge() > 19)).count();
        return count;
    }
}
