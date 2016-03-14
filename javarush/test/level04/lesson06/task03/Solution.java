package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        int max, mid, min;

        if(a>=b && a>=c){
            max = a;
                if (b>=c)
                {
                    mid = b;
                    min = c;
                }
                else
                {
                    mid=c;
                    min=b;
                }
            System.out.println(max+" "+ mid+ " "+ min);
            }
        if (b>=a && b>=c){
                max = b;
                if(a>=c)
                {
                    mid=a;
                    min=c;
                }
                else
                {
                    mid=c;
                    min=a;

                }
            System.out.println(max+" "+ mid+ " "+ min);
            }
        if(c>=a && c>=b){
            max=c;
                if(a>=b)
                {
                    mid = a;
                    min = b;
                }
            else
                {
                    mid = b;
                    min = a;
                }
            System.out.println(max+" "+ mid+ " "+ min);
        }


    }
}
