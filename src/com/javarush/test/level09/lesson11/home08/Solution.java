package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }


    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<>();
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {1, 2};
        int[] C = {1, 2, 3, 4};
        int[] D = {1, 2, 3, 4, 5, 6, 7};
        int[] E = {};
        list.add(A);
        list.add(B);
        list.add(C);
        list.add(D);
        list.add(E);
        return list;
    }


    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
