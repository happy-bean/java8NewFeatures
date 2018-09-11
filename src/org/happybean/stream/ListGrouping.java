package org.happybean.stream;

import org.happybean.common.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wgt
 * @date 2018-09-10
 * @description list按属性分组
 **/
public class ListGrouping {

    public static void main(String[] args) {

        List<Person> list = Person.getPersonListData();
        Map<Integer, List<Person>> personMap = personListGroupingByAge(list);
        System.out.println("personMap:" + personMap);
    }

    public static Map<Integer, List<Person>> personListGroupingByAge(List<Person> list) {

        Map<Integer, List<Person>> personMap = new HashMap<>();
        list.stream().collect(Collectors.groupingBy(Person::getAge)).forEach(
                (age, personList) -> {
                    personMap.put(age, personList);
                }
        );
        return personMap;
    }
}
