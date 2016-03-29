package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child = new Human();
        child.setName("Child1");
        child.setSex(true);
        child.setAge(11);
        child.setChildren(new ArrayList<Human>());

        Human child2 = new Human();
        child2.setName("Child2");
        child2.setSex(false);
        child2.setAge(15);
        child2.setChildren(new ArrayList<Human>());

        Human child3 = new Human();
        child3.setName("Child3");
        child3.setSex(true);
        child3.setAge(10);
        child3.setChildren(new ArrayList<Human>());

        ArrayList<Human> hm = new ArrayList<>();
        hm.add(child);
        hm.add(child2);
        hm.add(child3);


        Human grandma = new Human();
        grandma.setName("Babushka");
        grandma.setSex(false);
        grandma.setAge(69);
        grandma.setChildren(new ArrayList<Human>());

        Human grandma2 = new Human();
        grandma2.setName("Babushka2");
        grandma2.setSex(false);
        grandma2.setAge(73);
        grandma2.setChildren(new ArrayList<Human>());


        Human grandfather = new Human();
        grandfather.setName("Dedushka");
        grandfather.setSex(true);
        grandfather.setAge(72);
        grandfather.setChildren(new ArrayList<Human>());

        Human grandfather2 = new Human();
        grandfather2.setName("Dedushka2");
        grandfather2.setSex(true);
        grandfather2.setAge(73);
        grandfather2.setChildren(new ArrayList<Human>());

        Human mother = new Human();
        mother.setName("Mother");
        mother.setSex(false);
        mother.setAge(30);
        mother.setChildren(hm);

        Human father = new Human();
        father.setName("Father");
        father.setSex(false);
        father.setAge(33);
        father.setChildren(hm);



        System.out.println(grandma);
        System.out.println(grandma2);
        System.out.println(grandfather);
        System.out.println(grandfather2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(child);
        System.out.println(child2);
        System.out.println(child3);




    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public void setChildren(ArrayList<Human> children)
        {
            this.children = children;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public boolean isSex()
        {
            return sex;
        }

        public void setSex(boolean sex)
        {
            this.sex = sex;
        }

        public int getAge()
        {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
