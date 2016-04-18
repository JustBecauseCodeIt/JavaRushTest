package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by admin on 18.04.2016.
 */
public class Plane implements Flyable {
    private int passanger;
    @Override
    public void fly() {

    }

    public Plane(int passanger) {
        this.passanger = passanger;
    }
}
