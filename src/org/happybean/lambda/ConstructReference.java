package org.happybean.lambda;

import org.happybean.common.Person;
import org.happybean.common.Student;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wgt
 * @date 2018-09-11
 * @description 构造器引用（construct reference）
 **/
public class ConstructReference {

    public static void main(String[] args) {

        List<Person> persons = Person.getPersonListData();
        List<Student> students = personsConvertToStudents(persons);

        students.stream().forEach(System.out::println);
    }

    public static List<Student> personsConvertToStudents(List<Person> list) {

        return list.stream().map(Student::new).collect(Collectors.toList());
    }
}
