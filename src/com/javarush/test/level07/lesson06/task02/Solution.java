package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    static int count_subzero;
    static int count_scorpion;
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2= reader.readLine();
        String n3 = reader.readLine();
        int one = Integer.parseInt(n1);
        int two = Integer.parseInt(n2);
        int three = Integer.parseInt(n3);
        counter(one,two,three);
    }
    private static void counter(int one, int two, int three)
    {
        if(one>0){
            count_scorpion++;
        }else if(one<0){
            count_subzero++;
        }
        if(two>0){
            count_scorpion++;
        }else if(two<0) {
            count_subzero++;
        }
        if(three>0){
            count_scorpion++;
        }else if(three<0) {
            count_subzero++;
        }
        System.out.println("количество отрицательных чисел: "+count_subzero);
        System.out.println("количество положительных чисел: "+count_scorpion);
    }
}


