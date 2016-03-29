package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> reslult = new ArrayList<int[]>();
        reslult.add(new int[]{342,231,2332,4323,121});
        reslult.add(new int[]{2332,4323});
        reslult.add(new int[]{234521,43262,233452632,432425623});
        reslult.add(new int[]{234521,43262,233452632,432425623,2332,4323,43426});
        reslult.add(new int[0]);
        return reslult;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
