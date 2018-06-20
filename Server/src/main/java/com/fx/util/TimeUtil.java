package com.fx.util;

import java.util.Calendar;

/**
 * Description: 时间相关操作
 * Created by Hanxinhu at 8:46 2018/6/17/017
 */
public class TimeUtil {
    private int year;
    private int month;
    private int day;

    public TimeUtil() {
        Calendar calendar = Calendar.getInstance();
        this.day = calendar.get(Calendar.DATE);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }

    public TimeUtil(String date) {
        String[] param = date.split("-");
        year = Integer.parseInt(param[0]);
        month = Integer.parseInt(param[1]);
        day = Integer.parseInt(param[2]);
    }

    public static void main(String[] args) {
        TimeUtil timeUtil1 = new TimeUtil("2018-06-18");
        TimeUtil timeUtil2 = new TimeUtil("2018-06-17");
        System.out.println(timeUtil1.IntervalTime(timeUtil2));
    }

    @Override
    public String toString() {
        return String.format("%4d-%02d-%02d", year, month, day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int IntervalTime(TimeUtil newTime) {
        Calendar calendar = Calendar.getInstance();
        //第一个日期的秒值
        long firstSecond = 0;
        calendar.set(this.year
            , this.month - 1
            , this.day
            , 0
            , 0
            , 0);
        firstSecond = calendar.getTimeInMillis();
        //第二个日期的秒值
        long secondSecond = 0;
        calendar.set(newTime.year
            , newTime.month - 1
            , newTime.day
            , 0
            , 0
            , 0);
        secondSecond = calendar.getTimeInMillis();
        //
        return (int) Math.abs((secondSecond - firstSecond) / (1000 * 60 * 60));
    }
}
