package org.happybean.optional;

import java.util.Optional;

import static org.happybean.optional.OptionalOf.stringConvertToOptional;

/**
 * @author wgt
 * @date 2018-09-11
 * @description isPresent:如果创建的Optional中的值存在，返回true，否则返回false
 **/
public class OptionalIsPresent {

    public static void main(String[] args) {

        Optional<String> optionalStr = stringConvertToOptional("java1.8 Optional");
        printOptionalIsPresent(optionalStr);

        Optional optionalEmpty = Optional.ofNullable(null);
        printOptionalIsPresent(optionalEmpty);
    }

    public static void printOptionalIsPresent(Optional<String> optional) {

        System.out.println("optional.isPresent:" + optional.isPresent());
    }

}
