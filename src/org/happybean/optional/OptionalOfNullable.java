package org.happybean.optional;

import java.util.Optional;

/**
 * @author wgt
 * @date 2018-09-11
 * @description ofNullable:把指定的值封装为Optional对象，如果指定的值为null，则创建一个空的Optional对象
 **/
public class OptionalOfNullable {
    public static void main(String[] args) {

        Optional<String> optionalStr = stringConvertToOptional("java1.8 Optional");
        System.out.println("optionalStr:" + optionalStr);

        Optional<String> optionalNull = stringConvertToOptional(null);
        System.out.println("optionalNull:" + optionalNull);

    }

    public static Optional<String> stringConvertToOptional(String str) {

        Optional<String> optional = Optional.ofNullable(str);
        return optional;
    }
}
