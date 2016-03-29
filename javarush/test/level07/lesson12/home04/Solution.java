package com.javarush.test.level07.lesson12.home04;

import java.io.*;
import java.util.ArrayList;


/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String sN = null;
        while (!(sN = reader.readLine()).equals("end")){ list.add(sN); }

        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));

    }
}
