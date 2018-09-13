package org.happybean.sam;

import org.happybean.common.Person;

import java.util.function.Supplier;

/**
 * @author wgt
 * @date 2018-09-13
 * @description Supplier:接口返回一个任意范型的值，和Function接口不同的是该接口没有任何参数
 **/
public class SupplierDemo {

    public static void demo() {

        Supplier<Person> personSupplier = Person::new;
        Person person = personSupplier.get();
    }
}
