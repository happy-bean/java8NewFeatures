package org.happybean.stream;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wgt
 * @date 2018-09-12
 * @description parallelStream:返回并行流
 * stream()和parallelStream()方法返回的都是java.util.stream.Stream<E>类型的对象，说明它们在功能的使用上是没差别的。
 * 唯一的差别就是单线程和多线程的执行
 * <p>
 * 一般我们会认为多线程执行任务会比单线程执行快，其实也不一定，因为多线程的切换什么的也是需要消耗一定时间的，
 * 如果任务太小了，多线程的切换时间可能会占总的执行时间很大一个比例
 * </p>
 **/
public class ParallelStream {

    public static void main(String[] args) {

        List<Integer> list = getIntList();

        stream(list);

        parallelStream(list);
    }

    public static List<Integer> getIntList() {

        return Stream.iterate(1000000, item -> item - 1)
                .limit(1000000).collect(Collectors.toList());
    }

    public static void stream(List<Integer> list) {

        LocalTime start = LocalTime.now();

        list.stream().sorted().count();

        LocalTime end = LocalTime.now();

        Duration duration = Duration.between(start, end);
        System.out.println(duration.toMillis());
    }

    public static void parallelStream(List<Integer> list) {

        LocalTime start = LocalTime.now();

        list.parallelStream().sorted().count();

        LocalTime end = LocalTime.now();

        Duration duration = Duration.between(start, end);
        System.out.println(duration.toMillis());
    }
}
