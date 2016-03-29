package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> hash = new HashMap<>();
        hash.put("Иванов","Иван");
        hash.put("Петров","Петр");
        hash.put("Ивановыч","Петр");
        hash.put("Петрович","Иван");
        hash.put("Конь","Впальто");
        hash.put("Сидоров","Глеб");
        hash.put("Глебов","Сидр");
        hash.put("Глебович","Иван");
        hash.put("Медведев","Борис");
        hash.put("Борисов","Денис");
        return hash;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
          //  if(pair.getValue().equals(name)) count++;
            if(map.containsValue(name)) count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
           // if(pair.getKey().equals(lastName)) count++;
           if(map.containsKey(lastName)) count++;
        }
        return count;

    }

}
