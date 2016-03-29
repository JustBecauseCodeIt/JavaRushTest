package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFather = new Human();
        grandFather.name = "Павел";
        grandFather.sex = true;
        grandFather.age = 70;

        Human grandFather2 = new Human();
        grandFather2.name = "Иван";
        grandFather2.sex = true;
        grandFather2.age = 73;

        Human grandMother = new Human();
        grandMother.name = "Эльза";
        grandMother.sex = true;
        grandMother.age = 78;

        Human grandMother2 = new Human();
        grandMother2.name = "Ирида";
        grandMother2.sex = true;
        grandMother2.age = 75;

        Human mother = new Human();
        mother.name = "Катя";
        mother.sex = false;
        mother.age = 55;

        Human father = new Human();
        father.name = "Павел";
        father.sex = false;
        father.age = 52;

        Human dauther = new Human();
        dauther.name = "Аня";
        dauther.sex = false;
        dauther.age = 21;
        dauther.father = new Human();
        dauther.father.name = "Павел";
        dauther.mother = new Human();
        dauther.mother.name = "Катя";

        Human dauther2 = new Human();
        dauther2.name = "Лида";
        dauther2.sex = false;
        dauther2.age = 21;
        dauther2.father = new Human();
        dauther2.father.name = "Павел";
        dauther2.mother = new Human();
        dauther2.mother.name = "Катя";

        Human son = new Human();
        son.name = "Валера";
        son.sex = false;
        son.age = 2;
        son.father = new Human();
        son.father.name = "Павел";
        son.mother = new Human();
        son.mother.name = "Катя";



        System.out.println(grandFather);
        System.out.println(grandFather2);
        System.out.println(grandMother);
        System.out.println(grandMother2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(dauther);
        System.out.println(dauther2);
        System.out.println(son);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
