package com.javarush.test.level02.lesson02.task01;

/* Класс Person
В классе Person объяви следующие переменные: name типа String, age типа int, weight типа int, money типа int.
В методе main создай объект Person, занеси его ссылку в переменную person.
*/
public class Solution
{
    public static void main(String[] args)
    {
        Person person = new Person();
        person.name = "Alex";
        person.age =5;
        person.weight = 6;
        person.money = 700;//напишите тут ваш код
    }

    public static class Person
    {
        String name;
        int age;
        int weight;
        int money;//напишите тут ваш код
    }
}
