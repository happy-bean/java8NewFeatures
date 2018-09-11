package org.happybean.list;

import org.happybean.common.Person;
import org.happybean.common.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wgt
 * @date 2018-09-10
 * @description list转换操作
 **/
public class ListConvert {

    public static void main(String[] args) {

        String[] arrays = getStringArrayData();

        List<String> list = arraysConvertToList(arrays);

        System.out.println("list:" + list);

        arrays = listConvertToArray(list);

        System.out.println("arrays:" + Arrays.toString(arrays));

        List<Person> persons = Person.getPersonListData();

        List<Student> studens = personListConvertToStudentList(persons);

        System.out.println("studentList:" + studens);

        List<String> personNames = personListConvertToPersonNameList(persons);

        System.out.println("personNameList:" + personNames);
    }

    public static String[] getStringArrayData() {

        String[] arrays = new String[]{"a", "b", "c"};
        return arrays;
    }

    public static List arraysConvertToList(String[] arrays) {

        List<String> list = Stream.of(arrays).collect(Collectors.toList());
        return list;
    }

    public static String[] listConvertToArray(List<String> list) {

        String[] array = list.stream().toArray(String[]::new);
        return array;
    }

    public static List<Student> personListConvertToStudentList(List<Person> list) {

        List<Student> studentList =
                list.stream().map(person -> new Student(person.getName(), person.getAge())).collect(Collectors.toList());
        return studentList;
    }

    public static List<String> personListConvertToPersonNameList(List<Person> list) {

        List<String> nameList = list.stream().map(Person::getName).collect(Collectors.toList());
        return nameList;
    }
}
