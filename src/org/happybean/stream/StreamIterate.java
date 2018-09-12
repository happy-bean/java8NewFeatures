package org.happybean.stream;

import java.util.stream.Stream;

/**
 * @author wgt
 * @date 2018-09-12
 * @description iterate方法：也是生成无限长度的Stream，和generator不同的是，其元素的生成是重复对给定的种子值(seed)调用用户指定函数来生成的。
 * 其中包含的元素可以认为是：seed，f(seed),f(f(seed))无限循环
 * <p>
 * 每条语句其实都是生成一个无限长度的Stream，其中值是随机的。
 * 这个无限长度Stream是懒加载，一般这种无限长度的Stream都会配合Stream的limit()方法来用。
 * </p>
 **/
public class StreamIterate {


    public static void main(String[] args) {
        Stream stream = iterate();
        stream.limit(10).forEach(System.out::println);
    }

    public static Stream iterate() {

        return Stream.iterate(2, item -> item + 2);
    }
}
