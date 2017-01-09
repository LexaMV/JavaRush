package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String filename = null;

    public void initialize(String name)
    {
        this.filename = name;
    }

    public void initialize(String name, int growth)
    {
        this.filename = name + growth;
    }//напишите тут ваш код

    public void initialize(String name, int growth, String color)
    {
        this.filename = name + growth + color;//напишите тут ваш код
    }
}
