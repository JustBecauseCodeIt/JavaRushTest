package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Kirill Grigorichev on 03.04.2016.
 */
public class RussianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 15;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
