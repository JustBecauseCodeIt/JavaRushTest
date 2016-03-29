package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = bis.readLine();
            if (s.isEmpty()) break;
            list.add(s);

        }

        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        ArrayList<String> list2 = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
        String str = list.get(i);
            if(str.indexOf('р')>-1 & str.indexOf('л')>-1) {
                list2.add(str);
                continue;
            }
            if(str.indexOf('л')>-1) {
                list2.add(str);
                list2.add(str);
                continue;
            }
            if(str.indexOf('р')==-1){
                list2.add(str);
                continue;
            }

        }
        return  list2;
    }
}