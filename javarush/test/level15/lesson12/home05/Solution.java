package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution() { }
    public Solution(int[] d) { }
    public Solution(boolean[] d) { }

    Solution(String s) { }
    Solution(Double s) { }
    Solution(Float s) { }

    protected Solution(int t) {}
    protected Solution(double t) {}
    protected Solution(float t) {}

    private Solution(Integer[] t) {}
    private Solution(Double[] t) {}
    private Solution(Float[] t) {}

}

