package org.happybean.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wgt
 * @date 2018-09-12
 * @description generator方法：生成一个无限长度的Stream，其元素的生成是通过给定的Supplier
 * （这个接口可以看成一个对象的工厂，每次调用返回一个给定类型的对象）
 **/
public class StreamGenerator {

    public static List<Double> generator() {

        Stream.generate(Math::random);
        return Stream.generate(Math::random).collect(Collectors.toList());
    }
}
