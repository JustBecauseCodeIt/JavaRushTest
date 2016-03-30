package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < abcArray.length; i++) {
            hm.put(abcArray[i], 0);
        }

        for (int i = 0; i < list.size(); i++) {
            char[] listToArr = list.get(i).toCharArray();
            for (int j = 0; j < listToArr.length; j++) {
                for (Map.Entry<Character, Integer> entry: hm.entrySet()){
                   if(entry.getKey().equals(listToArr[j])) {
                       hm.put(entry.getKey(),entry.getValue()+1);
                   }
                }
            }
        }

        for (Map.Entry<Character, Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
    }

}
