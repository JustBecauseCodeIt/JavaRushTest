package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> mapCat = new HashMap<String, Cat>();
        mapCat.put("Кот1", new Cat("Кот1"));
        mapCat.put("Кот2", new Cat("Кот2"));
        mapCat.put("Кот3", new Cat("Кот3"));
        mapCat.put("Кот4", new Cat("Кот4"));
        mapCat.put("Кот5", new Cat("Кот5"));
        mapCat.put("Кот6", new Cat("Кот6"));
        mapCat.put("Кот7", new Cat("Кот7"));
        mapCat.put("Кот8", new Cat("Кот8"));
        mapCat.put("Кот9", new Cat("Кот9"));
        mapCat.put("Кот10", new Cat("Кот10"));
        return mapCat;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> result = new HashSet<>();
        for (Map.Entry<String , Cat> pair : map.entrySet())
        result.add(pair.getValue());
        return result;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
