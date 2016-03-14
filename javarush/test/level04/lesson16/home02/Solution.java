package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int mid;
        if(a>=b && a>=c){
            if (b>=c)  mid = b;
            else mid=c;
            System.out.println( mid);
        }
        if (b>=a && b>=c){
            if(a>=c) mid=a;
            else mid=c;
            System.out.println(mid);
        }
        if(c>=a && c>=b){
            if(a>=b) mid = a;
            else mid = b;
            System.out.println( mid);
        }

    }
}
