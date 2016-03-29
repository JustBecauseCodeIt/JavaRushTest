package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name;
    private int weihgt;
    private int age;
    private String color;
    private String address;

    public void initialize(String name){
    this.name = name;
    }

    public void initialize(String name, int weihgt, int age){
        this.name = name;
        this.weihgt=weihgt;
        this.age=age;
    }

    public void initialize(String name, int age){
        this.name=name;
        this.age=age;
        this.weihgt=7;
    }

    public void initialize(int weihgt, String color){
        this.weihgt=weihgt;
        this.color=color;
        this.name=null;
        this.address=null;

    }

    public void initialize(int weihgt, String color, String address){
        this.weihgt=weihgt;
        this.color=color;
        this.address=address;

    }


}
