package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());
        if (a>b && a>c && a>d) System.out.println(a);
        if (b>a && b>c && b>d) System.out.println(b);
        if (c>a && c>b && c>d) System.out.println(c);
        if (d>a && d>b && d>c) System.out.println(d);

    }
}
