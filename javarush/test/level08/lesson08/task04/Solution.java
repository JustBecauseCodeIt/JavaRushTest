package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Бузова", new Date("JULY 22 1947"));
        map.put("Светлаков", new Date("AUGUST 28 1976"));
        map.put("Гончаров", new Date("SEPTEMBER 17 3100"));
        map.put("Кличко", new Date("NOVEMBER 2 2033"));
        map.put("Ли", new Date("DECEMBER 1 2011"));
        map.put("Капоне", new Date("JANUARY 10 1876"));
        map.put("Торчилетти", new Date("FEBRUARY 5 1555"));
        map.put("Конь", new Date("FEBRUARY 5 1555"));
        map.put("Гамлет", new Date("SEPTEMBER 24 1678"));


        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        for(Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Date> pair = it.next();
            if(pair.getValue().getMonth() > 4 &  pair.getValue().getMonth() < 8) {
                it.remove();
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map);
    }

}
