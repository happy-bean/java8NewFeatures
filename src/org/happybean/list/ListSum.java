package org.happybean.list;

import org.happybean.common.Person;

import java.util.List;

/**
 * @author wgt
 * @date 2018-09-11
 * @description list求和
 **/
public class ListSum {

    public static void main(String[] args) {

        List<Person> list = Person.getPersonListData();
        int ageSum = personAgeSum(list);
        System.out.println("person age sum:" + ageSum);
    }

    public static int personAgeSum(List<Person> list) {

        int sum = list.stream().mapToInt(Person::getAge).sum();
        return sum;
    }
}
