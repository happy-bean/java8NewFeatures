package org.happybean.stream;

import org.happybean.common.Person;
import org.happybean.common.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wgt
 * @date 2018-09-12
 * @description map: 对于Stream中包含的元素使用给定的转换函数进行转换操作，新生成的Stream只包含转换生成的元素。
 * 这个方法有三个对于原始类型的变种方法，分别是：mapToInt，mapToLong和mapToDouble。这三个方法也比较好理解，比如mapToInt就是把原始Stream转换成一个新的Stream，这个新生成的Stream中的元素都是int类型。之所以会有这样三个变种方法，可以免除自动装箱/拆箱的额外消耗；
 **/
public class ListMap {

    public static void main(String[] args) {

        List<Person> persons = Person.getPersonListData();

        List<Student> studens = personsConvertToStudents(persons);

        System.out.println("students:" + studens);

        List<String> personNames = personsConvertToPersonNames(persons);

        System.out.println("personNames:" + personNames);

        System.out.print("personAges:");

        personsConvertToPersonAges(persons).stream().forEach(ages -> {
            for(int age:ages){
                System.out.print(age+" ");
            }
        });
    }

    public static List<Student> personsConvertToStudents(List<Person> list) {

        List<Student> students =
                list.stream().map(person -> new Student(person.getName(), person.getAge())).collect(Collectors.toList());
        return students;
    }

    public static List<String> personsConvertToPersonNames(List<Person> list) {

        List<String> names = list.stream().map(Person::getName).collect(Collectors.toList());
        return names;
    }

    public static List<int[]> personsConvertToPersonAges(List<Person> list) {

        int[] ages = list.stream().mapToInt(Person::getAge).toArray();
        return Arrays.asList(ages);
    }
}
