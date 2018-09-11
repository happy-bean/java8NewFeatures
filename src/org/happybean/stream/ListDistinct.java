package org.happybean.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wgt
 * @date 2018-09-12
 * @description distinct:对于Stream中包含的元素进行去重操作（去重逻辑依赖元素的equals方法），新生成的Stream中没有重复的元素；
 **/
public class ListDistinct {

    public static void main(String[] args) {

        String[] a = {"java", "1.8", "stream", "stream"};
        List<String> list = Arrays.asList(a);
        System.out.println("list distinct:" + listDistinct(list));
    }

    public static List<String> listDistinct(List<String> list) {

        return list.stream().distinct().collect(Collectors.toList());
    }
}
