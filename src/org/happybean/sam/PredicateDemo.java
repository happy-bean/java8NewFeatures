package org.happybean.sam;

import org.happybean.common.Person;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @author wgt
 * @date 2018-09-13
 * @description Predicate 接口只有一个参数，返回boolean类型。
 * 该接口包含多种默认方法来将Predicate组合成其他复杂的逻辑（比如：与，或，非）
 **/
public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<String> predicate = (s) -> s.length() > 0;
        System.out.println(predicate.test("predicate"));

        System.out.println(predicate.negate().test("predicate"));

        Person person = new Person("test", 2018);
        Predicate<Person> nonNull = Objects::nonNull;
        System.out.println(nonNull.test(person));

        Predicate<Person> isNull = Objects::isNull;
        System.out.println(isNull.test(person));

        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test("predicate"));

        Predicate<String> isNotEmpty = isEmpty.negate();
        System.out.println(isNotEmpty.test("predicate"));
    }
}
