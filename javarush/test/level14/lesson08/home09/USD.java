package com.javarush.test.level14.lesson08.home09;

/**
 * Created by admin on 06.04.2016.
 */
public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 1.4741;
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
