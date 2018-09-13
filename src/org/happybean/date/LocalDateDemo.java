package org.happybean.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * @author wgt
 * @date 2018-09-13
 * @description LocalDate:表示了一个确切的日期，比如 2018-10-01。该对象值是不可变的，用起来和LocalTime基本一致。
 **/
public class LocalDateDemo {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate tomorrow = plusDays(today);
        System.out.println("tomorrow:" + tomorrow);

        LocalDate yesterday = minusDays(1, today);
        System.out.println("yesterday:" + yesterday);

        LocalDate NationalDay = LocalDate.of(2018, Month.OCTOBER, 1);
        System.out.println("National Day is :"+getDayOfWeek(NationalDay));
    }

    public static LocalDate plusDays(LocalDate date) {

        return date.plus(1, ChronoUnit.DAYS);
    }

    public static LocalDate minusDays(int days, LocalDate date) {

        return date.minusDays(2);
    }

    public static DayOfWeek getDayOfWeek(LocalDate date){

        return date.getDayOfWeek();
    }
}
