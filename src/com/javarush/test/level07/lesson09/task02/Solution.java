package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.*;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(in));
       ArrayList<String>  list = new ArrayList<>();
       for (int i = 0; i < 5; i++)
       {
           String s = reader.readLine();
           list.add(s);
       }

       list.remove(2);
        System.out.println( list.get(3) );
        System.out.println( list.get(2) );
        System.out.println( list.get(1) );
        System.out.println( list.get(0) );

       //напишите тут ваш код

    }
}
