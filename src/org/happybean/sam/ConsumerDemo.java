package org.happybean.sam;

import org.happybean.common.Person;

import java.util.function.Consumer;

/**
 * @author wgt
 * @date 2018-09-13
 * @description Consumer:接口表示执行在单个参数上的操作。
 **/
public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<Person> consumer = (p) -> System.out.println("Hello " + p.getName());
        accept(consumer);
    }

    public static void accept(Consumer<Person> consumer) {

        consumer.accept(new Person("word", 2018));
    }
}
