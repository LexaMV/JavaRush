package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String filename = null;

    public Dog(String name)//напишите тут ваш код
    {
        this.filename = name;
    }

    public Dog(String name, int growth)
    {
        this.filename = name + growth;
    }

    public Dog(String name, int growth, String color)
    {
        this.filename = name + growth + color;
    }
}
