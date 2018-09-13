package org.happybean.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * @author wgt
 * @date 2018-09-13
 * @description LocalDateTime:同时表示了时间和日期，相当于前两节内容合并到一个对象上了。
 * LocalDateTime和LocalTime还有LocalDate一样，都是不可变的
 **/
public class LocalDateTimeDemo {

    public static void main(String[] args) {

        LocalDateTime NationalDay = LocalDateTime.of(2018, Month.OCTOBER, 1, 0, 0, 0);

        System.out.println("minuteOfDay:" + getminuteOfDay(NationalDay));

        System.out.println("dayOfWeek:" + getDayOfWeek(NationalDay));

        System.out.println("month:" + getMonth(NationalDay));
    }

    public static DayOfWeek getDayOfWeek(LocalDateTime date) {

        return date.getDayOfWeek();
    }

    public static Month getMonth(LocalDateTime date) {

        return date.getMonth();
    }

    public static long getminuteOfDay(LocalDateTime date) {

        return date.getLong(ChronoField.MINUTE_OF_DAY);
    }
}
