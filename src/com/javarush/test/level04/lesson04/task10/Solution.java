package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int g = Integer.parseInt(s);
        String n = reader.readLine();
        int m = Integer.parseInt(n);
        String u = reader.readLine();
        int k = Integer.parseInt(u);

        if (g == m && m == k)
        {
            System.out.println(g + " " + m + " " + k);
        }

        else if (g == m)
        {
            System.out.println(g + " " + m );
        }

        else if (m == k)
        {
            System.out.println(m + " " + k);
        }

        else if (g == k)
        {
            System.out.println(g + " " + k);
        }




       //напишите тут ваш код

    }
}