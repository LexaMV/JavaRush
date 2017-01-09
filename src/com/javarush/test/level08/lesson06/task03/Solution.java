package com.javarush.test.level08.lesson06.task03;

import java.util.*;

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/

public class Solution
{
    public static void main(String[] args)
    {

        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long  getTimeMsOfInsert(List list)
    {
        Date firstTime = new Date();
        insert10000(list);
        Date newTime = new Date();

        long msDelay = newTime.getTime() - firstTime.getTime();

        return msDelay;
        //напишите тут ваш код

    }

    public static void insert10000(List list)
    {
        for (int i = 0; i < 10000; i++)
        {
            list.add(i, new Object());
        }
    }
}