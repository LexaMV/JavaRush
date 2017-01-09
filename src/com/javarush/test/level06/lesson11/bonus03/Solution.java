package com.javarush.test.level06.lesson11.bonus03;

import javax.management.ObjectName;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

     //   int p = Integer.parseInt(S);
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++)
        {
            String S = reader.readLine();
            int p = Integer.parseInt(S);
            list[i] = p;
        }

        Arrays.sort(list);

        for (int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]);
        }


      //  ArrayList<Integer> list = new ArrayList<>();


        //напишите тут ваш код
    }
}
