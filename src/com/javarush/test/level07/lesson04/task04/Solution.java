package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] list = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }

        for ( int y = 0; y < 5; y++)
        {
            int r = list[y];
            int b = list[9 - y];
            list[y] = b;
            list[9-y] = r;

        }

        for (int i = 0; i < list.length; i++)
        { System.out.println(list[i]);}


        //напишите тут ваш код

    }
}
