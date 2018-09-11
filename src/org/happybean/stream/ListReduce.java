package org.happybean.stream;

/**
 * @author wgt
 * @date 2018-09-11
 * @description
 **/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author wgt
 * @date 2018-09-11
 * @description reduce:允许通过指定的函数来讲stream中的多个元素规约为一个元素
 **/
public class ListReduce {

    public static void main(String[] args) {

        String[] a = {"j", "a", "v", "a"};
        List<String> list = Arrays.asList(a);

        Optional<String> optional = reduce(list);
        optional.ifPresent(System.out::println);
    }

    public static Optional<String> reduce(List<String> list) {

        Optional<String> optional =
                list.stream().reduce((s1, s2) -> s1 + s2);
        return optional;
    }
}
