package org.happybean.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author wgt
 * @date 2018-09-12
 * @description Match 匹配:检测指定的Predicate是否匹配整个Stream。所有的匹配操作都是最终操作，并返回一个boolean类型的值
 **/
public class ListMatch {

    public static void main(String[] args) {

        String[] a = {"abc", "abcd", "bc", "def"};
        List<String> list = Arrays.asList(a);

        System.out.println("anyMatch:" + anyMatch(list));

        System.out.println("allMatch:" + allMatch(list));

        System.out.println("noneMatch:" + noneMatch(list));
    }

    public static boolean anyMatch(List<String> list) {

        return list.stream().anyMatch(str -> str.startsWith("a"));
    }

    public static boolean allMatch(List<String> list) {

        return list.stream().allMatch(str -> str.startsWith("a"));
    }

    public static boolean noneMatch(List<String> list) {

        return list.stream().noneMatch(str -> str.startsWith("g"));
    }
}
