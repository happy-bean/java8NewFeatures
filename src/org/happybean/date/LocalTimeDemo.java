package org.happybean.date;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author wgt
 * @date 2018-09-13
 * @description LocalTime:定义了一个没有时区信息的时间，例如 晚上10点，或者 17:30:15。
 **/
public class LocalTimeDemo {

    public static void main(String[] args) {

        ZoneId zone1 = TimezonesDemo.zoneIdOf("Asia/Aden");
        ZoneId zone2 = TimezonesDemo.zoneIdOf("America/Cuiaba");

        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);


        System.out.println(now1.isBefore(now2));

        System.out.println(hoursBetween(now1, now2));

        System.out.println(getLocalTime(23, 59, 59));

        System.out.println(dateTimeFormat("11:00"));
    }

    public static long hoursBetween(LocalTime time1, LocalTime time2) {

        return ChronoUnit.HOURS.between(time1, time2);
    }

    public static LocalTime getLocalTime(int hour, int minute, int second) {

        return LocalTime.of(hour, minute, second);
    }

    public static LocalTime dateTimeFormat(String string) {

        DateTimeFormatter formatter =
                DateTimeFormatter
                        .ofLocalizedTime(FormatStyle.SHORT)
                        .withLocale(Locale.GERMAN);
        return LocalTime.parse(string, formatter);
    }
}