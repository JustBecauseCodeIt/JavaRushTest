package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] a = new int[10];
            a[11]=9;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            ArrayList<Integer> t = new ArrayList<>();
            t.get(9);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String str = null;
            String m = str.toLowerCase();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String str = new String("dfsa3234");
            double t = Double.parseDouble(str);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            FileInputStream fis = new FileInputStream("C2:\\badFileName.txt");

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }


        //Add your code here

    }
}
