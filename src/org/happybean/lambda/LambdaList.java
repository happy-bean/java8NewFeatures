package org.happybean.lambda;

import org.happybean.common.Person;

import java.util.List;

/**
 * @author wgt
 * @date 2018-09-11
 * @description list中应用
 **/
public class LambdaList {

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
