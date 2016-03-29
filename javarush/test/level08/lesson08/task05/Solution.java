package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String > hm = new HashMap<>();
        hm.put("Иванов","Иван");
        hm.put("Петров","Иван");
        hm.put("Конь","Впальто");
        hm.put("Сидоров","Петр");
        hm.put("Борисов","Денис");
        hm.put("Денис","Борисов");
        hm.put("Смирнов","Денис");
        hm.put("Валуев","Валуй");
        hm.put("Валуй","Иван");
        hm.put("Путин","Вова");
        return hm;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
/*
        HashMap<String, String> copy = new HashMap<String, String>();
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            String name = pair.getValue();
            String famili = pair.getKey();
            copy.put(name, famili);
        }
        map.clear();

        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            String name = pair.getValue();
            String famili = pair.getKey();
            map.put(name, famili);
        }
*/
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
