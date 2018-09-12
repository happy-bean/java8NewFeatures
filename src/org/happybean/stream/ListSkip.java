package org.happybean.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wgt
 * @date 2018-09-12
 * @description skip: 返回一个丢弃原Stream的前N个元素后剩下元素组成的新Stream，
 * 如果原Stream中包含的元素个数小于N，那么返回空Stream；
 **/
public class ListSkip {

    public static void main(String[] args) {

        String[] strings = {"a", "b", "c", "d"};
        List<String> list = Arrays.asList(strings);

        List<String> skipList = skip(list, 2L);
        skipList.stream().forEach(System.out::println);
    }

    public static List<String> skip(List<String> list, long index) {

        return list.stream().skip(index).collect(Collectors.toList());
    }
}
