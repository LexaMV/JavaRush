package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String filename = null;

    public Cat(String name)
    {
        this.filename = name;
    }//напишите тут ваш код

    public Cat(String name, int weight, int age)
    {
        this.filename = name + weight + age;
    }

    public Cat(String name, int age)
    {
        int weight = 5;
        this.filename = name + age + weight;
    }

    public Cat(int weight, String color, String name, String adress, int age)
    {
        name = null;
        adress = null;
        age = 0;
        this.filename = weight + color + name + adress + age;
    }

    public Cat(int weight, String color, String adress)
    {
        adress = null;
        this.filename = weight + color + adress;
    }
}
