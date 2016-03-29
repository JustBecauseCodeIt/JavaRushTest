package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;
    private int weight;
    private String collor;

    public void initialize(String name){
        this.name=name;
    }

    public void initialize(String name, int weight){
        this.name=name;
        this.weight=weight;
    }

    public void initialize(String name, int weight, String collor){
        this.name=name;
        this.weight=weight;
        this.collor=collor;
    }

}
