package org.happybean.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author wgt
 * @date 2018-09-11
 * @description 方法引用（Method reference）
 **/
public class Print {

    public static void main(String[] args) {

        String[] a = {"a", "b", "c"};
        List<String> list = Arrays.asList(a);
        list.forEach(Print::myPrint);
    }

    public static void myPrint(Object object) {

        System.out.println("myprint:" + object.toString());
    }
}
