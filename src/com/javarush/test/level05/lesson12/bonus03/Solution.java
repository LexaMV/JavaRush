package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.ArrayList;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int b = Integer.parseInt(s);
        if (b > 0)
        {
            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 0; i < b; i++)
            {
                String h = reader.readLine();
                int f = Integer.parseInt(h);
                list.add(f);
            }

            int y = list.get(0);

            for(int i = 0; i < list.size(); i++)
            {

                if (y < list.get(i))
                    y = list.get(i);
            }

            System.out.println(y);

          //  for(int i = 0; i < list.size(); i++)
           // {
          //      System.out.println(list.get(i));
          //  }
        }




       // int maximum = 7;

        //напишите тут ваш код




      //  System.out.println(maximum);
    }
}
