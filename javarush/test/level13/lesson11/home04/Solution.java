package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();

        FileOutputStream fos = new FileOutputStream(sourceFileName);

        String s;
        while (true)
        {
            s = reader.readLine();
            fos.write((s+"\r\n").getBytes());
            if (s.equals("exit")) break;
        }

        fos.close();
    }
}
