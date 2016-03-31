package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        String family;
        boolean sex;
        int age;
        int height;
        int weight;

        public Human(String name, String family, boolean sex) {
            this.name = name;
            this.family = family;
            this.sex = sex;
        }

        public Human(String name, String family, boolean sex, int age, int height, int weight) {
            this.name = name;
            this.family = family;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, String family, boolean sex) {
            this.name = name;
            this.age = age;
            this.family = family;
            this.sex = sex;
        }

        public Human(String name, String family, int height, int weight) {
            this.name = name;
            this.family = family;
            this.height = height;
            this.weight = weight;
        }

        public Human(int weight, int height, String name) {
            this.weight = weight;
            this.height = height;
            this.name = name;
        }

        public Human(String name, int weight, int height) {
            this.name = name;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String family, boolean sex, int age) {
            this.family = family;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, String family, boolean sex, int height, int weight) {
            this.name = name;
            this.family = family;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(boolean sex, int age, String name) {
            this.sex = sex;
            this.age = age;
            this.name = name;
        }
    }
}
