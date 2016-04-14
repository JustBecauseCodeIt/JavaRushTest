package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

     static  {
        labels.put(1d, "dfa");
        labels.put(2d, "gsg");
        labels.put(3d, "rtw43");
        labels.put(4d, "df4322wea");
        labels.put(5d, "erwt");
    }

    public static void main(String[] args) {
         System.out.println(labels);
    }
}
