package org.happybean.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wgt
 * @date 2018-09-12
 * @description peek: 生成一个包含原Stream的所有元素的新Stream，同时会提供一个消费函数（Consumer实例），
 * 新Stream每个元素被消费的时候都会执行给定的消费函数
 **/
public class StreamPeek {

    public static void main(String[] args) {

        List<String> list = peek();
        list.stream().forEach(System.out::println);
    }

    public static List<String> peek() {
        List<String> list = Stream.of("a", "b", "c", "d")
                .peek(e -> System.out.println("peeked value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("mapped value: " + e))
                .collect(Collectors.toList());
        return list;
    }
}
