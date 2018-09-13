package org.happybean.date;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

/**
 * @author wgt
 * @date 2018-09-13
 * @description Instant:某一个特定的时间点也可以使用Instant类来表示，Instant类也可以用来创建老的java.util.Date对象
 **/
public class InstantDemo {

    public static void main(String[] args) {

        System.out.println(getDate().toString());
    }

    public static Date getDate(){

        Clock clock = Clock.systemDefaultZone();
        Instant instant = clock.instant();
        return Date.from(instant);
    }
}
