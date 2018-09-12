package org.happybean.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author wgt
 * @date 2018-09-12
 * @description 组合使用
 **/
public class StreamMix {

    public static void main(String[] args) {

        Integer[] nums = {1, 1, null, 2, 3, 4, null, 5, 6, 7, 8, 9, 10};
        List<Integer> numList = Arrays.asList(nums);
        System.out.println("sum:" + mix(numList));
    }

    public static int mix(List<Integer> list) {

        int sum = list.stream().filter(num -> num != null).
                distinct().mapToInt(num -> num * 2).
                peek(System.out::println).skip(2).limit(4).sum();
        return sum;
    }
}
