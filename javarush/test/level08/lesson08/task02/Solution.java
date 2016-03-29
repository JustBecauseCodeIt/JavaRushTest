package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(30);
        set.add(34);
        set.add(33);
        set.add(31);
        set.add(11);
        set.add(10);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(87);
        set.add(7767);
        set.add(454);
        set.add(3544);
        set.add(4853);
        set.add(2627);
        set.add(1);
        set.add(2);
        set.add(74332);
        set.add(31452);

        
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        HashSet<Integer> setNew = new HashSet<>();
        for (Integer intgr: set) {
            if (intgr<10) setNew.add(intgr);
        }
        return setNew;

    }
}
