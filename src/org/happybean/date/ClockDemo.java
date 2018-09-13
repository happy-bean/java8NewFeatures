package org.happybean.date;

import java.time.Clock;

/**
 * @author wgt
 * @date 2018-09-13
 * @description Clock类提供了访问当前日期和时间的方法，Clock是时区敏感的，可以用来取代 System.currentTimeMillis() 来获取当前的微秒数
 **/
public class ClockDemo {

    public static void main(String[] args) {

        System.out.println(getMillis());
    }

    public static long getMillis() {

        Clock clock = Clock.systemDefaultZone();
        return clock.millis();
    }
}
