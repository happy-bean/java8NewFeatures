package org.happybean.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author wgt
 * @date 2018-09-12
 * @description max和min：使用给定的比较器（Operator），返回Stream中的最大|最小值
 **/
public class ListMaxAndMin {

    public static void main(String[] args) {

        Integer[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> numList = Arrays.asList(nums);
        System.out.println("max:" + max(numList));
        System.out.println("min:" + min(numList));
    }

    public static Integer max(List<Integer> list) {

        return list.stream().max((num1, num2) -> num1.compareTo(num2)).get();
    }

    public static Integer min(List<Integer> list) {

        return list.stream().min((num1, num2) -> num1.compareTo(num2)).get();
    }
}
