package org.happybean.optional;

import java.util.Optional;

/**
 * @author wgt
 * @date 2018-09-11
 * @description of:把指定的值封装为Optional对象，如果指定的值为null，则抛出NullPointerException
 **/
public class OptionalOf {

    public static void main(String[] args) {

        Optional<String> optional = stringConvertToOptional("java1.8 Optional");
        System.out.println("optional:" + optional);

//        Optional<String> optional = stringConvertToOptional(null);

    }

    public static Optional<String> stringConvertToOptional(String str) {

        Optional<String> optional = Optional.of(str);
        return optional;
    }

}
