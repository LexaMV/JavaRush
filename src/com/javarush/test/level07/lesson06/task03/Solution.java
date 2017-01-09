package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int a = 0; a < 5; a++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        ArrayList<Integer> lest = new ArrayList<>();

        for (int b = 0; b < list.size(); b++)
        {
            String g = list.get(b);
            int h = g.length();
            lest.add(h);
        }

        Integer min = lest.get(0);

        for (int j = 0; j < lest.size(); j++)
        {
            if (min > lest.get(j))
                min = lest.get(j);
        }


        for (int u = 0; u < lest.size(); u++)
        {
            if (min == lest.get(u))
            System.out.println(list.get(u));
        }


    }
        }





        //напишите тут ваш код


