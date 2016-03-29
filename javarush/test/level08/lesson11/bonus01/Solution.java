package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().toUpperCase();
        Map<String, String> hm = new HashMap<>();
        hm.put("JANUARY","January is 1 month");
        hm.put("FEBRUARY","February is 2 month");
        hm.put("MARCH","March is 3 month");
        hm.put("APRIL","April is 4 month");
        hm.put("MAY","May is 5 month");
        hm.put("JUNE","June is 6 month");
        hm.put("JULY","July is 7 month");
        hm.put("AUGUST","August is 8 month");
        hm.put("SEPTEMBER","September is 9 month");
        hm.put("OCTOBER","October is 10 month");
        hm.put("NOVEMBER","November is 11 month");
        hm.put("DECEMBER","December is 12 month");
        if(hm.containsKey(s)) System.out.println(hm.get(s));
    }

}
