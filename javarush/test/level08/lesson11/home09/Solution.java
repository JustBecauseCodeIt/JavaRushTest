package com.javarush.test.level08.lesson11.home09;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {
        Date date1 = new Date(date);
        int day = date1.getDate();
        int month = date1.getMonth();
        int yearh = date1.getYear()+1900;
        Calendar c = new GregorianCalendar(yearh, month, day);
        int dayOfYearh = c.get(Calendar.DAY_OF_YEAR);
        if(dayOfYearh%2==0) return false;
        else return true;
    }
}
