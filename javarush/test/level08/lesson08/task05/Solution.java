package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;


/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {

        HashMap<String, String> hm = new HashMap<>();

        hm.put("Путин","Вова");
        hm.put("Якимов","Иван");
        hm.put("Петров","Петя");
        hm.put("Сталонне","Сильвестр");
        hm.put("Виртов","Вова");
        hm.put("Панамов","Иван");
        hm.put("Николаев","Коля");
        hm.put("Иванов","Владимир");
        hm.put("Фырков","Фыва");
        hm.put("Кверти","Коля");


        return hm;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            int count = 0;
            for (Map.Entry<String, String> pair2: copy.entrySet())
            {
                if (pair.getValue().equals(pair2.getValue())) count++;
                if (count>1) map.remove(pair.getKey());

            }



        }


        Set<String> set = new HashSet<>();
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            String name = pair.getValue();
            String famili = pair.getKey();
            set.add(name);
        }
        System.out.println(set);


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }




    public static void main(String[] args) {

        HashMap<String, String> hm = createMap();
        System.out.println(hm);
        removeTheFirstNameDuplicates(hm);
        System.out.println(hm);

    }
}
