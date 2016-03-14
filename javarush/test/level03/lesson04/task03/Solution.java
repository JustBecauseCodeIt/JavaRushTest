package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg();
        zerg1.name ="Zerg1";

        Zerg zerg2 = new Zerg();
        zerg2.name ="Zerg2";

        Zerg zerg3 = new Zerg();
        zerg3.name ="Zerg3";

        Zerg zerg4 = new Zerg();
        zerg4.name ="Zerg4";

        Zerg zerg5 = new Zerg();
        zerg5.name ="Zerg5";

        Zerg zerg6 = new Zerg();
        zerg6.name ="Zerg6";

        Zerg zerg7 = new Zerg();
        zerg7.name ="Zerg7";

        Zerg zerg8 = new Zerg();
        zerg8.name ="Zerg8";

        Zerg zerg9 = new Zerg();
        zerg9.name ="Zerg9";

        Zerg zerg10 = new Zerg();
        zerg10.name ="Zerg10";


        Protos protos1 = new Protos();
        protos1.name = "Protos1";

        Protos protos2 = new Protos();
        protos2.name = "Protos2";

        Protos protos3 = new Protos();
        protos3.name = "Protos3";

        Protos protos4 = new Protos();
        protos4.name = "Protos4";

        Protos protos5 = new Protos();
        protos5.name = "Protos5";

        Terran tr1 = new Terran();
        tr1.name = "Terran1";

        Terran tr2 = new Terran();
        tr2.name = "Terran2";

        Terran tr3 = new Terran();
        tr3.name = "Terran3";

        Terran tr4 = new Terran();
        tr4.name = "Terran4";

        Terran tr5 = new Terran();
        tr5.name = "Terran5";

        Terran tr6 = new Terran();
        tr6.name = "Terran6";

        Terran tr7 = new Terran();
        tr7.name = "Terran7";

        Terran tr8 = new Terran();
        tr8.name = "Terran8";

        Terran tr9 = new Terran();
        tr9.name = "Terran9";

        Terran tr10 = new Terran();
        tr10.name = "Terran10";

        Terran tr11 = new Terran();
        tr11.name = "Terran11";

        Terran tr12 = new Terran();
        tr12.name = "Terran12";


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}