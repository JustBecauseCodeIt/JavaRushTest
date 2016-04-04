package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = br.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
        String line;
        List<Integer> lines = new ArrayList<Integer>();
        while ((line = reader.readLine()) != null) {
            if (Integer.valueOf(line)%2==0)
            lines.add(Integer.valueOf(line));
        }

        Collections.sort(lines);

        for (int i = 0; i < lines.size(); i++)
        {
            System.out.println(lines.get(i));

        }

    }
}
