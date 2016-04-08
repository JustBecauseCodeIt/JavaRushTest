package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        System.out.println(nod(a,b));
    }

    public static int nod(int m, int n) {
        if (m==0) return n;
        if (n==0) return m;
        if (n==m) return n;
        if (n==1) return 1;
        if(m==1) return 1;
        if (m%2==0 & n%2==0) return 2*nod(m/2, n/2);
        if (m%2==0 & n%2!=0) return nod(m/2, n);
        if (m%2!=0 & n%2==0) return nod(m, n/2);
        if (m%2!=0 & n%2!=0 & n>m) return nod((n-m)/2, m);
        if (m%2!=0 & n%2!=0 & n<m) return nod((m-n)/2, n);
        return 0;
    }
}
