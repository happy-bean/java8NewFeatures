package org.happybean.date;

import java.time.ZoneId;

/**
 * @author wgt
 * @date 2018-09-13
 * @description Timezones:在新API中时区使用ZoneId来表示。时区可以很方便的使用静态方法of来获取到。
 * 时区定义了到UTS时间的时间差，在Instant时间点对象到本地日期对象之间转换的时候是极其重要的
 **/
public class TimezonesDemo {

    public static void main(String[] args) {

        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId zone1 = zoneIdOf("Asia/Aden");
        System.out.println(zone1.getRules());

        ZoneId zone2 = zoneIdOf("America/Cuiaba");
        System.out.println(zone2.getRules());
    }

    public static ZoneId zoneIdOf(String string) {

        return ZoneId.of(string);
    }
}
