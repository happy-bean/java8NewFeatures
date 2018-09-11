package org.happybean.optional;

import java.util.Optional;

import static org.happybean.optional.OptionalEmpty.createEmptyOptional;
import static org.happybean.optional.OptionalOf.stringConvertToOptional;

/**
 * @author wgt
 * @date 2018-09-11
 * @description get:如果创建的Optional中有值存在，则返回此值，否则抛出NoSuchElementException
 **/
public class OptionalGet {

    public static void main(String[] args) {

        Optional<String> optionalStr = stringConvertToOptional("java1.8 Optional");
        printOptionalValue(optionalStr);

        Optional optionalEmpty = createEmptyOptional();
        printOptionalValue(optionalEmpty);
    }

    public static void printOptionalValue(Optional optional) {
        System.out.println("optional.get:" + optional.get());
    }
}
