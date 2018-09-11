package org.happybean.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wgt
 * @date 2018-09-12
 * @description limit: 对一个Stream进行截断操作，获取其前N个元素，如果原Stream中包含的元素个数小于N，那就获取其所有的元素；
 **/
public class ListLimit {

    public static void main(String[] args) {

        String[] a = {"java", "1.8", "stream", "limit"};
        List<String> list = Arrays.asList(a);

        System.out.println("limit 2:" + getListByLimit(list, 2));
    }

    public static List<String> getListByLimit(List<String> list, int index) {

        return list.stream().limit(index).collect(Collectors.toList());
    }
}
