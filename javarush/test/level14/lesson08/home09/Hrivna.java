package com.javarush.test.level14.lesson08.home09;

/**
 * Created by admin on 06.04.2016.
 */
public class Hrivna extends Money {


    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 0.4414;
    }

    @Override
    public String getCurrencyName() {
        return "HRN";
    }
}
