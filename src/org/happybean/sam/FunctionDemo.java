package org.happybean.sam;

import java.util.function.Function;

/**
 * @author wgt
 * @date 2018-09-13
 * @description Function:接口有一个参数并且返回一个结果，并附带了一些可以和其他函数组合的默认方法（compose, andThen）
 **/
public class FunctionDemo {

    public static void demo() {

        Function<String, Integer> toInteger = Integer::valueOf;
        toInteger.apply("2018");

        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        backToString.apply("2018");
    }
}
