package org.happybean.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wgt
 * @date 2018-09-10
 * @description list转换操作
 **/
public class ListConvert {

    public static void main(String[] args) {

        String[] arrays = getStringArrayData();

        List<String> list = arraysConvertToList(arrays);

        System.out.println("list:" + list);

        arrays = listConvertToArray(list);

        System.out.println("arrays:" + Arrays.toString(arrays));
    }

    public static String[] getStringArrayData() {

        String[] arrays = new String[]{"a", "b", "c"};
        return arrays;
    }

    public static List arraysConvertToList(String[] arrays) {

        List<String> list = Stream.of(arrays).collect(Collectors.toList());
        return list;
    }

    public static String[] listConvertToArray(List<String> list) {

        String[] array = list.stream().toArray(String[]::new);
        return array;
    }

}
