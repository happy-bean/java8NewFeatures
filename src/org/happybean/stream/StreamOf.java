package org.happybean.stream;

import java.util.stream.Stream;

/**
 * @author wgt
 * @date 2018-09-12
 * @description of方法：有两个overload方法，一个接受变长参数，一个接口单一值
 **/
public class StreamOf {

    public static Stream<Integer> createIntegerStream(Integer... num) {

        Stream<Integer> stream = Stream.of(num);
        return stream;
    }

    public static Stream<String> createStringStream(String... str) {

        Stream<String> stream = Stream.of(str);
        return stream;
    }
}
